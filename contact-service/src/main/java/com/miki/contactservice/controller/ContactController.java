package com.miki.contactservice.controller;

import com.miki.contactservice.model.Contact;
import com.miki.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

  @Autowired
  ContactService contactService;

  @GetMapping("/{id}")
  public Contact getContact(@PathVariable Long id){
    return contactService.getContact(id);
  }

}
