package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Requisicao;
import com.example.demo.repositories.RequisicaoRepository;
// import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Service
public class HelloService {

     @Autowired
     private RequisicaoRepository requisicaoRepository;
 
     Integer quantidadeGets = 0;
     Integer quantidadePuts = 0;
     Integer quantidadePosts = 0;
     Integer quantidadeDeletes = 0;
 
     public Integer quantidadeGets(){
         // integer  = inteiro
         Requisicao requisicao = requisicaoRepository.getReferenceById(1);
         Integer getsDoBanco = requisicao.getGets();
 
         requisicao.setGets(getsDoBanco+1);
         requisicaoRepository.save(requisicao);
 
         return requisicao.getGets();
     }
 
     public Integer quantidadePuts(){
         // integer  = inteiro
         Requisicao requisicao = requisicaoRepository.getReferenceById(1);
 
         Integer putsDoBanco = requisicao.getPuts();
 
         requisicao.setPuts(putsDoBanco+1);
         requisicaoRepository.save(requisicao);
 
         return requisicao.getPuts();
     }
 
     
     public Integer quantidadePosts(){
         // integer  = inteiro
         Requisicao requisicao = requisicaoRepository.getReferenceById(1);
 
         Integer postsDoBanco = requisicao.getPosts();
 
         requisicao.setPosts(postsDoBanco+1);
         requisicaoRepository.save(requisicao);
 
         return requisicao.getPosts();
     }
 
     public Integer quantidadeDeletes(){
         // integer  = inteiro
         Requisicao requisicao = requisicaoRepository.getReferenceById(1);
 
         Integer deletesDoBanco = requisicao.getDeletes();
 
         requisicao.setDeletes(deletesDoBanco+1);
         requisicaoRepository.save(requisicao);
 
         return requisicao.getDeletes();
     }
}
