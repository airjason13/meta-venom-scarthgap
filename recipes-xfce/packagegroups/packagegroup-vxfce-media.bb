SUMMARY = "All media packages required for a base installation of VXFCE"
SECTION = "x11/wm"
PR = "r5"

# librsvg-gtk gets debian renamed to librsvg-2-gtk
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup features_check

REQUIRED_DISTRO_FEATURES = "x11"

PREFERRED_VERSION_ffmpeg = "4.4"
PACKAGECONFIG:append:pn-ffmpeg = " pthreads"
PACKAGECONFIG:append:pn-ffmpeg = " sdl2 "
PACKAGECONFIG:append:pn-ffmpeg = " libwebp "
PACKAGECONFIG:append:pn-ffmpeg = " gpl x264"
PACKAGECONFIG:append:pn-ffmpeg = " libzmq "
PACKAGECONFIG:append:pn-ffmpeg = " freetype "
PACKAGECONFIG:append:pn-ffmpeg = " mmal "
PACKAGECONFIG:append:pn-ffmpeg = " omx-rpi "
PACKAGECONFIG:append:pn-ffmpeg = " avresample "
#PACKAGECONFIG:append:pn-ffmpeg = " libdrm "
#PACKAGECONFIG:append:pn-ffmpeg = " libaom "

RDEPENDS:${PN} = " \
	v4l-utils \
	bluez5 \
	blueman \
	mesa-demos \
	xfce4-screenshooter \
	pulseaudio \
	alsa-lib \
	alsa-plugins \
	alsa-tools \
	thunar-volman \
	gstreamer1.0 \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-bad \
	gstreamer1.0-plugins-good \
	gstreamer1.0-plugins-ugly \
	gstreamer1.0-libav \
	gstreamer1.0-rtsp-server \
	gstreamer1.0-vaapi \
	mpv \
	opencv \
"
