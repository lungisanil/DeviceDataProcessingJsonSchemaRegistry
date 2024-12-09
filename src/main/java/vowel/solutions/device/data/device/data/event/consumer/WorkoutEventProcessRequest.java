package vowel.solutions.device.data.device.data.event.consumer;

public class WorkoutEventProcessRequest {
    private Long memberId;
    private String workoutType;
    private String deviceName;
    private Float averageSpeed;
    private Float averageHeartRate;
    private String workoutId;
    private Integer processed;
    private String emailAddress;

    public Long getMemberId() {
        return memberId;
    }

    public WorkoutEventProcessRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public WorkoutEventProcessRequest setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
        return this;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public WorkoutEventProcessRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public Float getAverageSpeed() {
        return averageSpeed;
    }

    public WorkoutEventProcessRequest setAverageSpeed(Float averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }

    public Float getAverageHeartRate() {
        return averageHeartRate;
    }

    public WorkoutEventProcessRequest setAverageHeartRate(Float averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
        return this;
    }

    public String getWorkoutId() {
        return workoutId;
    }

    public WorkoutEventProcessRequest setWorkoutId(String workoutId) {
        this.workoutId = workoutId;
        return this;
    }

    public Integer getProcessed() {
        return processed;
    }

    public WorkoutEventProcessRequest setProcessed(Integer processed) {
        this.processed = processed;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public WorkoutEventProcessRequest setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @Override
    public String toString() {
        return "WorkoutEventProcessRequest{" +
                "memberId=" + memberId +
                ", workoutType='" + workoutType + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", averageSpeed=" + averageSpeed +
                ", averageHeartRate=" + averageHeartRate +
                ", workoutId='" + workoutId + '\'' +
                ", processed=" + processed +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
