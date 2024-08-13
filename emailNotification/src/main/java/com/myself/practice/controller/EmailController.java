package com.myself.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myself.practice.service.SendEmailService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class EmailController {
	private  final SendEmailService sendEmailService;
	@GetMapping("send")
public String sendEmail() {
		sendEmailService.sendEmail("arunmozhiselvaraj15@gmail.com", "Good Morning", "Wishes");
		return  "send SuccessFully";
	}
}
