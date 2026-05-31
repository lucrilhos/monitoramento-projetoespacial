# 🚀 Plataforma de Monitoramento Espacial

Projeto desenvolvido como parte de uma **Global Solution 2026 na matéria de Programação Orientada a Objetos (POO)**.  
O objetivo é simular uma estação espacial capaz de monitorar sensores, controlar sistemas de propulsão e gerenciar dados de uma missão ficícia com dados randomizados e mocados.

---

## 📌 Estrutura do Projeto

- **br.com.monitoramento.espacial**
  - `ComponenteEspacial.java` → classe abstrata base
  - `Sensor.java` → interface para sensores
  - `SensorTemperatura.java`, `SensorPressao.java`, `SensorRadiacao.java` → implementação da interface
  - `DadosMissao.java` → encapsulamento de dados sensíveis
  - `SistemaPropulsao.java` → classe abstrata para propulsão
  - `PropulsaoQuimica.java`, `PropulsaoEletrica.java` → herança e polimorfismo

- **monitoramentoespacial.main**
  - `SistemaMonitoramento.java` → classe principal com menu interativo

---

## ⚙️ Funcionalidades

- **Sistema de Sensores**
  - Leitura simulada de valores (aleatórios)
  - Verificação de funcionamento
  - Definição de limites e alertas

- **Sistema de Propulsão**
  - Ligar/desligar motores
  - Acelerar com potência (0–100)
  - Calcular empuxo gerado
  - Comportamento diferente para cada tipo de propulsão

- **Dados da Missão**
  - Coordenadas protegidas por senha
  - Combustível com validação
  - Alerta automático quando <20%
  - Número de tripulantes

- **Sistema de Monitoramento**
  - Menu interativo no console
  - Exibição de sensores, propulsão e dados da missão

---

## 🧬 Conceitos de Java abordados

---

- Classe Abstrata → ComponenteEspacial, SistemaPropulsao
- Interface → Sensor
- Encapsulamento → DadosMissao
- Herança e Polimorfismo → PropulsaoQuimica, PropulsaoEletrica
- Sistema de Alertas → verificações automáticas e mensagens no console

---

## 📷 Prints do terminal

---

- Interface principal: <img width="357" height="180" alt="print1_terminal" src="https://github.com/user-attachments/assets/eb4200dd-23da-4110-bbd2-a472c518a923" />
- Opção 1: <img width="382" height="215" alt="print2_terminal" src="https://github.com/user-attachments/assets/302d9c52-7fed-4117-9ed7-8019475a1f54" />
- Opção 2: <img width="382" height="215" alt="print3_terminal" src="https://github.com/user-attachments/assets/1c1456fb-79eb-4371-b428-1906778a0101" />
- Opção 3: <img width="382" height="188" alt="print4_terminal" src="https://github.com/user-attachments/assets/d052d7eb-cc1b-4d30-9959-7e776dca5d06" />

---


## 🖥️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/projeto-espacial.git
   Abra no IntelliJ IDEA (ou outra IDE Java).

2. Compile e rode a classe principal:

```bash
javac monitoramentoespacial/main/SistemaMonitoramento.java
java monitoramentoespacial.main.SistemaMonitoramento
