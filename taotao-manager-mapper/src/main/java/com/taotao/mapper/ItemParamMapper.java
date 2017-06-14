package com.taotao.mapper;

import com.taotao.pojo.ItemParam;
import com.taotao.pojo.ItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ItemParamMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_item_param",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_item_param (id, item_cat_id, ",
        "created, updated, ",
        "param_data)",
        "values (#{id,jdbcType=BIGINT}, #{itemCatId,jdbcType=BIGINT}, ",
        "#{created,jdbcType=TIMESTAMP}, #{updated,jdbcType=TIMESTAMP}, ",
        "#{paramData,jdbcType=LONGVARCHAR})"
    })
    int insert(ItemParam record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(ItemParam record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemParam> selectByExampleWithBLOBs(ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemParam> selectByExample(ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, item_cat_id, created, updated, param_data",
        "from tb_item_param",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("ResultMapWithBLOBs")
    ItemParam selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") ItemParam record, @Param("example") ItemParamExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(ItemParam record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_param",
        "set item_cat_id = #{itemCatId,jdbcType=BIGINT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP},",
          "param_data = #{paramData,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(ItemParam record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_param",
        "set item_cat_id = #{itemCatId,jdbcType=BIGINT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ItemParam record);
}