
SUMMARY = "A simple Python wrapper for ffmpeg"
HOMEPAGE = "https://github.com/Ch00k/ffmpy"
AUTHOR = "Andrii Yurchuk <ay@mntw.re>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e7ac252a382a0b5b6d4d9dfe7898c71"

SRC_URI = "https://files.pythonhosted.org/packages/1d/70/07914754979f5dd80bda947a0ffd181c08bfcb137b01c3c0cef45254d271/ffmpy-0.3.2.tar.gz"
SRC_URI[md5sum] = "7d9dfc2627ee118859f336d72e2c0123"
SRC_URI[sha256sum] = "475ebfff1044661b8d969349dbcd2db9bf56d3ee78c0627e324769b49a27a78f"

S = "${WORKDIR}/ffmpy-0.3.2"

RDEPENDS_${PN} = ""

inherit setuptools3
