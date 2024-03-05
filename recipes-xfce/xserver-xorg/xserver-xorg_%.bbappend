FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"
SRC_URI += "file://99-vc4.conf"


do_install:append() {
	install -d ${D}/etc/X11/xorg.conf.d
	install -m 0755 ${WORKDIR}/99-vc4.conf ${D}/etc/X11/xorg.conf.d/
}
