SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=e4ac654ba9b61686c2dc854a1128a323"
FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"
SRC_URI += "file://home/ \
            file://bin/ \
            file://etc/ \
            file://LICENSE \
             "

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}/home/root/
    install -d ${D}/${bindir}
    install -d ${D}/${sysconfdir}/xdg/autostart/
    install -m 755 bin/xvenom-setting.sh ${D}/${bindir}
    install -m 755 bin/setup_hotspot.sh ${D}/${bindir}
    install -m 755 etc/xvenom-setting.desktop ${D}/${sysconfdir}/xdg/autostart/
    install -m 755 etc/gisled_default_connection ${D}/${sysconfdir}/
    cp -r home/piusb.bin ${D}/home/root/

}

#pkg_postinst_${PN} () {
#       chmod 777 /home/root/
#}




FILES:${PN} += " \
                /home/root/* \
                "

