package CursoJavaBasicoAula27.labs;

public class JogoDaVelha {

	char[][] jogoVelha = new char[3][3];
	int jogada = 1;

	boolean validarJogada(int linha, int coluna, char sinal){
			
			if(jogoVelha[linha][coluna] == 'X' || jogoVelha [linha][coluna] == '0') {
				return false;
			}else { //jogada válida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
				return true;
			}
		}
	
}
