package org.onaips.comandomeo;

import android.util.Log;

public class Keys {
	//						 1	,2	,3	,4	,5	,6	,7	,8	,9	,0	,av	,enter	,power	,v+	,p+	,v-		,p-		,ok	,menu	,back	,screen	,guia	,video	,i		,switchs,gravac	,stop	,play	,rec	,up		,down	,left	,right	,prev	,rev	,forw	,next	,red	,green	,yellow	,blue	,mute	,song	,riscas	,tv
	static int [] meo_key = {49	,50	,51	,52	,53	,54	,55	,56	,57	,48	,0	,0		,233	,175,33	,174	,34		,13	,36		,8		,27		,112	,114	,159	,156	,115	,123	,119	,225	,38		,40		,37		,39		,117	,118	,121	,122	,140	,141	,142	,143	,173	,0		,111	,0};
	static int [] meo_1_x = {22	,176,332,22	,176,332,22	,176,332,176,22	,332	,332	,22	,326,22		,326	,148,154	,20		,131	,243	,355	,22		,176	,332	,22		,176	,332	,143	,143	,23		,325	,20		,131	,243	,355	,20		,131	,243	,355	,20		,131	,243	,355};
	static int [] meo_2_x = {118,276,432,118,276,432,118,276,432,276,118,432	,432	,126,432,126	,432	,305,300	,97		,209	,332	,433	,118	,276	,432	,118	,276	,432	,309	,309	,118	,435	,97		,209	,332	,433	,97		,209	,332	,433	,97		,209	,332	,433};
	static int [] meo_1_y = {159,159,159,277,277,277,397,397,397,515,515,515	,40		,686,686,991	,991	,815,1113	,1198	,1198	,1198	,1198	,1325	,1325	,1325	,1444	,1444	,1444	,689	,990	,809	,809	,1600	,1600	,1600	,1600	,1715	,1715	,1715	,1715	,1826	,1826	,1826	,1826};
	static int [] meo_2_y = {256,256,256,377,377,377,497,497,497,615,615,615	,140	,793,793,1099	,1099	,972,1170	,1276	,1276	,1276	,1276	,1425	,1425	,1425	,1544	,1544	,1544	,800	,1090	,975	,975	,1680	,1680	,1680	,1680	,1795	,1795	,1795	,1795	,1906	,1906	,1906	,1906};

	static void checkArrays() {
		if (Keys.meo_key.length != Keys.meo_1_x.length || 
				Keys.meo_key.length != Keys.meo_1_y.length ||
				Keys.meo_key.length != Keys.meo_2_x.length ||
				Keys.meo_key.length != Keys.meo_2_y.length) {
			Log.e("COMANDOMEO","Error, key arrays do not match!");
			System.exit(-1);
		}
	}
}