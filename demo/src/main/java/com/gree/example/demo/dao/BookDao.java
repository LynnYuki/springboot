package com.gree.example.demo.dao;

import com.gree.example.demo.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookDao extends ElasticsearchRepository<Book, String> {
}
