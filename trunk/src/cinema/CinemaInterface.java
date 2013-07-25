package cinema;

import java.awt.Label;
import javax.swing.JLabel;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class CinemaInterface extends javax.swing.JFrame {

    /**
     * Creates new form CinemaInterface
     */
    public CinemaInterface() {
        initComponents();
        new Theads(jLabel13).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listSalas = new LinkedList<salas>();
        listsessao = new LinkedList<Sessao>();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CampoCapacideDaSala = new javax.swing.JTextField();
        BotaoSalvaSala = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campocodigosala = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        verificasesalapodesercriada = new javax.swing.JButton();
        conferir = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoNomeFilme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoDataDOFilme = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoHorarioInicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoHorarioFim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoNumeroSala = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CampoIngressosVendidos = new javax.swing.JTextField();
        botaoCriarSessao = new javax.swing.JButton();
        botaoVerificaSala = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        botaoExcluirSala = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        CampoInformaSala = new javax.swing.JTextField();
        BotaoEfetivaVenda = new javax.swing.JButton();
        botaoExcluirSessao = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        listSalas = org.jdesktop.observablecollections.ObservableCollections.observableList(listSalas);

        listsessao = org.jdesktop.observablecollections.ObservableCollections.observableList(listsessao);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorena\\Documents\\NetBeansProjects\\cinema\\src\\cinema\\capa.png")); // NOI18N
        jLabel1.setText("Cineminions");

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 200));
        jTabbedPane1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel2.setText("Capacidade Da Sala:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable3, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.lotacao}"), CampoCapacideDaSala, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable3, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoCapacideDaSala, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        BotaoSalvaSala.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        BotaoSalvaSala.setText("Criar Sala");
        BotaoSalvaSala.setEnabled(false);
        BotaoSalvaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvaSalaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel10.setText("Código:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable3, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigo}"), campocodigosala, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable3, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), campocodigosala, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        campocodigosala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocodigosalaActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lorena\\Desktop\\minions\\minio.jpg")); // NOI18N

        verificasesalapodesercriada.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        verificasesalapodesercriada.setText("Verificar Sala");
        verificasesalapodesercriada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificasesalapodesercriadaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel15.setText("Informe o código para verificação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(CampoCapacideDaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(conferir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(verificasesalapodesercriada))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campocodigosala, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(BotaoSalvaSala))
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(conferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(verificasesalapodesercriada)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campocodigosala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSalvaSala))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCapacideDaSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insere Sala", jPanel1);

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel3.setText("Nome Do Filme:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), CampoNomeFilme, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoNomeFilme, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel4.setText("Data Do FIlme:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.data}"), CampoDataDOFilme, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoDataDOFilme, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        CampoDataDOFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDataDOFilmeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel5.setText("Horário De Inicio:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horarioInicio}"), CampoHorarioInicio, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoHorarioInicio, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        CampoHorarioInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoHorarioInicioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel6.setText("Horário De Fim:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horarioFim}"), CampoHorarioFim, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoHorarioFim, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel7.setText("Nº Sala:");

        CampoNumeroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNumeroSalaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel8.setText("Nº De Ingressos Vendidos:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroIngressosVendidos}"), CampoIngressosVendidos, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement!=null}"), CampoIngressosVendidos, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        botaoCriarSessao.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        botaoCriarSessao.setText("Criar Sessão");
        botaoCriarSessao.setEnabled(false);
        botaoCriarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarSessaoActionPerformed(evt);
            }
        });

        botaoVerificaSala.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        botaoVerificaSala.setText("Verifica se sala existe");
        botaoVerificaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerificaSalaActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listSalas, jTable3);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lotacao}"));
        columnBinding.setColumnName("Lotacao");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jTable3);

        botaoExcluirSala.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        botaoExcluirSala.setText("Excluir Sala");
        botaoExcluirSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirSalaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("*Selecione uma linha da tabela!");

        jLabel12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel12.setText("Lista de salas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoHorarioInicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoIngressosVendidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoHorarioFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(CampoDataDOFilme)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CampoNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(CampoNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoVerificaSala)
                                .addGap(38, 38, 38)
                                .addComponent(botaoExcluirSala))
                            .addComponent(botaoCriarSessao))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(botaoVerificaSala)
                    .addComponent(botaoExcluirSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCriarSessao)
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CampoNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoDataDOFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CampoHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CampoHorarioFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoIngressosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Insere Sessão", jPanel2);

        jTable1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listsessao, jTable1);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${data}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horarioInicio}"));
        columnBinding.setColumnName("Horario Inicio");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horarioFim}"));
        columnBinding.setColumnName("Horario Fim");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroSala}"));
        columnBinding.setColumnName("Numero Sala");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroIngressosVendidos}"));
        columnBinding.setColumnName("Numero Ingressos Vendidos");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel9.setText("Informe a Sala:");

        BotaoEfetivaVenda.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        BotaoEfetivaVenda.setText("Efetivar Venda");
        BotaoEfetivaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEfetivaVendaActionPerformed(evt);
            }
        });

        botaoExcluirSessao.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        botaoExcluirSessao.setText("Excluir Sessão");
        botaoExcluirSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirSessaoActionPerformed(evt);
            }
        });

        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 290, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(CampoInformaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoEfetivaVenda)
                            .addComponent(botaoExcluirSessao))
                        .addGap(75, 75, 75)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoEfetivaVenda)
                            .addComponent(jLabel9))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(botaoExcluirSessao))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CampoInformaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bilheteria", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }
    private void BotaoSalvaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvaSalaActionPerformed
        salas s = new salas();
        listSalas.add(s);
        int nlinhas = jTable3.getRowCount() - 1;
        jTable3.setRowSelectionInterval(nlinhas, nlinhas);
        campocodigosala.requestFocus();
        BotaoSalvaSala.setEnabled(false);
        campocodigosala.setText(conferir.getText());
        campocodigosala.setEditable(false);
    }//GEN-LAST:event_BotaoSalvaSalaActionPerformed

    public boolean confereSala(){
        for (salas x : listSalas) {
                    if (x.getCodigo() == (Integer.parseInt(conferir.getText()))) {
                      return false;
                    }
         }
        return true;
    }
    private void botaoExcluirSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirSalaActionPerformed
        int selecionado = jTable3.getSelectedRow();
        listSalas.remove(selecionado);
    }//GEN-LAST:event_botaoExcluirSalaActionPerformed

    private void botaoCriarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarSessaoActionPerformed

        Sessao c = new Sessao();
        listsessao.add(c);
        c.setNumeroSala(Integer.parseInt(campocodigosala.getText()));
        int nlinhas = jTable1.getRowCount()-1;
        jTable1.setRowSelectionInterval(nlinhas, nlinhas);
        CampoNomeFilme.requestFocus();
        limpaCampo();
        botaoCriarSessao.setEnabled(false);

    }//GEN-LAST:event_botaoCriarSessaoActionPerformed
    public void limpaCampo(){
                 CampoNumeroSala.setText("");
                 CampoNomeFilme.setText("");
                 CampoDataDOFilme.setText("");
                 CampoHorarioInicio.setText("");
                 CampoHorarioFim.setText("");
                 CampoIngressosVendidos.setText("");
    }
    
    private void botaoExcluirSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirSessaoActionPerformed
        // TODO add your handling code here:
        int selecionado = jTable1.getSelectedRow();
        listsessao.remove(selecionado);
    }//GEN-LAST:event_botaoExcluirSessaoActionPerformed

    private void CampoNumeroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNumeroSalaActionPerformed

    }//GEN-LAST:event_CampoNumeroSalaActionPerformed

    private void botaoVerificaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerificaSalaActionPerformed
            if(verificaSala() == true){
                botaoCriarSessao.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "A Sala escolhida não está dispinível no momento ou sala não existe.");
            }
    }//GEN-LAST:event_botaoVerificaSalaActionPerformed

    private void BotaoEfetivaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEfetivaVendaActionPerformed
            venda();
    }//GEN-LAST:event_BotaoEfetivaVendaActionPerformed

    private void CampoDataDOFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDataDOFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDataDOFilmeActionPerformed

    private void CampoHorarioInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoHorarioInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoHorarioInicioActionPerformed

    private void verificasesalapodesercriadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificasesalapodesercriadaActionPerformed
        // TODO add your handling code here:
        if(confereSala() == false){
                JOptionPane.showMessageDialog(this, "Sala já existente!");
            }else{
                 BotaoSalvaSala.setEnabled(true);
            }
    }//GEN-LAST:event_verificasesalapodesercriadaActionPerformed

    private void campocodigosalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocodigosalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocodigosalaActionPerformed
    public boolean verificaSala(){
        int i=0;
        for (salas s : listSalas) {
                    if (s.getCodigo() == (Integer.parseInt(CampoNumeroSala.getText())) && s.getLotacao() > 0) {
                        System.out.println("Sala "+(i++)+": " + s.getCodigo());
                        return true;
                    }
         }
        return false;
   }
    public void venda() {
        int capacidade;
        boolean verifica=true;
        for (Sessao s : listsessao) {
            if (s.getNumeroSala() == (Integer.parseInt(CampoInformaSala.getText()))){
                 for (salas x : listSalas) {       
                     if (x.getCodigo() == (Integer.parseInt(CampoInformaSala.getText()))){
                         System.out.println("Capacidade Total:" + x.getLotacao());
                         capacidade = x.getLotacao() - 1 - s.getNumeroIngressosVendidos();
                         if(capacidade >= 0){
                            BotaoEfetivaVenda.setEnabled(true);
                            s.setNumeroIngressosVendidos(s.getNumeroIngressosVendidos()+1);
                            System.out.println("Capacidade atual: " +capacidade);
                            System.out.println("Ingressos vendidos: " +s.getNumeroIngressosVendidos());
                            JOptionPane.showMessageDialog(this, "Vendido");
                            verifica = true;
                         }else{
                            JOptionPane.showMessageDialog(this, "Sessão esgotada!"); 
                             break;
                         }   
                     }
                 }
                 break;
            }else{
                verifica = false;
            }         
    }
        if (verifica == false){
                JOptionPane.showMessageDialog(this, "Sala não existe!");
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CinemaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CinemaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CinemaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CinemaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CinemaInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEfetivaVenda;
    private javax.swing.JButton BotaoSalvaSala;
    private javax.swing.JTextField CampoCapacideDaSala;
    private javax.swing.JTextField CampoDataDOFilme;
    private javax.swing.JTextField CampoHorarioFim;
    private javax.swing.JTextField CampoHorarioInicio;
    private javax.swing.JTextField CampoInformaSala;
    private javax.swing.JTextField CampoIngressosVendidos;
    private javax.swing.JTextField CampoNomeFilme;
    private javax.swing.JTextField CampoNumeroSala;
    private javax.swing.JButton botaoCriarSessao;
    private javax.swing.JToggleButton botaoExcluirSala;
    private javax.swing.JButton botaoExcluirSessao;
    private javax.swing.JButton botaoVerificaSala;
    private javax.swing.JTextField campocodigosala;
    private javax.swing.JTextField conferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel label;
    private java.util.List<salas> listSalas;
    private java.util.List<Sessao> listsessao;
    private javax.swing.JButton verificasesalapodesercriada;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
