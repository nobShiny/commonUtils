package com.milimi.mynewteamin.utils;

import android.util.Log;

/**
 * Created by shiny_jia
 * on 2016-01-04 15:00.
 */
public final class LogHelper {

    //获取堆栈信息会影响性能，发布应用时记得关闭DebugMode
    private static boolean mIsDebugMode = true;
//    private static String mLogTag = "LogHelper" ;

    private static final String CLASS_METHOD_LINE_FORMAT = "%s.%s()  Line:%d  <%s>";

    public static void trace(Object obj) {
        if (mIsDebugMode) {
            StackTraceElement traceElement = Thread.currentThread()
                    .getStackTrace()[3];//从堆栈信息中获取当前被调用的方法信息
            /**
             * log属性顺序：
             *      类名
             *      方法名
             *      行号
             *      文件名（一般是和类名一样）
             */
            String logText = String.format(CLASS_METHOD_LINE_FORMAT,
                    traceElement.getClassName(),
                    traceElement.getMethodName(),
                    traceElement.getLineNumber(),
                    traceElement.getFileName());
            Log.d(traceElement.getClassName(), logText + (obj!=null?"调试信息为:"+ obj.toString():"" ));//打印Log
        }
    }


}