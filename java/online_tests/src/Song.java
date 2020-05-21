import java.util.HashMap;

public class Song {
	private String name;
	private Song nextSong;

	public Song(String name) {
		this.name = name;
	}

	public void setNextSong(Song nextSong) {
		this.nextSong = nextSong;
	}

	public boolean isRepeatingPlaylist() {
		boolean repeating = false;

		HashMap<String, Integer> playlist = new HashMap<>();
		Song root = this.nextSong; 
		playlist.put(this.name, 0);
		
		while (root != null) {

			if (playlist.containsKey(root.name) ) {
				repeating = true;
				break;
			} else {
				playlist.put(root.name, 0);
			}

			root = root.nextSong;
		}

		return repeating;
	}

	public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

    }
}