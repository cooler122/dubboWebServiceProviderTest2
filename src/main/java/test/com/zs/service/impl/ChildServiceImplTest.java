package test.com.zs.service.impl;

import com.zs.po.Child;
import com.zs.service.ChildService;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml"})
public class ChildServiceImplTest{

    @Resource
    private ChildService childService;

    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        int resultCode = childService.deleteByPrimaryKey(1);
        Assert.assertEquals(resultCode, 1);
    }

    /**
     * Method: insert(Child record)
     */
    @Test
    public void testInsert() throws Exception {
        Child child = new Child();
        child.setChildName("aaaaa");
        child.setParentId(1);
        child.setChildInformation("aaa's child");
        int resultCode = childService.insert(child);
        Assert.assertEquals(resultCode, 1);
    }

    /**
     * Method: insertSelective(Child record)
     */
    @Test
    public void testInsertSelective() throws Exception {
        Child child = new Child();
        child.setChildName("kka");
        child.setParentId(2);
        int resultCode = childService.insertSelective(child);
        Assert.assertEquals(resultCode, 1);
    }

    /**
     * Method: selectByPrimaryKey(Integer childId)
     */
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        Child child = childService.selectByPrimaryKey(2);
        Assert.assertNotNull(child);
    }

    /**
     * Method: updateByPrimaryKeySelective(Child record)
     */
    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {
        Child child = new Child();
        child.setChildId(2);
        child.setChildName("kkakka");
        int resultCode = childService.updateByPrimaryKeySelective(child);
        Assert.assertEquals(resultCode, 1);
    }

    /**
     * Method: updateByPrimaryKey(Child record)
     */
    @Test
    public void testUpdateByPrimaryKey() throws Exception {
        Child child = new Child();
        child.setChildId(2);
        child.setChildName("kkakkaaaa");
        child.setParentId(1);
        child.setChildInformation("kkakka's information");
        int resultCode = childService.updateByPrimaryKeySelective(child);
        Assert.assertEquals(resultCode, 1);
    }
} 
