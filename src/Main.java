import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager managePost = new PostManager();

        int engagementScore = managePost.calculateEngagement(100, 80, 70);
        String category = managePost.getCategoryRating(engagementScore);

        System.out.println("≡≡≡ Social Media Post Manager ≡≡≡");
        managePost.displayPostStats("Java Programming Tips", engagementScore, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        System.out.println("Unique Hashtags: " + managePost.manageHashtags(hashtags));

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"));
        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", 250);
        engagements.put("Advanced Java Tutorial", 750);
        engagements.put("Spring Boot Guide", 1700);

        System.out.println("Trending Posts: " + managePost.findTrendingPosts(posts, engagements));

        System.out.println("Unique Authors: " + managePost.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie"));
    }
}
