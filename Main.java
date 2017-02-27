import java.io.File;
import java.util.*;
import java.util.logging.Logger;

//调main函数
public class Main {
public static void main(String[] args) {
		File file = new File("C:\\Users\\dell\\Desktop\\123.xlsx");
		ArrayList<ArrayList<Object>> result = ExportExcel.readExcel(file);
		for(int i = 0 ;i < result.size() ;i++){
			for(int j = 0;j<result.get(i).size(); j++){
				System.out.println(i+"行 "+j+"列  "+ result.get(i).get(j).toString());
			}
		}
		ExportExcel.writeExcel(result,"C:\\Users\\dell\\Desktop\\bb.xls");
	}
	
}
