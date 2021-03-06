package ratingapp.ddey.com.dam_project.models;

public class Result {
    private long idResult;
    private String studentName;
    private String quizzName;
    private int score;
    private String dateTime;
    private String firebaseKey;

    public Result(String studentName, String quizzName, int score, String dateTime) {
        this.studentName = studentName;
        this.quizzName = quizzName;
        this.score = score;
        this.dateTime = dateTime;
        firebaseKey="";
    }

    public Result(long idResult, String studentName, String quizzName, int score, String dateTime) {
        this.idResult = idResult;
        this.studentName = studentName;
        this.quizzName = quizzName;
        this.score = score;
        this.dateTime = dateTime;
        firebaseKey="";
    }

    public Result(String dateTime, long idResult,String quizzName,int score, String studentName,String firebaseKey) {
        this.idResult = idResult;
        this.studentName = studentName;
        this.quizzName = quizzName;
        this.score = score;
        this.dateTime = dateTime;
        this.firebaseKey=firebaseKey;
    }

    public String getFirebaseKey() {
        return firebaseKey;
    }

    public void setFirebaseKey(String firebaseKey) {
        this.firebaseKey = firebaseKey;
    }

    public String getQuizzName() {
        return quizzName;
    }

    public void setQuizzName(String quizzName) {
        this.quizzName = quizzName;
    }

    public long getIdResult() {
        return idResult;
    }

    public void setIdResult(long idResult) {
        this.idResult = idResult;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
