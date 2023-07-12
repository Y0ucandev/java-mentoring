package youcandev.mentoring.java_syntax._01_commands_and_first_program._02_declare_variables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

class DeclareVariablesTest {
    @Test
    void mainMethodContainsRequiredVariables() throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("src/main/java/youcandev/mentoring/java_syntax" +
                "/_01_commands_and_first_program/_02_declare_variables/DeclareVariables.java")));

        Pattern mainMethodPattern = Pattern.compile("public\\s+static\\s+void\\s+main\\([^)]*\\)\\s*\\{[^}]*\\}", Pattern.DOTALL);
        Assertions.assertTrue(mainMethodPattern.matcher(content).find());

        Pattern nameVariablePattern = Pattern.compile("String\\s+name\\s*;");
        Assertions.assertTrue(nameVariablePattern.matcher(content).find());

        Pattern ageVariablePattern = Pattern.compile("int\\s+age\\s*;");
        Assertions.assertTrue(ageVariablePattern.matcher(content).find());

        Pattern cityVariablePattern = Pattern.compile("String\\s+city\\s*;");
        Assertions.assertTrue(cityVariablePattern.matcher(content).find());
    }
}
