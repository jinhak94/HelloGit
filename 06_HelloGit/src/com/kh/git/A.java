package com.kh.git;
/*
 * revert
 *  이후 변경내역 남김
 * 
 * reset
 *  hard HEAD, Index and WorkingTree : 지정한 버젼으로 돌아가고,이후 변경내역을 모두 삭제함.
	soft HEAD Only: 지정한 버젼으로 돌아가고,이후 변경내역은 index(staging area)에 남음
	mixed HEAD And Index: 기본값. 지정한 버젼으로 돌아가고, index도 초기화됨. uncommited changes 에 남음.
 *
 *  branch는 되는지 안되는지 모르겠는 경우 또는
 *  기능 테스트 시에 만든다.
 *  기능이 안되는 경우 branch만 날리면 된다.
 *
 */
public class A {
	public void foo() {
		
	}
}
