1. **TABELAS PRINCIPAIS**

**1.1. MODELO RELACIONAL ATUAL**

OCORRENCIA (cod\_oc, cpeccv, rg, equipe\_perito, equipe\_fotografo, equipe\_motorista, gerente\_chefe, comunicante\_oc, data\_comunic\_oc, hora\_comunic\_oc, tipo\_pericia, data\_inic\_pericia, hora\_inic\_pericia, data\_fim\_pericia, hora\_fim\_pericia, data\_fato, hora\_fato, tipo\_oc, delegacia\_local, solicitante\_laudo\_bo, equipe\_atendente, bo\_delegacia)

VITIMA (cod\_vit, nome\_vitima, tipo\_vitima, data\_nascimento, nome\_mae, sexo\_vitima, cod\_oc, num\_cad, nome\_pai, endereco, escolaridade, usa\_drogas, quais\_drogas, possue\_enfermidades, quais\_enfermidades, usa\_medicamentos, quais\_medicamentos, tipo\_lesao, armas\_usadas, observacao)  
VITIMA (cod\_oc) REFERENCES OCORRENCIA (cod\_oc)

EQUIPE\_SOCORRO (cod\_eq\_soc, viatura, medico\_crm, instituicao, horario\_obito\_soc, data\_obito\_soc, cod\_oc\_soc, observacao)  
EQUIPE\_SOCORRO (cod\_oc\_soc) REFERENCES OCORRENCIA (cod\_oc)

ENDERECO (id\_endereco, tipo\_local, rua, complemento, bairro, cidade, estado, cod\_end\_oc, coordenadas, observacao)  
ENDERECO (cod\_end\_oc) REFERENCES OCORRENCIA (cod\_oc)

LESAO (cod\_lesao, tipo\_lesao, causa, localizacao\_lesao, descricao, cod\_vitima\_lesao, quantidade, num\_lesao, arma\_usada, observacao)  
LESAO (cod\_vitima\_lesao) REFERENCES VITIMA (cod\_vit)

ISOLAMENTO (cod\_isolamento, instituicao, viatura, batalhao, responsaveis, preservacao\_contento, isolamento\_contento, observacao\_preservacao, observacao\_isolamento, cod\_oc\_iso, observacao\_geral)  
ISOLAMENTO (cod\_oc\_iso) REFERENCES OCORRENCIA (cod\_oc)

PESSOA (cod\_pessoa, tipo\_pessoa, nome, data\_nascimento, observacoes, cod\_oc\_pessoa, endereco)  
PESSOA (cod\_oc\_pessoa) REFERENCES OCORRENCIA (cod\_oc)

VESTIGIOS (num\_vestigio, num\_vest\_oc, referencia\_vest, quantidade\_vest, vestigio, onde\_encontrado, exame\_no\_local, foi\_coletado, p\_onde\_foi\_enviado, quais\_exames, observacoes)  
VESTIGIOS (num\_vest\_oc) REFERENCES OCORRENCIA (cod\_oc)

OBSERVACOES (cod\_obs, ref\_obs, observ, cod\_obs\_oc)  
OBSERVACOES (cod\_obs\_oc) REFERENCES OCORRENCIA (cod\_oc)

PERTENCES (num\_pertence, num\_pert\_vit, tipo, nome, onde\_encontrado, para\_onde\_enviado, observacoes)  
PERTENCES (num\_pert\_vit) REFERENCES VITIMA (cod\_vit)  
**1.2. MODELO RELACIONAL SUGERIDO**

OCORRENCIA (ID, cpeccv, rg, perito, fotografo, motorista, gerente, comunicante, data\_comunic, hora\_comunic, tipo\_pericia, data\_inic\_pericia, hora\_inic\_pericia, data\_fim\_pericia, hora\_fim\_pericia, data\_fato, hora\_fato, tipo\_oc, delegacia\_local, solicitante\_laudo\_bo, equipe\_atendente, bo\_delegacia)

ENDERECO (ID, ocorrencia, tipo\_local, rua, complemento, bairro, cidade, estado, coordenadas, observacao)  
ENDERECO (ocorrencia) REFERENCES OCORRENCIA (ID)

EQUIPE\_SOCORRO (ID, ocorrencia, viatura, medico\_crm, instituicao, horario\_obito, data\_obito, observacao)  
EQUIPE\_SOCORRO (ocorrencia) REFERENCES OCORRENCIA (ID)

ISOLAMENTO (ID, ocorrencia, instituicao, viatura, batalhao, responsaveis, preservacao\_contento, isolamento\_contento, observacao\_preservacao, observacao\_isolamento, observacao\_geral)  
ISOLAMENTO (ocorrencia) REFERENCES OCORRENCIA (ID)

LESAO (ID, vitima, dia\_lesoes, tipo\_lesao, causa, localizacao\_lesao, descricao, quantidade, num\_lesao, arma\_usada, observacao)  
LESAO (vitima) REFERENCES VITIMA (ID)  
LESAO (dia\_lesoes) REFERENCES DIA\_LESOES (ID)

OBSERVACOES (ID, ocorrencia, observacao)  
OBSERVACOES (ocorrencia) REFERENCES OCORRENCIA (ID)

PERTENCES (ID, vitima, tipo, nome, onde\_encontrado, para\_onde\_enviado, observacoes)  
PERTENCES (vitima) REFERENCES VITIMA (ID)

PESSOA (ID, ocorrencia, tipo\_pessoa, nome, data\_nascimento, observacao, endereco)  
PESSOA (ocorrencia) REFERENCES OCORRENCIA (ID)

VESTIGIOS (ID, ocorrencia, referencia\_vest, quantidade\_vest, vestigio, onde\_encontrado, exame\_no\_local, foi\_coletado, p\_onde\_foi\_enviado, quais\_exames, observacao)  
VESTIGIOS (ocorrencia) REFERENCES OCORRENCIA (ID)

VITIMA (ID, ocorrencia, nome\_vitima, tipo\_vitima, data\_nascimento, nome\_pai, nome\_mae, sexo\_vitima, num\_cad, endereco, escolaridade, usa\_drogas, quais\_drogas, possue\_enfermidades, quais\_enfermidades, usa\_medicamentos, quais\_medicamentos, tipo\_lesao, armas\_usadas, observacao)  
VITIMA (ocorrencia) REFERENCES OCORRENCIA (ID)

**2\. 	OUTRAS TABELAS**

**2.1. LOGIN**

USUARIO (ID, nome, user, senha, email, tipo, cargo, ativo)  
nome: Nome real do usuário  
user: Nome de usuário do login  
senha: Senha do login  
email: E-mail do usuário, pode ser usado como username no login  
tipo: Tipo de usuário do sistema (admin/usuário comum)  
cargo: Cargo do usuário na vida real  
ativo: Determina se o usuário está ativo no sistema ou inativo (excluído)

**2.2. SUGESTÕES (AUTOCOMPLETE TAGS)**

TAGS\_OFICIAIS (ID, nome, conteudo)  
nome: Nome do campo  
conteudo: Conteudo da sugestão que pode ser predefinido ou adicionado após muitos usuários adicionarem o mesmo em suas sugestões pessoais (há mais de uma sugestão por campo/nome)

TAGS\_PESSOAIS (ID, usuario, nome, conteudo)  
TAGS\_PESSOAIS (usuario) REFERENCES (ID)  
usuario: Usuario associado a uma sugestão nova criada por ele  
nome: Nome do campo do conteúdo da sugestão (ex.: tipo\_lesao, tipo\_ocorrencia, etc.)  
conteudo: String do autopreenchimento do campo, ou seja, o conteúdo da sugestão

**2.3. DIAGRAMA DE LESÕES**

DIAGRAMA (ID, nome, lista\_locais, imagem, mapa, largura, zoom)  
nome: Nome do diagrama  
lista\_locais: Lista dos locais cadastrados que são associados aos pontos  
imagem: Imagem de fundo do diagrama  
mapa: HTML do mapa de pontos  
largura: Define o tamanho do diagrama em pixels  
zoom: Ampliação do diagrama (em fase de testes)

DIA\_LESOES (ID, diagrama, mapa)  
DIA\_LESOES (diagrama) REFERENCES DIAGRAMA (ID)  
diagrama: Define o diagrama de fundo  
mapa: Novos pontos que simbolizam o local exato das lesões no diagrama

**2.4. LOGS DO SISTEMA**

LOGS (ID, usuario, referencia\_id, referencia, tipo, mensagem, data\_hora)  
LOGS (usuario) REFERENCES USUARIO (ID)  
tipo: Criação, Exclusão, Modificação, Visualização, Compartilhamento, Geramento, Importação, Exportação  
referencia: Linka ao ID de outra tabela relacionada à ação do log  
Ex.: O usuário X criou o diagrama Corpo Humano \- referencia: ID do Diagrama

**2.5. GRUPOS**

GRUPO (ID, nome, descricao, data\_inicio, status)  
status: Ativo ou Inativo

USER\_GRUPO(usuario, grupo, data\_entrada)  
USER\_GRUPO(usuario) REFERENCES USUARIO(ID)  
USER\_GRUPO(grupo) REFERENCES GRUPO(ID)  
