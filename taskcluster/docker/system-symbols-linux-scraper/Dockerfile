FROM          $DOCKER_IMAGE_PARENT
MAINTAINER    Gabriele Svelto <gsvelto@mozilla.com>

RUN mkdir -p /builds
RUN id worker || useradd -d /builds/worker -s /bin/bash -m worker
WORKDIR /builds/worker

# We need to declare all potentially cache volumes as caches. Also,
# making high I/O paths volumes increase I/O throughput because of
# AUFS slowness.
VOLUME /builds/worker/checkouts

RUN apt-get update && \
    apt-get install --no-install-recommends -y \
        aria2 file binutils build-essential cpio curl debuginfod elfutils \
        flatpak jq libxml2-utils python3-pip squashfs-tools unzip wget zip && \
    apt-get autoremove -y && rm -rf /var/lib/apt/lists/*

COPY run.sh /builds/worker/run.sh

COPY SHA256SUMS.txt /builds/worker/

RUN chown -R worker:worker /builds/worker

RUN pip3 install --break-system-packages crashstats-tools==2.1.0

# Set a default command useful for debugging
CMD ["/bin/bash", "--login"]
