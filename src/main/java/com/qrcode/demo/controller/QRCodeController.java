package com.qrcode.demo.controller;

import com.qrcode.demo.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {
    @Autowired
    QRCodeService qrCodeService;

    @RequestMapping(value="/getQRCode")
    public String getQRCode() throws IOException {
        return qrCodeService.crateQRCode("this is qrcode",200,200);
    }
}
