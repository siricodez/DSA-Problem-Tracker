public class Problem {

    // private variables
    private String problemName;
    private String topic;
    private String status; // Solved or Unsolved

    // constructor
    public Problem(String problemName, String topic, String status) {
        this.problemName = problemName;
        this.topic = topic;
        this.status = status;
    }

    // getters
    public String getProblemName() {
        return problemName;
    }

    public String getTopic() {
        return topic;
    }

    public String getStatus() {
        return status;
    }

    // setters
    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString method for clean printing
    @Override
    public String toString() {
        return "Problem Name: " + problemName +
               " | Topic: " + topic +
               " | Status: " + status;
    }
}
