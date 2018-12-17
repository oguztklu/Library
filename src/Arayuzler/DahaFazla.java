/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arayuzler;

import Arayuzler.Kullanici_GUI;
import Kitap.*;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
public class DahaFazla extends javax.swing.JFrame {

     Dergi adres;
    public DahaFazla(Kitap x) {
        initComponents();
        tAOzet.setVisible(false);
        jLabel2.setVisible(false);
        panelOzet.setVisible(false);
        jpanelTeslimTarihi.setVisible(false);
        panelicon.setVisible(false);
        panelOKU.setVisible(false);
       decide(x);
       
        
    }

    
   public void decide(Kitap x){
       String id = Integer.toString(x.getID());
       PanelKitap.setVisible(true);
        KitapTurleri.setVisible(true);
        HangiTur.setVisible(true);
       
            panelicon.setVisible(true);
            
        
        if (x.getKitapAlan() != null && x.getKitapAlan().getTeslimTarihi().equals("") == false) {
           jpanelTeslimTarihi.setVisible(true);
           tfTeslimTarihi.setText(x.getKitapAlan().getTeslimTarihi());
       }
        
          if (x.isUygun()) {
               tfUygunluk.setText("Evet odunc Alinabilir !");
               
           }
           else{
               tfUygunluk.setText("Hayir Bu kitap Odunc Alindi !!");
               
           }
       if (x instanceof Roman) {
           lblicon.setIcon(x.getKapak_resmi());
           if (((Roman) x).getOzet().equals("")) {
             panelOzet.setVisible(false);
           }
           else{
               panelOzet.setVisible(true);
           }
        PanelBasili.setVisible(true);
        panelElektronik.setVisible(false);
        HangiTur.setVisible(true);
        panelRoman.setVisible(true);
        panelAnsiklopedi.setVisible(false);
        panelDergi.setVisible(false);
        tfKitapID.setText(id);
        tfAd.setText(x.getKitap_adi());
        tfBasiTarihi.setText(x.getBasim_tarihi());
        tfYayinEvi.setText(x.getYayim_Evi());
        tfHamur.setText(((Roman) x).getHamur());
        tfBaski.setText(((Roman) x).getBaskı());
        tfSize.setText(((Roman) x).getSize());
        tfTür.setText(((Roman) x).getTür());
        tfYasAraligi.setText(((Roman) x).getYaşAralığı());
        tfAkim.setText(((Roman) x).getEtkilendiğiAkım());
        tfYazar.setText(((Roman) x).getYazar());
        tAOzet.setText(((Roman) x).getOzet());
         
          tAOzet.setText(((Roman) x).getOzet());
       }
       else if(x instanceof Dergi){
           lblicon.setIcon(x.getKapak_resmi());
           panelOKU.setVisible(true);
           adres = (Dergi) x;
           if (((Dergi) x).getOzet().equals("")) {
             panelOzet.setVisible(false);
           }
           else{
               panelOzet.setVisible(true);
           }
        
        KitapTurleri.setVisible(true);
        panelDergi.setVisible(true);
        panelElektronik.setVisible(true);
        PanelBasili.setVisible(false);
        panelRoman.setVisible(false);
        panelAnsiklopedi.setVisible(false);
           tfKitapID.setText(id);
       tfYayinEvi.setText(x.getYayim_Evi());
       tfBasiTarihi.setText(x.getBasim_tarihi());
       tfAd.setText(x.getKitap_adi());
       tfDil.setText(((Dergi) x).getDil());
       tfBaski2.setText(((Dergi) x).getBaskıElek());
       tAOzet.setText(((Dergi) x).getOzet());
       tfTür1.setText(((Dergi) x).getTürDergi());
       tfEditor.setText(((Dergi) x).getEditor());
       tfKordinator.setText(((Dergi) x).getKoordinator());
       tfSayi.setText(((Dergi) x).getSayi());
       tfYayimAraligi.setText(((Dergi) x).getYayımAralığı());
       tAOzet.setText(((Dergi) x).getOzet());
        
       }
       else if(x instanceof Ansiklopedi){
           lblicon.setIcon(x.getKapak_resmi());
       PanelBasili.setVisible(true);
       panelAnsiklopedi.setVisible(true);
       panelRoman.setVisible(false);
       panelDergi.setVisible(false);
       panelElektronik.setVisible(false);
          
       tfKitapID.setText(id);
       tfYayinEvi.setText(x.getYayim_Evi());
       tfBasiTarihi.setText(x.getBasim_tarihi());
       tfAd.setText(x.getKitap_adi());
       tfHamur.setText(((Ansiklopedi) x).getHamur());
       tfBaski.setText(((Ansiklopedi) x).getBaskı());
       tfSize.setText(((Ansiklopedi) x).getSize());
       tfKonu.setText(((Ansiklopedi) x).getKonu());
       tfDagitici.setText(((Ansiklopedi) x).getContributors());
       
       }
       
       
   }

   public void clear(){
       
       
       
       
       
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelKitap = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfYayinEvi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBasiTarihi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfUygunluk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfKitapID = new javax.swing.JTextField();
        KitapTurleri = new javax.swing.JPanel();
        PanelBasili = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfHamur = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBaski = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        panelElektronik = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tfBaski2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfDil = new javax.swing.JTextField();
        HangiTur = new javax.swing.JPanel();
        panelDergi = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tfKordinator = new javax.swing.JTextField();
        tfSayi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfYayimAraligi = new javax.swing.JTextField();
        tfTür1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfEditor = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        panelAnsiklopedi = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        tfKonu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfDagitici = new javax.swing.JTextField();
        panelRoman = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfTür = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfYasAraligi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfAkim = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfYazar = new javax.swing.JTextField();
        btnCık = new javax.swing.JButton();
        panelOzet = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAOzet = new javax.swing.JTextArea();
        jpanelTeslimTarihi = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tfTeslimTarihi = new javax.swing.JTextField();
        panelicon = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        panelOKU = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Kitap Adi :");

        tfAd.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Yayin Evi :");

        tfYayinEvi.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Basim Tarihi :");

        tfBasiTarihi.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Uygun mu ? :");

        tfUygunluk.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Kitap ID");

        tfKitapID.setEditable(false);

        javax.swing.GroupLayout PanelKitapLayout = new javax.swing.GroupLayout(PanelKitap);
        PanelKitap.setLayout(PanelKitapLayout);
        PanelKitapLayout.setHorizontalGroup(
            PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKitapLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUygunluk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKitapLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(tfYayinEvi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKitapLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(tfAd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelKitapLayout.createSequentialGroup()
                        .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfBasiTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(tfKitapID))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKitapLayout.setVerticalGroup(
            PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKitapID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYayinEvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBasiTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelKitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUygunluk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        KitapTurleri.setLayout(new java.awt.CardLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Hamur :");

        tfHamur.setEditable(false);
        tfHamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHamurActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Baski :");

        tfBaski.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Size :");

        tfSize.setEditable(false);
        tfSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBasiliLayout = new javax.swing.GroupLayout(PanelBasili);
        PanelBasili.setLayout(PanelBasiliLayout);
        PanelBasiliLayout.setHorizontalGroup(
            PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBasiliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfHamur, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBaski, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBasiliLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        PanelBasiliLayout.setVerticalGroup(
            PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBasiliLayout.createSequentialGroup()
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBaski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBasiliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        KitapTurleri.add(PanelBasili, "card2");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setText("Baski :");

        tfBaski2.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Dil :");

        tfDil.setEditable(false);

        javax.swing.GroupLayout panelElektronikLayout = new javax.swing.GroupLayout(panelElektronik);
        panelElektronik.setLayout(panelElektronikLayout);
        panelElektronikLayout.setHorizontalGroup(
            panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElektronikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelElektronikLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelElektronikLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBaski2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 185, Short.MAX_VALUE))
        );
        panelElektronikLayout.setVerticalGroup(
            panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelElektronikLayout.createSequentialGroup()
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelElektronikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBaski2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        KitapTurleri.add(panelElektronik, "card3");

        HangiTur.setLayout(new java.awt.CardLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Kordinatör :");

        tfKordinator.setEditable(false);

        tfSayi.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("Sayi :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setText("Yayim Araligi :");

        tfYayimAraligi.setEditable(false);

        tfTür1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("Tür :");

        tfEditor.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setText("Editor");

        javax.swing.GroupLayout panelDergiLayout = new javax.swing.GroupLayout(panelDergi);
        panelDergi.setLayout(panelDergiLayout);
        panelDergiLayout.setHorizontalGroup(
            panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDergiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfYayimAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKordinator, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfTür1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        panelDergiLayout.setVerticalGroup(
            panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDergiLayout.createSequentialGroup()
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYayimAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKordinator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTür1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDergiLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelDergiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HangiTur.add(panelDergi, "card4");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Konu :");

        tfKonu.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("Dagitici :");

        tfDagitici.setEditable(false);

        javax.swing.GroupLayout panelAnsiklopediLayout = new javax.swing.GroupLayout(panelAnsiklopedi);
        panelAnsiklopedi.setLayout(panelAnsiklopediLayout);
        panelAnsiklopediLayout.setHorizontalGroup(
            panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfKonu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDagitici, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        panelAnsiklopediLayout.setVerticalGroup(
            panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnsiklopediLayout.createSequentialGroup()
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAnsiklopediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDagitici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        HangiTur.add(panelAnsiklopedi, "card3");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Tür :");

        tfTür.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Yas Araligi :");

        tfYasAraligi.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Etkilenen Akim:");

        tfAkim.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Yazar :");

        tfYazar.setEditable(false);
        tfYazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfYazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRomanLayout = new javax.swing.GroupLayout(panelRoman);
        panelRoman.setLayout(panelRomanLayout);
        panelRomanLayout.setHorizontalGroup(
            panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRomanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRomanLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAkim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRomanLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTür, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRomanLayout.createSequentialGroup()
                        .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRomanLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfYazar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRomanLayout.createSequentialGroup()
                                .addComponent(tfYasAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        panelRomanLayout.setVerticalGroup(
            panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRomanLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTür, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYasAraligi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRomanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAkim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HangiTur.add(panelRoman, "card2");

        btnCık.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCık.setText("ÇIKIŞ");
        btnCık.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCıkActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OZET");

        tAOzet.setEditable(false);
        tAOzet.setColumns(20);
        tAOzet.setRows(5);
        jScrollPane1.setViewportView(tAOzet);

        javax.swing.GroupLayout panelOzetLayout = new javax.swing.GroupLayout(panelOzet);
        panelOzet.setLayout(panelOzetLayout);
        panelOzetLayout.setHorizontalGroup(
            panelOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelOzetLayout.setVerticalGroup(
            panelOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOzetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setText("Teslim Tarihi :");

        tfTeslimTarihi.setEditable(false);

        javax.swing.GroupLayout jpanelTeslimTarihiLayout = new javax.swing.GroupLayout(jpanelTeslimTarihi);
        jpanelTeslimTarihi.setLayout(jpanelTeslimTarihiLayout);
        jpanelTeslimTarihiLayout.setHorizontalGroup(
            jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTeslimTarihiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelTeslimTarihiLayout.setVerticalGroup(
            jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTeslimTarihiLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpanelTeslimTarihiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneliconLayout = new javax.swing.GroupLayout(panelicon);
        panelicon.setLayout(paneliconLayout);
        paneliconLayout.setHorizontalGroup(
            paneliconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        paneliconLayout.setVerticalGroup(
            paneliconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("OKU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOKULayout = new javax.swing.GroupLayout(panelOKU);
        panelOKU.setLayout(panelOKULayout);
        panelOKULayout.setHorizontalGroup(
            panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOKULayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOKULayout.setVerticalGroup(
            panelOKULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOKULayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelTeslimTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKitap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KitapTurleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HangiTur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(panelOzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(panelicon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCık, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelOKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelKitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KitapTurleri, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HangiTur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOzet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanelTeslimTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(panelOKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCık, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfHamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHamurActionPerformed

    private void tfSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSizeActionPerformed

    private void tfYazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfYazarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfYazarActionPerformed

    private void btnCıkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCıkActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCıkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String web = adres.getWebSayfasi();
    Desktop d = Desktop.getDesktop();
    
         try {
             d.browse(new URI(web));
         } catch (URISyntaxException ex) {
             Logger.getLogger(DahaFazla.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(DahaFazla.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HangiTur;
    private javax.swing.JPanel KitapTurleri;
    private javax.swing.JPanel PanelBasili;
    private javax.swing.JPanel PanelKitap;
    private javax.swing.JButton btnCık;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelTeslimTarihi;
    private javax.swing.JLabel lblicon;
    private javax.swing.JPanel panelAnsiklopedi;
    private javax.swing.JPanel panelDergi;
    private javax.swing.JPanel panelElektronik;
    private javax.swing.JPanel panelOKU;
    private javax.swing.JPanel panelOzet;
    private javax.swing.JPanel panelRoman;
    private javax.swing.JPanel panelicon;
    private javax.swing.JTextArea tAOzet;
    private javax.swing.JTextField tfAd;
    private javax.swing.JTextField tfAkim;
    private javax.swing.JTextField tfBasiTarihi;
    private javax.swing.JTextField tfBaski;
    private javax.swing.JTextField tfBaski2;
    private javax.swing.JTextField tfDagitici;
    private javax.swing.JTextField tfDil;
    private javax.swing.JTextField tfEditor;
    private javax.swing.JTextField tfHamur;
    private javax.swing.JTextField tfKitapID;
    private javax.swing.JTextField tfKonu;
    private javax.swing.JTextField tfKordinator;
    private javax.swing.JTextField tfSayi;
    private javax.swing.JTextField tfSize;
    private javax.swing.JTextField tfTeslimTarihi;
    private javax.swing.JTextField tfTür;
    private javax.swing.JTextField tfTür1;
    private javax.swing.JTextField tfUygunluk;
    private javax.swing.JTextField tfYasAraligi;
    private javax.swing.JTextField tfYayimAraligi;
    private javax.swing.JTextField tfYayinEvi;
    private javax.swing.JTextField tfYazar;
    // End of variables declaration//GEN-END:variables
}
