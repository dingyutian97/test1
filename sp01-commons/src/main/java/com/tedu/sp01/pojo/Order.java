package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private String id;        //订单id，一般都是生成的随机数，所以用String类型接收
	private User user;        //订单所属用户
	private List<Item> items; //订单包含的商品
	
}
