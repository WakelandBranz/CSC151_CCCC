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

public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean hasWordProcessingSkills;
    private boolean hasSpreadsheetSkills;
    private boolean hasDatabaseSkills;
    private boolean hasGraphicsSkills;

    public JobApplicant(String name, String phoneNumber, boolean hasWordProcessingSkills, 
        boolean hasSpreadsheetSkills,boolean hasDatabaseSkills, boolean hasGraphicsSkills) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.hasWordProcessingSkills = hasWordProcessingSkills;
        this.hasSpreadsheetSkills = hasSpreadsheetSkills;
        this.hasDatabaseSkills = hasDatabaseSkills;
        this.hasGraphicsSkills = hasGraphicsSkills;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean getHasWordProcessingSkills() {
        return hasWordProcessingSkills;
    }
    
    public boolean getHasSpreadsheetSkills() {
        return hasSpreadsheetSkills;
    }
    
    public boolean getHasDatabaseSkills() {
        return hasDatabaseSkills;
    }
    
    public boolean getHasGraphicsSkills() {
        return hasGraphicsSkills;
    }
}
