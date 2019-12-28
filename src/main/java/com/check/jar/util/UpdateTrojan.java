package com.check.jar.util;

import com.check.jar.bean.WaBotnetTrojanResult;
import com.check.jar.mapper.TrojanMapper;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-12-28 22:50
 */
public class UpdateTrojan {

    private final static String regex = "^[+-]?[\\d]+([\\.][\\d]+)?([Ee][+-]?[\\d]+)?$";

    public static void execute() throws SQLException, IOException, ClassNotFoundException {

        WaBotnetTrojanResult result = null;
        List<Map<String, Long>> resultMap = null;

        Map<String,Object> params = new HashMap<>();
        List<WaBotnetTrojanResult> resultContainer;
        int pageSize = 500;
        int size = 0;
        try {
            System.out.println("开始比较重要用户僵尸木马事件");
            Long maxId = TrojanMapper.getTrojanCountMaxId();
            if (maxId != null && maxId.longValue() > 0) {

                size = new BigDecimal(maxId).divide(new BigDecimal(pageSize)).setScale(0, BigDecimal.ROUND_UP).intValue();
            } else {
                return;
            }

            for (int i = 0; i < size; i++) {
                System.out.println("第 " + (i+1) + " 比较重要用户僵尸木马事件");
                long start = new BigDecimal(i).multiply(new BigDecimal(pageSize)).longValue();
                long end = start + pageSize;
                params.put("start",start);
                params.put("end",end);

                resultMap = TrojanMapper.getTrojanResults(params);
                System.out.println("第 " + (i+1) + " 比较重要用户僵尸木马事件结果： " + resultMap.size() + " 条");
                resultContainer = new ArrayList<>();
                for (Map<String, Long> map : resultMap) {

                    result = TrojanMapper.getBotnetTrojanById(map.get("id"));
                    result.setType(1);
                    result.setField(1);
                    result.setCreateTime(new Date());
                    result.setUnitId(map.get("unitId"));
                    result.setSourceUnitId(map.get("sourceUnitId"));
                    result.setIsMore(map.get("isMore").intValue() > 1);
                    result.setUnitNum(map.get("unitNum").intValue());
                    result.setSourceUnitNum(map.get("sourceUnitNum").intValue());
                    if (StringUtils.isNotBlank(result.getPhone()) && result.getPhone().matches(regex)) {
                        result.setPhone(new BigDecimal(result.getPhone()).setScale(0, BigDecimal.ROUND_HALF_UP).toPlainString());
                    }

//                    int rows = TrojanMapper.inserTrojan(result);
                    resultContainer.add(result);
                }

                TrojanMapper.inserTrojanList(resultContainer);
                System.out.println("第 " + (i+1) + " 比较重要用户僵尸木马事件插入结束");
            }
            System.out.println("比较重要用户僵尸木马事件结束");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean deleteLeadUserResult(){
        try {
            TrojanMapper.deleteLeadUserResult();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean startUpdate() throws SQLException, IOException, ClassNotFoundException {
        try {
            execute();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
