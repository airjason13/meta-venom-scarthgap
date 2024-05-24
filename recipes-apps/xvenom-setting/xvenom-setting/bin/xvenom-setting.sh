#!/bin/sh
systemctl stop dnsmasq
systemctl disable dnsmasq

export DISPLAY=:0
xset s off -dpms
setup_hotspot.sh

