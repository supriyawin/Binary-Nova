package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

public class Doctor {
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("lattitude")
    @Expose
    private String lattitude;

    @SerializedName("longitude")
    @Expose
    private String longitude;

    @SerializedName("timeslotMap")
    @Expose
    private HashMap<String,Integer> timeslotMap;

    @SerializedName("queueToken")
    @Expose
    private List<Integer> queueToken;

    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;

    @SerializedName("queueCapacity")
    @Expose
    private int queueCapacity;

    public int getQueueCapacity() {
        return queueCapacity;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public HashMap<String, Integer> getTimeslotMap() {
        return timeslotMap;
    }

    public void setTimeslotMap(HashMap<String, Integer> timeslotMap) {
        this.timeslotMap = timeslotMap;
    }

    public List<Integer> getQueueToken() {
        return queueToken;
    }

    public void setQueueToken(List<Integer> queueToken) {
        this.queueToken = queueToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
