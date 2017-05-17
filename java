@RestController: 
-É a mesma coisa que o @Controller do Spring MVC. 
-Porém, inclui automaticamente a anotação @ResponseBody.

@ResponseBody:
-Se usar num método, o spring vai converter o valor do retorno e gravar a resposta no http.
-Se usar num parametro, o spring vai converter o conteúdo do corpo em seu objeto de parâmetro.

@RequestMapping:
-Usado para mapear as classes/métodos.

ResponseEntity<>:
-Representa toda a resposta HTTP. Você pode controlar qualquer coisa que entra nele: código de status, cabeçalhos e corpo.
-Flexibilidade.

@PathVariable:
-Usada para obter o nome da variável e seu valor.

GET:
-Utiliza a propria URL para enviar os dados ao servidor.
-Envio de dados via URL.

POST:
-Envia os dados colocando-os no corpo da msg.
-Encapsula os dados do formulário dentro do envio http

service intercepta as operacoes de banco
camada intermediaria entre controll e repository

jwt:  
-framework/especificação/api/lib
-gera (algoritmos, tempo de expiração etc)  
-permite validar o token com suas propriedades 
-precisamos esconder o dentro do cabeçalho http o header "Authorization: bearer <token>" 
-verifica se é valido ou não
-quem tentar chamar cliente(qualquer requisição chamando produto) vai ter que chamar /admin (@restcontroller('/admin') 
-alguem vai interceptar (TokenFilter) 	
-verifica se tem token e se ele é válido. Se for valido ele deixa vc acessar.
-na classe que rodamos a aplicação, precisamos registrar o filter
-criar um interceptor

Framework:
-Códigos para uma funcionalidade genérica.
-Conjunto de classes para realizar uma resposabilidade.

MVC:
-modelo de desenvolvimento de software.
-artuitetura padrao.
-isola a lógica da interface do usuário.
M- manipulação dos dados (leitura, escrita e validações dos dados)
V- interação do usuário  (exibição dos dados)
C- controle (manipula as requisições http do usuário)

Model:
-Onde representa os modelos do 'mundo real' com seus atributos.

View:
-Representa o HTML/layout

Controller:
-Responsável por receber e processar uma requisição
-Decide a partir da lógica implementada se utilizará ou não o Model.
-Retorna a view para o browser.

Maven:
-O maven faz gerencia de dependencias do projeto, e gerencia a ciclo de vida do projeto e as etapas para construção do mesmo.
-Por padrão, limpar, compilar, testar, empacotar, distribuir.
-Tudo é baseado no arquivo pom.xml.
-A gerencia de dependencias evita aquela maldita pasta lib com os jars da sua aplicação.

Spring:
-Framework
-Existem vários módulos nele(Spring Data, Security, Persistencia, etc) .
-Cabe ao desenvolvedor dizer ao Spring o que quer usar. 
-O que faz dele uma poderosa ferramenta, pois não existe a necessidade de se arrastar todas as ferramentas do framework para criar uma aplicação simples.

Spring Criticas:
-Maneira que configuramos o seu container de injeção de dependências e inversão de controle usando arquivos de configuração no formato XML.
-Complexidade na gestão de dependências.

Spring Boot:
-"Micro framework" que apenas reaproveita o spring, aumentando a produtividade. 
-Diferente da burocrática configuração do Spring, ele automatiza a mesma.

Thymeleaf:
-A ideia de Thymeleaf é ofertar uma alternativa elegante a outros template engines como JSP ou velocity, especialmente em aplicações feitas com Spring MVC. 
-É uma engine de templates com algumas vantagens
-Dinamizar as páginas html
-3 vantagens sobre o JSP
.funciona independente de estar num serviço web
.JSP burocrático para evoluir. Thymeleaf em crescimento maior.
.facilidade para renderizar arquivos 
-mecanismo de renderização da visualização
-O Spring Boot usará e configurará automaticamente o Thymeleaf como mecanismo de renderização da visualização, desde que esteja no classpath.

O Hibernate é uma ferramenta ORM open source e é a líder de mercado, sendo a inspiração para a especificação Java Persistence API (JPA). 
O Hibernate nasceu sem JPA mas hoje em dia é comum acessar o Hibernate pela especificação JPA. 
Como toda especificação, ela deve possuir implementações.
O Hibernate abstrai o seu código SQL, toda a camada JDBC e o SQL será gerado em tempo de execução. 
Mais que isso, ele vai gerar o SQL que serve para um determinado banco de dados, já que cada banco fala um "dialeto" diferente dessa linguagem. 
Assim há também a possibilidade de trocar de banco de dados sem ter de alterar código Java, já que isso fica de responsabilidade da ferramenta.
Como usaremos JPA abstraímos mais ainda, podemos desenvolver sem conhecer detalhes sobre o Hibernate

Sabe o que é API? É a possibilidade de descartar uma série de atividades repetitivas 
É como um tradutor, um intérprete que ouve uma pessoa falando grego e traduz para o português para que você entenda suas instruções.





