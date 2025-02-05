package org.example.restaurant;

import com.google.i18n.phonenumbers.NumberParseException;
import org.example.restaurant.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    /*
     * Напишите тесты для функции Util.reformatRuTelephone
     * Функция принимает на вход строку - телефон в любом формате с любым количеством whitespaces.
     * Функция возвращает отформатированный номер телефона без посторонних символов: +78008888888
     * Функция выбрасывает Exception если:
     *  входящая строка не является телефоном (посторонние симфолы)
     *  входящая строка не является телефоном РФ
     * Вы можете посмотреть исходный код функции Util.reformatRuTelephone.
     * Пример вы можете увидеть ниже.
     */

    @Test
    void reformatRuTelephoneRemoveWhiteSpaces() throws NumberParseException {
        String removeWhiteSpaces = Util.reformatRuTelephone("+7(999)222-33-11");
        assertEquals("+79992223311", removeWhiteSpaces);
        //fail();
    }
    @Test
    void test1() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7-999-222-33-11");
        assertEquals("+79992223311", number);
    }
    @Test
    void test2() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7 999 222 33 11");
        assertEquals("+79992223311", number);
    }
    @Test
    void test3() throws NumberParseException{
        String number = Util.reformatRuTelephone("+79992223311");
        assertEquals("+79992223311", number);
    }
    @Test
    void test4() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7-99 -222-33-11");
        assertEquals("+79992223311", number);
    }
    @Test
    void test5() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7-999-2a2-33-11");
        assertEquals("+79992223311", number);
    }
    @Test
    void test6() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7-999-222-33");
        assertEquals("+79992223311", number);
    }
    @Test
    void test7() throws NumberParseException{
        String number = Util.reformatRuTelephone("+7-999-222-33-11-00");
        assertEquals("+79992223311", number);
    }
}