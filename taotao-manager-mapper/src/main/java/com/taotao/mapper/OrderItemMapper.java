package com.taotao.mapper;

import com.taotao.pojo.OrderItem;
import com.taotao.pojo.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface OrderItemMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(OrderItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(OrderItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_order_item",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_order_item (id, item_id, ",
        "order_id, num, title, ",
        "price, total_fee, pic_path)",
        "values (#{id,jdbcType=VARCHAR}, #{itemId,jdbcType=VARCHAR}, ",
        "#{orderId,jdbcType=VARCHAR}, #{num,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=BIGINT}, #{totalFee,jdbcType=BIGINT}, #{picPath,jdbcType=VARCHAR})"
    })
    int insert(OrderItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(OrderItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, item_id, order_id, num, title, price, total_fee, pic_path",
        "from tb_order_item",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    OrderItem selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_order_item",
        "set item_id = #{itemId,jdbcType=VARCHAR},",
          "order_id = #{orderId,jdbcType=VARCHAR},",
          "num = #{num,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT},",
          "total_fee = #{totalFee,jdbcType=BIGINT},",
          "pic_path = #{picPath,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(OrderItem record);
}