package org.example.backend.Mapper.Doctor;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.backend.Entity.Doctor.DoctorData;

@Mapper
public interface DoctorDataMapper extends BaseMapper<DoctorData> {
}