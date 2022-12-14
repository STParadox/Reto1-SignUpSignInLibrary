/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtotest;

import datatransferobject.User;
import datatransferobject.UserPrivilege;
import datatransferobject.UserStatus;
import java.sql.Timestamp;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Julen and Sendoa
 */
public class UserTest {
    
    /**
     * Test for creating an empty user
     */
    @Test
    public void CreateUserTest() {
        User user = new User();
        assertTrue(user instanceof User);
    }

    /**
     * Test for creating a user with parameters
     */
    @Test
    public void CreateUserWithParamsTest() {

        int myYear = 2014;
        int myMonth = 3;
        int myDay = 24;
        Timestamp ts = Timestamp.valueOf(String.format("%04d-%02d-%02d 00:00:00",myYear, myMonth, myDay));

        User user = new User("a", "example@gmail.com", "a", UserStatus.ENABLED, UserPrivilege.USER, "abcd*1234", ts);
        assertTrue(user instanceof User);
    }

}
