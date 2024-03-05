SUMMARY = "rtl8812au wifi module"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRC_URI = " \
		file://android/ \	
		file://core/ \	
		file://docs/ \	
		file://hal/ \	
		file://include/ \	
		file://os_dep/ \	
		file://platform/ \	
		file://tools/ \	
		file://dkms.conf \	
		file://Kconfig \	
		file://Makefile \	
		file://README.md \	
		file://ReleaseNotes.pdf \	
		file://LICENSE \	
	"

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-rtl8812au"

