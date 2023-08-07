package com.miki.contactservice.service;

import com.miki.contactservice.model.Contact;
import java.util.List;

public interface ContactService {

  public List<Contact> getContact(Long id);

}
