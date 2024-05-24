SUMMARY = "All utils packages required for a base installation of VXFCE"
SECTION = "x11/wm"
PR = "r5"

# librsvg-gtk gets debian renamed to librsvg-2-gtk
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "x11"

RDEPENDS:${PN} = " \
	python3 \
	python3-pip \
	python3-setuptools \
	python3-flask \
	python3-flask-wtf \
	python3-numpy \
	python3-pyqt5 \
	python3-itsdangerous \
	python3-json \
	python3-wtforms \
	python3-qtmodern \
	python3-pyqtgraph \
	python3-ffmpy \
	python3-qdarkstyle \
	python3-qtpy \
	python3-pyudev \
	python3-psutil \
"
