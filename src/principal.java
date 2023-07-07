import java.io.*;

public class principal {
    public static void main(String[] args) {
        String filePath="Datos.dat";
        MiClase MiObjeto=new MiClase("Ariana",20);

        try(FileOutputStream fileOut=new FileOutputStream(filePath);
            ObjectOutputStream obOut=new ObjectOutputStream(fileOut)
        ){
            obOut.writeObject(MiObjeto);
            System.out.println("Archivo escrito correctamente");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    try(
            FileInputStream fileIn=new FileInputStream(filePath);
            ObjectInputStream objIn=new ObjectInputStream(fileIn);
            ){
        MiClase readObject=(MiClase) objIn.readObject();
        System.out.println("El objeto en disco es:"+readObject);
        System.out.println(readObject.getEdad());
        System.out.println(readObject.getNombre());
    }catch (IOException e){
        throw new RuntimeException(e);
    }catch (ClassNotFoundException e){
        throw new RuntimeException(e);
    }

    }
}
