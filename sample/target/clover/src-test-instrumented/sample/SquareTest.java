/* $$ This file has been instrumented by Clover 4.2.0#20170430005756651 $$ */package sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class SquareTest {static class __CLR4_2_022jrsocror{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_2_0();if(20170430005756651L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.2.0#20170430005756651,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0053\u0061\u0074\u0069\u0073\u0068\u005c\u005c\u0065\u0063\u006c\u0069\u0070\u0073\u0065\u0077\u0073\u005c\u005c\u0073\u0061\u006d\u0070\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1549426200332L,8589935092L,9,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_2_0_TEST_NAME_SNIFFER=new com_atlassian_clover.JUnitParameterizedTestSniffer();

	 @Parameters
	    public static Collection<Object[]> data() {try{__CLR4_2_022jrsocror.R.inc(2);
	        __CLR4_2_022jrsocror.R.inc(3);return Arrays.asList(new Object[][] {     
	                 { 0, 0 }, { 1, 1 }, { 2, 4 }
	           });
	    }finally{__CLR4_2_022jrsocror.R.flushNeeded();}}

	    protected int input;
	    protected int expected;
	    public SquareTest(int input, int expected) {try{__CLR4_2_022jrsocror.R.inc(4);
	    	__CLR4_2_022jrsocror.R.inc(5);this.input = input;
	    	__CLR4_2_022jrsocror.R.inc(6);this.expected = expected;
	    }finally{__CLR4_2_022jrsocror.R.flushNeeded();}}
	    
	@Test
	public void test() {__CLR4_2_022jrsocror.R.globalSliceStart(getClass().getName(),7);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_2_0zi4lt37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_2_022jrsocror.R.rethrow($CLV_t2$);}finally{__CLR4_2_022jrsocror.R.globalSliceEnd(getClass().getName(),"sample.SquareTest.test",__CLR4_2_0_TEST_NAME_SNIFFER.getTestName(),7,$CLV_p$,$CLV_t$);}}private void  __CLR4_2_0zi4lt37(){try{__CLR4_2_022jrsocror.R.inc(7);
		__CLR4_2_022jrsocror.R.inc(8);assertEquals(expected, Square.square(input));
	}finally{__CLR4_2_022jrsocror.R.flushNeeded();}}

}
