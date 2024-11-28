package vowel.solutions.device.data.device.data.event.processor;

public class WorkoutEventPointsMnemonic {
    private String mnemonic;
    private Integer pointsValue;
    private String description;

    public String getMnemonic() {
        return mnemonic;
    }

    public WorkoutEventPointsMnemonic setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
        return this;
    }

    public Integer getPointsValue() {
        return pointsValue;
    }

    public WorkoutEventPointsMnemonic setPointsValue(Integer pointsValue) {
        this.pointsValue = pointsValue;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public WorkoutEventPointsMnemonic setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "WorkoutEventPointsMnemonic{" +
                "mnemonic='" + mnemonic + '\'' +
                ", pointsValue=" + pointsValue +
                ", description='" + description + '\'' +
                '}';
    }
}
