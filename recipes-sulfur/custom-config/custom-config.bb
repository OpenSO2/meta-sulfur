LICENSE = "GPL-2+"


do_install () {
   install -m 0755 -d ${D}${sysconfdir}
   install -b -m 0644 ${WORKDIR}/gpsd ${D}${sysconfdir}
#   install -b -m 0644 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}
#   ....
}
