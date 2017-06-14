package com.taotao.mapper;

import com.taotao.pojo.Content;
import com.taotao.pojo.ContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ContentMapper {
    /**
     *
     * @mbggenerated 2017-06-13
     */
    int countByExample(ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int deleteByExample(ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Delete({
        "delete from tb_content",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Insert({
        "insert into tb_content (id, category_id, ",
        "title, sub_title, ",
        "title_desc, url, ",
        "pic, pic2, created, ",
        "updated, content)",
        "values (#{id,jdbcType=BIGINT}, #{categoryId,jdbcType=BIGINT}, ",
        "#{title,jdbcType=VARCHAR}, #{subTitle,jdbcType=VARCHAR}, ",
        "#{titleDesc,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{pic,jdbcType=VARCHAR}, #{pic2,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP}, #{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Content record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int insertSelective(Content record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<Content> selectByExampleWithBLOBs(ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    List<Content> selectByExample(ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Select({
        "select",
        "id, category_id, title, sub_title, title_desc, url, pic, pic2, created, updated, ",
        "content",
        "from tb_content",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Content selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExampleWithBLOBs(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    int updateByPrimaryKeySelective(Content record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_content",
        "set category_id = #{categoryId,jdbcType=BIGINT},",
          "title = #{title,jdbcType=VARCHAR},",
          "sub_title = #{subTitle,jdbcType=VARCHAR},",
          "title_desc = #{titleDesc,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "pic2 = #{pic2,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Content record);

    /**
     *
     * @mbggenerated 2017-06-13
     */
    @Update({
        "update tb_content",
        "set category_id = #{categoryId,jdbcType=BIGINT},",
          "title = #{title,jdbcType=VARCHAR},",
          "sub_title = #{subTitle,jdbcType=VARCHAR},",
          "title_desc = #{titleDesc,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "pic = #{pic,jdbcType=VARCHAR},",
          "pic2 = #{pic2,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Content record);
}