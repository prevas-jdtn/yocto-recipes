SUMMARY = "A serial to network proxy"
SECTION = "console/network"
HOMEPAGE = "http://sourceforge.net/projects/ser2net/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bae3019b4c6dc4138c217864bd04331f"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/ser2net/ser2net/ser2net-${PV}.tar.gz"

SRC_URI[md5sum] = "cd937041144de83d41d811521e72158c"
SRC_URI[sha256sum] = "98f6193225338e25f35302fef5e1f16688693ed43e7b3c3e9e09187eb54547ac"

inherit autotools pkgconfig
SYSTEMD_AUTO_ENABLE = "disable"

BBCLASSEXTEND = "native nativesdk"
