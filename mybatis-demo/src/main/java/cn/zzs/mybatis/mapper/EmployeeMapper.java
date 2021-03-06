package cn.zzs.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import cn.zzs.mybatis.condition.EmployeeCondition;
import cn.zzs.mybatis.entity.Employee;

public interface EmployeeMapper {

    long countByCondition(@Param("con") EmployeeCondition con);

    int deleteByCondition(@Param("con") EmployeeCondition con);

    int deleteByPrimaryKey(String id);

    int insert(Employee employee);

    int insertBatch(List<Employee> list);
    
    /**
     * <p>嵌套 Select查询映射</p>
     */
    List<Employee> selectByCondition(@Param("con") EmployeeCondition con);
    
    /**
     * <p>嵌套结果映射</p>
     */
    List<Employee> selectByCondition2(@Param("con") EmployeeCondition con);
    
    Employee selectByPrimaryKey(String id);
    
    void selectByCondition(@Param("con") EmployeeCondition con, ResultHandler<Employee> resultHandler);
    
    List<Employee> selectByCondition(@Param("con") EmployeeCondition con, RowBounds rowBounds);

    int updateByCondition(@Param("record") Employee employee, @Param("con") EmployeeCondition con);

    int updateByPrimaryKey(Employee employee);

}