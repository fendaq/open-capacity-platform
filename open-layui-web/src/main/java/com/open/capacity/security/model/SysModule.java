package com.open.capacity.security.model;
/**
 * @author wjh
 * @create 2018-05-07 11:53
 * @desc 模块管理
 **/
public class SysModule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.version
     *
     * @mbg.generated
     */
    private Long version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.index_page
     *
     * @mbg.generated
     */
    private String indexPage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.if_show
     *
     * @mbg.generated
     */
    private String ifShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_module.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.id
     *
     * @return the value of sys_module.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.id
     *
     * @param id the value for sys_module.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.version
     *
     * @return the value of sys_module.version
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.version
     *
     * @param version the value for sys_module.version
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.description
     *
     * @return the value of sys_module.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.description
     *
     * @param description the value for sys_module.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.image
     *
     * @return the value of sys_module.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.image
     *
     * @param image the value for sys_module.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.name
     *
     * @return the value of sys_module.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.name
     *
     * @param name the value for sys_module.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.index_page
     *
     * @return the value of sys_module.index_page
     *
     * @mbg.generated
     */
    public String getIndexPage() {
        return indexPage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.index_page
     *
     * @param indexPage the value for sys_module.index_page
     *
     * @mbg.generated
     */
    public void setIndexPage(String indexPage) {
        this.indexPage = indexPage == null ? null : indexPage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.if_show
     *
     * @return the value of sys_module.if_show
     *
     * @mbg.generated
     */
    public String getIfShow() {
        return ifShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.if_show
     *
     * @param ifShow the value for sys_module.if_show
     *
     * @mbg.generated
     */
    public void setIfShow(String ifShow) {
        this.ifShow = ifShow == null ? null : ifShow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_module.sort
     *
     * @return the value of sys_module.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_module.sort
     *
     * @param sort the value for sys_module.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}