public class Runner {
        public static void main(String[] args){
            double[] scan = {0.3,0.7,0.834,0.4,1.4,1.1, 0.1,0.2, 0.2, 1.6, 0.5, 0.9};
            double[] scan2 = {0.3, 0.5, 0.75, 0.4, 1.44, 1.1};

            SkyView sv1 = new SkyView(4,3,scan);
            System.out.println();
            SkyView sv2 = new SkyView(3,2,scan2);;
            System.out.println();

            System.out.println("Average 1: "+ sv1.getAverage(1,3,0,2));
            System.out.println("Average 2: "+ sv2.getAverage(0,1,0,1));
        }
    }
