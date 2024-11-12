# **App V3 Agenda**

Este é um aplicativo Android desenvolvido para gerenciar compromissos, exibindo e armazenando informações em um banco de dados SQLite. A aplicação permite adicionar, visualizar e remover compromissos, além de incluir personalizações de interface, como botões com bordas arredondadas.

## **Funcionalidades**
- **Adicionar Compromissos**: Insira compromissos com descrição, data e hora.
- **Visualizar Compromissos**:
  - Exiba compromissos do dia atual automaticamente ao abrir o aplicativo.
  - Selecione uma data específica para visualizar compromissos relacionados.
  - Liste todos os compromissos armazenados.
- **Excluir Compromissos**: Limpe o banco de dados para remover todos os registros.
- **Interface Personalizada**:
  - Botões e layouts com bordas arredondadas para uma experiência visual agradável.
- **Armazenamento Local**:
  - Persistência de dados com SQLite.

## **Requisitos**
- Android Studio 2024.1.2 ou superior.
- Gradle 8.0 ou superior.
- SDK mínimo: 24 (Android 7.0 Nougat).
- Dependências:
  - Biblioteca Material Components (`com.google.android.material:material:1.9.0`).

## **Instalação**
1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>

  2. Instale as dependências necessárias (Gradle).
3. Conecte um dispositivo ou emulador Android.
4. Compile e execute o aplicativo.

## **Estrutura do Projeto**
- **`MainActivity`**: 
  - Activity principal que gerencia a navegação entre fragments.
  
- **`VisualizacaoFragment`**:
  - Exibe compromissos do dia atual ao iniciar.
  - Permite selecionar outras datas para exibição de compromissos.
  
- **`CompromissosDB`**:
  - Classe para gerenciar o banco de dados SQLite.
  - Métodos principais:
    - `adicionarCompromisso()`: Insere um compromisso no banco.
    - `buscarCompromissosPorData()`: Retorna compromissos de uma data específica.
    - `buscarTodosCompromissos()`: Retorna todos os compromissos.
    - `limparBancoDeDados()`: Remove todos os registros do banco.
  
- **`Drawable` (Recursos)**:
  - Arquivos XML personalizados em `res/drawable/` para botões e layouts com bordas arredondadas.

## **Uso**
### **Adicionar Compromissos**:
- Insira uma descrição, selecione uma data e hora, e clique para salvar.

### **Visualizar Compromissos**:
- Ao abrir o aplicativo, os compromissos do dia atual serão exibidos.
- Use o botão "Outra Data" para selecionar um dia específico.

### **Limpar Banco de Dados**:
- Clique no botão "Limpar" para remover todos os compromissos armazenados.

## **Capturas de Tela**

### **Tela Inicial**
<img src="https://github.com/user-attachments/assets/450f5d48-8e1b-42a6-b446-c3814687d1bf" alt="Tela Inicial" width="300">

### **Visualização de Compromissos**
<img src="https://github.com/user-attachments/assets/1be020be-3dc3-4648-9588-7a42d88a75b9" alt="Visualização de Compromissos" width="300">

### **Adicionar Compromissos**
<img src="https://github.com/user-attachments/assets/33baca06-9510-47d7-977e-028a05a8d190" alt="Adicionar Compromissos" width="300">
