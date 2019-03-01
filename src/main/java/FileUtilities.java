import java.io.File;

public class FileUtilities {
	public static void createFolderIfNotExists(String path) {
		File toCheck = new File(path);
		if (!(toCheck.exists())) {
			toCheck.mkdir();
		}
	}
}
