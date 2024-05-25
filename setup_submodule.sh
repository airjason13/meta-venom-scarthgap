#!/bin/sh

git checkout main

git submodule add  --force https://github.com/airjason13/pyLed_Server.git recipes-apps/ledserver/ledserver/pyLed_Server/
git submodule add --force https://chromium.googlesource.com/libyuv/libyuv.git recipes-apps/libyuv/libyuv/libyuv
git submodule add --force https://github.com/aircrack-ng/rtl8812au.git recipes-bsp/rtl8812au/rtl8812au
git submodule add --force https://github.com/airjason13/pyLed_test_server.git recipes-apps/ledtester/ledtester/pyLedTester
git submodule add --force https://github.com/airjason13/pyLedRATool.git recipes-apps/ledratool/ledratool/pyLedRATool



