class SensorDataLogger {
    public static void logTemperature(double primitiveTemp, Double wrapperTemp) {
        Double autoBoxed = primitiveTemp;  
        double autoUnboxed = wrapperTemp;

        System.out.println("Primitive → Wrapper (auto-boxed): " + autoBoxed);
        System.out.println("Wrapper → Primitive (auto-unboxed): " + autoUnboxed);
    }

    public static void main(String[] args) {
        System.out.println("=== 7. Sensor Data Logger ===");
        logTemperature(36.5, 38.2);
        System.out.println();
    }
}