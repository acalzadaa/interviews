import java.util.HashMap;

public class Song2 {
	private String name;
	private Song2 nextSong;

	public Song2(String name) {
		this.name = name;
	}

	public void setNextSong(Song2 nextSong) {
		this.nextSong = nextSong;
	}

	public boolean isRepeatingPlaylist() {
		boolean repeating = false;
		HashMap<String, Integer> playlist = new HashMap<>();
		playlist.put(this.name,0);

		//first movement
		Song2 rootSlow = this.nextSong != null ? this.nextSong : null;
		Song2 rootFast = this.nextSong.nextSong != null ? this.nextSong.nextSong : null;
		
		while (rootSlow != null || rootFast != null ) {

			if (playlist.containsKey(rootSlow.name)) {
				repeating = true;
				break;
			} else {
				playlist.put(rootSlow.name, 0);
			}

			if (playlist.containsKey(rootFast.name)) {
				repeating = true;
				break;
			} else {
				playlist.put(rootFast.name, 0);
			}
			rootSlow = rootSlow.nextSong;
			rootFast = rootFast.nextSong.nextSong;
		}

		return repeating;
	}

	public static void main(String[] args) {
		Song2 first = new Song2("Hello");
		Song2 second = new Song2("Eye of the tiger");

		first.setNextSong(second);
		second.setNextSong(first);

		System.out.println(first.isRepeatingPlaylist());
	}
}