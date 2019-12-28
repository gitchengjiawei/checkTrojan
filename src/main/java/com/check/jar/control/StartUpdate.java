package com.check.jar.control;

import com.check.jar.util.UpdateTrojan;

import java.io.IOException;
import java.sql.SQLException;

public class StartUpdate {

	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		System.out.println("开始删除重要用户 僵尸木马 安全事件结果");
		boolean delete = UpdateTrojan.deleteLeadUserResult();
		if(delete){
			System.out.println("删除重要用户 僵尸木马 安全事件结果成功");
		}else{
			System.out.println("删除重要用户 僵尸木马 安全事件结果失败");
			return;
		}

		System.out.println("开始重新比对重要用户 僵尸木马 安全事件");
		boolean update = UpdateTrojan.startUpdate();
		if(update) {
			System.out.println("重新比对重要用户 僵尸木马 安全事件结果成功");
		}else{
			System.out.println("重新比对重要用户 僵尸木马 安全事件结果失败");
		}
	}
}
