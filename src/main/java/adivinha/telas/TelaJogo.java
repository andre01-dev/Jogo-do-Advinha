package adivinha.telas;

import adivinha.dados.RankingDAO;
import adivinha.modelo.Jogo;
import adivinha.modelo.Partida;
import adivinha.modelo.Resultado;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class TelaJogo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaJogo.class.getName());

    private static final String AUTOR = "André Guilherme de Oliveira Sjydlovski";
    private Jogo jogo;
    private RankingDAO dao;
    private javax.swing.Timer cronometro;
    private final DefaultListModel<String> historico = new DefaultListModel<>();

    private static final java.awt.Color FUNDO_NEUTRO = new java.awt.Color(245, 240, 255);
    private static final java.awt.Color TEXTO_NEUTRO = new java.awt.Color(48, 0, 72);
    private static final java.awt.Color FUNDO_DICA = new java.awt.Color(255, 243, 214);
    private static final java.awt.Color TEXTO_DICA = new java.awt.Color(102, 64, 0);
    private static final java.awt.Color FUNDO_ACERTO = new java.awt.Color(222, 242, 230);
    private static final java.awt.Color TEXTO_ACERTO = new java.awt.Color(17, 80, 48);

    public TelaJogo() {
        initComponents();
        jogo = new Jogo();
        dao = new RankingDAO();
        lstHistorico.setModel(historico);
        cronometro = new javax.swing.Timer(100,
                e -> lbTempo.setText(formatarTempo(jogo.getTempoMs())));
        getContentPane().setBackground(new java.awt.Color(236, 232, 244));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPalpite = new javax.swing.JTextField();
        btConfirmar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstHistorico = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbDica = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTentativas = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbTempo = new javax.swing.JLabel();
        btNovoJogo = new javax.swing.JButton();
        BtRanking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do Adivinha");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(236, 232, 244));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(47, 1, 71));

        jLabel1.setBackground(new java.awt.Color(245, 240, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 240, 255));
        jLabel1.setText("Jogo do Adivinha");

        jLabel2.setBackground(new java.awt.Color(245, 240, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 240, 255));
        jLabel2.setText("Adivinhe o número secreto entre 1 a 1000, no menor número de tentativas e no menor tempo possível");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 240, 255));
        jPanel2.setForeground(new java.awt.Color(245, 240, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 179));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 0, 72));
        jLabel5.setText("Nome do Jogador");
        jLabel5.setToolTipText("2 a 40 caracteres");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(48, 0, 72));
        txtNome.setToolTipText("");
        txtNome.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 90, 160)), javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 10)));
        txtNome.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 0, 72));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Digite seu palpite:");
        jLabel6.setToolTipText("Número de 1 a 1000");

        txtPalpite.setBackground(new java.awt.Color(255, 255, 255));
        txtPalpite.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        txtPalpite.setForeground(new java.awt.Color(48, 0, 72));
        txtPalpite.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 90, 160)), javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 10)));
        txtPalpite.addActionListener(this::txtPalpiteActionPerformed);

        btConfirmar.setBackground(new java.awt.Color(47, 1, 71));
        btConfirmar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btConfirmar.setForeground(new java.awt.Color(255, 248, 240));
        btConfirmar.setText("Confirmar");
        btConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btConfirmar.setFocusPainted(false);
        btConfirmar.setMargin(new java.awt.Insets(6, 16, 6, 16));
        btConfirmar.addActionListener(this::btConfirmarActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btConfirmar))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(245, 240, 255));
        jPanel3.setForeground(new java.awt.Color(48, 0, 72));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 0, 72));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Histórico da partida");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 198, 228)));

        lstHistorico.setBackground(new java.awt.Color(255, 255, 255));
        lstHistorico.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 10));
        lstHistorico.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lstHistorico.setForeground(new java.awt.Color(48, 0, 72));
        lstHistorico.setFixedCellHeight(30);
        lstHistorico.setSelectionBackground(new java.awt.Color(226, 214, 244));
        lstHistorico.setSelectionForeground(new java.awt.Color(48, 0, 72));
        jScrollPane1.setViewportView(lstHistorico);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(245, 240, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 0, 72));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dica");

        lbDica.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbDica.setForeground(new java.awt.Color(48, 0, 72));
        lbDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDica.setText("Faça seu primeiro palpite");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbDica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lbDica)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(245, 240, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(187, 100));

        jLabel3.setBackground(new java.awt.Color(31, 39, 27));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(48, 0, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tentativas");

        txtTentativas.setEditable(false);
        txtTentativas.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtTentativas.setForeground(new java.awt.Color(48, 0, 72));
        txtTentativas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTentativas.setText("0");
        txtTentativas.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTentativas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(245, 240, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(187, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(48, 0, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tempo");

        lbTempo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbTempo.setForeground(new java.awt.Color(48, 0, 72));
        lbTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTempo.setText("00:00.000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTempo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btNovoJogo.setBackground(new java.awt.Color(47, 1, 71));
        btNovoJogo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btNovoJogo.setForeground(new java.awt.Color(255, 248, 240));
        btNovoJogo.setText("Novo Jogo");
        btNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNovoJogo.setFocusPainted(false);
        btNovoJogo.setMargin(new java.awt.Insets(6, 16, 6, 16));
        btNovoJogo.addActionListener(this::btNovoJogoActionPerformed);

        BtRanking.setBackground(new java.awt.Color(47, 1, 71));
        BtRanking.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BtRanking.setForeground(new java.awt.Color(255, 248, 240));
        BtRanking.setText("Ranking");
        BtRanking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtRanking.setFocusPainted(false);
        BtRanking.setMargin(new java.awt.Insets(6, 16, 6, 16));
        BtRanking.addActionListener(this::BtRankingActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(764, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRankingActionPerformed
        abrirRanking();
    }//GEN-LAST:event_BtRankingActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        confirmarPalpite();
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void txtPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalpiteActionPerformed
        confirmarPalpite();
    }//GEN-LAST:event_txtPalpiteActionPerformed

    private void btNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoJogoActionPerformed
        novoJogo();
    }//GEN-LAST:event_btNovoJogoActionPerformed

    private void confirmarPalpite() {
        String nome = txtNome.getText().trim();
        if (!nome.matches("[\\p{L}0-9 ]{2,40}")) {
            JOptionPane.showMessageDialog(this,
                    "Informe o nome do jogador (2 a 40 caracteres: letras, números e espaços).");
            return;
        }

        int palpite;
        try {
            palpite = Integer.parseInt(txtPalpite.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número inteiro entre 1 e 1000.");
            limparPalpite();
            return;
        }

        Resultado resultado;
        try {
            resultado = jogo.avaliar(palpite);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            limparPalpite();
            return;
        }

        if (jogo.getTentativas() == 1) {
            cronometro.start();
        }
        txtTentativas.setText(String.valueOf(jogo.getTentativas()));
        historico.addElement(jogo.getTentativas() + "º   " + palpite + " → " + resultado);
        lstHistorico.ensureIndexIsVisible(historico.size() - 1);
        limparPalpite();

        if (resultado == Resultado.ACERTOU) {
            cronometro.stop();
            String tempo = formatarTempo(jogo.getTempoMs());
            lbTempo.setText(tempo);
            mostrarDica("Parabéns! Você acertou em " + jogo.getTentativas() + " tentativas",
                    FUNDO_ACERTO, TEXTO_ACERTO);
            txtPalpite.setEnabled(false);
            btConfirmar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Parabéns! Você acertou em "
                    + jogo.getTentativas() + " tentativas e " + tempo);

            Partida partida = new Partida(nome, jogo.getTentativas(), jogo.getTempoMs(), AUTOR);
            try {
                dao.gravar(partida);
            } catch (RuntimeException ex) {
                JOptionPane.showMessageDialog(this,
                        "Não foi possível gravar a partida: " + ex.getMessage());
            }
        } else if (resultado == Resultado.MAIOR) {
            mostrarDica("O número secreto é MAIOR que " + palpite, FUNDO_DICA, TEXTO_DICA);
        } else {
            mostrarDica("O número secreto é MENOR que " + palpite, FUNDO_DICA, TEXTO_DICA);
        }
    }

    private void limparPalpite() {
        txtPalpite.setText("");
        txtPalpite.requestFocus();
    }

    private void mostrarDica(String texto, java.awt.Color fundo, java.awt.Color cor) {
        lbDica.setText(texto);
        jPanel4.setBackground(fundo);
        lbDica.setForeground(cor);
    }

    private void novoJogo() {
        cronometro.stop();
        jogo.novoJogo();
        historico.clear();
        txtTentativas.setText("0");
        lbTempo.setText("00:00.000");
        mostrarDica("Faça seu primeiro palpite", FUNDO_NEUTRO, TEXTO_NEUTRO);
        txtPalpite.setText("");
        txtPalpite.setEnabled(true);
        btConfirmar.setEnabled(true);
        txtPalpite.requestFocus();
    }

    private void abrirRanking() {
        new TelaRanking().setVisible(true);
    }

    private String formatarTempo(long ms) {
        long min = ms / 60000;
        long seg = (ms / 1000) % 60;
        long mil = ms % 1000;
        return String.format("%02d:%02d.%03d", min, seg, mil);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaJogo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtRanking;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btNovoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDica;
    private javax.swing.JLabel lbTempo;
    private javax.swing.JList<String> lstHistorico;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPalpite;
    private javax.swing.JTextField txtTentativas;
    // End of variables declaration//GEN-END:variables
}
