**Estrutura do Banco de Dados**

OCORRENCIA

* ID (int \- autoincrement)  
* user (int)  
* cpeccv (int)  
* rg (string)  
* perito (string)  
* fotografo (string)  
* motorista (string)  
* gerente (string)  
* comunicante (string)  
* dia\_comunicacao (int)  
* mes\_comunicacao (int)  
* ano\_comunicacao (int)  
* hora\_comunicacao (string)  
* tipo\_pericia (string)  
* data\_inic\_pericia (string)  
* hora\_inic\_pericia (string)  
* data\_fim\_pericia (string)  
* hora\_fim\_pericia (string)  
* data\_fato (string)  
* hora\_fato (string)  
* tipo\_oc (string)  
* delegacia\_local (string)  
* equipe\_atendente (string)  
* bo\_delegacia (string)  
* criacao\_form (string)

LAUDO

* ID (int \- autoincrement)  
* ocorrencia (int)  
* data\_laudo (timestamp)  
* historico\_laudo (text)  
* solicitante\_laudo (string)  
* num\_fotos (int)  
* conclusao (text)

LAUDO (ocorrencia) REFERENCES OCORRENCIA (ID)

ENDERECO

* ID (int \- autoincrement)  
* ocorrencia (int)  
* tipo\_local (string)  
* rua (string)  
* complemento (string)  
* bairro (string)  
* cidade (string)  
* estado (string)  
* coordenadas (string)  
* condicoes\_tempo (text)  
* observacao (text)

ENDERECO (ocorrencia) REFERENCES OCORRENCIA (ID)

EQUIPE\_SOCORRO

* ID (int \- autoincrement)  
* ocorrencia (int)  
* viatura (string)  
* medico\_crm (string)  
* instituicao (string)  
* horario\_obito (string)  
* data\_obito (string)  
* observacao (text)

EQUIPE\_SOCORRO (ocorrencia) REFERENCES OCORRENCIA (ID)

ISOLAMENTO

* ID (int \- autoincrement)  
* endereco (int)  
* ocorrencia (int)  
* instituicao (string)  
* viatura (string)  
* batalhao (string)  
* responsaveis (string)  
* preservacao\_contento (boolean)  
* isolamento\_contento (boolean)  
* observacao\_preservacao (text)  
* observacao\_isolamento (text)  
* observacao\_geral (text)

ISOLAMENTO (endereco) REFERENCES ENDERECO (ID)

LESAO

* ID (int \- autoincrement)  
* vitima (int)  
* ocorrencia (int)  
* dia\_lesoes (int)  
* tipo\_lesao (string)  
* causa (string)  
* localizacao\_lesao (string)  
* descricao (text)  
* quantidade (int)  
* num\_lesao (int)  
* arma\_usada (string)  
* observacao (text)

LESAO (vitima) REFERENCES VITIMA (ID)  
LESAO (dia\_lesoes) REFERENCES DIA\_LESOES (ID)

OBSERVACAO

* ID (int \- autoincrement)  
* tipo (string)  
* ocorrencia (int)  
* observacao (text)

OBSERVACAO (ocorrencia) REFERENCES OCORRENCIA (ID)

PERTENCE

* ID (int \- autoincrement)  
* ocorrencia (int)  
* vitima (int)  
* tipo (string)  
* nome (string)  
* onde\_encontrado (string)  
* onde\_enviado (string)  
* observacao (text)

PERTENCE (vitima) REFERENCES VITIMA (ID)

PESSOA

* ID (int \- autoincrement)  
* ocorrencia (int)  
* tipo\_pessoa (string)  
* nome (string)  
* data\_nascimento (string)  
* endereco (text)  
* observacao (text)

PESSOA (ocorrencia) REFERENCES OCORRENCIA (ID)

VESTIGIO

* ID (int \- autoincrement)  
* ocorrencia (int)  
* referencia (string)  
* quantidade (int)  
* vestigio (string)  
* onde\_encontrado (string)  
* exame\_local (boolean)  
* coletado (boolean)  
* onde\_enviado (string)  
* quais\_exames (string)  
* observacao (text)

VESTIGIO (ocorrencia) REFERENCES OCORRENCIA (ID)

VITIMA

* ID (int \- autoincrement)  
* ocorrencia (int)  
* nome (string)  
* tipo (string)  
* data\_nascimento (string)  
* nome\_pai (string)  
* nome\_mae (string)  
* sexo (string)  
* num\_cad (string)  
* endereco (string)  
* escolaridade (string)  
* usa\_drogas (boolean)  
* quais\_drogas (string)  
* possui\_enfermidades (boolean)  
* quais\_enfermidades (string)  
* usa\_medicamentos (boolean)  
* quais\_medicamentos (string)  
* tipo\_lesao (text)  
* armas\_usadas (text)  
* posicionamento (text)  
* observacao (text)

VITIMA (ocorrencia) REFERENCES OCORRENCIA (ID)

USUARIO

* ID (int \- autoincrement)  
* nome (string)  
* user (string)  
* senha (string)  
* email (string)  
* tipo (string)  
* cargo (string)  
* ativo (boolean)

TAGS\_OFICIAIS

* ID (int \- autoincrement)  
* nome (string)  
* conteudo (string)

TAGS\_PESSOAIS

* ID (int \- autoincrement)  
* usuario (int)  
* nome (string)  
* conteudo (string)

TAGS\_PESSOAIS (usuario) REFERENCES (ID)

DIAGRAMA

* ID (int \- autoincrement)  
* nome (string)  
* lista\_locais (text)  
* imagem (string)  
* mapa (longtext)  
* largura (int)  
* zoom (int)

DIA\_LESOES

* ID (int \- autoincrement)  
* diagrama (int)  
* mapa (longtext)

DIA\_LESOES (diagrama) REFERENCES DIAGRAMA (ID)

LOGS

* ID (int \- autoincrement)  
* usuario (int)  
* referencia (string)  
* referencia\_id (int)  
* tipo (string)  
* mensagem (string)  
* data\_hora (datetime ou timestamp)

LOGS (usuario) REFERENCES USUARIO (ID)

GRUPO

* ID (int \- autoincrement)  
* nome (string)  
* descricao (string)  
* data\_inicio (datetime ou timestamp)  
* status (boolean)

USER\_GRUPO

* usuario (int)  
* grupo (int)  
* data\_entrada (date)

USER\_GRUPO(usuario) REFERENCES USUARIO(ID)  
USER\_GRUPO(grupo) REFERENCES GRUPO(ID)

