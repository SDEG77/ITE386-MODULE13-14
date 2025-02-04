import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the image file path: ");
        String imagePath = scanner.nextLine();
        String detectedDisease = callImageRecognitionSystem(imagePath);
        String report = generateReport(detectedDisease);
        System.out.println(report);
        scanner.close();
    }

    public static String callImageRecognitionSystem(String imagePath) {
        String disease = "Gastri";
        return disease;
    }

    public static String generateReport(String detectedDisease) {
        StringBuilder report = new StringBuilder();
        report.append("\n================ Crop Disease Report ================\n");
        report.append("Detected Disease: ").append(detectedDisease).append("\n");
        report.append("----------------------------------------------------\n");
        if ("Leaf Blight".equalsIgnoreCase(detectedDisease)) {
            report.append("Treatment: Apply fungicides containing mancozeb or copper oxychloride.\n");
            report.append("Prevention: Use resistant crop varieties and ensure proper field sanitation.\n");
        } else if ("Powdery Mildew".equalsIgnoreCase(detectedDisease)) {
            report.append("Treatment: Use sulfur-based fungicides.\n");
            report.append("Prevention: Improve air circulation and avoid overhead watering.\n");
        } else {
            report.append("No specific disease detected or unrecognized disease. Consult an expert.\n");
        }
        report.append("====================================================\n");
        return report.toString();
    }
}
