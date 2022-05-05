
    import java.util.ArrayList;
    import java.util.Comparator;

    interface anonClass{
        void anonMethod();
    }

    interface intFuncional{
        String intFuncionalMethod(ArrayList<String> A);
    }

    interface metReferencia{
        void metReferenciaMethod(ArrayList<String> A);
    }

    class Ordenar {

        class compararAlfabeticamente implements Comparator<String> {
            public int compare(String S1, String S2) {
                return S1.compareTo(S2);
            }

        }

        void ordenarAlf(ArrayList<String> A) {
            A.sort(new compararAlfabeticamente());

            System.out.println();
            System.out.println("Nombres ordenados alfabéticamente con método de referencia:");

            for (String Alfabetico : A) {
                System.out.println(Alfabetico);
            }
        }


        class compararLongitud implements Comparator<String> {
            public int compare(String S1, String S2) {

                int L1 = S1.length();
                int L2 = S2.length();

                if (L1 > L2) {
                    return 1;
                } else if (L1 < L2) {
                    return -1;
                }
                return 0;
            }
        }

        void ordenarLong(ArrayList<String> A) {
            A.sort(new compararLongitud());

            System.out.println();
            System.out.println("Nombres ordenados por longitud con método de referencia:");

            for (String Longitud : A) {
                System.out.println(Longitud);
            }
        }


    }
    public class Expresiones {
        public static void main(String[] args) {


            ArrayList<String> List = new ArrayList<>();


            List.add("Alvaro Bucio");
            List.add("Joaquin Pagaza");
            List.add("Elizabeth Mascote");
            List.add("Jesus Miyamoto");
            List.add("Brenda Reyes");
            List.add("Braulio Millan");
            List.add("Evelin Garduño");
            List.add("Tomas Garcia");
            List.add("Erick Aguilar");
            List.add("Nicolas Uribe");

            anonClass anon = new anonClass() {
                @Override
                public void anonMethod() {
                    class compararAlfabeticamente implements Comparator<String>{
                        public int compare(String S1, String S2){
                            return S1.compareTo(S2);
                        }
                    }

                    List.sort(new compararAlfabeticamente());
                    System.out.println("Nombres ordenados alfabéticamente con clase anónima:");

                    for (String Alfabetico : List) {
                        System.out.println(Alfabetico);
                    }

                    class compararLongitud implements Comparator<String>{
                        public int compare(String S1, String S2){

                            int L1 = S1.length();
                            int L2 = S2.length();

                            if(L1 > L2){
                                return 1;
                            }
                            else if (L1 < L2){
                                return -1;
                            }
                            return 0;
                        }
                    }

                    List.sort(new compararLongitud());
                    System.out.println();
                    System.out.println("Nombres ordenados por longitud con clase anónima:");

                    for(String Longitud : List){
                        System.out.println(Longitud);
                    }
                }
            };

            anon.anonMethod();
            System.out.println();

            intFuncional lambda = (a) -> {
                class compararAlfabeticamente implements Comparator<String>{
                    public int compare(String S1, String S2){
                        return S1.compareTo(S2);
                    }
                }

                List.sort(new compararAlfabeticamente());
                System.out.println("Nombres ordenados alfabéticamente con lambda e interfaz funcional:");

                for (String Alfabetico : List) {
                    System.out.println(Alfabetico);
                }

                class compararLongitud implements Comparator<String>{
                    public int compare(String S1, String S2){

                        int L1 = S1.length();
                        int L2 = S2.length();

                        if(L1 > L2){
                            return 1;
                        }
                        else if (L1 < L2){
                            return -1;
                        }
                        return 0;
                    }
                }

                List.sort(new compararLongitud());
                System.out.println();
                System.out.println("Nombres ordenados por longitud con lambda e interfaz funcional:");

                for(String Longitud : List){
                    System.out.println(Longitud);
                }
                return null;
            };

            lambda.intFuncionalMethod(List);
            System.out.println();


            Ordenar Lista = new Ordenar();

            metReferencia ordenadaAlf = Lista::ordenarAlf;
            ordenadaAlf.metReferenciaMethod(List);

            metReferencia ordenadaLong = Lista::ordenarLong;
            ordenadaLong.metReferenciaMethod(List);
        }
    }

