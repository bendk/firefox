FROM $DOCKER_IMAGE_PARENT
MAINTAINER Mike Hommey <mhommey@mozilla.com>

VOLUME /builds/worker/checkouts
VOLUME /builds/worker/workspace
VOLUME /builds/worker/tooltool-cache

ENV XZ_OPT=-T0

# binutils is needed for base toolchain builds. Ideally, it wouldn't be needed.
# libc6-i386 and lib32gcc1 are needed for wine.
# libgtk-3-0 are needed to run xpcshell during the build.
# lib32atomic1, lib32stdc++6 and lib32z1 are needed to run some 32-bits
# cpio is needed by xar (mac repackaging on linux)
# spidermonkey tests. libasound2 is needed to run xpcshell after we introduced
# the dependencies on alsa via Web MIDI.
RUN apt-get update && \
    apt-get dist-upgrade && \
    apt-get install \
      bash \
      binutils \
      bzip2 \
      cpio \
      curl \
      file \
      findutils \
      gawk \
      gnupg \
      gzip \
      jq \
      lib32atomic1 \
      'lib32gcc(1|-s1)$' \
      lib32stdc++6 \
      lib32z1 \
      libasound2 \
      libc6-i386 \
      libgtk-3-0 \
      libucl1 \
      libxml2 \
      m4 \
      make \
      p7zip-full \
      perl \
      procps \
      python3-dev \
      rsync \
      screen \
      tar \
      unzip \
      uuid \
      wget \
      zip
