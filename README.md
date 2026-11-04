# 🐾 Vitalia API

O Vitalia é uma plataforma de monitoramento inteligente para animais de estimação, integrando tutores, veterinários e dispositivos IoT para garantir a saúde e o bem-estar animal.

---

# 🚀 Swagger UI & Consoles

Acesse a documentação interativa e realize testes diretamente pelo navegador:

```bash
https://vitalia-txa9.onrender.com/swagger-ui/index.html#/
```
```bash
http://localhost:8080/swagger-ui/index.html
```
```bash
http://localhost:8080
```
---

# 🔗 Link Youtube

```bash
https://www.youtube.com/watch?v=OFF-OnubFsc
```
---

# ⚙️ Como Configurar e Executar com Oracle / Flyway

### 1. Pré-requisitos
* Java JDK 17 instalada.
* Acesso a uma instância do **Oracle Database**.

### 2. Configuração de Variáveis de Ambiente
Configure as seguintes variáveis no seu ambiente ou no arquivo de propriedades:
* `ORACLE_URL`: `jdbc:oracle:thin:@//host:port/service`
* `ORACLE_USER`: Seu usuário do banco
* `ORACLE_PASSWORD`: Sua senha do banco
* `JWT_SECRET`: Chave secreta para os tokens

*(Nota: O projeto não possui um carregador específico de arquivo `.env`; o Spring lê as variáveis de ambiente diretamente).*

### 3. Executando as Migrações
O projeto utiliza o **Flyway** para gerenciar e versionar o banco de dados Oracle de forma automatizada ao iniciar a aplicação.

---

# 💻 Como Iniciar a Aplicação
Mac/Linux
```bash
chmod +x mvnw
./mvnw spring-boot:run
```
Windows
```bash
.\mvnw.cmd spring-boot:run
```
---

🧪 Executando os Testes Automatizados
Mac/Linux
```bash
./mvnw clean test
```
Windows
```bash
.\mvnw.cmd clean test
```
---
  
# 🏗️ Divisão da Arquitetura 
    React Native
    ├── Java -> autenticação + operacional
    └── .NET -> comercial
  * JWT Cross-Platform: O token JWT gerado pelo backend Java é totalmente compatível e validado pelo .NET.
---

# 🔐 Roles do Sistema 
    * TUTOR
    * VETERINARIAN
    * ADMIN
---

# ⚙️ Como Executar e Testar
    * Para rodar a suíte de testes automatizados da aplicação Java, utilize o comando:
```bash
./mvnw test
```
---

# 📅 Cronograma

💡 **Nota sobre o Histórico de Desenvolvimento:** As menções às entidades Account, Responsible, Veterinarian
e ResponsibleRequest presentes nas primeiras entradas datam da fase inicial do projeto (evolução da arquitetura
original para o ecossistema atual do Vitalia). Elas foram posteriormente refatoradas, unificadas ou renomeadas
para estruturas mais robustas como AppUser.

| Atividade | Responsável | Data | Status |
|--------|----------|------------|------------|
| Implementação da entidade Account | Manuelalacerda | 13/05 | Concluído |
| Configuração inicial do Swagger/OpenAPI | Manuelalacerda | 13/05 | Concluído |
| Criação do README e guia de testes | Manuelalacerda | 13/05 | Concluído |
| Implementação da entidade Responsible | Manuelalacerda | 13/05 | Concluído |
| Ajustes de validações do AccountRequest | Manuelalacerda | 15/05 | Concluído |
| Ajustes de validações do ResponsibleRequest | Manuelalacerda | 15/05 | Concluído |
| Implementação da entidade Veterinarian | Manuelalacerda | 15/05 | Concluído |
| Implementação da entidade Pet | Manuelalacerda | 15/05 | Concluído |
| Ajustes e correções dos endpoints | Manuelalacerda | 15/05 | Concluído |
| Implementação da entidade ClinicalHistory | Manuelalacerda | 15/05 | Concluído |
| Documentação do módulo ClinicalHistory | Manuelalacerda | 15/05 | Concluído |
| Implementação da entidade Alert | Manuelalacerda | 15/05 | Concluído |
| Implementação da entidade Appointment | Manuelalacerda | 15/05 | Concluído |
| Correção de paginação e cache do módulo Pet | Manuelalacerda | 18/05 | Concluído |
| Correção de paginação e cache do módulo Responsible | Manuelalacerda | 18/05 | Concluído |
| Configuração de cache na aplicação | Manuelalacerda | 18/05 | Concluído |
| Ajustes do SwaggerConfig | Manuelalacerda | 18/05 | Concluído |
| Correção dos HTTP Responses | Manuelalacerda | 18/05 | Concluído |
| Organização de imagens e estrutura do projeto | Manuelalacerda | 21/05 | Concluído |
| Atualizações da documentação README | Manuelalacerda | 21/05 | Concluído |
| Adição da pasta de testes e exportação Postman | Manuelalacerda | 21/05 | Concluído |
| Refatoração do Flyway, roles e validações de Appointment e ClinicalHistory | Manuelalacerda | 07/09 | Concluído |
| Padronização de DTOs, segurança no PetService e coleção Postman | Manuelalacerda | 09/09 | Concluído |
| Restrição de alertas/históricos para Admin/Vet e autorização DRY | Manuelalacerda | 10/09 | Concluído |
| Suíte de testes de integração, auth bearer no Postman e refatoração de regras | Manuelalacerda | 11/09 | Concluído |
| Atualização de dados de perfil do tutor (CPF, data de nascimento e endereço) | Manuelalacerda | 12/09 | Concluído |
| Criação do `SpeciesController`, `BreedService`, DTOs e migration V4 (`seed_species_and_breeds`) | Moisés | 13/09 | Concluído |
| Implementação do endpoint de exclusão de conta (`DELETE /users/{id}`) e `/auth/me` | Moisés | 13/09 | Concluído |
| Criação do `DatabaseProcedureService`, procedure no controller e `AlertType` | Moisés | 11/10 | Concluído |
| Fluxo de ingestão de medições e integração backend com IA | Manuelalacerda | 27/10 | Concluído |
| Persistência de recomendações da IA e integração com alertas | Manuelalacerda | 27/10 | Concluído |
| Implementação do `MeasurementController` (endpoints de histórico e última medição IoT) | Moisés | 02/11 | Concluído |
| Validação de permissões de acesso do usuário às medições do pet | Moisés | 02/11 | Concluído |
| Desenvolvimento do `AppVersionController`, repositório e regras de versões publicadas | Moisés | 03/11 | Concluído |
| Ocultação de stack trace nas respostas de erro do SecurityConfig | Moisés | 03/11 | Concluído |
| Implementação do tipo, local, detalhes e fluxo de confirmação de consultas (`PATCH /appointments/{id}/confirm`) | Moisés | 04/11 | Concluído |
| Permissão de cancelamento de consultas por tutores e ajuste nos testes | Moisés | 04/11 | Concluído |
| Criação do `VeterinarianController`, serviço, DTO de resposta e ajuste no `SecurityConfig` | Moisés | 04/11 | Concluído |
| Atualização do link do YouTube e refinamentos da documentação no README | Manuelalacerda | 04/11 | Concluído |

---

## 👥 Integrantes do Grupo

<table>
  <tr>
    <td width="130">
      <img src="https://github.com/moisesBarsoti.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Moisés Barsoti Andrade de Oliveira</b><br/>
      <b>RM:</b> 565049 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPO - FIAP <br/>
    </td>
  </tr>

  <tr>
    <td width="130">
      <img src="https://github.com/sSofia-s.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Sofia Siqueira Fontes</b><br/>
      <b>RM:</b> 563829 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPG - FIAP <br/>
    </td>
  </tr>

  <tr>
    <td width="130">
      <img src="https://github.com/manuelalacerda.png" width="120" style="border-radius: 50%;"/>
    </td>
    <td>
      <b>Manuela de Lacerda Soares</b><br/>
      <b>RM:</b> 564887 &nbsp;&nbsp;|&nbsp;&nbsp;<b>Turma:</b> 2TDSPG - FIAP <br/>
    </td>
  </tr>
</table>

---

# 🐾 1. Species (/species)

| Método | Endpoint | Descrição/Perfil de Acesso                         |
|--------|----------|----------------------------------------------------|
| GET | `/species` | Lista todas as espécies                       |
| GET | `/species/{speciesId}/breeds` | Lista as raças de uma espécie |
| POST | `/auth/register` | Cadastra um registro utilizando PL/SQL                             |

---

# 🔐 2. Auth Controller (`/auth`)

| Método | Endpoint | Descrição/Perfil de Acesso                         |
|--------|----------|----------------------------------------------------|
| POST | `/auth/login` | Realiza o login na aplicação                       |
| GET | `/auth/me` | Retorna os dados do usuário autenticado atualmente |
| POST | `/auth/register` | Cadastro público TUTOR                             |
| POST | `/auth/register/admin` | ADMIN                                              |
| POST | `/auth/register/tutor` | Cadastro de usuário com perfil tutor               |
| POST | `/auth/register/vet` | ADMIN                                              |

---

POST
```bash
{
  "fullName":"Tutor ",
  "email":"tutor1@vitalia.com",
  "password":"SenhaSegura123!",
  "phoneNumber":"(11) 99999-9999"
}
```
---
ADMIN
```bash
{
  "email": "ester@gmail.com",
  "password": "senha123"
}
```
---
TUTOR
```bash
{
  "email": "manu@gmail.com",
  "password": "senha123"
}
```
---
VETERINARIAN
```bash
{
  "email": "vet@vitalia.com",
  "password": "SenhaSegura123"
}
```
---

# 👤 3. App User Controller (`/users`)

| Método | Endpoint | Descrição/Perfil de Acesso      |
|--------|----------|---------------------------------|
| GET | `/users` | ADMIN                           |
| GET | `/users/{id}` | Busca um usuário pelo ID        |
| PUT | `/users/{id}` | Atualiza os dados de um usuário |
| DELETE | `/users/{id}` | Remove um usuário do sistema    |
| PUT | `/users/me` | Atualiza os dados do usuário autenticado    |
| DELETE | `/users/me` | Remove o próprio usuário autenticado    |

---

# 🐶 4. Pets (`/pets`)

| Método | Endpoint | Descrição/Perfil de Acesso                                 |
|--------|----------|------------------------------------------------------------|
| GET | `/pets` | VETERINARIAN/ADMIN                                         |
| POST | `/pets` | Cadastra um novo pet vinculado ao tutor autenticado        |
| GET | `/pets/{id}` | Busca um pet pelo ID                                       |
| PUT | `/pets/{id}` | Atualiza os dados de um pet                                |
| DELETE | `/pets/{id}` | Remove um pet do sistema                                   |
| GET | `/pets/my-pets` | Lista todos os pets do tutor autenticado                   |
| GET | `/pets/search/name` | Busca pets por nome (parcial, sem distinção de maiúsculas) |

---
POST
```bash
{
  "name": "Thor",
  "sex": "Macho",
  "birthDate": "2021-03-10",
  "weightKg": 32.5,
  "status": "NORMAL",
  "breedId": 1
}
```
---

# 📊 5. Clinical History Controller (`/clinical-histories`)

| Método | Endpoint | Descrição/Perfil de Acesso                     |
|--------|----------|------------------------------------------------|
| GET | `/clinical-histories` | VETERINARIAN/ADMIN                             |
| POST | `/clinical-histories` | Cadastra um novo registro clínico              |
| GET | `/clinical-histories/{id}` | Busca um registro clínico pelo ID              |
| PUT | `/clinical-histories/{id}` | Atualiza um registro clínico                   |
| DELETE | `/clinical-histories/{id}` | Remove um registro clínico                     |
| GET | `/clinical-histories/pet/{petId}` | Lista o histórico clínico de um pet específico |

---
POST
```bash
{
  "petId": 1,
  "veterinarianId": 1,
  "appointmentId": 1,
  "diagnosis": "Check-up semestral",
  "observations": "Dados coletados após exercício matinal",
  "treatment": "Vitaminas e acompanhamento"
}
```
---
# 📅 6. Appointment Controller (`/appointments`)

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/appointments` | Lista todos os agendamentos |
| POST | `/appointments` | Cria um novo agendamento |
| GET | `/appointments/{id}` | Busca um agendamento pelo ID |
| PUT | `/appointments/{id}` | Atualiza um agendamento |
| DELETE | `/appointments/{id}` | Remove um agendamento |
| PATCH | `/appointments/{id}/confirm` | Confirma uma consulta |
| GET | `/appointments/pet/{petId}` | Lista todas as consultas de um pet específico |

---
POST
```bash
{
  "appointmentDate": "2026-06-20T14:30:00",
  "status": "SCHEDULED",
  "notes": "Consulta de rotina e check-up semestral",
  "petId": 1,
  "veterinarianId": 1
}
```
---

# 🚨 7. Alert Controller (`/alerts`)

| Método | Endpoint | Descrição/Perfil de acesso            |
|--------|----------|---------------------------------------|
| GET | `/alerts` | VETERINARIAN/ADMIN                    |
| POST | `/alerts` | Cria um novo alerta                   |
| GET | `/alerts/{id}` | Busca um alerta pelo ID               |
| PUT | `/alerts/{id}` | Atualiza um alerta                    |
| DELETE | `/alerts/{id}` | Remove um alerta                      |
| GET | `/alerts/pet/{petId}` | Lista os alertas de um pet específico |

---
POST
```bash
{
  "alertType": "TEMPERATURE",
  "message": "Febre detectada: 40.2°C. O animal já foi medicado.",
  "severity": "HIGH",
  "status": "RESOLVED",
  "petId": 1
}
```

---

# 📱 8. App Version Controller (/app-versions)

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/app-versions` | Lista as versões da aplicação |
| POST | `/app-versions` | Regista uma nova versão |
| GET | `/app-versions/{version}` | Busca detalhes de uma versão específica |

---

# 📏 9. Measurement Controller (/api/measurements)

| Método | Endpoint | Descrição |
|--------|----------|------------|
| POST | `/api/measurements` | Regista uma nova medição IoT |
| GET | `/api/measurements/pet/{petId}` | Lista as medições de um pet específico |
| GET | `/api/measurements/pet/{petId}/latest` | Retorna a medição mais recente de um pet |

---

# 🩺 10. Veterinarian Controller (/veterinarians)

| Método | Endpoint | Descrição |
|--------|----------|------------|
| GET | `/veterinarians` | Lista todos os veterinários registados |

---

### 🗄 Modelo

<div align="center">
  <img src="doc/Pet%20Care%20Management%20Model-2026-05-18-150201.png" alt="Modelo de Gestão de Cuidados de Pets" width="200" />
  <img src="doc/Pet%20Care%20Management%20Model-2026-05-18-150244.png" alt="Modelo de Gestão de Cuidados de Pets" width="305" />
  <img src="doc/Pet%20Care%20Management%20Model-2026-05-18-150318.png" alt="Modelo de Gestão de Cuidados de Pets" width="215" />
</div>
