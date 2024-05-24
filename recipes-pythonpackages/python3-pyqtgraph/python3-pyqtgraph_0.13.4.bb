
SUMMARY = "Scientific Graphics and GUI Library for Python"
HOMEPAGE = "http://www.pyqtgraph.org"
AUTHOR = "Luke Campagnola <luke.campagnola@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f3e5f0e3bfada0ee09266e5402b0a690"

SRC_URI = "https://files.pythonhosted.org/packages/96/04/9dba6bfd9f883116f42d78208036a316e9d02fd6b1c3d0864ed26e87ddef/pyqtgraph-0.13.4.tar.gz"
SRC_URI[md5sum] = "a49159711dcce265cadd60cd331df69b"
SRC_URI[sha256sum] = "67b0d371405c4fd5f35afecfeb37d4b73bc118f187c52a965ed68d62f59b67b3"

S = "${WORKDIR}/pyqtgraph-0.13.4"

RDEPENDS_${PN} = "python3-numpy"

inherit setuptools3
