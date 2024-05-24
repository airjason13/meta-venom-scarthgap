
SUMMARY = "The most complete dark/light style sheet for C++/Python and Qt applications"
HOMEPAGE = "https://github.com/ColinDuquesnoy/QDarkStyleSheet"
AUTHOR = "Colin Duquesnoy <colin.duquesnoy@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5853d07295f06b810b88fb21825eed34"

SRC_URI = "https://files.pythonhosted.org/packages/ef/1e/5bf72a61a7636058e25eaa7503c050dae9445de75fad6f71ba08f2174e49/QDarkStyle-3.2.3.tar.gz"
SRC_URI[md5sum] = "4d0a2378b6bb56c9c8fb26bdeda0f2ec"
SRC_URI[sha256sum] = "0c0b7f74a6e92121008992b369bab60468157db1c02cd30d64a5e9a3b402f1ae"

S = "${WORKDIR}/QDarkStyle-3.2.3"

RDEPENDS_${PN} = "python3-qtpy"

inherit setuptools3
