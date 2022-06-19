package api.model.workspaces;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WorkspacesResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("hourlyRate")
    private HourlyRate hourlyRate;
    @JsonProperty("memberships")
    private List<Membership> memberships;
    @JsonProperty("workspaceSettings")
    private WorkspaceSettings workspaceSettings;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("featureSubscriptionType")
    private String featureSubscriptionType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HourlyRate getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(HourlyRate hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public WorkspaceSettings getWorkspaceSettings() {
        return workspaceSettings;
    }

    public void setWorkspaceSettings(WorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFeatureSubscriptionType() {
        return featureSubscriptionType;
    }

    public void setFeatureSubscriptionType(String featureSubscriptionType) {
        this.featureSubscriptionType = featureSubscriptionType;
    }
}
