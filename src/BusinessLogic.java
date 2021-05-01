import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JFileChooser;

public class BusinessLogic 
{
	List<Path> result;
	
	public String SelectReaperProjectDirectory()
	{
		 JFileChooser chooser = new JFileChooser();
		    chooser.setCurrentDirectory(new java.io.File(System.getProperty("user.home")));
		    chooser.setDialogTitle("Select Fast Song Reaper Project folder");
		    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		    chooser.setAcceptAllFileFilterUsed(false);

		    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
		    {
		      return chooser.getCurrentDirectory().getAbsolutePath().toString();
		    }
		    else 
		    {
		    	return "Not Found";
		    }
	}
	
	public String SelectFastSongDirectory()
	{
		String reaperDirectory;
		return reaperDirectory = SelectReaperProjectDirectory();
	}
	
	public String SelectSlowSongDirectory()
	{
		String reaperDirectory;
		return reaperDirectory = SelectReaperProjectDirectory();
	}
	
	
	
	public String GenerateRandomSong (String directory) throws IOException
	
	{
		List<Path> result;
		Path path = Paths.get(directory);
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk.filter(Files::isRegularFile)
                    .collect(Collectors.toList());
            
            Random rand = new Random();
            Path randomElement = result.get(rand.nextInt(result.size()));
            
            return randomElement.toString();
        }
       
	}
	
	public String GenerateSong1(String directory) throws IOException
	{
		return GenerateRandomSong(directory);
	}
	
	public String GenerateSong2(String directory) throws IOException
	{
		return GenerateRandomSong(directory);
	}
	
	public String GenerateSong3(String directory) throws IOException
	{
		return GenerateRandomSong(directory);
	}
	
	public String GenerateSong4(String directory) throws IOException
	{
		return GenerateRandomSong(directory);
	}

}
