/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author IT
 */
public class Branch {
    private String CPTE;
    private String branchName;
    public Branch() {
        
    }

    public Branch(String CPTE,String branchName) {
        this.CPTE=CPTE;
        this.branchName=branchName;
    }
    public void setCPTE(String CPTE) {
        this.CPTE = CPTE;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCPTE() {
        return CPTE;
    }

    public String getBranchName() {
        return branchName;
    }
    
}
