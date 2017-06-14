package com.taotao.mapper;

import com.taotao.pojo.ItemParamItem;
import com.taotao.pojo.ItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ItemParamItemMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_item_param_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_item_param_item (id, item_id, ",
        "created, updated, ",
        "param_data)",
        "values (#{id,jdbcType=BIGINT}, #{itemId,jdbcType=BIGINT}, ",
        "#{created,jdbcType=TIMESTAMP}, #{updated,jdbcType=TIMESTAMP}, ",
        "#{paramData,jdbcType=LONGVARCHAR})"
    })
    int insert(ItemParamItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(ItemParamItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemParamItem> selectByExampleWithBLOBs(ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemParamItem> selectByExample(ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, item_id, created, updated, param_data",
        "from tb_item_param_item",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("ResultMapWithBLOBs")
    ItemParamItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleWithBLOBs(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") ItemParamItem record, @Param("example") ItemParamItemExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(ItemParamItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_param_item",
        "set item_id = #{itemId,jdbcType=BIGINT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP},",
          "param_data = #{paramData,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(ItemParamItem record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_param_item",
        "set item_id = #{itemId,jdbcType=BIGINT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ItemParamItem record);
}