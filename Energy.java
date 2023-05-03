public class Energy extends Physics {
    public float calculatePotentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }

    public float calculateKineticEnergy(float mass, float velocity) {
        return 0.5f * mass * powTwo(velocity);
    }
}