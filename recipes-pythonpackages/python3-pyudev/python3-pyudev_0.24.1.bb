
SUMMARY = "A libudev binding"
HOMEPAGE = "http://pyudev.readthedocs.org/"
AUTHOR = "Sebastian Wiesner <lunaryorn@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343"

SRC_URI = "https://files.pythonhosted.org/packages/20/b6/16961ac3575575260c72928f17df9c99c2a696871e486965ec6e2fa2aff4/pyudev-0.24.1.tar.gz"
SRC_URI[md5sum] = "fecaabe9eaa890d2173c7b49ab63a412"
SRC_URI[sha256sum] = "75e54d37218f5ac45b0da1f0fd9cc5e526a3cac3ef1cfad410cf7ab338b01471"

S = "${WORKDIR}/pyudev-0.24.1"

RDEPENDS_${PN} = ""

inherit setuptools3
