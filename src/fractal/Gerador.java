/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal;

/**
 *
 * @author higor
 */
public class Gerador {
    private static String atual = "";
	private static String translacaoF;
	private static String translacaoG;
	
	public static void Begin(String init, String translacaoFF, String translacaoGG)
	{
		atual = init;
		translacaoF = translacaoFF;
		translacaoG = translacaoGG;
	}
	
	public static String Read(int interacoes)
	{
		for(int n = 0; n < interacoes; n++)
		{
			StringBuffer next = new StringBuffer();
			for (int i = 0; i < atual.length(); i++) 
			{
				char c = atual.charAt(i);
			
				if (c == 'F')
					next.append(translacaoF);	
				else if (c == 'G')
					next.append(translacaoG);
			}		
			atual = next.toString();	
		}
		return atual;
	}
}
