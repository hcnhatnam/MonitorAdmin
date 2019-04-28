/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monitor.admin.DBEntities;

import com.monitor.admin.entities.Images;
import com.monitor.admin.entities.Statistical;
import com.monitor.admin.repository.ImageRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author namhcn
 */
@Service
public class ImagesImpl {

    @Autowired
    private ImageRepository imageRepository;

    public Iterable<Images> getTableImage() {
        return imageRepository.findAll();
    }

    public void removeImage(String imgId) {
        imageRepository.deleteById(imgId);
    }

    public List<Object[]> getStatistical() {
        List<Object[]> statistical = imageRepository.getStatistical();
        Iterator<Object[]> it = statistical.iterator();
        while (it.hasNext()) {
            Object value = it.next();

        }
        return imageRepository.getStatistical();
    }

    public List<Statistical> getStatic() {
        List<Object[]> result = imageRepository.getStatistical();
        List<Statistical> statis = new ArrayList<>();
        if (result != null && !result.isEmpty()) {
            for (Object[] object : result) {
                statis.add(new Statistical((String) object[0], (String) object[1]));
            }
        }
        return statis;
    }
}
