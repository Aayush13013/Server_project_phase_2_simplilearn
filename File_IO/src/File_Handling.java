import java.io.*;
import java.util.*;
public class File_Handling {

	public static void main(String[] args) throws IOException
	{
		File f1 = new File("E:\\IS training\\server dev\\project\\projectSubmission\\fileIO_project\\File_IO\\My_dir");
//		File [] files = f1.listFiles();
//		f1.createNewFile();
//		System.out.println("is exist : " + f1.exists());
//		System.out.println("file size : " + f1.length());
//		System.out.println("can read : " + f1.canRead());
//		System.out.println("can write : " + f1.canWrite());
//		System.out.println("name of the file : " + f1.getName());
		
		System.out.println("\r\n"
				+ " __       __  ________  __         ______    ______   __       __  ________        ________   ______                                                    \r\n"
				+ "/  |  _  /  |/        |/  |       /      \\  /      \\ /  \\     /  |/        |      /        | /      \\                                                   \r\n"
				+ "$$ | / \\ $$ |$$$$$$$$/ $$ |      /$$$$$$  |/$$$$$$  |$$  \\   /$$ |$$$$$$$$/       $$$$$$$$/ /$$$$$$  |                                                  \r\n"
				+ "$$ |/$  \\$$ |$$ |__    $$ |      $$ |  $$/ $$ |  $$ |$$$  \\ /$$$ |$$ |__             $$ |   $$ |  $$ |                                                  \r\n"
				+ "$$ /$$$  $$ |$$    |   $$ |      $$ |      $$ |  $$ |$$$$  /$$$$ |$$    |            $$ |   $$ |  $$ |                                                  \r\n"
				+ "$$ $$/$$ $$ |$$$$$/    $$ |      $$ |   __ $$ |  $$ |$$ $$ $$/$$ |$$$$$/             $$ |   $$ |  $$ |                                                  \r\n"
				+ "$$$$/  $$$$ |$$ |_____ $$ |_____ $$ \\__/  |$$ \\__$$ |$$ |$$$/ $$ |$$ |_____          $$ |   $$ \\__$$ |                                                  \r\n"
				+ "$$$/    $$$ |$$       |$$       |$$    $$/ $$    $$/ $$ | $/  $$ |$$       |         $$ |   $$    $$/                                                   \r\n"
				+ "$$/      $$/ $$$$$$$$/ $$$$$$$$/  $$$$$$/   $$$$$$/  $$/      $$/ $$$$$$$$/          $$/     $$$$$$/                                                    \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "  ______    ______   __      __  __    __   ______   __    __  __   ______         _______   _______    ______      _____  ________   ______   ________ \r\n"
				+ " /      \\  /      \\ /  \\    /  |/  |  /  | /      \\ /  |  /  |/  | /      \\       /       \\ /       \\  /      \\    /     |/        | /      \\ /        |\r\n"
				+ "/$$$$$$  |/$$$$$$  |$$  \\  /$$/ $$ |  $$ |/$$$$$$  |$$ |  $$ |$$/ /$$$$$$  |      $$$$$$$  |$$$$$$$  |/$$$$$$  |   $$$$$ |$$$$$$$$/ /$$$$$$  |$$$$$$$$/ \r\n"
				+ "$$ |__$$ |$$ |__$$ | $$  \\/$$/  $$ |  $$ |$$ \\__$$/ $$ |__$$ |$/  $$ \\__$$/       $$ |__$$ |$$ |__$$ |$$ |  $$ |      $$ |$$ |__    $$ |  $$/    $$ |   \r\n"
				+ "$$    $$ |$$    $$ |  $$  $$/   $$ |  $$ |$$      \\ $$    $$ |    $$      \\       $$    $$/ $$    $$< $$ |  $$ | __   $$ |$$    |   $$ |         $$ |   \r\n"
				+ "$$$$$$$$ |$$$$$$$$ |   $$$$/    $$ |  $$ | $$$$$$  |$$$$$$$$ |     $$$$$$  |      $$$$$$$/  $$$$$$$  |$$ |  $$ |/  |  $$ |$$$$$/    $$ |   __    $$ |   \r\n"
				+ "$$ |  $$ |$$ |  $$ |    $$ |    $$ \\__$$ |/  \\__$$ |$$ |  $$ |    /  \\__$$ |      $$ |      $$ |  $$ |$$ \\__$$ |$$ \\__$$ |$$ |_____ $$ \\__/  |   $$ |   \r\n"
				+ "$$ |  $$ |$$ |  $$ |    $$ |    $$    $$/ $$    $$/ $$ |  $$ |    $$    $$/       $$ |      $$ |  $$ |$$    $$/ $$    $$/ $$       |$$    $$/    $$ |   \r\n"
				+ "$$/   $$/ $$/   $$/     $$/      $$$$$$/   $$$$$$/  $$/   $$/      $$$$$$/        $$/       $$/   $$/  $$$$$$/   $$$$$$/  $$$$$$$$/  $$$$$$/     $$/    \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "                                                                                                                                                        \r\n"
				+ "");
		
		
		
		
		System.out.println("Developer : Aayush Soni\nCompany : Infostretch Pvt. Ltd.\nProjectName : File_IO project\n");
		
		int user_input,user_input2=0;
		String newFileName,addFile,delete_file;
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("\nPlease enter a number from below to choose respective option\n"
				+ "\n1 : Press '1'to retrieve the files in ascending order of there names"
				+ "\n2 : Press '2' to perform operations like adding, deleting and searching"
				+ "\n3 : Press '3' to exit the program\n");
		user_input = sc.nextInt();
//		sc.close();
		if (user_input==1) {
			
			
			System.out.println("Here are the sorted files for you...\n");
			
			if (f1.isDirectory())
			{
			  // you can get all the names
			  String[] fileNames = f1.list();

			  // you can get directly files objects ..the next line will give you array with whole paths
			  //File[] files = f1.listFiles();
			  Arrays.sort(fileNames);
			  for (int i=0;i<fileNames.length;i++) {
				  System.out.println(fileNames[i]+" ");
			  }
//			  System.out.println(Arrays.toString(fileNames));
			}
			
			
			
		}
		else if (user_input==2) {
			
			do {
			System.out.println("\nPlease choose from below to perform operations on the files \n"
					+ "\n1 : Please press '1' to add files to the directory\n"
					+ "2 : Please press '2' to delete files from the directory\n"
					+ "3 : Please press '3' to search the files in the directory\n"
					+ "4 : Please press '4' to go back");
			user_input2 = sc.nextInt();
//			sc.close();
			switch (user_input2) {
			case 1:
				
					System.out.println("Please provide the name with the extension of the file : \n");
					Scanner input = new Scanner(System.in);
				    newFileName = input.nextLine();
					addFile = "E:\\\\IS training\\\\server dev\\\\project\\\\projectSubmission\\\\fileIO_project\\\\File_IO\\\\My_dir\\\\"+newFileName;
//					System.out.println(folder);
					File f2 = new File(addFile);   
					
					
		            // if it does not exist
		            if (!f2.exists()) {
		            	f2.createNewFile();
		                System.out.println("File created");
		                System.out.println("name of the file : " + f2.getName());
		            }
//		            if it exists
		            else
		                System.out.println("Sorry!!  File already exists");
		       
				break;
            case 2:
				System.out.println("Please provide the name of the file with the extension to be deleted :");
				Scanner delete = new Scanner(System.in);
				 String Delete = delete.nextLine();
				 delete_file = "E:\\\\IS training\\\\server dev\\\\project\\\\projectSubmission\\\\fileIO_project\\\\File_IO\\\\My_dir\\\\"+Delete;
				 File f3 = new File(delete_file);
				 if (f3.exists()) {
					f3.delete();
					System.out.println("File deleted\nDeleted File : " + Delete);
				}
				 else {
					System.out.println("Oops!! This file does not exists");
				}
				break;
            case 3:
            	System.out.println("Please provide the name of the file with the extension to be searched : ");
            	Scanner search = new Scanner(System.in);
            	String Searched = search.nextLine();
            	String searchFile = "E:\\\\IS training\\\\server dev\\\\project\\\\projectSubmission\\\\fileIO_project\\\\File_IO\\\\My_dir\\\\"+Searched;
            	File f4 = new File(searchFile);
            	if (f4.exists()) {
					System.out.println("Yes file exists in My_dir\nFile name : "+ Searched);
				}
            	else {
					System.out.println("OOps!! File does not exists");
				}
	            break;

			default:
				System.out.println("Sending you to the back menu..........\n");
				break;
			}
		}while(user_input2!=4);
	}
		
		else if (user_input==3){
			System.out.println("Thank You for using my app....Bye!");
		}
		else {
			System.out.println("invalid input.....please choose again from the given options!!\n");
		}
	  } while (user_input!=3);
	}

}
