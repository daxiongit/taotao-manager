package com.taotao.mapper;

import com.taotao.pojo.Order;
import com.taotao.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_order",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_order (order_id, payment, ",
        "payment_type, post_fee, ",
        "status, create_time, ",
        "update_time, payment_time, ",
        "consign_time, end_time, ",
        "close_time, shipping_name, ",
        "shipping_code, user_id, ",
        "buyer_message, buyer_nick, ",
        "buyer_rate)",
        "values (#{orderId,jdbcType=VARCHAR}, #{payment,jdbcType=VARCHAR}, ",
        "#{paymentType,jdbcType=INTEGER}, #{postFee,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{paymentTime,jdbcType=TIMESTAMP}, ",
        "#{consignTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{closeTime,jdbcType=TIMESTAMP}, #{shippingName,jdbcType=VARCHAR}, ",
        "#{shippingCode,jdbcType=VARCHAR}, #{userId,jdbcType=BIGINT}, ",
        "#{buyerMessage,jdbcType=VARCHAR}, #{buyerNick,jdbcType=VARCHAR}, ",
        "#{buyerRate,jdbcType=INTEGER})"
    })
    int insert(Order record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(Order record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "order_id, payment, payment_type, post_fee, status, create_time, update_time, ",
        "payment_time, consign_time, end_time, close_time, shipping_name, shipping_code, ",
        "user_id, buyer_message, buyer_nick, buyer_rate",
        "from tb_order",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    Order selectByPrimaryKey(String orderId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_order",
        "set payment = #{payment,jdbcType=VARCHAR},",
          "payment_type = #{paymentType,jdbcType=INTEGER},",
          "post_fee = #{postFee,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "payment_time = #{paymentTime,jdbcType=TIMESTAMP},",
          "consign_time = #{consignTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "close_time = #{closeTime,jdbcType=TIMESTAMP},",
          "shipping_name = #{shippingName,jdbcType=VARCHAR},",
          "shipping_code = #{shippingCode,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "buyer_message = #{buyerMessage,jdbcType=VARCHAR},",
          "buyer_nick = #{buyerNick,jdbcType=VARCHAR},",
          "buyer_rate = #{buyerRate,jdbcType=INTEGER}",
        "where order_id = #{orderId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Order record);
}