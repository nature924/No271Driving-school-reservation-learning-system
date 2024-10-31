package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.ExamrewrongquestionDao;
import com.entity.ExamrewrongquestionEntity;
import com.service.ExamrewrongquestionService;
import com.entity.view.ExamrewrongquestionView;

/**
 * 错题表 服务实现类
 */
@Service("examrewrongquestionService")
@Transactional
public class ExamrewrongquestionServiceImpl extends ServiceImpl<ExamrewrongquestionDao, ExamrewrongquestionEntity> implements ExamrewrongquestionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<ExamrewrongquestionView> page =new Query<ExamrewrongquestionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
