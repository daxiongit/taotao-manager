package com.taotao.mapper;

import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ItemMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_item (id, title, ",
        "sell_point, price, ",
        "num, barcode, image, ",
        "cid, status, created, ",
        "updated)",
        "values (#{id,jdbcType=BIGINT}, #{title,jdbcType=VARCHAR}, ",
        "#{sellPoint,jdbcType=VARCHAR}, #{price,jdbcType=BIGINT}, ",
        "#{num,jdbcType=INTEGER}, #{barcode,jdbcType=VARCHAR}, #{image,jdbcType=VARCHAR}, ",
        "#{cid,jdbcType=BIGINT}, #{status,jdbcType=TINYINT}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP})"
    })
    int insert(Item record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(Item record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<Item> selectByExample(ItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, title, sell_point, price, num, barcode, image, cid, status, created, updated",
        "from tb_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Item selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(Item record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item",
        "set title = #{title,jdbcType=VARCHAR},",
          "sell_point = #{sellPoint,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT},",
          "num = #{num,jdbcType=INTEGER},",
          "barcode = #{barcode,jdbcType=VARCHAR},",
          "image = #{image,jdbcType=VARCHAR},",
          "cid = #{cid,jdbcType=BIGINT},",
          "status = #{status,jdbcType=TINYINT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Item record);
}