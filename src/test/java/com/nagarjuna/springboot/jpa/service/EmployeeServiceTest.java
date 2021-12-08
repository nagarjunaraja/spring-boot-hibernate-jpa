/*/*	 * ***************************************************************    
	 *                                                                 *  
	 *                               NOTICE                            *  
	 *                                                                 *  
	 *       THIS SOFTWARE IS THE PROPERTY OF AND CONTAINS             *  
	 *       CONFIDENTIAL INFORMATION OF INFOR AND\OR ITS AFFILIATES   *  
	 *       OR SUBSIDIARIES AND SHALL NOT BE DISCLOSED WITHOUT PRIOR  *  
	 *       WRITTEN PERMISSION. LICENSED CUSTOMERS MAY COPY AND       *  
	 *       ADAPT THIS SOFTWARE FOR THEIR OWN USE IN ACCORDANCE WITH  *  
	 *       THE TERMS OF THEIR SOFTWARE LICENSE AGREEMENT.            *  
	 *       ALL OTHER RIGHTS RESERVED.                                *  
	 *                                                                 *  
	 *       (c) COPYRIGHT 2020 INFOR.  ALL RIGHTS RESERVED.           *  
	 *       THE WORD AND DESIGN MARKS SET FORTH HEREIN ARE            *  
	 *       TRADEMARKS AND\OR REGISTERED TRADEMARKS OF INFOR          *  
	 *       AND\OR ITS AFFILIATES AND SUBSIDIARIES. ALL RIGHTS        *  
	 *       RESERVED.  ALL OTHER TRADEMARKS LISTED HEREIN ARE         *  
	 *       THE PROPERTY OF THEIR RESPECTIVE OWNERS.                  *  
	 *                                                                 *  
	 *    **********************************************************************  
	 *																    */
package com.nagarjuna.springboot.jpa.service;

import com.nagarjuna.springboot.jpa.exception.RecordNotFoundException;
import com.nagarjuna.springboot.jpa.model.*;
import com.nagarjuna.springboot.jpa.model.EmployeeEntity.*;
import com.nagarjuna.springboot.jpa.repository.EmployeeRepository;
import com.nagarjuna.springboot.jpa.service.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import mockit.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/*AugieGeneratedTestFile*/
public class EmployeeServiceTest {

    @Tested
    private EmployeeService employeeService;

    @Injectable
    private EmployeeRepository repository1;

    @Injectable
    private List<EmployeeEntity> iReturnValue1;

    @Injectable
    private Optional<EmployeeEntity> iReturnValue2;

    @Injectable
    private EmployeeEntity iReturnValue3;

    @Injectable
    private EmployeeEntity ientity;

    @Injectable
    private EmployeeEntity iReturnValue4;

    @Injectable
    private String iReturnValue5;

    @Injectable
    private String iReturnValue6;

    @Injectable
    private String iReturnValue7;

    @BeforeAll
    public static void beforeAll() {
    }

    @BeforeEach
    public void beforeEach() {
        iReturnValue1 = (List<EmployeeEntity>) Arrays.asList(iReturnValue3, ientity, iReturnValue4);
        iReturnValue5 = "Hildred Gerlach";
        iReturnValue6 = "Marian Batz II";
        iReturnValue7 = "Lesli Leuschke";
    }

    @Test
    public void testGetAllEmployees_0() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            List<EmployeeEntity> getAllEmployees_ReturnParam_0 = (List<EmployeeEntity>) iReturnValue1;
            List<EmployeeEntity> actualReturn_getAllEmployees = employeeService.getAllEmployees();
            assertNotNull(actualReturn_getAllEmployees);
            assertTrue(actualReturn_getAllEmployees instanceof List<?>);
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testGetAllEmployees_1() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            List<EmployeeEntity> getAllEmployees_ReturnParam_0 = (List<EmployeeEntity>) iReturnValue1;
            List<EmployeeEntity> actualReturn_getAllEmployees = employeeService.getAllEmployees();
            assertNotNull(actualReturn_getAllEmployees);
            assertTrue(actualReturn_getAllEmployees instanceof List<?>);
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testGetEmployeeById_2() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            EmployeeEntity getEmployeeById_ReturnParam_1 = iReturnValue3;
            Long getEmployeeById_ActualInputParam1_1 = 229794L;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.get();
                    result = iReturnValue3;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = true;
                }
            };
            EmployeeEntity actualReturn_getEmployeeById = employeeService.getEmployeeById(getEmployeeById_ActualInputParam1_1);
            assertNotNull(actualReturn_getEmployeeById);
            assertTrue(actualReturn_getEmployeeById instanceof EmployeeEntity);
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.get();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testGetEmployeeById_3() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            EmployeeEntity getEmployeeById_ReturnParam_1 = iReturnValue3;
            Long getEmployeeById_ActualInputParam1_1 = 48806L;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = false;
                }
            };
            assertThrows(RecordNotFoundException.class, () -> employeeService.getEmployeeById(getEmployeeById_ActualInputParam1_1));
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testCreateOrUpdateEmployee_4() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            EmployeeEntity createOrUpdateEmployee_ReturnParam_1 = iReturnValue4;
            EmployeeEntity createOrUpdateEmployee_ActualInputParam1_1 = ientity;
            EmployeeEntity save_InputParam1_1 = iReturnValue4;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    ientity.getId();
                    result = 70332257L;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.get();
                    result = iReturnValue4;
                }
            };
            new Expectations() {

                {
                    iReturnValue4.setEmail(anyString);
                }
            };
            new Expectations() {

                {
                    ientity.getEmail();
                    result = "Antwan Conroy";
                }
            };
            new Expectations() {

                {
                    iReturnValue4.setFirstName(anyString);
                }
            };
            new Expectations() {

                {
                    ientity.getFirstName();
                    result = "Genaro Lesch";
                }
            };
            new Expectations() {

                {
                    iReturnValue4.setLastName(anyString);
                }
            };
            new Expectations() {

                {
                    ientity.getLastName();
                    result = "Youlanda Hackett";
                }
            };
            new Expectations() {

                {
                    repository1.save(save_InputParam1_1);
                    result = iReturnValue4;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = true;
                }
            };
            EmployeeEntity actualReturn_createOrUpdateEmployee = employeeService.createOrUpdateEmployee(createOrUpdateEmployee_ActualInputParam1_1);
            assertNotNull(actualReturn_createOrUpdateEmployee);
            assertTrue(actualReturn_createOrUpdateEmployee instanceof EmployeeEntity);
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    ientity.getId();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.get();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue4.setEmail(anyString);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    ientity.getEmail();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue4.setFirstName(anyString);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    ientity.getFirstName();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue4.setLastName(anyString);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    ientity.getLastName();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    repository1.save(save_InputParam1_1);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testCreateOrUpdateEmployee_5() /*
1)Method Under Test returns non-void value,Assertion may require Manual Intervention.

2)Augie generated test case.
*/
    {
        try {
            EmployeeEntity createOrUpdateEmployee_ReturnParam_1 = iReturnValue4;
            EmployeeEntity createOrUpdateEmployee_ActualInputParam1_1 = ientity;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    ientity.getId();
                    result = 977L;
                }
            };
            new Expectations() {

                {
                    repository1.save((EmployeeEntity) any);
                    result = ientity;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = false;
                }
            };
            EmployeeEntity actualReturn_createOrUpdateEmployee = employeeService.createOrUpdateEmployee(createOrUpdateEmployee_ActualInputParam1_1);
            assertNotNull(actualReturn_createOrUpdateEmployee);
            assertTrue(actualReturn_createOrUpdateEmployee instanceof EmployeeEntity);
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    ientity.getId();
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    repository1.save((EmployeeEntity) any);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testDeleteEmployeeById_6() /*
1)Augie generated test case.
*/
    {
        try {
            Long deleteEmployeeById_ActualInputParam1_1 = 46696L;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    repository1.deleteById(anyLong);
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = true;
                }
            };
            employeeService.deleteEmployeeById(deleteEmployeeById_ActualInputParam1_1);
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    repository1.deleteById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @Test
    public void testDeleteEmployeeById_7() /*
1)Augie generated test case.
*/
    {
        try {
            Long deleteEmployeeById_ActualInputParam1_1 = 10L;
            new Expectations() {

                {
                    repository1.findById(anyLong);
                    result = iReturnValue2;
                }
            };
            new Expectations() {

                {
                    iReturnValue2.isPresent();
                    result = false;
                }
            };
            assertThrows(RecordNotFoundException.class, () -> employeeService.deleteEmployeeById(deleteEmployeeById_ActualInputParam1_1));
            new Verifications() {

                {
                    repository1.findById(anyLong);
                    minTimes = 1;
                }
            };
            new Verifications() {

                {
                    iReturnValue2.isPresent();
                    minTimes = 1;
                }
            };
        } catch (Exception e) {
            fail("Test Failed Due To Following Exception:==> " + e, e);
        }
    }

    @AfterAll
    public static void afterAll() {
    }

    @AfterEach
    public void afterEach() {
    }
}

