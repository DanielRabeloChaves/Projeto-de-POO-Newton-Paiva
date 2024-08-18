# Projeto de POO em Java com DDD e Microsserviços

Este projeto foi desenvolvido como parte do curso de Sistemas de Informação na Universidade Newton Paiva. O objetivo foi aplicar os conceitos de Programação Orientada a Objetos (POO), utilizando a arquitetura de Domain-Driven Design (DDD) e o padrão de microsserviços.

# Descrição do Projeto

O projeto tem como objetivo implementar um sistema distribuído seguindo os princípios da Programação Orientada a Objetos (POO), utilizando a arquitetura Domain-Driven Design (DDD) e dividindo o sistema em microsserviços. Cada microsserviço é responsável por uma parte específica do domínio, promovendo a separação de responsabilidades e escalabilidade.

# Arquitetura

A arquitetura do projeto segue o padrão de Domain-Driven Design (DDD) dividido em camadas:

*  Domain: Contém as entidades, agregados, repositórios e serviços de domínio.
*  Application: Contém os casos de uso e serviços de aplicação.
*  Infrastructure: Contém as implementações de repositórios, contexto de banco de dados e outros detalhes técnicos.
*  Interfaces: Contém as interfaces REST, que expõem as funcionalidades dos microsserviços.
O
s microsserviços são organizados por contexto delimitado, garantindo a independência entre os módulos e permitindo a evolução do sistema de forma modular.

#  Tecnologias Utilizadas
*  Java: Linguagem de programação principal.
*  Spring Boot: Framework para facilitar o desenvolvimento de microsserviços.
