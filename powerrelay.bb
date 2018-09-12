DESCRIPTION = "REST API to control GPIO chips"
HOMEPAGE = "http://vmjira.prevas.se/bitbucket/projects/PIL/powerrelay/browse"
LICENSE = "The MIT License (MIT)"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20796caa814f193af92c180d146bb7ec"

SRC_URI = "git://git@vmjira.prevas.se:7999/pil/powerrelay.git;protocol=ssh;branch=master"
SRCREV = "a48cf47285e6082b3adf9cea54ae46e2feb69674"
S = "${WORKDIR}/git"

inherit setuptools3
