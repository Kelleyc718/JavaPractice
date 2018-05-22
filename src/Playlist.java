import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("The Black Album", "Jay-Z");
        album.addSong("Empire State Of Mind", 3.40);
        album.addSong("Empire State Of Butt", 3.20);
        album.addSong("Empire State Of Crack", 3.31);
        album.addSong("Empire State Of Hole", 3.43);
        album.addSong("Empire State Of Ass", 3.54);
        album.addSong("Empire State Of Buildings", 3.13);
        album.addSong("Empire State Of Beyonce", 2.34);

        albums.add(album);

        Album album2 = new Album("The Blue Album", "Jay-D");
        album2.addSong("No Empire State Of Mind", 3.40);
        album2.addSong("No Empire State Of Butt", 3.20);
        album2.addSong("No Empire State Of Crack", 3.31);
        album2.addSong("No Empire State Of Hole", 3.43);
        album2.addSong("No Empire State Of Ass", 3.54);
        album2.addSong("No Empire State Of Buildings", 3.13);
        album2.addSong("No Empire State Of Beyonce", 2.34);

        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(1).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(0).addToPlaylist(5, playlist);
        albums.get(0).addToPlaylist(7, playlist);
        albums.get(1).addToPlaylist(5, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing - \"" + listIterator.next().toString());
        }

    }
}
