import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		InputStreamReader leer = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(leer);
		
		System.out.println("1) Carreras");
		System.out.println("2) Materias");
		System.out.println("3) Mallas Curriculares");
		System.out.println("4) Salir");
		int opcion1= scan.nextInt();
		if(opcion1 == 1){
			System.out.println("a) Ingresar Nueva Carrera");
			System.out.println("b) Listar todas las Carreras");
			System.out.println("c) Buscar Carrera por Código");
			System.out.println("d) Eliminar Carrera");
			System.out.println("e) Salir");
			
		}
		
		while(opcion1 == 2){
			System.out.println("a) Ingresar Nueva Materia");
			System.out.println("b) Listar todas las Materias");
			System.out.println("c) Buscar Materia por Código");
			System.out.println("d) Eliminar Materia");
			
			
			String opcion2 = scan.next();
			while(opcion2.equals("a")){
				String cod = "";
				System.out.println("Ingrese código de la materia: ");
				
				try {
					cod = buff.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Código: " + cod);
				System.out.println("Ingrese nombre de la materia: ");
				String nombre = null;
				try {
					nombre = buff.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Nombre: " + nombre);
				System.out.println("Ingrese descripción de la materia:");
				
				String descripcion = null;
				try {
					descripcion = buff.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Descripción: " + descripcion);
				System.out.println("Ingrese número de créditos teóricos:");
				
				int creditosTeoricos = scan.nextInt();
				System.out.println("Créditos Teóricos: " + creditosTeoricos);
				System.out.println("Ingrese número de créditos prácticos:");
				
		
				int creditosPracticos = scan.nextInt();
				System.out.println("Créditos Prácticos: " + creditosPracticos);
				
				LinkedList<Materia> materias = new LinkedList<Materia>();
				Materia materia = new Materia(cod, nombre, descripcion, creditosTeoricos, creditosPracticos);
				materias.addLast(materia);
				try {
					guardarMaterias(true, materias);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("(1) Ingresar nueva materia");
				System.out.println("(2) Volver");
				int opcion3 =scan.nextInt();
				if(opcion3 == 2){
					break;
				}
			while(opcion2.equals("b")){
				
				
			}
			while(opcion2.equals("c")){
				
			}
			while(opcion2.equals("d")){		
				
			}
			
			
			
		}
		
		

	}
	public static void guardarMaterias(boolean nuevoArchivo, LinkedList<Materia> materias) throws IOException{
		
		File archivo = null;
	
		
		try{
			archivo =new File("C:\\Users\\GOD\\workspace\\Proyecto Final\\src\\materias.sol");
			
			if (archivo.createNewFile()){
			System.out.println("se ha creado el archivo");	
			}
				
		}catch(Throwable e){
          			
			System.err.println("no se ha podido crear el archivo");
			
		}
		
		try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(archivo, nuevoArchivo);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bw = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            for (Materia materia : materias) {
                
                bw.newLine();
                for (Materia m : materias ) {
                    bw.write(m.getCodigo() + "|");
                    bw.write(m.getNombre() + "|");
                    bw.write(m.getDescripcion() + "|");
                    bw.write(m.getCreditosTeoricos() + "|");
                    bw.write(m.getCreditosPracticos() + "|");
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println(
                    "Error writing to file '"
                    + archivo + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        } finally 
		{		
				
			}		
	}

}
