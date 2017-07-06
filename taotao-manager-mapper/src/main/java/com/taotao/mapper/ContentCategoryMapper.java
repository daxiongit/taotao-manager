package com.taotao.mapper;

import com.taotao.pojo.ContentCategory;
import com.taotao.pojo.ContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ContentCategoryMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ContentCategoryExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ContentCategoryExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_content_category",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    /*@Insert({
        "insert into tb_content_category (id, parent_id, ",
        "name, status, sort_order, ",
        "is_parent, created, ",
        "updated)",
        "values (#{id,jdbcType=BIGINT}, #{parentId,jdbcType=BIGINT}, ",
        "#{name,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, #{sortOrder,jdbcType=INTEGER}, ",
        "#{isParent,jdbcType=BIT}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP})"
    })*/
    int insert(ContentCategory record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(ContentCategory record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<ContentCategory> selectByExample(ContentCategoryExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, parent_id, name, status, sort_order, is_parent, created, updated",
        "from tb_content_category",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    ContentCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") ContentCategory record, @Param("example") ContentCategoryExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(ContentCategory record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_content_category",
        "set parent_id = #{parentId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "sort_order = #{sortOrder,jdbcType=INTEGER},",
          "is_parent = #{isParent,jdbcType=BIT},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ContentCategory record);
}