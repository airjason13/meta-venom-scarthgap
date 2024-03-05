SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"
SRC_URI += "file://xfce-blue.jpg \
	    file://xfce-teal.jpg \ 
	    file://xfce-shapes.svg \ 
	    file://xfce-stripes.png \
	    file://xfce-verticals.png	"

do_install:append() {
	install -m 0444 ${WORKDIR}/xfce-blue.jpg ${D}${datadir}/backgrounds/xfce
	install -m 0444 ${WORKDIR}/xfce-teal.jpg ${D}${datadir}/backgrounds/xfce
	install -m 0444 ${WORKDIR}/xfce-shapes.svg ${D}${datadir}/backgrounds/xfce
	install -m 0444 ${WORKDIR}/xfce-stripes.png ${D}${datadir}/backgrounds/xfce
	install -m 0444 ${WORKDIR}/xfce-verticals.png ${D}${datadir}/backgrounds/xfce
}



