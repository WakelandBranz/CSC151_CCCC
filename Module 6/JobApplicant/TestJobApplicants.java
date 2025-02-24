/*
 * Wakeland Branz
Create a class that holds data about a job applicant. 
Include a name, a phone number, and four Boolean fields that represent whether the applicant is skilled in each of the following areas: 
word processing, spreadsheets, databases, and graphics. 
Include a constructor that accepts values for each of the fields. Also include a get method for each field. 
Create an application that instantiates several job applicant objects and pass each in turn to a Boolean method that determines whether each applicant is qualified for an interview. 
Then, in the main() method, display an appropriate method for each applicant. 
A qualified applicant has at least three of the four skills. Save the files as JobApplicant.java and TestJobApplicants.java.
 */

public class TestJobApplicants {
    public static void main(String[] args) {
        // Create several JobApplicant objects
        JobApplicant applicant1 = new JobApplicant("Johnson, William", "555-1234", 
                                   true, true, true, false);
        
        JobApplicant applicant2 = new JobApplicant("Rivera, Maria", "555-9876", 
                                   true, false, false, true);
        
        JobApplicant applicant3 = new JobApplicant("Smith, David", "555-5555", 
                                   false, true, true, true);
        
        JobApplicant applicant4 = new JobApplicant("Jones, Latisha", "555-8642", 
                                   true, true, true, true);
        
        JobApplicant applicant5 = new JobApplicant("Lee, Timothy", "555-3698", 
                                   false, false, true, false);
        
        // Test each applicant and display the results
        displayApplicantQualification(applicant1);
        displayApplicantQualification(applicant2);
        displayApplicantQualification(applicant3);
        displayApplicantQualification(applicant4);
        displayApplicantQualification(applicant5);
    }

    public static boolean isQualified(JobApplicant applicant) {
        int skillCount = 0;

        if(applicant.getHasWordProcessingSkills()) {
            skillCount++;
        }
        
        if(applicant.getHasSpreadsheetSkills()) {
            skillCount++;
        }
        
        if(applicant.getHasDatabaseSkills()) {
            skillCount++;
        }
        
        if(applicant.getHasGraphicsSkills()) {
            skillCount++;
        }
        
        return (skillCount >= 3);
    }

    public static void displayApplicantQualification(JobApplicant applicant) {
        String qualificationStatus = isQualified(applicant) ? "is qualified" : "is NOT qualified";
        
        System.out.println(applicant.getName() + " " + qualificationStatus + 
                           " for an interview  " + "(" + applicant.getPhoneNumber() + ")");
    }
}
