package Activitat5;

import java.util.StringTokenizer;

public class Fecha {
        private int dia;

        private int mes;

        private int anyo;

        private static final String[] DIAS_TEXTO = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes",
                "sábado"};

        private static final String[] MESES_TEXTO = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

        public Fecha() {
            this.dia = 1;
            this.mes = 1;
            this.anyo = 1970;
        }

        public Fecha(int dia, int mes, int anyo) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anyo;
        }

        public Fecha clone() {
            Fecha fechaClon = new Fecha(this.dia, this.mes,this.anyo);
            return fechaClon;
        }

        public Fecha(String fecha) {
            StringTokenizer st = new StringTokenizer(fecha);
            String dia = st.nextToken("/");
            int number1 = Integer.parseInt(dia);
            String mes = st.nextToken("/");
            int number2 = Integer.parseInt(mes);
            String anyo = st.nextToken("/");
            int number3 = Integer.parseInt(anyo);
            this.dia = number1;
            this.mes = number2;
            this.anyo = number3;
        }

        public void set(int dia, int mes, int anyo) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anyo;
        }

        public int getDia() {
            return dia;
        }

        public int getMes(){
            return mes;
        }

        public int getAnyo(){
            return anyo;
        }

        public void mostrarFormatoES()  {
            System.out.println("Formato espanol: "+getDia()+"-"+getMes()+"-"+getAnyo());
        }

        public void mostrarFormatoGB() {
            System.out.println("Formato GB: "+getAnyo()+"-"+getMes()+"-"+getDia());
        }

        public void mostrarFormatoTexto() {
            System.out.println("El formato texto es: "+this.dia +" de "+getMesTexto()+" de "+this.anyo);
        }

        public boolean isEqual(Fecha otraFecha) {
            if (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anyo == otraFecha.anyo ){
                return true;
            }else{
                return false;
            }
        }

        public int getNumeroSemana() {
            int dias = getDiasTranscurridosAnyo();
            int resto = dias / 7;
            return resto;
        }

        /**
         * Retorna el dia correspondiente de la semana en formato String
         * @return String
         */
        public String getDiaSemana() {
            switch (this.dia){
                case 1:

            }
            return null;
        }

        /**
         * Solo Festivo sábado o domingo
         * @return boolean
         */
        public boolean isFestivo() {
            return false;
        }

        public Fecha anyadir(int numDias){
            Fecha fecha2 = new Fecha(this.dia, this.mes, this.anyo);
            int diasMes = getDiasMes(fecha2.mes,fecha2.anyo);
            int sumaDias = fecha2.dia + numDias;
            int diferencia = diasMes - fecha2.dia;

            if (sumaDias > diasMes){
                fecha2.dia = 1;
                do {
                    fecha2.mes++;
                    fecha2.dia = numDias - diferencia;
                    sumaDias = sumaDias - diasMes;
                }while (sumaDias > diasMes);
            }else {
                fecha2.dia = sumaDias;
            }
            return fecha2;
        }

        /**
         * Devuelve un objeto de tipo fecha que representa una fecha restando @numDias
         * A la fecha Actual. El número máximo de dias a restar es 30
         *
         * @return boolean
         */
        public Fecha restar(int numDias){
            return null;
        }

        public boolean isCorrecta(){
            int diasMes = getDiasMes(this.mes,this.anyo);
            if (this.dia >=1 && this.dia <=diasMes){
                return true;
            }else {
                return false;
            }
        }

        private String getMesTexto() {
            String mes = "";
            switch (this.mes){
                case 1:
                    mes = MESES_TEXTO[0];
                    break;
                case 2:
                    mes = MESES_TEXTO[1];
                    break;
                case 3:
                    mes = MESES_TEXTO[2];
                    break;
                case 4:
                    mes = MESES_TEXTO[3];
                    break;
                case 5:
                    mes = MESES_TEXTO[4];
                    break;
                case 6:
                    mes = MESES_TEXTO[5];
                    break;
                case 7:
                    mes = MESES_TEXTO[6];
                    break;
                case 8:
                    mes = MESES_TEXTO[7];
                    break;
                case 9:
                    mes = MESES_TEXTO[8];
                    break;
                case 10:
                    mes = MESES_TEXTO[9];
                    break;
                case 11:
                    mes = MESES_TEXTO[10];
                    break;
                case 12:
                    mes = MESES_TEXTO[11];
                    break;
            }
            return mes;
        }

        public int getDiasTranscurridosOrigen() {
            int diasTotal = 0;
            int anyoActual = 1;
            for (int i = 1; i <=this.anyo ; i++) {
                if (isBisiesto(anyoActual)){
                    diasTotal = diasTotal+366;
                    anyoActual++;
                }else if (anyoActual == this.anyo){
                    diasTotal = diasTotal + getDiasTranscurridosAnyo();
                }else {
                    diasTotal = diasTotal+365;
                    anyoActual++;
                }
            }

            return diasTotal;
        }

        private int getDiasTranscurridosAnyo() {
            int diasTotal = 0;
            for (int i = 1; i <this.mes ; i++) {
                diasTotal = diasTotal + getDiasMes(i,this.anyo);
            }
            diasTotal = diasTotal +dia;
            return diasTotal;
        }

        public static boolean isBisiesto(int anyo){
            if (getDiasAnyo(anyo) == 365){
                return false;
            }else {
                return true;
            }
        }

        public static int getDiasMes(int mes, int anyo) {
            int total = 0;
            if (isBisiesto(anyo)){
                switch (mes){
                    case 1,3,5,7,8,10,12:
                        return total = 31;
                    case 2:
                        return  total = 29;
                    case 4,6,9,11:
                        return total = 30;
                }
            }else {
                switch (mes){
                    case 1,3,5,7,8,10,12:
                        return total = 31;
                    case 2:
                        return total = 28;
                    case 4,6,9,11:
                        return total = 30;
                }
            }
            return total;
        }

        public static int getDiasAnyo(int anyo){
            if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
                anyo = 366;
            } else {
                anyo = 365;
            }
            return anyo;
        }
        public int getAnyosTranscurridos(Fecha fecha){
            return this.anyo - fecha.anyo;
        }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anyo;
    }
}



