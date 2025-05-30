# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.

import re
from pathlib import Path

from mach.decorators import Command, CommandArgument, SubCommand

LICENSE_HEADER = """# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.
"""

GENERATED_HEADER = """
### This file was AUTOMATICALLY GENERATED by `./mach update-glean-tags`
### DO NOT edit it by hand.
"""

# A list of bug components only present in certain build configurations.
# Include any valid BMO bug component that is missed when you run
# `./mach update-glean-tags` on certain platforms.
PLATFORM_SPECIFIC_COMPONENTS = [
    "Toolkit :: Default Browser Agent",  # Windows-only
]

DEFAULT_TAG_CONTENT = {
    "description": "The Bugzilla component which applies to this object."
}

DATA_REVIEW_HELP = """
Beginning 2024-05-07[1], data reviews for projects in mozilla-central are now
conducted on Phabricator. Simply duplicate your bug URL from the `bugs` list to
the `data_reviews` list in your metrics and pings definitions, and push for code
review in the normal way[2].

More details about this process can be found in the in-tree docs[3] and wiki[4].

If you'd like to generate a Data Review Request template anyway (if, for
instance, you can't use Phabricator for your data review or you need a Data
Review Request to aid in a Sensitive Data Review process. Or you're just
curious), you can invoke glean_parser directly:

./mach python -m glean_parser data-review

[1]: https://groups.google.com/a/mozilla.org/g/firefox-dev/c/7z-i6UhPoKY
[2]: https://firefox-source-docs.mozilla.org/contributing/index.html
[3]: https://firefox-source-docs.mozilla.org/contributing/data-review.html
[4]: https://wiki.mozilla.org/Data_Collection
"""


@Command(
    "data-review",
    category="misc",
    description="Describe how Data Review works in mozilla-central",
)
def data_review(command_context):
    # Data Review happens in Phabricator now
    # (https://groups.google.com/a/mozilla.org/g/firefox-dev/c/7z-i6UhPoKY)
    # so explain how to do it.

    print(DATA_REVIEW_HELP)


@Command(
    "update-glean-tags",
    category="misc",
    description=(
        "Creates a list of valid glean tags based on in-tree bugzilla component definitions"
    ),
)
def update_glean_tags(command_context):
    import yaml
    from mozbuild.backend.configenvironment import ConfigEnvironment
    from mozbuild.frontend.reader import BuildReader

    config = ConfigEnvironment(
        command_context.topsrcdir,
        command_context.topobjdir,
        defines=command_context.defines,
        substs=command_context.substs,
    )

    reader = BuildReader(config)
    bug_components = set()
    for p in reader.read_topsrcdir():
        if p.get("BUG_COMPONENT"):
            bug_components.add(p["BUG_COMPONENT"])

    tags_filename = (Path(__file__).parent / "../tags.yaml").resolve()

    tags = {"$schema": "moz://mozilla.org/schemas/glean/tags/1-0-0"}
    for bug_component in bug_components:
        product = bug_component.product.strip()
        component = bug_component.component.strip()
        tags[f"{product} :: {component}"] = DEFAULT_TAG_CONTENT

    for bug_component in PLATFORM_SPECIFIC_COMPONENTS:
        tags[bug_component] = DEFAULT_TAG_CONTENT

    # pyyaml will anchor+alias DEFAULT_TAG_CONTENT which would normally be fine,
    # but I don't want the whole file to change all at once right now.
    yaml.Dumper.ignore_aliases = lambda self, data: True

    open(tags_filename, "w").write(
        f"{LICENSE_HEADER}\n{GENERATED_HEADER}\n\n"
        + yaml.dump(tags, width=78, explicit_start=True, line_break="\n")
    )


def replace_in_file(path, pattern, replace):
    """
    Replace `pattern` with `replace` in the file `path`.
    The file is modified on disk.

    Returns `True` if exactly one replacement happened.
    `False` otherwise.
    """

    import re

    with open(path, "r+") as file:
        data = file.read()
        data, subs_made = re.subn(pattern, replace, data, flags=re.MULTILINE)

        file.seek(0)
        file.write(data)
        file.truncate()

        if subs_made != 1:
            return False

    return True


def replace_in_file_or_die(path, pattern, replace):
    """
    Replace `pattern` with `replace` in the file `path`.
    The file is modified on disk.

    If not exactly one occurrence of `pattern` was replaced it will exit with exit code 1.
    """

    import sys

    success = replace_in_file(path, pattern, replace)
    if not success:
        print(f"ERROR: Failed to replace one occurrence in {path}")
        print(f"  Pattern: {pattern}")
        print(f"  Replace: {replace}")
        print("File was modified. Check the diff.")
        sys.exit(1)


@Command(
    "update-glean",
    category="misc",
    description="Update Glean to the given version",
)
@CommandArgument("version", help="Glean version to upgrade to")
def update_glean(command_context, version):
    import textwrap

    topsrcdir = Path(command_context.topsrcdir)

    replace_in_file_or_die(
        topsrcdir / "gradle" / "libs.versions.toml",
        r'mozilla-glean = "[0-9.]+"',
        f'mozilla-glean = "{version}"',
    )
    replace_in_file_or_die(
        topsrcdir / "Cargo.toml",
        r'^glean = "=[0-9.]+"',
        f'glean = "={version}"',
    )
    replace_in_file_or_die(
        topsrcdir / "gfx" / "wr" / "Cargo.toml",
        r'^glean = "=[0-9.]+"',
        f'glean = "={version}"',
    )
    replace_in_file_or_die(
        topsrcdir / "python" / "sites" / "mach.txt",
        r"glean-sdk==[0-9.]+",
        f"glean-sdk=={version}",
    )

    instructions = f"""
    We've edited the necessary files to require Glean SDK {version}.

    To ensure Glean and Firefox's other Rust dependencies are appropriately vendored,
    please run the following commands:

        cargo update -p glean
        ./mach vendor rust --ignore-modified

    `./mach vendor rust` may identify version mismatches.
    Please consult the Updating the Glean SDK docs for assistance:
    https://firefox-source-docs.mozilla.org/toolkit/components/glean/dev/updating_sdk.html

    The Glean SDK is already vetted and no additional vetting for it is necessary.
    To prune the configuration file after vendoring run:

        ./mach cargo vet prune

    Then, to update webrender which independently relies on the Glean SDK, run:

        cd gfx/wr
        cargo update -p glean

    Then, to ensure all is well, build Firefox and run the FOG tests.
    Instructions can be found here:
    https://firefox-source-docs.mozilla.org/toolkit/components/glean/dev/testing.html
    """

    print(textwrap.dedent(instructions))


@Command(
    "event-into-legacy",
    category="misc",
    description="Create a Legacy Telemetry compatible event definition from an existing Glean Event metric.",
)
@CommandArgument(
    "--append",
    "-a",
    action="store_true",
    help="Append to toolkit/components/telemetry/Events.yaml (note: verify and make any necessary modifications before landing).",
)
@CommandArgument("event", default=None, nargs="?", type=str, help="Event name.")
def event_into_legacy(command_context, event=None, append=False):
    # Get the metrics_index's list of metrics indices
    # by loading the index as a module.
    import sys
    from os import path

    sys.path.append(path.join(path.dirname(__file__), path.pardir))

    from metrics_index import metrics_yamls

    sys.path.append(path.dirname(__file__))

    from translate_events import translate_event

    legacy_yaml_path = path.join(
        Path(command_context.topsrcdir),
        "toolkit",
        "components",
        "telemetry",
        "Events.yaml",
    )

    return translate_event(
        event,
        append,
        [Path(command_context.topsrcdir) / x for x in metrics_yamls],
        legacy_yaml_path,
    )


def is_glean_path(glean_path):
    """
    Check if the given path could be a Glean repository
    by checking for the existence of the right manifest files.
    """
    main_cargo = Path(glean_path) / "Cargo.toml"
    core_cargo = Path(glean_path) / "glean-core" / "Cargo.toml"
    rlb_cargo = Path(glean_path) / "glean-core" / "rlb" / "Cargo.toml"

    return main_cargo.is_file() and core_cargo.is_file() and rlb_cargo.is_file()


GLEAN_PATCH_PATH = """
glean-core = {{ path = "{core_path}" }}
glean = {{ path = "{rlb_path}" }}
""".strip()

GLEAN_PATCH_GIT = """
glean-core = {{ git = "{repo}", branch = "{branch}" }}
glean = {{ git = "{repo}", branch = "{branch}" }}
""".strip()

TOML_GLEAN_PATCH_RE = re.compile(r"^glean(-core)? = {.+}\n?", re.MULTILINE)


def patch_section(glean_path, branch):
    """
    Return the right patch section for a `Cargo.toml` based on the given Glean path.

    A `https` URI will be used as a git location and the given branch inserted.
    Otherwise it will be treated as a path dependency.
    """
    import urllib.parse

    uri = urllib.parse.urlparse(glean_path)

    if uri.scheme == "https":
        section = GLEAN_PATCH_GIT.format(repo=glean_path, branch=branch)
        return section
    elif uri.scheme == "":
        if not is_glean_path(uri.path):
            raise Exception(
                f"given path '{uri.path}' does not point to a Glean checkout"
            )

        core_path = Path(glean_path) / "glean-core"
        rlb_path = Path(glean_path) / "glean-core" / "rlb"
        section = GLEAN_PATCH_PATH.format(core_path=core_path, rlb_path=rlb_path)
        return section
    else:
        raise Exception("unsupported format. Use a path or a https: URL")


@Command(
    "glean",
    category="misc",
    description="Glean utilities",
)
def glean(command_context):
    print("Usage:")
    print("  mach glean dev <path>  Use the given URL or path as the Glean source")
    print("")
    print("  mach glean prod        Switch back to the normal production use of Glean.")
    print("                         Removes any patch overrides.")


@SubCommand(
    "glean",
    "dev",
    description="Use the given URL or path as the Glean source",
)
@CommandArgument(
    "glean_path",
    help="Path or URL to a Glean repository. A patch can be absolute or relative to the mozilla-central root.",
)
@CommandArgument(
    "branch", default="main", nargs="?", help="branch to use for Glean repository"
)
def glean_dev(command_context, glean_path, branch):
    cargo_toml = Path(command_context.topsrcdir) / "Cargo.toml"
    content = open(cargo_toml).read()

    if re.search(TOML_GLEAN_PATCH_RE, content):
        content = re.sub(TOML_GLEAN_PATCH_RE, "", content)

    patch = patch_section(glean_path, branch)
    glean_source(command_context, cargo_toml, content, patch)


@SubCommand(
    "glean",
    "prod",
    description="Switch back to the normal production use of Glean. Removes any patch overrides.",
)
def glean_prod(command_context):
    cargo_toml = Path(command_context.topsrcdir) / "Cargo.toml"
    content = open(cargo_toml).read()

    if re.search(TOML_GLEAN_PATCH_RE, content):
        content = re.sub(TOML_GLEAN_PATCH_RE, "", content)

    glean_source(command_context, cargo_toml, content)


def glean_source(command_context, cargo_toml, content, patch=None):
    if patch:
        print(f"Adding Cargo patch for Glean in {cargo_toml}")
    else:
        print(f"Removing Cargo patch for Glean in {cargo_toml}")

    with open(cargo_toml, "w") as fp:
        fp.write(content)
        if patch:
            print("Adding these lines:")
            print(patch)
            print(patch, file=fp)

    print("Vendoring it for you:\n")
    print("  mach vendor rust --force --ignore-modified")
    print("\nYou can commit the local changes afterwards:\n")
    print("  git add Cargo.toml Cargo.lock third_party/rust")
    print("  git commit -m 'Local Glean development'")
    print("")

    run_mach(
        command_context, "vendor", subcommand="rust", force=True, ignore_modified=True
    )


def run_mach(command_context, cmd, **kwargs):
    return command_context._mach_context.commands.dispatch(
        cmd, command_context._mach_context, **kwargs
    )
