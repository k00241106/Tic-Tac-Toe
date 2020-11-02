/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Eoghan
 */
//to do:
//1. small bit of the gui
//2. increment score
//3. player Score

public class TicTacToeGUI extends javax.swing.JFrame {

    private String whosTurn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    private int playerOneCounter = 0;
    private int playerTwoCounter = 0;

    //public void determineWhoTurn()
    //{
    //  if(turn%2=0){
    //  whosTurn="X";
    //  turn++;
    //}
    //  else{
    //  whosTurn="0";
    //  turn++;
    public TicTacToeGUI() {
        initComponents();
        getPlayers();
        setPlayerNames();

    }

//        messageLabel.setText(playerOne + " Score: " + playerOneCounter + " \t "+playerTwo + " score: " + playerTwoCounter);
    private void tieGame() {
        String one = square1.getText();
        String two = square2.getText();
        String three = square3.getText();
        String four = square4.getText();
        String five = square5.getText();
        String six = square6.getText();
        String seven = square7.getText();
        String eight = square8.getText();
        String nine = square9.getText();

        if (one != "" && two != "" && three != "" && four != "" && five != ""
                && six != "" && seven != "" && eight != "" && nine != "") {
            JOptionPane.showMessageDialog(null, "Game is a tie");
            resetGame();
        }
    }

    private void getPlayers() {
        try {
            playerOne = JOptionPane.showInputDialog("Player One name");
            playerTwo = JOptionPane.showInputDialog("Player Two Name");

            if (playerOne.equals("")) {
                playerOne = "Player One";
            }
            if (playerTwo.equals("")) {
                playerTwo = "Player Two";

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No value entered", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
            playerOne = "Player One";
            playerTwo = "Player Two";
        }
    }

    private void setPlayerNames() {
        player1NameLabel.setText(playerOne);
        player1NameLabel.setForeground(Color.RED);
        player2NameLabel.setText(playerTwo);
        player2NameLabel.setForeground(Color.BLUE);
    }

    private void determineWhosTurn() {
        if (whosTurn.equalsIgnoreCase("X")) {
            whosTurn = "O";
            messageLabel.setText("Player O's Turn");
            messageLabel.setForeground(Color.BLUE);
        } else {
            whosTurn = "X";
            messageLabel.setText("Player X's Turn");
            messageLabel.setForeground(Color.RED);
        }
    }

    // X winning message
    private void xWins() {
        JOptionPane.showMessageDialog(null, "Player One Wins");
        playerOneCounter++;
        resetGame();
    }

    // O Winning message
    private void oWins() {
        JOptionPane.showMessageDialog(null, "Player Two Wins");
        playerTwoCounter++;
        resetGame();
    }

    private void resetGame() {
        //Resets the PLaying field
        square1.setText("");
        square2.setText("");
        square3.setText("");
        square4.setText("");
        square5.setText("");
        square6.setText("");
        square7.setText("");
        square8.setText("");
        square9.setText("");

        //Re-Enables The buttons
        square1.setEnabled(true);
        square2.setEnabled(true);
        square3.setEnabled(true);
        square4.setEnabled(true);
        square5.setEnabled(true);
        square6.setEnabled(true);
        square7.setEnabled(true);
        square8.setEnabled(true);
        square9.setEnabled(true);
    }
    //This is old version
    private void determineWhoWins() {
        String button1 = square1.getText();
        String button2 = square2.getText();
        String button3 = square3.getText();
        String button4 = square4.getText();
        String button5 = square5.getText();
        String button6 = square6.getText();
        String button7 = square7.getText();
        String button8 = square8.getText();
        String button9 = square9.getText();

        //Wining Conditions
        if (button1 == "X" && button2 == "X" && button3 == "X") {
            xWins();
        }
        if (button4 == "X" && button5 == "X" && button6 == "X") {
            xWins();
        }
        if (button7 == "X" && button8 == "X" && button9 == "X") {
            xWins();
        }
        if (button1 == "X" && button4 == "X" && button7 == "X") {
            xWins();
        }
        if (button2 == "X" && button5 == "X" && button8 == "X") {
            xWins();
        }
        if (button3 == "X" && button6 == "X" && button9 == "X") {
            xWins();
        }
        if (button1 == "X" && button5 == "X" && button9 == "X") {
            xWins();
        }
        if (button3 == "X" && button5 == "X" && button7 == "X") {
            xWins();
        }

        //IF O WINS
        if (button1 == "O" && button2 == "O" && button3 == "O") {
            oWins();
        }
        if (button4 == "O" && button5 == "O" && button6 == "O") {
            oWins();
        }
        if (button7 == "O" && button8 == "O" && button9 == "O") {
            oWins();
        }
        if (button1 == "O" && button4 == "O" && button7 == "O") {
            oWins();
        }
        if (button2 == "O" && button5 == "O" && button8 == "O") {
            oWins();
        }
        if (button3 == "O" && button6 == "O" && button9 == "O") {
            oWins();
        }
        if (button1 == "O" && button5 == "O" && button9 == "O") {
            oWins();
        }
        if (button3 == "O" && button5 == "O" && button7 == "O") {
            oWins();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        squaresPanel = new javax.swing.JPanel();
        square1 = new javax.swing.JButton();
        square2 = new javax.swing.JButton();
        square3 = new javax.swing.JButton();
        square4 = new javax.swing.JButton();
        square5 = new javax.swing.JButton();
        square6 = new javax.swing.JButton();
        square7 = new javax.swing.JButton();
        square8 = new javax.swing.JButton();
        square9 = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        player2NameLabel = new javax.swing.JLabel();
        player1NameLabel = new javax.swing.JLabel();
        easyLevelButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setPreferredSize(new java.awt.Dimension(600, 800));

        squaresPanel.setLayout(new java.awt.GridLayout(3, 3));

        square1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square1ActionPerformed(evt);
            }
        });
        squaresPanel.add(square1);

        square2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square2ActionPerformed(evt);
            }
        });
        squaresPanel.add(square2);

        square3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square3ActionPerformed(evt);
            }
        });
        squaresPanel.add(square3);

        square4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square4ActionPerformed(evt);
            }
        });
        squaresPanel.add(square4);

        square5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square5ActionPerformed(evt);
            }
        });
        squaresPanel.add(square5);

        square6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square6ActionPerformed(evt);
            }
        });
        squaresPanel.add(square6);

        square7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square7ActionPerformed(evt);
            }
        });
        squaresPanel.add(square7);

        square8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square8ActionPerformed(evt);
            }
        });
        squaresPanel.add(square8);

        square9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        square9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square9ActionPerformed(evt);
            }
        });
        squaresPanel.add(square9);

        newGameButton.setText("Reset Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player2NameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        player2NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player1NameLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        easyLevelButton.setText("Easy");
        easyLevelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyLevelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(squaresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player1NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(easyLevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(newGameButton)
                                .addGap(163, 163, 163)))
                        .addComponent(player2NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(squaresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newGameButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2NameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(easyLevelButton)
                                .addComponent(player1NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void square3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square3ActionPerformed
        square3.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square3.setForeground(Color.RED);
        } else {
            square3.setForeground(Color.BLUE);
        }
        square3.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square3ActionPerformed

    private void square1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square1ActionPerformed
        square1.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square1.setForeground(Color.RED);
        } else {
            square1.setForeground(Color.BLUE);
        }
        square1.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square1ActionPerformed

    private void square2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square2ActionPerformed
        square2.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square2.setForeground(Color.RED);
        } else {
            square2.setForeground(Color.BLUE);
        }
        square2.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square2ActionPerformed

    private void square4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square4ActionPerformed
        square4.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square4.setForeground(Color.RED);
        } else {
            square4.setForeground(Color.BLUE);
        }
        square4.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square4ActionPerformed

    private void square5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square5ActionPerformed
        square5.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square5.setForeground(Color.RED);
        } else {
            square5.setForeground(Color.BLUE);
        }
        square5.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square5ActionPerformed

    private void square6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square6ActionPerformed
        square6.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square6.setForeground(Color.RED);
        } else {
            square6.setForeground(Color.BLUE);
        }
        square6.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square6ActionPerformed

    private void square7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square7ActionPerformed
        square7.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square7.setForeground(Color.RED);
        } else {
            square7.setForeground(Color.BLUE);
        }
        square7.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square7ActionPerformed

    private void square8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square8ActionPerformed
        square8.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square8.setForeground(Color.RED);
        } else {
            square8.setForeground(Color.BLUE);
        }
        square8.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square8ActionPerformed

    private void square9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square9ActionPerformed
        square9.setText(whosTurn);
        if (whosTurn.equalsIgnoreCase("X")) {
            square9.setForeground(Color.RED);
        } else {
            square9.setForeground(Color.BLUE);
        }
        square9.setEnabled(false);
        determineWhosTurn();
        determineWhoWins();
        tieGame();
    }//GEN-LAST:event_square9ActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        resetGame();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void easyLevelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_easyLevelButtonActionPerformed
        if(easyLevelButton.isSelected()){
            
        }
    }//GEN-LAST:event_easyLevelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton easyLevelButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel player1NameLabel;
    private javax.swing.JLabel player2NameLabel;
    private javax.swing.JButton square1;
    private javax.swing.JButton square2;
    private javax.swing.JButton square3;
    private javax.swing.JButton square4;
    private javax.swing.JButton square5;
    private javax.swing.JButton square6;
    private javax.swing.JButton square7;
    private javax.swing.JButton square8;
    private javax.swing.JButton square9;
    private javax.swing.JPanel squaresPanel;
    // End of variables declaration//GEN-END:variables
}
