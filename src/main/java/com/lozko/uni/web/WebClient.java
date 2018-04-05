package com.lozko.uni.web;

import com.lozko.uni.dao.BookRepository;
import com.lozko.uni.dao.ClientRepository;
import com.lozko.uni.model.Book;
import com.lozko.uni.model.Client;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WebClient {

  private final ClientRepository clientRepository;
  private final BookRepository bookRepository;

  @GetMapping("clients")
  public List<Client> findAll() {
    final List<Client> res = new ArrayList<>();
    clientRepository.findAll().forEach(res::add);
    return res;
  }

  @GetMapping("clients/{clientId}")
  public Client findOne(@PathVariable("clientId") int clientId) {
    return clientRepository.findOne(clientId);
  }

  @PostMapping("clients")
  public Client create(@RequestBody Client client) {
    return clientRepository.save(client);
  }

  @PostMapping("books")
  public Book createBook(@RequestBody Book book) {
    return bookRepository.save(book);
  }

  @GetMapping("books")
  public List<Book> findAllBooks() {
    final List<Book> res = new ArrayList<>();
    bookRepository.findAll().forEach(res::add);
    return res;
  }

  @GetMapping("books/{bookId}")
  public Book findOneBook(@PathVariable("bookId") int clientId) {
    return bookRepository.findOne(clientId);
  }

  @GetMapping("clients/{clientId}/books")
  public List<Book> findAllByClientId(@PathVariable("clientId") int clientId) {
    return bookRepository.findAllByClientId(clientId);
  }

  @DeleteMapping("clients/{clientId}")
  public void deleteOne(@PathVariable("clientId") int clientId) {
    clientRepository.delete(clientId);
  }

  @DeleteMapping("books/{bookId}")
  public void deleteOneBook(@PathVariable("bookId") int bookId) {
    bookRepository.delete(bookId);
  }
}
