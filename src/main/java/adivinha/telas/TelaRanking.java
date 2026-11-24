package adivinha.telas;

import adivinha.dados.RankingDAO;
import adivinha.modelo.Partida;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaRanking extends javax.swing.JFrame {

    private RankingDAO dao;

    public TelaRanking() {
        initComponents();
        dao = new RankingDAO();
        carregarRanking();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlCorpo = new javax.swing.JPanel();
        pnlAviso = new javax.swing.JPanel();
        pnlAviso.setVisible(false);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRanking = new javax.swing.JTable();
        tbRanking.getTableHeader().setBackground(new java.awt.Color(245,240,255));
        tbRanking.getTableHeader().setForeground(new java.awt.Color(48, 0, 72));
        tbRanking.getTableHeader().setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 18));
        tbRanking.getTableHeader().setReorderingAllowed(false);
        tbRanking.getTableHeader().setResizingAllowed(false);
        javax.swing.table.DefaultTableCellRenderer centro = new javax.swing.table.DefaultTableCellRenderer();
        centro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tbRanking.setDefaultRenderer(Object.class, centro);
        tbRanking.setDefaultRenderer(Number.class, centro);
        jPanel2 = new javax.swing.JPanel();
        btAtualizar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ranking");
        setResizable(false);
        setSize(new java.awt.Dimension(751, 685));

        jPanel1.setBackground(new java.awt.Color(47, 1, 71));
        jPanel1.setPreferredSize(new java.awt.Dimension(687, 81));

        jLabel1.setBackground(new java.awt.Color(245, 240, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 240, 255));
        jLabel1.setText("Ranking");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 240, 255));
        jLabel2.setText("10 melhores: menos tentativas e menor tempo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        pnlCorpo.setBorder(javax.swing.BorderFactory.createEmptyBorder(24, 60, 24, 60));
        pnlCorpo.setLayout(new java.awt.BorderLayout());

        pnlAviso.setBackground(new java.awt.Color(255, 244, 224));
        pnlAviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 192, 122)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 47, 0));
        jLabel3.setText("Sem conexão com a internet");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 47, 0));
        jLabel4.setText("Não foi possível carregar o ranking agora. Verifique sua conexão e clique em Atualizar.");

        javax.swing.GroupLayout pnlAvisoLayout = new javax.swing.GroupLayout(pnlAviso);
        pnlAviso.setLayout(pnlAvisoLayout);
        pnlAvisoLayout.setHorizontalGroup(
            pnlAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvisoLayout.createSequentialGroup()
                .addGroup(pnlAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAvisoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3))
                    .addGroup(pnlAvisoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAvisoLayout.setVerticalGroup(
            pnlAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvisoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCorpo.add(pnlAviso, java.awt.BorderLayout.NORTH);

        tbRanking.setBackground(new java.awt.Color(255, 255, 255));
        tbRanking.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbRanking.setForeground(new java.awt.Color(48, 0, 72));
        tbRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Posição", "Nome", "Tentativas", "Tempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRanking.setFillsViewportHeight(true);
        tbRanking.setFocusable(false);
        tbRanking.setGridColor(new java.awt.Color(232, 226, 242));
        tbRanking.setRowHeight(40);
        tbRanking.setRowSelectionAllowed(false);
        tbRanking.setSelectionBackground(new java.awt.Color(226, 214, 244));
        tbRanking.setSelectionForeground(new java.awt.Color(48, 0, 72));
        tbRanking.setShowHorizontalLines(true);
        tbRanking.setShowVerticalLines(true);
        tbRanking.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbRanking);
        if (tbRanking.getColumnModel().getColumnCount() > 0) {
            tbRanking.getColumnModel().getColumn(0).setResizable(false);
            tbRanking.getColumnModel().getColumn(0).setPreferredWidth(84);
            tbRanking.getColumnModel().getColumn(1).setResizable(false);
            tbRanking.getColumnModel().getColumn(1).setPreferredWidth(260);
            tbRanking.getColumnModel().getColumn(2).setResizable(false);
            tbRanking.getColumnModel().getColumn(2).setPreferredWidth(110);
            tbRanking.getColumnModel().getColumn(3).setResizable(false);
            tbRanking.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        pnlCorpo.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(22, 10, 22, 10));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btAtualizar.setBackground(new java.awt.Color(47, 1, 71));
        btAtualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(255, 248, 240));
        btAtualizar.setText("Atualizar");
        btAtualizar.setPreferredSize(new java.awt.Dimension(136, 48));
        btAtualizar.addActionListener(this::btAtualizarActionPerformed);
        jPanel2.add(btAtualizar, java.awt.BorderLayout.WEST);

        btFechar.setBackground(new java.awt.Color(255, 248, 240));
        btFechar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btFechar.setForeground(new java.awt.Color(47, 1, 71));
        btFechar.setText("Fechar");
        btFechar.setPreferredSize(new java.awt.Dimension(136, 48));
        btFechar.addActionListener(this::btFecharActionPerformed);
        jPanel2.add(btFechar, java.awt.BorderLayout.EAST);

        pnlCorpo.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlCorpo, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(769, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        carregarRanking();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void carregarRanking() {
        DefaultTableModel modelo = (DefaultTableModel) tbRanking.getModel();
        modelo.setRowCount(0);
        try {
            List<Partida> lista = dao.top10();
            int posicao = 1;
            for (Partida p : lista) {
                modelo.addRow(new Object[]{
                    posicao,
                    p.getNome(),
                    p.getTentativas(),
                    formatarTempo(p.getTempoMs())
                });
                posicao++;
            }
            pnlAviso.setVisible(false);
        } catch (RuntimeException ex) {
            pnlAviso.setVisible(true);
        }
    }

    private String formatarTempo(long ms) {
        long min = ms / 60000;
        long seg = (ms / 1000) % 60;
        long mil = ms % 1000;
        return String.format("%02d:%02d.%03d", min, seg, mil);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAviso;
    private javax.swing.JPanel pnlCorpo;
    private javax.swing.JTable tbRanking;
    // End of variables declaration//GEN-END:variables
}
