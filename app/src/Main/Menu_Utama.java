/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Master.Form_User;
import Master.Form_Suplier;
import Master.Form_Barang;
import Master.Form_Kategori;
import Master.Form_Merek;
import view.Form_Login_old;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Lenovo
 */
public class Menu_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Utama
     */
    public static boolean tutup = false;

    public Menu_Utama(String nama, String level) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        lb_nama.setText(nama);
        lb_level.setText(level);
        execute();
        Date();
    }

    private void Date() {
        Date TanggalSekarang = new Date();
        SimpleDateFormat TanggalWaktu = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = TanggalWaktu.format(TanggalSekarang);
        lb_tanggal.setText(tanggal);
    }

    JButton btnNewButton = new JButton("Logout");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_navbar = new javax.swing.JPanel();
        lb_tanggal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb_level = new javax.swing.JLabel();
        lb_nama = new javax.swing.JLabel();
        panel_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_navbar.setBackground(new java.awt.Color(43, 42, 76));
        panel_navbar.setPreferredSize(new java.awt.Dimension(871, 70));

        lb_tanggal.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lb_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        lb_tanggal.setText("Tanggal ");

        jButton1.setBackground(new java.awt.Color(0, 255, 102));
        jButton1.setText("Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Apotek ANAMEDIKA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/image/output-onlinepngtools2.png"))); // NOI18N

        javax.swing.GroupLayout panel_navbarLayout = new javax.swing.GroupLayout(panel_navbar);
        panel_navbar.setLayout(panel_navbarLayout);
        panel_navbarLayout.setHorizontalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_navbarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 668, Short.MAX_VALUE)
                .addComponent(lb_tanggal)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panel_navbarLayout.setVerticalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_navbarLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_tanggal)
                    .addGroup(panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );

        getContentPane().add(panel_navbar, java.awt.BorderLayout.PAGE_START);

        panel_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        panel_sidebar.setPreferredSize(new java.awt.Dimension(250, 432));

        jScrollPane1.setBorder(null);

        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lb_level.setBackground(new java.awt.Color(255, 255, 255));
        lb_level.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lb_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_level.setText("Level");
        lb_level.setPreferredSize(new java.awt.Dimension(47, 30));

        lb_nama.setBackground(new java.awt.Color(255, 255, 255));
        lb_nama.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lb_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nama.setText("Nama");
        lb_nama.setPreferredSize(new java.awt.Dimension(47, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(lb_level, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_sidebarLayout = new javax.swing.GroupLayout(panel_sidebar);
        panel_sidebar.setLayout(panel_sidebarLayout);
        panel_sidebarLayout.setHorizontalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_sidebarLayout.setVerticalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_sidebarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );

        getContentPane().add(panel_sidebar, java.awt.BorderLayout.LINE_START);

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(204, 204, 204));
        pn_utama.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        getContentPane().add(panel_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1135, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (user.getJenisUser().equals("PEMILIK")) {
            pn_utama.add(new Form_DasbordPemilik());
            pn_utama.repaint();
            pn_utama.revalidate();
        } else if (user.getJenisUser().equals("KARYAWAN")) {
            pn_utama.add(new Form_DasbordKaryawan());
            pn_utama.repaint();
            pn_utama.revalidate();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Form_Akun().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama("Nama", "level").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_level;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_tanggal;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_navbar;
    private javax.swing.JPanel panel_sidebar;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon IconHome = new ImageIcon(getClass().getResource("/Main/image/icon_home.png"));
        ImageIcon IconMaster = new ImageIcon(getClass().getResource("/Main/image/icon_master.png"));
        ImageIcon IconTransaksi = new ImageIcon(getClass().getResource("/Main/image/icon_transaksi.png"));
        ImageIcon IconBarang = new ImageIcon(getClass().getResource("/Main/image/icon_product.png"));
        ImageIcon IconLogout = new ImageIcon(getClass().getResource("/Main/image/icon_logout.png"));

        MenuItem masProduk = new MenuItem(null, true, IconBarang, "Products", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Barang());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem masKategory = new MenuItem(null, true, IconBarang, "Category", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Kategori());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem masMerek = new MenuItem(null, true, IconBarang, "Brand", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Merek());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem masSupplier = new MenuItem(null, true, IconBarang, "Suppliers", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Suplier());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem masUser = new MenuItem(null, true, IconBarang, "Users", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                try {
                    pn_utama.add(new Form_User());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Menu_Utama.class.getName()).log(Level.SEVERE, null, ex);
                }
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        }
        );


        MenuItem Sell = new MenuItem(null, true, IconBarang, "Sell", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Penjualan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        MenuItem Restock = new MenuItem(null, true, IconBarang, "Restock", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_Pembelian());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        MenuItem menuDasboardPemilik = new MenuItem(IconHome, false, null, "Dasboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_DasbordPemilik());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuDasboardKaryawan = new MenuItem(IconHome, false, null, "Dasboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_DasbordKaryawan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuMasterPemilik = new MenuItem(IconMaster, false, null, "Master", null, masProduk, masKategory, masMerek, masSupplier, masUser);
        MenuItem menuMasterKaryawan = new MenuItem(IconMaster, false, null, "Master", null, masProduk, masKategory, masMerek);
        MenuItem menuTransaction = new MenuItem(IconTransaksi, false, null, "Transaction", null, Sell, Restock);
        MenuItem menuReportPemilik = new MenuItem(IconMaster, false, null, "Report", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_ReportPemilik());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuReportKaryawan = new MenuItem(IconMaster, false, null, "Report", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new Form_ReportKaryawan());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuLogOut = new MenuItem(IconLogout, false, null, "Log Out", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin?", "Select", JOptionPane.YES_NO_OPTION);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    Form_Login_old obj = null;
                    try {
                        obj = new Form_Login_old();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Menu_Utama.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    obj.setVisible(true);
                }
            }
        });
        if (user.getJenisUser().equals("PEMILIK")) {
            addMenu(menuDasboardPemilik, menuMasterPemilik, menuTransaction, menuReportPemilik, menuLogOut);
        } else if (user.getJenisUser().equals("KARYAWAN")) {
            addMenu(menuDasboardKaryawan, menuMasterKaryawan, menuTransaction, menuReportKaryawan, menuLogOut);
        }

    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_menu.revalidate();
    }

}