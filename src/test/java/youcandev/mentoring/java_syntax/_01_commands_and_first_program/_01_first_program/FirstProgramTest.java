package youcandev.mentoring.java_syntax._01_commands_and_first_program._01_first_program;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstProgramTest {

    @Test
    public void shouldReturnDesiredTextFromSystemOutPrintln() {
        //given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //when
        FirstProgram.main(new String[]{});
        String printedText = outputStream.toString().trim();
        String expectedText = "My first program works!";

        //then
        assertEquals(expectedText, printedText);
    }
}
