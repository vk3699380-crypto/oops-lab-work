class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String msg) { super(msg); }
}
class LoginSystem {
    void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234")) throw new InvalidCredentialsException("Invalid credentials");
        System.out.println("Login successful!");
    }
    public static void main(String[] args) {
        LoginSystem l = new LoginSystem();
        try {
            l.validate("admin", "wrong");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}