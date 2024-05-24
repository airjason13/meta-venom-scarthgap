
SUMMARY = "Provides an abstraction layer on top of the various Qt bindings (PyQt5/6 and PySide2/6)."
HOMEPAGE = "https://github.com/spyder-ide/qtpy"
AUTHOR = "Colin Duquesnoy and the Spyder Development Team <spyder.python@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b2830f54500be1314b9ec6096989f983"

SRC_URI = "https://files.pythonhosted.org/packages/eb/9a/7ce646daefb2f85bf5b9c8ac461508b58fa5dcad6d40db476187fafd0148/QtPy-2.4.1.tar.gz"
SRC_URI[md5sum] = "9a4ed88d2b16b3e660265881430c4779"
SRC_URI[sha256sum] = "a5a15ffd519550a1361bdc56ffc07fda56a6af7292f17c7b395d4083af632987"

S = "${WORKDIR}/QtPy-2.4.1"

RDEPENDS_${PN} = "python3-packaging"

inherit setuptools3
