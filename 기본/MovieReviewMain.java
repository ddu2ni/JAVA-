package class1;

class MovieReview{
    String title;
    String review;
}

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2]; //리뷰할영화 2개

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        movieReviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";
        movieReviews[1] = movieReview2;

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목: "+movieReview.title+", 리뷰: "+movieReview.review);
        }
    }
}

