package vowel.solutions.device.data.device.data.event.processor;

import vowel.solutions.device.data.device.data.event.consumer.WorkoutEventProcessRequest;

public class WorkoutEventPointsRequest {
    private WorkoutEventProcessRequest workoutEventProcessRequest;
    private WorkoutEventPointsMnemonic workoutEventPointsMnemonic;

    public WorkoutEventProcessRequest getWorkoutEventProcessRequest() {
        return workoutEventProcessRequest;
    }

    public WorkoutEventPointsRequest setWorkoutEventProcessRequest(WorkoutEventProcessRequest workoutEventProcessRequest) {
        this.workoutEventProcessRequest = workoutEventProcessRequest;
        return this;
    }

    public WorkoutEventPointsMnemonic getWorkoutEventPointsMnemonic() {
        return workoutEventPointsMnemonic;
    }

    public WorkoutEventPointsRequest setWorkoutEventPointsMnemonic(WorkoutEventPointsMnemonic workoutEventPointsMnemonic) {
        this.workoutEventPointsMnemonic = workoutEventPointsMnemonic;
        return this;
    }

    @Override
    public String toString() {
        return "WorkoutEventPointsRequest{" +
                "workoutEventProcessRequest=" + workoutEventProcessRequest +
                ", workoutEventPointsMnemonic=" + workoutEventPointsMnemonic +
                '}';
    }
}
