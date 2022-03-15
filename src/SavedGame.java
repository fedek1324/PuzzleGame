import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class SavedGame implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	File lastPicture;
	ArrayList<Integer> lastSequence;
	
	SavedGame(File picture, ArrayList<Integer> sequence) {
		lastPicture = picture;
		lastSequence = sequence;
	}
}
