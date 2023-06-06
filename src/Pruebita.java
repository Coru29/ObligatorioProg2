import java.io.*;

public class Pruebita {

    public static void main(String[] args) {

        //CSV = Comma-Separated Values
        //   text file that uses a comma to separate values

        String file = "/Users/coru/IdeaProjects/AA_Obligatorio/src/dataset/f1_dataset_test.csv";
        BufferedReader reader = null;
        String line = "";

        int contadorMax = 0;
        int contadorLeclerc = 0;
        int contadorSainz = 0;
        int contadorPerez = 0;
        int contadorHamilton = 0;
        int contadorRussell = 0;

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {

//                String[] row = line.split(",");
                String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                // -----------  -----------  -----------  -----------  -----------  -----------  -----------  -----------

                // contador para max
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Max")) contadorMax++;
                }

                //contador Leclerc
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Leclerc")) contadorLeclerc++;
                }


                //contador Sainz
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Leclerc") || row[i].equals("Carlos")) contadorSainz++;
                }

                //contador Pérez
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Pérez") || row[i].equals("Sergio") || row[i].equals("Perez")) contadorPerez++;
                }

                //contador Hamilton
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Hamilton") || row[i].equals("Lewis")) contadorHamilton++;
                }

                //contador Russell
                for (int i = 0; i < row.length; i++) {
                    if (row[i].equals("Russell") || row[i].equals("George")) contadorRussell++;
                }


                // -----------  -----------  -----------  -----------  -----------  -----------  -----------  -----------

//
//                for(String index : row) {
//                    System.out.printf("%-10s", index);
//                }
                System.out.println();


            }

            System.out.println("contador Max = " +contadorMax);
            System.out.println("contador Leclerc = " + contadorLeclerc);
            System.out.println("contador Sainz = " + contadorSainz);
            System.out.println("contador Perez = " + contadorPerez);
            System.out.println("contador Hamilton = " + contadorHamilton);
            System.out.println("contador Russel = " + contadorRussell);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}