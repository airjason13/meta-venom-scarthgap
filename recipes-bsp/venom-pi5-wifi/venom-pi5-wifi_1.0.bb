SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=e4ac654ba9b61686c2dc854a1128a323"

FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"
SRC_URI += "file://brcmfmac43455-sdio.txt \
	    file://brcmfmac43455-sdio.clm_blob \	
	    file://brcmfmac43455-sdio.bin \	
	    file://LICENSE \
		"

do_install() {
	install -d ${D}/lib/firmware/brcm
	#install -m 0644 ${WORKDIR}/brcmfmac43455-sdio.txt ${D}/lib/firmware/brcm/brcmfmac43455-sdio.txt
	#install -m 0644 ${WORKDIR}/brcmfmac43455-sdio.clm_blob ${D}/lib/firmware/brcm/brcmfmac43455-sdio.clm_blob
	install -m 0644 ${WORKDIR}/brcmfmac43455-sdio.bin ${D}/lib/firmware/brcm/brcmfmac43455-sdio.raspberrypi,5-model-b.bin

}

FILES:${PN} += " \
                /lib/* \
                "

