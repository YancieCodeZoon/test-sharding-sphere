package cn.study.service.impl;

import cn.study.model.Test;
import cn.study.dao.TestMapper;
import cn.study.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
