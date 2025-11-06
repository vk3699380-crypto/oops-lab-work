import java.time.*;
class LateSubmissionException extends Exception { LateSubmissionException(String msg) { super(msg); } }
class InvalidFileFormatException extends Exception { InvalidFileFormatException(String msg) { super(msg); } }
class OnlineExamSubmission {
    void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        LocalDateTime deadline = LocalDateTime.of(2025, 11, 6, 12, 0);
        if (!fileName.endsWith(".pdf")) throw new InvalidFileFormatException("Submission failed: invalid file format");
        if (submissionTime.isAfter(deadline)) throw new LateSubmissionException("Submission failed: late submission");
        System.out.println("Exam submitted successfully.");
    }
    public static void main(String[] args) {
        OnlineExamSubmission o = new OnlineExamSubmission();
        try {
            o.submitExam("test.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}