import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0)
            return 0;
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500 && engagementScore <= 999)
            return "Popular";
        else if (engagementScore >= 100 && engagementScore <= 499)
            return "Good";
        else if (engagementScore >= 50 && engagementScore <= 99)
            return "Low";
        else{
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        if (hashtags == null)
            return uniqueHashtags;

        HashSet<String> alreadyExist = new HashSet<>();
        for (String tag : hashtags) {
            if (tag != null && alreadyExist.add(tag)) {
                uniqueHashtags.add(tag);
            }
        }
        return uniqueHashtags;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null)
            return trending;

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public ArrayList<String> getUniqueAuthors(String... authors) {
        HashSet<String> alreadyExist = new HashSet<>();
        ArrayList<String> uniqueAuthors = new ArrayList<>();

        if (authors == null) return uniqueAuthors;

        for (String author : authors) {
            if (author != null && alreadyExist.add(author)) {
                uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }
}
