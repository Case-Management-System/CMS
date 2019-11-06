
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s177229
 */
class CMSController {

    CMSModel model;
    CMSView view;

    void setModel(CMSModel m) {
        model = m;
    }

    void setView(CMSView v) {
        view = v;
    }

    int getcaseNumber() {

    }

    String getpotentialCaseNumber(int staffCode) {

    }

    CaseInfo caseIn(CaseInfo info) {
        //check all info is ready for input
        if (info.caseNumber == null) {
            failNotice("No Case Number. Please Contact Technical Support.");
        } else if (info.socialworkID == null) {
            failNotice("Please Enter Socialworker's ID.");
        } else if (info.caseOpenDate == null) {
            failNotice("Please Enter Case Opening Date.");
        } else if (info.clientAddress == null) {
            failNotice("Please Enter Address");
        } else if (info.clientName == null) {
            failNotice("Please Enter Case Name.");
        } else if (info.telNumber == null) {
            failNotice("Please Enter Client's Telephone Number.");
        }
        
        return info;

    }

    void confirmationNotice(String text) {
        view.setConfirmationNotice(text);
    }

    void failNotice(String text) {
        view.setFailnNotice(text);
        break;
    }

    /**
     * The Case Number including two digit of year code. For Example "0519001".
     * "05" is center code "19"is year code "001" is case code
     *
     * @return Current Year Code for Case Number
     */
    String getYearCode() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int yearCode = year % 1000;

        return Integer.toString(yearCode);
    }

    /**
     * The Case Number including two digit of center code. For Example
     * "0519001". "05" is center code "19"is year code "001" is case code
     *
     * @return Center Code for Case Number
     */
    String getCenterCode() {
        int number = 05;
        return Integer.toString(number);
    }

}
