package manager;

public class Equation {
        public double a;
        public double b;
        public double c;
        private int N;
        public Equation (double a, double b, double c){

            this.a = a;
            this.b = b;
            this.c = c;

            double d = b*b - 4*a*c;

            if (d > 0){
                N = 2;
            } else if(d == 0){
                N = 1;
            } else {
                N = 0;
            }


        }
        public int RootNumber(){
            return N;
        }

}
