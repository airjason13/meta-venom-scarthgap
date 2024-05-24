
SUMMARY = "Safely add untrusted strings to HTML/XML markup."
HOMEPAGE = "https://palletsprojects.com/p/markupsafe/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI = "https://files.pythonhosted.org/packages/87/5b/aae44c6655f3801e81aa3eef09dbbf012431987ba564d7231722f68df02d/MarkupSafe-2.1.5.tar.gz"
SRC_URI[md5sum] = "8fe7227653f2fb9b1ffe7f9f2058998a"
SRC_URI[sha256sum] = "d283d37a890ba4c1ae73ffadf8046435c76e7bc2247bbb63c00bd1a709c6544b"

S = "${WORKDIR}/MarkupSafe-2.1.5"

RDEPENDS_${PN} = ""

inherit setuptools3
