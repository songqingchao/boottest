package com.songqingchao.servcie.impl;

import com.songqingchao.entity.PingFen;
import com.songqingchao.mapper.PingFenMapper;
import com.songqingchao.servcie.PingFenService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;

/**
 * @user candy
 * 2021/6/1323:01
 */
@Service
public class PingFenServiceImpl implements PingFenService {
    @Autowired
    private PingFenMapper pingfenMapper;
    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    public List<PingFen> queryPingFen(int uid) {
        return pingfenMapper.selectById(uid);
    }

    @Override
    public int insert(int nid) {
        return pingfenMapper.insert(3);
    }

    @Override
    @Transactional
    public void cursor() {
        Cursor<PingFen> cursor = pingfenMapper.cursor();
        cursor.forEach((t) -> {
            System.out.println(t.getStudentName());
        });
    }

    @Override
    @Transactional
    public void cursor2() {
        for (; ; ) {
            TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
            try {
                Cursor<PingFen> cursor = pingfenMapper.cursor();
                cursor.forEach((t) -> {
                    System.out.println(t.getStudentName());
                });
                transactionManager.commit(status);
            } catch (Exception e) {
                System.out.println(e.toString());
                transactionManager.rollback(status);
            }
        }
    }

    @Override
    public void transactionTest() {
        for (; ; ) {
            TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        }
    }
}
