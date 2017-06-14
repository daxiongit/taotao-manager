package com.taotao.mapper;

import com.taotao.pojo.OrderShipping;
import com.taotao.pojo.OrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderShippingMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(OrderShippingExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(OrderShippingExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_order_shipping",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_order_shipping (order_id, receiver_name, ",
        "receiver_phone, receiver_mobile, ",
        "receiver_state, receiver_city, ",
        "receiver_district, receiver_address, ",
        "receiver_zip, created, ",
        "updated)",
        "values (#{orderId,jdbcType=VARCHAR}, #{receiverName,jdbcType=VARCHAR}, ",
        "#{receiverPhone,jdbcType=VARCHAR}, #{receiverMobile,jdbcType=VARCHAR}, ",
        "#{receiverState,jdbcType=VARCHAR}, #{receiverCity,jdbcType=VARCHAR}, ",
        "#{receiverDistrict,jdbcType=VARCHAR}, #{receiverAddress,jdbcType=VARCHAR}, ",
        "#{receiverZip,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP})"
    })
    int insert(OrderShipping record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(OrderShipping record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<OrderShipping> selectByExample(OrderShippingExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "order_id, receiver_name, receiver_phone, receiver_mobile, receiver_state, receiver_city, ",
        "receiver_district, receiver_address, receiver_zip, created, updated",
        "from tb_order_shipping",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    OrderShipping selectByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") OrderShipping record, @Param("example") OrderShippingExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(OrderShipping record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_order_shipping",
        "set receiver_name = #{receiverName,jdbcType=VARCHAR},",
          "receiver_phone = #{receiverPhone,jdbcType=VARCHAR},",
          "receiver_mobile = #{receiverMobile,jdbcType=VARCHAR},",
          "receiver_state = #{receiverState,jdbcType=VARCHAR},",
          "receiver_city = #{receiverCity,jdbcType=VARCHAR},",
          "receiver_district = #{receiverDistrict,jdbcType=VARCHAR},",
          "receiver_address = #{receiverAddress,jdbcType=VARCHAR},",
          "receiver_zip = #{receiverZip,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(OrderShipping record);
}