/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.Cliente;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import model.Bilhete;

/**
 *
 * @author User
 */
public class ListarBilhetes extends javax.swing.JFrame {

    /**
     * Creates new form ListarBilhetes
     */
    DefaultListModel modelo = new DefaultListModel();
    public static ListarBilhetes listarBilhetes;

    public ListarBilhetes() throws RemoteException, NotBoundException {
        initComponents();
        adicionarElementos(MenuUsuario.companhia);
    }

    public void adicionarElementos(int companhia) throws RemoteException, NotBoundException {
        Cliente c = new Cliente();
        LinkedList<Bilhete> bilhetes = new LinkedList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date datax = new Date();
        String data = sdf.format(datax);
        switch (companhia) {
            case 1:
                bilhetes = c.listarBilhetesCompanhia(TelaInicial.ip_a, TelaInicial.porta_a);
                listaBilhetesCompanhia.removeAll();
                modelo = new DefaultListModel();
                if (!bilhetes.isEmpty()) {
                    for (int i = 0; i < bilhetes.size(); i++) {
                        if (bilhetes.get(i).getCompanhia().equals("Norte - Nordeste") && bilhetes.get(i).getData().equals(data)){
                            modelo.addElement("Código: " + bilhetes.get(i).getId()
                                    + "\tOrigem: " + bilhetes.get(i).getOrigem()
                                    + "\tDestino: " + bilhetes.get(i).getDestino()
                                    + "\tPreço: R$" + bilhetes.get(i).getPreco());
                        }
                    }
                }
                break;
            case 2:
                bilhetes = c.listarBilhetesCompanhia(TelaInicial.ip_b, TelaInicial.porta_b);
                listaBilhetesCompanhia.removeAll();
                modelo = new DefaultListModel();
                if (!bilhetes.isEmpty()) {
                    for (int i = 0; i < bilhetes.size(); i++) {
                        if (bilhetes.get(i).getCompanhia().equals("Centro-Oeste") && bilhetes.get(i).getData().equals(data)){
                            modelo.addElement("Código: " + bilhetes.get(i).getId()
                                    + "\nOrigem: " + bilhetes.get(i).getOrigem()
                                    + "\nDestino: " + bilhetes.get(i).getDestino()
                                    + "\nPreço: R$" + bilhetes.get(i).getPreco());
                        }
                    }
                }
                
                break;
            case 3:
                bilhetes = c.listarBilhetesCompanhia(TelaInicial.ip_c, TelaInicial.porta_c);
                listaBilhetesCompanhia.removeAll();
                modelo = new DefaultListModel();
                if (!bilhetes.isEmpty()) {
                    for (int i = 0; i < bilhetes.size(); i++) {
                        if (bilhetes.get(i).getCompanhia().equals("Sul - Sudeste") && bilhetes.get(i).getData().equals(data)){
                            modelo.addElement("Código: " + bilhetes.get(i).getId()
                                    + "\nOrigem: " + bilhetes.get(i).getOrigem()
                                    + "\nDestino: " + bilhetes.get(i).getDestino()
                                    + "\nPreço: R$" + bilhetes.get(i).getPreco());
                        }
                    }
                }
                break;
        }
        listaBilhetesCompanhia.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaBilhetesCompanhia = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bilhetes Disponíveis");
        setResizable(false);

        listaBilhetesCompanhia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaBilhetesCompanhia);

        jLabel1.setText("Companhia:");

        jLabel2.setText("Nome Aqui");

        jButton1.setText("Comprar");

        jButton2.setText("<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(230, 230, 230)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaBilhetesCompanhia;
    // End of variables declaration//GEN-END:variables
}
