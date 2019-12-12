package com.maven.serviceImpl;

import com.maven.dao.ItemDao;
import com.maven.entity.Item;
import com.maven.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: ItemServiceImpl.java
 * File description:
 *
 * @copyright: 2019
 * @company: tb
 * @Author: lxf
 * @version: 1.0
 * @date 2019年12月12日
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    public Item findItemById(String id) {
        return itemDao.findItemById(id);
    }
}
