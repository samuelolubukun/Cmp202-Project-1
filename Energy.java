public class Energy extends Physics {
    public float calculatePotentialEnergy(float mass, float height) {
        return mass * getGravity() * height;
    }
}