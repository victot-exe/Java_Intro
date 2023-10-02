**Linguagem de baixo nível** -> linguagem de maquina (Assembly)  
**Linguagem de alto nível** -> linguagens de programação (Python, Java...)  

## Programação estruturada
__É um paradgma de programação que visa melhorar a clareza, a qualidadae e o tempo de desenvolvimento__
* Uso extensivo das construções de fluxo(if, then, else)
* Linearidade

# Programação orientada a objetos
**Baseado no conceito de objetos, abstração de objetos do mundo real**
## Classes
* Toda a estrutura do código em Java é baseado em classes.
* Os arquivos são `NomeDaClasse.java`
* __Classe__ `class`: direciona a criação dos objetos de mesmo tipo.
* __Identificador__ `identity`: propósito dos objetos que serão criados (usar um nome claro)
* __Caracteristicas__ `states`: atributos ou propriedades (representam caracteristicas do objeto)
* __Comportamentos__ `behavior`: ações que o objeto tem, coisas que ele faz.
* __Instanciar__ `new`: quando se cria um objeto a partir de um molde (outro objeto)
### Exemplo
**Classe**: `Pessoa` => `identity`  
**Caracteristicas**{  
    raça:  
    sexo:  
    altura:  
    nome:  
}  
**Comportamentos**:{  
    andar()  
    correr()  
    comer()  
    dormir()  
}

**Instancia** menino = new Pessoa{  
    menino então vai herdar as caracteristicas e comportamentos de pessoa, podendo altera-los e adcionar novos, sendo uma variação feita a partir de um molde.  
}  


### Classificações de classes
* `model` -> Representa estrutura de domínio do app: Cliente, Pedido, Nota fiscal, etc...  
* `service` -> Regras de negócio e validação do sistema.
* `repository` -> Contém uma integração com o Banco de dados.
* `controller` -> Com finalidade de comunicação externa ao app: http, web ou webservices.
* `util` -> Contém recursos comuns para todo o app.
