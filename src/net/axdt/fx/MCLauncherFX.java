/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.axdt.fx;
import net.axdt.fx.utils.MCLauncher;
import java.io.*;
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.Image; 
import java.awt.Toolkit; 
import javax.swing.ButtonGroup;
import java.net.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.axdt.fx.utils.SimpleSettingSaver;

/**
 *
 * @author lucas
 */
public class MCLauncherFX extends javax.swing.JFrame {
public String jpath;
//Image img;
//private Image image=null;
    /**
     * Creates new form MCLauncherFX
     */
    public MCLauncherFX() {
        //URL imgurl = MCLauncherFX.class.getResource("img.jpg");
       // img=Toolkit.getDefaultToolkit().getImage(imgurl);
        initComponents();
        
        ButtonGroup group = new ButtonGroup();
        group.add(rcv_512mem);
        group.add(rcv_1024mem);
          group.add(rcv_2048mem);
            group.add(rcv_4096mem);
            MCLauncher ss = new MCLauncher();
            int version = ss.getjavaversion();
            if(version<=16)
                jLabel3.setText("状态：java版本过低！请升级！");
            /*try{
                Class clz=this.getClass();
                InputStream stream=new FileInputStream("images/images.jpg");
                image=ImageIO.read(stream);
            }catch (IOException e){
                e.printStackTrace();
            }*/
    }
   // public void paint(Graphics g){
      // super.paint(g);
        //g.drawImage(image,0,0,559,250,this);
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        src_topic = new javax.swing.JLabel();
        src_username = new javax.swing.JLabel();
        rcv_username = new javax.swing.JTextField();
        src_maxmem = new javax.swing.JLabel();
        rcv_isdebug = new javax.swing.JCheckBox();
        action_start = new javax.swing.JButton();
        rcv_512mem = new javax.swing.JRadioButton();
        rcv_1024mem = new javax.swing.JRadioButton();
        rcv_2048mem = new javax.swing.JRadioButton();
        rcv_4096mem = new javax.swing.JRadioButton();
        rcv_javapath = new javax.swing.JTextField();
        action_searthforjava = new javax.swing.JButton();
        lbl_java = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        action_entersettings = new javax.swing.JButton();
        action_showdevlist = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel1.setText("服务器列表：");

        jList1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("服务器ip");
        jScrollPane1.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel2.setText("（此处还没有完成）");

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jButton1.setText("测试ping值");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MCLauncherFX Alpha 3");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        src_topic.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        src_topic.setForeground(new java.awt.Color(51, 153, 255));
        src_topic.setText("LC's Minecraft Launcher FX Beta 3");

        src_username.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        src_username.setText("用户名：");

        src_maxmem.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        src_maxmem.setText("内存大小：");

        rcv_isdebug.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        rcv_isdebug.setText("使用java.exe启动");

        action_start.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        action_start.setText("启动游戏");
        action_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_startActionPerformed(evt);
            }
        });

        rcv_512mem.setText("512MB");

        rcv_1024mem.setText("1024MB");

        rcv_2048mem.setText("2048MB");
        rcv_2048mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcv_2048memActionPerformed(evt);
            }
        });

        rcv_4096mem.setText("4096MB");

        rcv_javapath.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        action_searthforjava.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        action_searthforjava.setText("启动判断");
        action_searthforjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_searthforjavaActionPerformed(evt);
            }
        });

        lbl_java.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        lbl_java.setText("Java路径：");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel3.setText("状态：正常");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jLabel4.setText("版本：0.1.5Beta3");

        action_entersettings.setFont(new java.awt.Font("文泉驿微米黑", 0, 12)); // NOI18N
        action_entersettings.setText("进入设置");
        action_entersettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_entersettingsActionPerformed(evt);
            }
        });

        action_showdevlist.setFont(new java.awt.Font("文泉驿微米黑", 0, 12)); // NOI18N
        action_showdevlist.setText("开发者名单");
        action_showdevlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_showdevlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl_java))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(src_username)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rcv_javapath, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(action_searthforjava))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rcv_isdebug)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(action_start)
                                        .addGap(18, 18, 18)
                                        .addComponent(action_entersettings)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(action_showdevlist))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(src_topic)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rcv_1024mem)
                                    .addGap(55, 55, 55)
                                    .addComponent(rcv_2048mem)
                                    .addGap(34, 34, 34)
                                    .addComponent(rcv_4096mem))
                                .addComponent(rcv_username, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(src_maxmem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcv_512mem))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(src_topic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcv_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(src_username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(src_maxmem)
                    .addComponent(rcv_1024mem)
                    .addComponent(rcv_512mem)
                    .addComponent(rcv_4096mem)
                    .addComponent(rcv_2048mem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_java)
                    .addComponent(rcv_javapath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(action_searthforjava))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcv_isdebug)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(action_start)
                    .addComponent(action_entersettings)
                    .addComponent(action_showdevlist))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void action_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_startActionPerformed
        String username;
        username = rcv_username.getText();
       
       MCLauncher launch = new MCLauncher();
           try{
               SimpleSettingSaver sss = new SimpleSettingSaver("launcher");
               Object maxmem;
               maxmem=sss.ReadSavedSettings("maxmem");
               int realmem =(int) maxmem;
           boolean isjava = false;
            launch.start(username,realmem,jpath,isjava);
           }
         
           catch(IOException e)
           {
               e.printStackTrace();
               System.exit(1);
           }
           finally
           {
               System.exit(0);
           }
        
     
// TODO add your handling code here:
    }//GEN-LAST:event_action_startActionPerformed

    private void rcv_2048memActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcv_2048memActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcv_2048memActionPerformed

    private void action_searthforjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_searthforjavaActionPerformed

    String jpath = System.getProperty("java.home");
    rcv_javapath.setText(jpath);
    
    }//GEN-LAST:event_action_searthforjavaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
/*MCLauncher ls = new MCLauncher();
try{
ls.checkforupdate();
}
catch(IOException e)
{
    e.printStackTrace();
}
finally
{
    
}*/
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
  //由于服务器中断暂时关闭功能
    private void action_showdevlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_showdevlistActionPerformed
JOptionPane.showMessageDialog(null,"UI设计：Lucas\n内核设计：Lucas，“3”，Codes\n更新模块设计：Codes");
        // TODO add your handling code here:
    }//GEN-LAST:event_action_showdevlistActionPerformed

    private void action_entersettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_entersettingsActionPerformed
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
            java.util.logging.Logger.getLogger(MCSettingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCSettingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCSettingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCSettingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MCSettingFrame frame = new MCSettingFrame();
                frame.setVisible(true);
            }
        });    // TODO add your handling code here:
    }//GEN-LAST:event_action_entersettingsActionPerformed

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
            java.util.logging.Logger.getLogger(MCLauncherFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCLauncherFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCLauncherFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCLauncherFX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCLauncherFX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton action_entersettings;
    private javax.swing.JButton action_searthforjava;
    private javax.swing.JButton action_showdevlist;
    private javax.swing.JButton action_start;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_java;
    private javax.swing.JRadioButton rcv_1024mem;
    private javax.swing.JRadioButton rcv_2048mem;
    private javax.swing.JRadioButton rcv_4096mem;
    private javax.swing.JRadioButton rcv_512mem;
    private javax.swing.JCheckBox rcv_isdebug;
    private javax.swing.JTextField rcv_javapath;
    private javax.swing.JTextField rcv_username;
    private javax.swing.JLabel src_maxmem;
    private javax.swing.JLabel src_topic;
    private javax.swing.JLabel src_username;
    // End of variables declaration//GEN-END:variables
}
/*class CanvasPanel extends Canvas{
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2=(Graphics2D) g;
        MCLauncherFX s = new MCLauncherFX();
        g2.drawImage(s.img,0,0,this);
    }
            
}*/
