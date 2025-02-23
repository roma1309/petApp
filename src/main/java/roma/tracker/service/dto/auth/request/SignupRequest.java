package roma.tracker.service.dto.auth.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class SignupRequest {

    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    private String email;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    @NotEmpty(message = "Please enter your firstname")
    private String name;
    @NotEmpty(message = "Please enter your lastname")
    private String surname;
    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
