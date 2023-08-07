package com.miki.contactservice.service;

import com.miki.contactservice.model.Contact;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

  List<Contact> contactList = Arrays.asList(
      new Contact(1L, "email1@example.com", "Alice Smith", 1L),
      new Contact(2L, "email2@example.com", "Bob Johnson", 2L),
      new Contact(3L, "email3@example.com", "Charlie Brown", 3L),
      new Contact(4L, "email4@example.com", "David Lee", 4L),
      new Contact(5L, "email5@example.com", "Emily Davis", 5L),
      new Contact(6L, "email6@example.com", "Frank Martin", 6L),
      new Contact(7L, "email7@example.com", "Grace Kim", 7L)
  );

  @Override
  public Contact getContact(Long id) {
    return contactList.stream().filter(contact -> contact.getUserId().equals(id)).findAny()
        .orElse(null);
  }

}