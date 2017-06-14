package com.taotao.mapper;

import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ItemDescMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_item_desc",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long itemId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_item_desc (item_id, created, ",
        "updated, item_desc)",
        "values (#{itemId,jdbcType=BIGINT}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP}, #{itemDesc,jdbcType=LONGVARCHAR})"
    })
    int insert(ItemDesc record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(ItemDesc record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemDesc> selectByExampleWithBLOBs(ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemDesc> selectByExample(ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "item_id, created, updated, item_desc",
        "from tb_item_desc",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    @ResultMap("ResultMapWithBLOBs")
    ItemDesc selectByPrimaryKey(Long itemId);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleWithBLOBs(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") ItemDesc record, @Param("example") ItemDescExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(ItemDesc record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_desc",
        "set created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP},",
          "item_desc = #{itemDesc,jdbcType=LONGVARCHAR}",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(ItemDesc record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_desc",
        "set created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where item_id = #{itemId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ItemDesc record);
}