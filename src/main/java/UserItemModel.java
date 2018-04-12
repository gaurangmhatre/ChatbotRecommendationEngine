public class UserItemModel {
    String userId;
    String itemId;
    String ratings;
    String NormalizedRatings;

    public String getUserId() {
        return userId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getRatings() {
        return ratings;
    }

    public String getNormalizedRatings() {
        return NormalizedRatings;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public void setNormalizedRatings(String normalizedRatings) {
        NormalizedRatings = normalizedRatings;
    }


}
