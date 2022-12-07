import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class App extends javax.swing.JFrame {

  Connection conexao;
  Statement consulta;
  List<Estudante> listaEstudantes = new ArrayList<Estudante>();

  // método construtor
  public App() {
    initComponents();
    limparDados();
    mostrarRegistros();
  }

  @SuppressWarnings("unchecked")
  private void initComponents() {

    // cria componentes
    labelTitulo = new javax.swing.JLabel();
    labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18));
    labelTitulo.setText("EXEMPLO CRUD ESTUDANTES EM JAVA SWING");

    labelNome = new javax.swing.JLabel();
    labelNome.setText("Nome:");
    txtNome = new javax.swing.JTextField();

    labelRGA = new javax.swing.JLabel();
    labelRGA.setText("RGA:");
    txtRGA = new javax.swing.JTextField();

    btSalvar = new javax.swing.JButton();
    btAtualizar = new javax.swing.JButton();
    btExcluir = new javax.swing.JButton();

    jScrollPane1 = new javax.swing.JScrollPane();
    jTableEstudantes = new javax.swing.JTable();

    // propriedades da JFrame
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("CRUD Estudantes");
    setResizable(false);

    jTableEstudantes.setCellSelectionEnabled(true);

    jTableEstudantes.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "RGA", "NOME"
        }) {
      boolean[] canEdit = new boolean[] {
          false, false
      };

      public boolean isCellEditable(int indexLinha, int indexColuna) {
        return canEdit[indexColuna];
      }
    });
    jTableEstudantes.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evento) {
        acaoSelecionarRegistro(evento);
      }
    });

    // adiciona a JTable no Painel
    jScrollPane1.setViewportView(jTableEstudantes);
    if (jTableEstudantes.getColumnModel().getColumnCount() > 0) {
      jTableEstudantes.getColumnModel().getColumn(1).setResizable(false);
    }

    btSalvar.setText("Salvar");
    btSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evento) {
        acaoBtSalvar(evento);
      }
    });

    btAtualizar.setText("Atualizar");
    btAtualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evento) {
        acaoBtAtualizar(evento);
      }
    });

    btExcluir.setText("Excluir");
    btExcluir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evento) {
        acaoBtExcluir(evento);
      }
    });

    // este bloco define o layout da JFrame
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRGA, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRGA, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRGA, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRGA, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE)));

    pack();
    setLocationRelativeTo(null);
    // fim da inicialização de componentes swing
  }

  private void acaoBtSalvar(java.awt.event.ActionEvent evento) {
    String nome = txtNome.getText();
    String RGA = txtRGA.getText();
    if (!nome.isEmpty() && !RGA.isEmpty()) {
      inserirNovoEstudante(nome, RGA);
      limparDados();
      mostrarRegistros();
    } else {
      alerta("Informe o Nome e o RGA!");
    }
  }

  private void acaoBtAtualizar(java.awt.event.ActionEvent evento) {
    String nome = txtNome.getText();
    String RGA = txtRGA.getText();
    if (!nome.isEmpty() && !RGA.isEmpty()) {
      atualizarEstudante(nome, RGA);
      limparDados();
      mostrarRegistros();
    } else {
      alerta("Informe o Nome e o RGA para atualizar!");
    }
  }

  private void acaoBtExcluir(java.awt.event.ActionEvent evento) {
    String RGA = txtRGA.getText();
    if (!RGA.isEmpty()) {
      excluirEstudantePorRGA(RGA);
      limparDados();
      mostrarRegistros();
    } else {
      alerta("Informe o RGA para excluir um registro de estudante!");
    }
  }

  public void alerta(String msg) {
    JOptionPane.showMessageDialog(rootPane, msg, "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
  }

  private void acaoSelecionarRegistro(java.awt.event.MouseEvent evento) {
    int i = jTableEstudantes.getSelectedRow();
    TableModel modeloSelecao = jTableEstudantes.getModel();
    txtRGA.setText(modeloSelecao.getValueAt(i, 0).toString());
    txtNome.setText(modeloSelecao.getValueAt(i, 1).toString());
  }

  private void limparDados() {
    txtNome.setText("");
    txtRGA.setText("");
    listaEstudantes.clear();
    jTableEstudantes.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "RGA", "NOME"
        }) {
      boolean[] canEdit = new boolean[] {
          false, false
      };

      public boolean isCellEditable(int indexLinha, int indexColuna) {
        return canEdit[indexColuna];
      }
    });
  }

  public void inserirNovoEstudante(String estudanteNome, String estudanteRGA) {
    try {
      conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdalg3", "root", "123456");

      String inserirRegistro = "INSERT INTO estudantes (estudanteNome, estudanteRGA) values (?,?)";
      PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(inserirRegistro);

      consultaPreCompilada.setString(1, estudanteNome);
      consultaPreCompilada.setString(2, estudanteRGA);

      consultaPreCompilada.executeUpdate();

      System.out.println("Registro inserido com sucesso!");
      conexao.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void atualizarEstudante(String estudanteNome, String estudanteRGA) {
    try {
      conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdalg3", "root", "123456");

      String atualizar = "UPDATE estudantes SET estudanteNome=? WHERE estudanteRGA=?";
      PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(atualizar);

      consultaPreCompilada.setString(1, estudanteNome);
      consultaPreCompilada.setString(2, estudanteRGA);

      consultaPreCompilada.executeUpdate();

      System.out.println("Registro atualizado com sucesso!");
      conexao.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void excluirEstudantePorRGA(String estudanteRGA) {
    try {
      conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdalg3", "root", "123456");

      String excluirRegistro = "DELETE FROM estudantes WHERE estudanteRGA=?";

      PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(excluirRegistro);

      consultaPreCompilada.setString(1, estudanteRGA);

      consultaPreCompilada.executeUpdate();

      System.out.println("Registro excluído com sucesso!");
      conexao.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private void mostrarRegistros() {
    listaEstudantes.clear();
    try {
      conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdalg3", "root", "123456");
      String consulta = "SELECT * FROM estudantes";
      Statement mostrarRegistros = conexao.createStatement();
      ResultSet registros = mostrarRegistros.executeQuery(consulta);

      DefaultTableModel modeloTabela = (DefaultTableModel) jTableEstudantes.getModel();
      while (registros.next()) {
        Estudante e = new Estudante(registros.getString("estudanteNome"), registros.getString("estudanteRGA"));
        listaEstudantes.add(e);
        Object[] colunas = new Object[2];
        colunas[0] = e.getRGA();
        colunas[1] = e.getNome();
        modeloTabela.addRow(colunas);
      }
      listaEstudantes.clear();
      conexao.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // início do método main
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
      new App().setVisible(true);
    });
  }

  // declaração dos componentes
  private javax.swing.JLabel labelTitulo;
  private javax.swing.JLabel labelNome;
  private javax.swing.JTextField txtNome;
  private javax.swing.JLabel labelRGA;
  private javax.swing.JTextField txtRGA;

  private javax.swing.JButton btSalvar;
  private javax.swing.JButton btAtualizar;
  private javax.swing.JButton btExcluir;

  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTableEstudantes;

}
