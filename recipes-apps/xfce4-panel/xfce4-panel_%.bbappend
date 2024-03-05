SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"
SRC_URI += "file://default.xml"

do_install:append() {
       mkdir -p ${D}/etc/xdg/xfce4/panel/
       install -m 0644 ${WORKDIR}/xfce4-panel.xml ${D}/etc/xdg/xfce4/panel/default.xml
}



