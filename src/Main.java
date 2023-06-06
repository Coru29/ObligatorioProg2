import Entidades.User;
import TADs.Hash.LinearProbingHashTable;
import TADs.Lista.LL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {



    // /Users/coru/IdeaProjects/AA_Obligatorio/src/dataset/f1_dataset_test.csv
    public static void main(String[] args) {

        int contadorKey = 0;

        LL<User> usuarios = new LL();
        LinearProbingHashTable<Integer, Object> tablaHash = new LinearProbingHashTable<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/coru/IdeaProjects/AA_Obligatorio/src/dataset/f1_dataset_test.csv"));

            String line;
            while ((line = reader.readLine()) != null) {
                // Divide la línea en las diferentes partes.
                String[] parts = line.split(",", -1);

                // Verifica que la línea tenga al menos 13 campos.
                if (parts.length >= 13) {
                    // Obtiene la columna "Column1".
                    String column1 = parts[0];

                    if (isNumeric(parts[0])) {
                        // Crea una nueva instancia de la clase User.
                        User tempUser = new User();
                        // Convierte el valor de 'Column1' a long y lo asigna al id del objeto user.

                        // esto es para agregar todos a un LL
//                        tempUser.setId(Long.parseLong(parts[0]));
//                        usuarios.add(tempUser);

                        tablaHash.put(contadorKey,tempUser);
                        contadorKey++;

                    }

                    // Obtiene la columna "user_description".
                    String userDescription = String.join(",", Arrays.copyOfRange(parts, 4, 11));

                    // Obtiene la columna "text".
                    String text = String.join(",", Arrays.copyOfRange(parts, 11, parts.length - 2));

                    // Obtiene la columna "hashtags".
                    String hashtags = parts[parts.length - 1];

                    // Imprime el valor en la columna "Column1".
//                    System.out.println(column1);
                }
            }


//            usuarios.imprimir();

            for (int i = 0; i < 100; i++) {
                System.out.println(tablaHash.get(i));
            }




        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

// esto es para buscar los datos q tengan 208738 en column1
//if (nextLine[0].equals("208738")) {
//        // Imprime toda la fila.
//        for (String item : nextLine) {
//        System.out.print(item + " ");
//        }
//        System.out.println();
//        }
