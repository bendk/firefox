#!/usr/bin/env python
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this file,
# You can obtain one at http://mozilla.org/MPL/2.0/.

"""
Mozilla universal manifest parser
"""
import os
import sys
from optparse import OptionParser

from .logger import Logger
from .manifestparser import ManifestParser, convert


class ParserError(Exception):
    """error for exceptions while parsing the command line"""


def parse_args(_args):
    """
    parse and return:
    --keys=value (or --key value)
    -tags
    args
    """

    # return values
    _dict = {}
    tags = []
    args = []

    # parse the arguments
    key = None
    for arg in _args:
        if arg.startswith("---"):
            raise ParserError("arguments should start with '-' or '--' only")
        elif arg.startswith("--"):
            if key:
                raise ParserError("Key %s still open" % key)
            key = arg[2:]
            if "=" in key:
                key, value = key.split("=", 1)
                _dict[key] = value
                key = None
                continue
        elif arg.startswith("-"):
            if key:
                raise ParserError("Key %s still open" % key)
            tags.append(arg[1:])
            continue
        else:
            if key:
                _dict[key] = arg
                continue
            args.append(arg)

    # return values
    return (_dict, tags, args)


class CLICommand:
    usage = "%prog [options] command"

    def __init__(self, parser):
        self._parser = parser  # master parser
        self.logger = Logger()

    def parser(self):
        return OptionParser(
            usage=self.usage, description=self.__doc__, add_help_option=False
        )


class CopyCLI(CLICommand):
    """
    To copy tests and manifests from a source
    """

    usage = "%prog [options] copy manifest directory -tag1 -tag2 --key1=value1 --key2=value2 ..."

    def __call__(self, global_options, args):
        # parse the arguments
        try:
            kwargs, tags, args = parse_args(args)
        except ParserError as e:
            self._parser.error(str(e))

        # make sure we have some manifests, otherwise it will
        # be quite boring
        if not len(args) == 2:
            self.logger.error("missing arguments: manifest directory")
            HelpCLI(self._parser)(global_options, ["copy"])
            return 1

        # read the manifests
        # TODO: should probably ensure these exist here
        manifests = ManifestParser()
        manifests.read(args[0])

        # print the resultant query
        manifests.copy(args[1], None, *tags, **kwargs)
        return 0


class CreateCLI(CLICommand):
    """
    create a manifest from a list of directories
    """

    usage = "%prog [options] create directory <directory> <...>"

    def parser(self):
        parser = CLICommand.parser(self)
        parser.add_option(
            "-p", "--pattern", dest="pattern", help="glob pattern for files"
        )
        parser.add_option(
            "-i",
            "--ignore",
            dest="ignore",
            default=[],
            action="append",
            help="directories to ignore",
        )
        parser.add_option(
            "-w",
            "--in-place",
            dest="in_place",
            help="Write .ini files in place; filename to write to",
        )
        return parser

    def __call__(self, global_options, args):
        parser = self.parser()
        options, args = parser.parse_args(args)

        # need some directories
        if not len(args):
            self.logger.error("missing arguments: directory ...")
            parser.print_usage()
            return 1

        # add the directories to the manifest
        for arg in args:
            assert os.path.exists(arg)
            assert os.path.isdir(arg)
            manifest = convert(
                args,
                pattern=options.pattern,
                ignore=options.ignore,
                write=options.in_place,
            )
        if manifest:
            print(manifest)
        return 0


class HelpCLI(CLICommand):
    """
    get help on a command
    """

    usage = "%prog [options] help [command]"

    def __call__(self, global_options, args):
        if len(args) == 1 and args[0] in commands:
            commands[args[0]](self._parser).parser().print_help()
        else:
            self._parser.print_help()
            print("\nCommands:")
            for command in sorted(commands):
                print("  %s : %s" % (command, commands[command].__doc__.strip()))


class UpdateCLI(CLICommand):
    """
    update the tests as listed in a manifest from a directory
    """

    usage = "%prog [options] update manifest directory -tag1 -tag2 --key1=value1 --key2=value2 ..."

    def __call__(self, options, args):
        # parse the arguments
        try:
            kwargs, tags, args = parse_args(args)
        except ParserError as e:
            self._parser.error(str(e))

        # make sure we have some manifests, otherwise it will
        # be quite boring
        if not len(args) == 2:
            self.logger.error("missing arguments: manifest directory")
            HelpCLI(self._parser)(options, ["update"])
            return 1

        # read the manifests
        # TODO: should probably ensure these exist here
        manifests = ManifestParser()
        manifests.read(args[0])

        # print the resultant query
        manifests.update(args[1], None, *tags, **kwargs)
        return 0


class WriteCLI(CLICommand):
    """
    write a manifest based on a query
    """

    usage = "%prog [options] write manifest <manifest> -tag1 -tag2 --key1=value1 --key2=value2 ..."

    def __call__(self, options, args):
        # parse the arguments
        try:
            kwargs, tags, args = parse_args(args)
        except ParserError as e:
            self._parser.error(str(e))

        # make sure we have some manifests, otherwise it will
        # be quite boring
        if not args:
            self.logger.error("missing arguments: manifest ...")
            HelpCLI(self._parser)(options, ["write"])
            return 1

        # read the manifests
        # TODO: should probably ensure these exist here
        manifests = ManifestParser()
        manifests.read(*args)

        # print the resultant query
        manifests.write(global_tags=tags, global_kwargs=kwargs)
        return 0


# command -> class mapping
commands = {
    "copy": CopyCLI,
    "create": CreateCLI,
    "help": HelpCLI,
    "update": UpdateCLI,
    "write": WriteCLI,
}


def main(args=sys.argv[1:]):
    """console_script entry point"""

    # set up an option parser
    usage = "%prog [options] [command] ..."
    description = "%s. Use `help` to display commands" % __doc__.strip()
    parser = OptionParser(usage=usage, description=description)
    parser.add_option(
        "-s",
        "--strict",
        dest="strict",
        action="store_true",
        default=False,
        help="adhere strictly to errors",
    )
    parser.disable_interspersed_args()

    global_options, args = parser.parse_args(args)

    if not args:
        HelpCLI(parser)(global_options, args)
        parser.exit()

    # get the command
    command = args[0]
    if command not in commands:
        parser.error(
            "Command must be one of %s (you gave '%s')"
            % (", ".join(sorted(commands.keys())), command)
        )
        return 1

    handler = commands[command](parser)
    return handler(global_options, args[1:])


if __name__ == "__main__":
    sys.exit(main())
