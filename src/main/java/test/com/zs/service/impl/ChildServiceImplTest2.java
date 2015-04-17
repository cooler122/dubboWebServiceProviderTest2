package test.com.zs.service.impl;

import com.zs.po.Child;
import com.zs.service.ChildService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ChildServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/17/2015</pre>
 */
public class ChildServiceImplTest2 extends TestCase {

    private ChildService childServiceImpl;

    public ChildServiceImplTest2(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
        String configLocation= "spring/spring-service-provider.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
        childServiceImpl = (ChildService) context.getBean("childService");
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: deleteByPrimaryKey(Integer childId)
     */
    public void testDeleteByPrimaryKey() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: insert(Child record)
     */
    public void testInsert() throws Exception {
        Child child = new Child();
        child.setChildName("aaaaa");
        child.setParentId(1);
        child.setChildInformation("aaa's child");
        childServiceImpl.insert(child);
    }

    /**
     * Method: insertSelective(Child record)
     */
    public void testInsertSelective() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: selectByPrimaryKey(Integer childId)
     */
    public void testSelectByPrimaryKey() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateByPrimaryKeySelective(Child record)
     */
    public void testUpdateByPrimaryKeySelective() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateByPrimaryKey(Child record)
     */
    public void testUpdateByPrimaryKey() throws Exception {
//TODO: Test goes here... 
    }


    public static Test suite() {
        return new TestSuite(ChildServiceImplTest2.class);
    }
} 
