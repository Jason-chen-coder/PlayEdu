package xyz.playedu.api.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.playedu.api.domain.UserCourseRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author tengteng
* @description 针对表【user_course_records】的数据库操作Mapper
* @createDate 2023-03-20 16:41:04
* @Entity xyz.playedu.api.domain.UserCourseRecord
*/
@Mapper
public interface UserCourseRecordMapper extends BaseMapper<UserCourseRecord> {

}




