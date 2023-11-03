package course.test.example;

public class Loops {
	
	public static void main(String args[]) {
		
		String[] data = {"Data1","Data2","Data3","Data4","Data5","Data6","Data7","Data8","Data9","Data10"};
		
		for(int a=0,j=data.length-1; a<j; a++, j-- ) {
			System.out.println(a +" "+ j);
			String SearchData="Data1";
			if(data[a].equalsIgnoreCase(SearchData)) {
				System.out.println("Data found in array position: "+a);
				return;
			}
			else if (data[j].equalsIgnoreCase(SearchData)) {
				System.out.println("Data found in array position: "+j);
				return;
			}
		}		
	}
}