package Validate_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Kiểm tra tính hợp lệ của 1 lớp học;
// Bắt đầu bằng ký tự chữ cái C/A/P;
// Ko chứa ký tự đặc biệt;
// THeo sau là 4 ký tự số;
// Kết thúc phải là các ký tự hoa G/H/I/K/L/M;
// Ví dụ: C1120G1
public class Validate_Class {
    private final String CLASS_NAME_REGEX = "^[A|P|C][0-9]{4}[G-M]$";

    public Validate_Class() {
    }

    public boolean check(String inputString) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
