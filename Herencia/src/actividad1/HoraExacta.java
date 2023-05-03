package actividad1;

	public class HoraExacta extends Hora {

		private int Segundos;
		
		/*
		 * 
		 */
		public HoraExacta(int hora, int minutos, int segundos) {
			super(hora, minutos);
			this.Segundos = segundos;
		}
		/*
		 * 
		 */
		public boolean setSegundo(int segundos) {
			
			boolean resm = false;
			if (segundos < 60 && segundos >= 0) {
				this.Segundos = segundos;
				resm = true;
			}
			
			return resm;
			
		}
		
		@Override
	    public void inc() {
	        if (Segundos < 59) {
	            Segundos++;
	        } else {
	            Segundos = 0;
	            super.inc();
	        }
	    }

		@Override
		public String toString() {
			return "Segundos";
		}

	    
}
