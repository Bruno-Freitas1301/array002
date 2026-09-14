package array002;

import javax.swing.JOptionPane;

public class ronaaldo {
	public static void main(String[] args) {

		String impressão = "";
	    int numeros [] = new int[10];
	    
    	for (int p = 0; p < 10; p++) {
    		numeros[p] = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 numeros"));
        	impressão = impressão + "" + numeros[p];   
    	}
        JOptionPane.showMessageDialog(null, "" + impressão);
	}
}