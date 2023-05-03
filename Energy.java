public class Energy extends Physics {
    public float calculatePotentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    public float calculateKineticEnergy(float mass, float velocity) {
        return 0.5f * mass * powTwo(velocity);
    }

    public float calculateWork(float force,float distance) {
        return multiply(force, distance);
    }

    public float calculatePower(float work, float time) {
        return divide(work,time);
    }
    public float calculateFinalVelocity (float initialVelocity, float acceleration, float time) {
        return addition(initialVelocity, acceleration)*time;
    }
}