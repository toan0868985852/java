package src.Bai_tap_Array;

import java.util.ArrayList;
import java.util.List;

public class Movielist2 {
    private ArrayList<String> movieList = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("===MovieliSt===");
        System.out.println("---------------");

        Movielist2 List = new Movielist2();
        List.addMovie("Titanic");
        List.addMovie("One Piece");
        List.addMovie("Avengers");
        List.addMovie("The flash");
        List.addMovie("Noting Hills");
        for (int i = 0; i < List.movieList.size(); i++) {
            System.out.println(List.movieList.get(i));
        }
        System.out.println("-------------------------");
       List.displayList();
        System.out.println(List.movieList);
        System.out.println("-------------------------");
        List.updateMovie(2, "Batman");
        for (int i = 0; i < List.movieList.size(); i++) {
            System.out.println(List.movieList.get(i));
        }
        System.out.println("-------------------------");
        List.removeMovie(4);
        for (int i = 0; i < List.movieList.size(); i++) {
            System.out.println(List.movieList.get(i));
        }
        System.out.println("-------------------------");
        System.out.println(List.findMovie("One Pi"));
    }
    /**
     * thêm phim vào danh sách
     *
     * @param movie tên phim
     */
    public void addMovie(String movie){
        movieList.add(movie);
    }
    //hiển thị danh sách phim hiện tại
    public void displayList(){
        System.out.println("Bạn có " + movieList.size());
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("Moive " + (i + 1) + " " + movieList.get(i));
        }
    }

    public void updateMovie(int index, String movie){
        movieList.set(index, movie);
        System.out.println("Updated");
        System.out.println("Movie " + (index + 1) + " " + movie);
    }

    /**
     *
     * @param index số thứ tự phim muốn xóa
     */
    public void removeMovie(int index){
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Removed " + movie);
    }

    /**
     *
     * @param search tìm kiếm phim trong danh sách
     * @return tên phim
     */
    public String findMovie(String search){
        int position = movieList.indexOf(search);
        if (position > 0) {
            System.out.println("Có phim " + movieList.get(position) + " trong danh sách:");
        }else {
            System.out.println("khoông có phim " + search + " trong danh sách");
        }
        return search;
    }
}
