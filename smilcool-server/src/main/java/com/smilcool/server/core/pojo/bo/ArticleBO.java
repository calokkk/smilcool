package com.smilcool.server.core.pojo.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.smilcool.server.core.pojo.vo.ArticleVO;
import com.smilcool.server.core.pojo.vo.CommentVO;
import com.smilcool.server.core.pojo.vo.ResourceVO;
import com.smilcool.server.core.pojo.vo.UserVO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Angus
 * @date 2019/5/13
 */
@Data
public class ArticleBO {
    private ArticleVO articleVO;

    /**
     * 发布用户
     */
    private UserVO userVO;

    /**
     * 资源信息
     */
    private ResourceVO resourceVO;

    /**
     * 评论信息
     */
    private List<CommentVO> commentVOList;
}