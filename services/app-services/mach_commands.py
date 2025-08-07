# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.

import os

# As a result of the selective module loading changes, this import has to be
# done here. It is not explicitly used, but it has an implicit side-effect
# (bringing in TASKCLUSTER_ROOT_URL) which is necessary.
import gecko_taskgraph.main  # noqa: F401
from mach.decorators import Command, SubCommand
from mozbuild.base import MachCommandConditions as conditions

# Some simple color codes
YELLOW = "\033[1;33m"
NC = "\033[0m"  # No Color


def _make_artifacts(command_context):
    state_dir = command_context._mach_context.state_dir
    cache_dir = os.path.join(state_dir, "package-frontend")

    hg = None
    if conditions.is_hg(command_context):
        hg = command_context.substs["HG"]

    git = None
    if conditions.is_git(command_context) or conditions.is_jj(command_context):
        git = command_context.substs["GIT"]

    # If we're building Thunderbird, we should be checking for comm-central artifacts.
    topsrcdir = command_context.substs.get("commtopsrcdir", command_context.topsrcdir)

    from mozbuild.artifacts import Artifacts

    artifacts = Artifacts(
        None,
        command_context.substs,
        command_context.defines,
        None,
        log=command_context.log,
        cache_dir=cache_dir,
        skip_cache=False,
        hg=hg,
        git=git,
        topsrcdir=topsrcdir,
        download_tests=False,
        download_symbols=False,
        download_maven_zip=False,
        no_process=False,
        unfiltered_project_package=False,
        mozbuild=command_context,
    )
    return artifacts


def print_env_setup_if_needed(app_services_obj_dir):
    if os.environ.get("CI"):
        return
    env_vars = {
        "NSS_DIR": os.path.join(app_services_obj_dir, "bin"),
        "NSS_STATIC": None,
    }
    for name, value in env_vars.items():
        if os.environ.get(name) != value:
            print_env_setup(env_vars)
            return


def print_env_setup(env_vars):
    if os.environ.get("SHELL", "").split("/")[-1] == "fish":
        return print_env_setup_fish(env_vars)
    else:
        return print_env_setup_traditional(env_vars)


def print_env_setup_traditional(env_vars):
    print()
    print(f"{YELLOW}!! Your environment variables are outdated!{NC}")
    print(
        "Please run the following commands and add them your shell initialization file (.zshenv, .bashrc etc.)"
    )
    print()
    for name, value in env_vars.items():
        if value is not None:
            print(f"export {name}={value}")
        else:
            print(f"unset {name}")


def print_env_setup_fish(env_vars):
    print()
    print(f"{YELLOW}!! Your environment variables are outdated!{NC}")
    print("Please execute the following commands:")
    print()
    for name, value in env_vars.items():
        if value is not None:
            print(f"set -gx {name} {value}")
        else:
            print(f"set -e {name}")


@Command(
    "app-services",
    category="devenv",
    description="App-services-related commands",
)
def app_services(command_context, *runargs, **lintargs):
    command_context._sub_mach(["help", "app-services"])
    return 1


@SubCommand(
    "app-services",
    "setup",
    description="Setup the app-services environment",
)
def setup_app_services(command_context, *runargs, **lintargs):
    app_services_obj_dir = os.path.abspath(
        os.path.join(command_context.topobjdir, "app-services")
    )
    artifacts = _make_artifacts(command_context)
    artifacts.install_from(None, app_services_obj_dir)
    print_env_setup_if_needed(app_services_obj_dir)
    return 0
