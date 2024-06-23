package com.example.demo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class HealthCalculator {
        private static final String CSV_FILE = "high_risk_patients.csv";
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Questions> questions = new ArrayList<>();

        public void addUserToArrayList(User userData){
            users.add(userData);
            printArrayList(users);
        } 

        public void addQuestionsToArrayList(Questions questionsData){
            questions.add(questionsData);
            printArrayList(questions);
        }

        public void printArrayList(ArrayList<?> list) {
            for (Object item : list) {
                System.out.println(item);
            }
        }

        public boolean calculateHealthStatus(Questions questions){
            boolean healthStatus = false;  //false = good health, true = health at risk
            double temperature = questions.getTemperature();
            if (temperature > 39){
                healthStatus = true;
            }
            if(!questions.isBreatheCorrectly() || questions.isCardiovascularDisturbs() || questions.isPoisonousSubstances()){
                healthStatus = true;
            }
            System.out.println("healthstatus: "+ healthStatus);

            if(healthStatus){
                excelUpload(findUserById(questions.getUserID()),questions);

            }

            return healthStatus;
        }

        public User findUserById(String userId) {
            for (User user : users) {
                if (user.getUserID().equals(userId)) {
                    return user; // Found the user, return it
                }
            }
            System.out.println("user "+userId+" not found in arraylist");
            return null; // User not found
        }

        public void excelUpload(User user, Questions questions) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.getUserID()).append(";");
            sb.append(user.getName()).append(";");
            sb.append(user.getSurname()).append(";");
            sb.append(user.getSocialnumber()).append(";");
            sb.append(user.getBirthdate()).append(";");
            sb.append(user.getPhone()).append(";");
            sb.append("-").append(";");
            sb.append(questions.getTemperature()).append(";");
            sb.append(questions.isPoisonousSubstances()).append(";");
            sb.append(questions.isBreatheCorrectly()).append(";");
            sb.append(questions.isAssumedDrug()).append(";");
            sb.append(questions.isDiabetes()).append(";");
            sb.append(questions.isCardiovascularDisturbs()).append("\n");;
 
            writer.write(sb.toString());
            System.out.println("User "+user.getUserID()+ " added to CSV file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

       



    

