package br.edu.ifspcjo.ads.web2.ifitness.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.edu.ifspcjo.ads.web2.ifitness.domain.model.User;
import br.edu.ifspcjo.ads.web2.ifitness.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;

@RestController //serverlet -> aplicação servidora
@RequestMapping("api/users")
public class UserResource {

    @Autowired  // Injeção de Dependência
    private UserRepository userRepository;

    @GetMapping // ->
    public List<User> list(){
      return userRepository.findAll();
    }

    @PostMapping 
    public User create(@RequestBody User user, HttpServletResponse response){
        return userRepository.save(user);
    }
    
}

// O Hibernate ORM é um framework para o mapeamento objeto-relacional escrito na linguagem Java. 
// Também está disponível em .NET com nome de NHibernate
// É um software livre da RedHat

// A ideia do Hibernate é facilitar a interação em o código e as tabelas do DataBase
// Foco nas regras de negócio, não na estrutura

// a notação @Table serve para indicar a tabela correta
// A recomendação do próprio Hibernate é que para produção será interessante gerenciar o schema com scripts de migração icrementais 
