package controller;

public class InversaoController {
	public String inverteString(String str, int tamanho) {
		
		/*
		 * condicao de parada tamanho == 1
		 * 
		 * quando o tamanho é == 1
		 * retorna o elemento no indice 1 e a recursao acaba
		 */
		if (tamanho == 1) {
			return str.substring(tamanho-1, tamanho);
		}
		
		/*
		 * retona o caractere atual e continua a recursao para inverter os proximos caracteres
		 */
		return  str.substring(tamanho-1, tamanho) + inverteString(str, tamanho-1);
	}
}
