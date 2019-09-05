package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ExpressDelivery;

import java.util.List;

@Mapper
public interface ExpressDeliveryMapper {
    List<ExpressDelivery> selectAll();
    void insert(@Param("expressDelivery") ExpressDelivery expressDelivery);
}
