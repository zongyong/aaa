package yong.demo;

import java.util.Scanner;

public class PyramidDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入金字塔层数：");
		int n = scanner.nextInt();
		System.out.print("正金字塔输入1，倒金字塔输入2：");	
		int m = scanner.nextInt();
		switch (m) {
			case 1:
				straight(n);
				break;
			case 2:
				fall(n);
				break;
			default:
				System.out.println("输入错误！");
				break;
		}
	}
	
	/**
	 * 正序输出
	 */
	public static void straight(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if (j>n-1+i) {
					break;
				}
				if (j<=n-i) {
					System.out.print(' ');
				}
				if (j>n-i) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
	}
	
	/**
	 * 倒序输出
	 */
//	public static void fall(int n) {
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= 2*n-1; j++) {
//				if (j>2*n-i) {
//					break;
//				}
//				if (j<=i-1) {
//					System.out.print(' ');
//				}
//				if (j>i-1) {
//					System.out.print('*');	
//				}		
//			}
//			System.out.println();
//		}
//	}
}