package com.taotao.mapper;

import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ItemCatMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ItemCatExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ItemCatExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_item_cat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_item_cat (id, parent_id, ",
        "name, status, sort_order, ",
        "is_parent, created, ",
        "updated)",
        "values (#{id,jdbcType=BIGINT}, #{parentId,jdbcType=BIGINT}, ",
        "#{name,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{sortOrder,jdbcType=INTEGER}, ",
        "#{isParent,jdbcType=BIT}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP})"
    })
    int insert(ItemCat record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(ItemCat record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ItemCat> selectByExample(ItemCatExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, parent_id, name, status, sort_order, is_parent, created, updated",
        "from tb_item_cat",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ItemCat selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") ItemCat record, @Param("example") ItemCatExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(ItemCat record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_item_cat",
        "set parent_id = #{parentId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "sort_order = #{sortOrder,jdbcType=INTEGER},",
          "is_parent = #{isParent,jdbcType=BIT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ItemCat record);
}