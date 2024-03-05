SUMMARY = "All utils packages required for a base installation of VXFCE"
SECTION = "x11/wm"
PR = "r5"

# librsvg-gtk gets debian renamed to librsvg-2-gtk
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "x11"

RDEPENDS:${PN} = " \
	htop \
	atop \
	vim \
	git \
	ntp \
	networkmanager \
	network-manager-applet \
	networkmanager-nmcli \
	usbutils \
	raspi-gpio \
	rpi-gpio \
	intltool \
	m4 \
	bison \
	ninja \
	meson \
	tigervnc \
	hostapd \
	ethtool \
	dnsmasq \
	cmake \
	gvfs \
	gettext \
	ibus \
	dconf \
	xwininfo \
	xdotool \
	linux-firmware \
	openssh \
	openvpn \
	valgrind \
	strace \
"
