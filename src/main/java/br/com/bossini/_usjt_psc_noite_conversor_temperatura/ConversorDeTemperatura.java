/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_noite_conversor_temperatura;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author rodrigo
 */
public class ConversorDeTemperatura {
    
    public static void criarTela(){
        //construir a moldura (JFrame)
        JFrame tela = new JFrame ("Conversor");
        //construir o campo em que o usuário vai digitar (JTextField)
        JTextField celsiusTextField = new JTextField(10);
        //construir um rótulo que mostra °C (JLabel)
        JLabel celsiusLabel = new JLabel("\u00B0C");
        //construir um botão para fazer a conversão (JButton)
        JButton conversaoButton = new JButton ("Converter");
        //construir um rótulo que mostra a temperatura convertida (JLabel)
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 2));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(conversaoButton);
        painelDeConteudo.add(valorConvertidoLabel);
        conversaoButton.addActionListener((e) -> {
            //1. Pegar o que o usuário digitou (vem textual, como String)
            String celsiusString = celsiusTextField.getText();
            //2. Converter para número
            double celsiusDouble = Double.parseDouble(celsiusString);
            //3. Converter de celsius fahrenheit
            double fahrenheitDouble = celsiusDouble / 5 * 9 + 32;
            //4. Converter o resultado para texto
            String fahrenheitString = Double.toString(fahrenheitDouble);
            //5. Fazer com que o JLabel de resultado exiba o valor convertido
            valorConvertidoLabel.setText(fahrenheitString);            
        });
        
        tela.pack();
        //centralizar
        tela.setLocationRelativeTo(null);
        //operação padrão quando o usuário clicar no X
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tornar a tela visível
        tela.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
    
}
