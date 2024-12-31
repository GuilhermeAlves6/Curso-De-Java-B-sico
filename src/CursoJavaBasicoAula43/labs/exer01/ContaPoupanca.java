package CursoJavaBasicoAula43.labs.exer01;

import java.util.Calendar;

//(15) sub-classe: contaPoupança
      public class ContaPoupanca extends ContaBancaria {
    	  
    	  //(16)Dia rendimento
    	  private int diaRendimento;
    	  
    	  
    	//(17) Gerar os Getters and Satter do Dia Rendimento 
		public int getDiaRendimento() {
			return diaRendimento;
		}
		
		public void setDiaRendimento(int diaRendimento) {
			this.diaRendimento = diaRendimento;
		}

		
		//(18) Gerar o método ToString
		@Override
		public String toString() {
			String s = "ContaPoupança[";
			s += " diaRendimento:" + diaRendimento;
		    s += " ; " + super.toString();
		    s += "]" ;
		    return s;
		}
		
		//(19) Calcular o novo saldo
		public boolean calcularNovoSaldo(double taxaRendimento) {
			
			//(20) Obter a data de hoje no java
			Calendar hoje = Calendar.getInstance();
			if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
				//saldo += saldo * taxaRendimento;
				this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
				return true;
			}
			return false;
		}
	
}






/*import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "ContaPoupança[";
		s += " diaRendimento:" + diaRendimento;
	    s += "; " + super.toString();
	    s += "]" ;
	    return s;
		
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			//saldo += saldo * taxaRendimento;
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
	

}*/
