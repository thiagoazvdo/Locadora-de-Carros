# Projeto utilizando classes de datas e horas 
(versão -> Jdk 8 ou superior)

Bem-vindo ao projeto da Locadora de Carros! 
Este é um sistema Java que gerencia o cadastro de carros, clientes, aluguel e devolução de veículos. 
O projeto utiliza algumas funcionalidades da biblioteca Java para trabalhar com datas e horas.

Funcionalidades
O sistema possui as seguintes classes com métodos que fazem uso da biblioteca Java:

# 1. Classe CadastroCarro:
Nesta classe, é utilizado o método Year.of para criar objetos Year que representam o ano de fabricação 
dos carros cadastrados.

# 2. Classe CadastroCliente
Aqui, é feito uso do método Period.between em conjunto com LocalDate.now() para calcular a idade dos 
clientes cadastrados com base em sua data de nascimento.

# 3. Classe DevolucaoCarro
Nesta classe, utilizamos LocalDateTime.of para criar objetos LocalDateTime que representam a data e 
hora de devolução dos carros alugados. Além disso, o método plusDays() é utilizado para adicionar 
dias à data de devolução e o método plusHours() para adicionar horas, a fim de calcular o horário limite 
de devolução. Também é feita referência ao enum Month.FEBRUARY para representar o mês de fevereiro em 
uma devolução (o mês de fevereiro foi apenas um exemplo, poderia ser qualquer outro mês).

# 4. Classe NovoAluguel
Nesta classe, é utilizado o método DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm") para definir o padrão de 
data e hora desejado para o cadastro de novos aluguéis. Isso permite que o usuário informe a data e hora 
de início do aluguel e esse padrao de formato seja aplicado.


