package com.rp.system.content;

import javax.servlet.http.HttpServletRequest;

public class Summary {

		//Field marked as --remove means
		//It exist in mainframe but the inventory doc (correction sent) does not contain those field.
		//TODO: Either remove the field from mainframe or need to add the fields for future changes.
	
		public String print(String type, HttpServletRequest request) {
				
				if(type.equalsIgnoreCase("maker")) 
					return maker(request);
				
				if(type.equalsIgnoreCase("prod")) 
					return prod(request);
				
				if(type.equalsIgnoreCase("cust"))
					return cust(request);
					
				return "";
			}
		
		private String cust(HttpServletRequest request) { //Customer Info -- non member
			String filler="";
			
			//cus00  --removed 
			String eom="";																	//length 7
			String min_days_delayed="";														//length 2
			String cus00="cus00 "+eom+min_days_delayed;
			
			//cus01  --removed
			filler=spaces(3);																//length 3
			String cus01_days_delayed="";													//length 2
			String cus01="cus01 "+filler+cus01_days_delayed;
			
			//cus02  --order info
			filler=spaces(3);																//length 3
			String cus02_days_delayed=space(request.getParameter("delayedOrder"),2);		//length 2
			String cus02_order_section=space(request.getParameter("ilcc1pd1ocs"),3);		//length 3
			String cus02_order_quantity=space(request.getParameter("ilcc1pd1obs"),3);		//length 3
			String cus02="cus02 "+filler+cus02_days_delayed+cus02_order_section+cus02_order_quantity;
			
			//cus03	 --payment info 
			filler=spaces(3);																//length 3
			String cus03_days_delayed=space(request.getParameter("delayedPayment"),2);		//length 2
			String cus03_pay_type=space(request.getParameter("paymentType"),3);				//length 3
			String cus03_bouns=space(request.getParameter("bouns"),3);						//length 3
			String cus03="cus03 "+filler+cus03_days_delayed+cus03_pay_type+cus03_bouns;
			
			//cus04  --price deduction - non member
			filler=spaces(3); 																//length 3
			String cus04_days_delayed=space(request.getParameter("delayedPenalty"),2);		//length 2
			String cus04_promo_A=space(request.getParameter("promotionA"),2);				//length 2
			String cus04_promo_B=space(request.getParameter("promotionB"),2);				//length 2
			String cus04_promo_C=space(request.getParameter("promotionC"),2);				//length 2
			String cus04_promo_D=space(request.getParameter("promotionD"),2);				//length 2
			String cus04_promo_E=space(request.getParameter("promotionE"),2);				//length 2
			String cus04_class_A=space(request.getParameter("gradeA"),2);					//length 2
			String cus04_class_B=space(request.getParameter("gradeB"),2);					//length 2
			String cus04_class_C=space(request.getParameter("gradeC"),2);					//length 2
			String cus04_accum_points=space(request.getParameter("points"),3);				//length 3
			String cus04="cus04 "+filler+cus04_days_delayed+cus04_promo_A+cus04_promo_B+cus04_promo_C+cus04_promo_D+
						 cus04_promo_E+cus04_class_A+cus04_class_B+cus04_class_C+cus04_accum_points;
			
			//cus05	 --price deduction - member
			filler=spaces(3);
			String cus05_days_delayed=space(request.getParameter("delayedPenaltyC"),3);		//length 3
			String cus05_QRC=space(request.getParameter("QRCode"),2);						//length 2
			String cus05_Coupon=space(request.getParameter("CouponId"),3);					//length 3
			String cus05_promo_A=space(request.getParameter("promotionAC"),2);				//length 2
			String cus05_promo_B=space(request.getParameter("promotionBC"),2);				//length 2
			String cus05_promo_C=space(request.getParameter("promotionCC"),2);				//length 2
			String cus05_promo_D=space(request.getParameter("promotionDC"),2);				//length 2
			String cus05_promo_E=space(request.getParameter("promotionEC"),2);				//length 2
			String cus05_class_A=space(request.getParameter("gradeAC"),2);					//length 2
			String cus05_class_B=space(request.getParameter("gradeBC"),2);					//length 2
			String cus05_class_C=space(request.getParameter("gradeCC"),2);					//length 2
			String cus05_acct_points=space(request.getParameter("pointsC"),3);				//length 3
			String cus05_whole_sale=space(request.getParameter("wholeSale"),3);				//length 3
			String cus05_quick_sale=space(request.getParameter("quicksale"),3);				//length 3
			String cus05_holdings=space(request.getParameter("hold"),2);					//length 2
			String cus05_clearance=space(request.getParameter("clearance"),2);				//length 2
			String cus05="cus05 "+filler+cus05_days_delayed+cus05_QRC+cus05_Coupon+
					     cus05_promo_A+cus05_promo_B+cus05_promo_C+cus05_promo_D+cus05_promo_E+
					     cus05_class_A+cus05_class_B+cus05_class_C+cus05_acct_points+cus05_whole_sale+
					     cus05_quick_sale+cus05_holdings+cus05_clearance;
			
			//cus06   --quick match trio
			filler=spaces(3);																//length 3
			String cus06_days_paid=space(request.getParameter("paidDays"),2);				//length 2
			String cus06_total_paid=space(request.getParameter("paidTotal"),3);				//length 3
			String cus06="cus06 "+filler+cus06_days_paid+cus06_total_paid;
			
			//cus07   --long match trio
			filler=spaces(3);																//length 3
			String cus07_days_paid=space(request.getParameter("paidDaysLong"),2);			//length 2
			String cus07_mail_payment=space(request.getParameter("paidByMail"),3);			//length 3
			String cus07_interest=space(request.getParameter("interest"),3);				//length 3
			String cus07_total_paid=space(request.getParameter("paidTotalLong"),3);			//length 3
			String cus07_bal=space(request.getParameter("balance"),3);			//length 3
			String cus07="cus07 "+filler+cus07_days_paid+cus07_mail_payment+cus07_interest+
					cus07_total_paid+cus07_bal;
			
			//cus08	  --inactive account
			filler=spaces(3);																//length 3
			String cus08_days_disabled=space(request.getParameter("inactive"),2);			//length 2
			String cus08="cus08 "+filler+cus08_days_disabled;
			
			//cus09   --balance on account
			String cus09_payoff_bal=space(request.getParameter("balancePayoff"),6);			//length 6
			String cus09_last_pay_date=space(request.getParameter("datePaid"),8);			//length 8
			String cus09_princ_bal=space(request.getParameter("ilcczbaprb"),6);	   			//length 6
			String cus09="cus09 "+cus09_payoff_bal+cus09_last_pay_date+cus09_princ_bal;
			
			//cus10   --removed 
			String cus10_status="";															//length 2
			String cus10_balance="";														//length 7
			String cus10="cus010 "+cus10_status+cus10_balance;	
			
			//cus11   --removed
			String cus11_current="";														//length 3
			String cus11="cus11 "+cus11_current;
			
			return cus00+"\r\n"+
				   cus01+"\r\n"+
				   cus02+"\r\n"+
				   cus03+"\r\n"+
				   cus04+"\r\n"+
				   cus05+"\r\n"+
				   cus06+"\r\n"+
				   cus07+"\r\n"+
				   cus08+"\r\n"+
				   cus09+"\r\n"+
				   cus10+"\r\n"+
				   cus11;
		}
		
		private String prod(HttpServletRequest request) {
			String filler="";
			
			//pm00
			String eom="";													//length 7
			String pm00_days_delayed="";									//length 2
			filler="";														//length 50 leave it blank since it is not used
			String dt01_utilization="";										//length 3
			String dt02_utilization="";										//length 3
			String dt03_pay_curbal="";										//length 3
			String dt04_date_hibal="";										//length 3
			String dt05_days_delayed="";									//length 2
			String dt06_curbal_hibal="";			    					//length 3
			String dt07_utilization="";										//length 3
			String dt08_time_on_books="";									//length 3
			String dt09_pay_curbal="";										//length 3
			String dt10_curbal_crline="";									//length 3
			String dt11_curbal_hibal="";									//length 3
			String dt12_time_on_books="";									//length 3
			String dt13_nsf="";												//length 3
			String dt14_curbal_hibal="";									//length 3
			String dt15_days_delayed="";									//length 2
			String dt16_curbal_hibal="";									//length 3
			String pm00="pm00 "+eom+pm00_days_delayed+filler+dt01_utilization+dt02_utilization+dt03_pay_curbal+
					     dt04_date_hibal+dt05_days_delayed+dt06_curbal_hibal+dt07_utilization+dt08_time_on_books+
					     dt09_pay_curbal+dt10_curbal_crline+dt11_curbal_hibal+dt12_time_on_books+dt13_nsf+
					     dt14_curbal_hibal+dt15_days_delayed+dt16_curbal_hibal;
			
			//pm01 --product listing
			filler=spaces(3);														//length 3
			String pm01_is_on_sale=space(request.getParameter("saleList"),1);		//length 1
			String pm01_group_id=space(request.getParameter("group"),3);			//length 3
			String pm01_price=space(request.getParameter("price"),4);				//length 4
			String pm01="pm01 "+filler+pm01_is_on_sale+pm01_group_id+pm01_price;
			
			//pm02 --removed
			filler=spaces(3);															//length 3
			String pm02_days_delayed="";												//length 2
			String pm02="pm02 "+filler+pm02_days_delayed;
			
			//pm03 --product current
			filler=spaces(3);															//length 3
			String pm03_is_soldOut=space(request.getParameter("soldout"),1);			//length 1
			String pm03_replace_id=space(request.getParameter("replaceId"),3);			//length 3
			String pm03_count=space(request.getParameter("count"),3);					//length 3
			String pm03="pm03 "+filler+pm03_is_soldOut+pm03_replace_id+pm03_count;
			
			//pm04 --removed
			filler=spaces(3);												//length 3
			String pm04_amt_recieved="";									//length 3
			String pm04_amt_sent="";										//length 3
			String pm04="pm04 "+filler+pm04_amt_recieved+pm04_amt_sent;	
			
			//pm05 --removed
			filler=spaces(3);												//length 3
			String pm05_amt_recieved="";									//length 3
			String pm05_amt_sent="";										//length 3
			String pm05="pm05 "+filler+pm05_amt_recieved+pm05_amt_sent;	
			
			//pm06 --price line
			filler=spaces(3);															//length 3
			String pm06_is_soldout=space(request.getParameter("soldout"),1);			//length 1
			String pm06_days_delayed=space(request.getParameter("delayedLine"),2);		//length 2
			String pm06="pm06 "+filler+pm06_is_soldout+pm06_days_delayed;	
			
			//pm07 --high return factor
			filler=spaces(3);															//length 3
			String pm07_days_delayed=space(request.getParameter("delayedFactorHigh"),2);//length 2
			String pm07_profit_margin1=space(request.getParameter("profit1"),2);		//length 2
			String pm07_profit_margin2=space(request.getParameter("profit2"),2);		//length 2
			String pm07_profit_margin3=space(request.getParameter("profit3"),2);		//length 2
			String pm07_sale_sum=space(request.getParameter("numberOfSale"),3);			//length 3
			String pm07_margin_of_return=space(request.getParameter("return"),3);		//length 3
			String pm07_item_id=space(request.getParameter("itemId"),6);				//length 6
			String pm07_pct_item_sold=space(request.getParameter("salePct"),3);			//length 3
			String pm07="pm07 "+filler+pm07_days_delayed+pm07_profit_margin1+pm07_profit_margin2+
					pm07_profit_margin3+pm07_sale_sum+pm07_margin_of_return+pm07_item_id+pm07_pct_item_sold;
			
			//pm08	--mid return factor
			filler=spaces(3);															//length 3
			String pm08_days_delayed=space(request.getParameter("delayedFactorMid"),2);	//length 2
			String pm08_sale_sum=space(request.getParameter("numberOfSaleMid"),3);		//length 3
			String pm08_pct_item_sold=space(request.getParameter("salePctMid"),3);		//length 3
			String pm08="pm08 "+filler+pm08_days_delayed+pm08_sale_sum+pm08_pct_item_sold;
			
			//pm09 --low return factor
			filler=spaces(3);															//length 3
			String pm09_days_delayed=space(request.getParameter("delayedFactorLow"),2);	//length 2
			String pm09="pm09 "+filler+pm09_days_delayed;
			
			//pm10 --removed
			filler=spaces(3);												//length 3
			String pm10_days_delayed="";									//length 2
			String pm10_amt_recieved="";									//length 3
			String pm10_amt_sent="";										//length 3
			String pm10="pm10 "+filler+pm10_days_delayed+pm10_amt_recieved+pm10_amt_sent;
			
			return pm00+"\r\n"+
				   pm01+"\r\n"+
				   pm02+"\r\n"+
				   pm03+"\r\n"+
				   pm04+"\r\n"+
				   pm05+"\r\n"+
				   pm06+"\r\n"+
				   pm07+"\r\n"+
				   pm08+"\r\n"+
				   pm09+"\r\n"+
				   pm10;
		}
		
		private String maker(HttpServletRequest request) {
			String filler="";
			
			//mq00 --removed
			String application="";						    				//length 3
			String seq="";						        		  			//length 2
			String eom = "";						          				//length 7 
			String min_days_delayed="";										//length 2
			String mq00="mq00 "+application+seq+eom+min_days_delayed;
			
			//mq01 --product transaction 1
			filler = spaces(3); 														//length 3
			String mq01_is_payment_recieved=space(request.getParameter("recieved"),1);	//length 1
			String mq01_days_delayed=space(request.getParameter("delayed"),2);		    //length 2
			String mq01_prod_code_A=space(request.getParameter("productA"),2);			//length 2
			String mq01_prod_code_B=space(request.getParameter("productB"),2);			//length 2
			String mq01_prod_code_C=space(request.getParameter("productC"),2);			//length 2
			String mq01_prod_code_D=space(request.getParameter("productD"),2);			//length 2
			String mq01_item_price=space(request.getParameter("price"),3);			    //length 3
			String mq01_sale_rate=space(request.getParameter("rateOfSale"),3);			//length 3
			String mq01="mq01 "+filler+mq01_is_payment_recieved+mq01_days_delayed+mq01_prod_code_A+mq01_prod_code_B+
					mq01_prod_code_C+mq01_prod_code_D+mq01_item_price+mq01_sale_rate;
			
			//mq02 --product transaction 2
			filler=spaces(3);																//length 3
			String mq02_is_payment_recived=space(request.getParameter("recievedTwo"),2);	//length 2
			String mq02_days_delayed=space(request.getParameter("delayedTwo"),2);			//length 2
			String mq02_item_price=space(request.getParameter("priceTwo"),3);				//length 3
			String mq02="mq02 "+filler+mq02_is_payment_recived+mq02_days_delayed+mq02_item_price;
			
			//mq03 --transaction summary
			filler=spaces(3); 																//length 3
			String mq03_prod_id=space(request.getParameter("id"),2);						//length 2
			String mq03_order=space(request.getParameter("order"),2);						//length 2
			String mq03_prod_code_A=space(request.getParameter("sumProductA"),2);			//length 2
			String mq03_prod_code_B=space(request.getParameter("sumProductB"),2);			//length 2
			String mq03_prod_code_C=space(request.getParameter("sumProductC"),2);			//length 2
			String mq03_prod_code_D=space(request.getParameter("sumProductD"),2);			//length 2
			String mq03_price_target=space(request.getParameter("sumTarget"),3);			//length 3
			String mq03_refill=space(request.getParameter("sumFill"),2);					//length 2
			String mq03_sale_rate=space(request.getParameter("sumRate"),3);					//length 3
			String mq03="mq03 "+filler+mq03_prod_id+mq03_order+mq03_prod_code_A+mq03_prod_code_B+mq03_prod_code_C+
						 mq03_prod_code_D+mq03_price_target+mq03_refill+mq03_sale_rate;
			
			//mq04 --prod placement
			filler = spaces(3);																//length 3
			String mq04_days_delayed=space(request.getParameter("totalDelay"),2);			//length 2
			String mq04_prod_code_A=space(request.getParameter("totalProdctA"),2);			//length 2
			String mq04_prod_code_B=space(request.getParameter("totalProdctB"),2);			//length 2
			String mq04_prod_code_C=space(request.getParameter("totalProdctC"),2);			//length 2
			String mq04_prod_code_D=space(request.getParameter("totalProdctD"),2);			//length 2
			String mq04_price_target=space(request.getParameter("totalPrice"),3);			//length 3
			String mq04_rate_of_change=space(request.getParameter("totalChange"),2);		//length 2
			String mq04_order_quantity=space(request.getParameter("totalOrder"),3);			//length 3
			String mq04="mq04 "+filler+mq04_days_delayed+mq04_prod_code_A+mq04_prod_code_B+mq04_prod_code_C+mq04_prod_code_D+mq04_price_target+
					mq04_rate_of_change+mq04_order_quantity;
			
			//mq05 --account info
			filler= spaces(3);																//length 3
			String mq05_is_member=space(request.getParameter("membership"),1);				//length 1
			String mq05_acc_id=space(request.getParameter("acct"),3);						//length 3
			String mq05_record_info=space(request.getParameter("storedInfo"),3);			//length 3
			String mq05="mq05 "+filler+mq05_is_member+mq05_acc_id+mq05_record_info;
			
			//mq06 --inactive account
			filler= spaces(3);																//length 3
			String mq06_days_inactive=space(request.getParameter("inactive"),2);			//length 2
			String mq06="mq06 "+filler+mq06_days_inactive;
			
			return mq00+"\r\n"+
				   mq01+"\r\n"+
				   mq02+"\r\n"+
				   mq03+"\r\n"+
				   mq04+"\r\n"+
				   mq05+"\r\n"+
				   mq06;
		}
		
		public static String spaces(int space) {
			String blank="";
			for(int i=0; i<space; i++){
				blank=blank+" ";
			}
			return blank;
		}
		
		public static String space(String s, int length) {
			String space="";
			
			if(s.length() < length) {
				int diff= length-s.length();
				for(int i=0; i<diff; i++){
					space+=" ";
				}
				s=s+space;
			}
			
			return s;
		}
}
