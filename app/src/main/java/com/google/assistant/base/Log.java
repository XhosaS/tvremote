package com.google.assistant.base;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Log {
    private static final String sDeprecatedTagPrefix = "cr.";
    private static final String sTagPrefix = "cr_";

    private Log() {
    }

    public static void d(String str, String str2) {
        debug(str, str2, new Object[0]);
    }

    private static void debug(String str, String str2, Object... objArr) {
        String logWithStack = formatLogWithStack(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.d(normalizeTag(str), logWithStack, throwableToLog);
        } else {
            android.util.Log.d(normalizeTag(str), logWithStack);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        String log = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.e(normalizeTag(str), log, throwableToLog);
        } else {
            android.util.Log.e(normalizeTag(str), log);
        }
    }

    private static String formatLog(String str, Object... objArr) {
        return (objArr == null || objArr.length == 0) ? str : String.format(Locale.US, str, objArr);
    }

    private static String formatLogWithStack(String str, Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, objArr);
    }

    private static String getCallOrigin() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Log.class.getName();
        int i = 0;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            if (stackTrace[i].getClassName().equals(name)) {
                i += 4;
                break;
            }
            i++;
        }
        return stackTrace[i].getFileName() + ":" + stackTrace[i].getLineNumber();
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        int length;
        if (objArr == null || (length = objArr.length) == 0) {
            return null;
        }
        Object obj = objArr[length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void i(String str, String str2, Object... objArr) {
        String log = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.i(normalizeTag(str), log, throwableToLog);
        } else {
            android.util.Log.i(normalizeTag(str), log);
        }
    }

    public static String normalizeTag(String str) {
        if (str.startsWith(sTagPrefix)) {
            return str;
        }
        return sTagPrefix.concat(String.valueOf(str.substring(true != str.startsWith(sDeprecatedTagPrefix) ? 0 : 3, str.length())));
    }

    public static void w(String str, String str2, Object... objArr) {
        String log = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.w(normalizeTag(str), log, throwableToLog);
        } else {
            android.util.Log.w(normalizeTag(str), log);
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        String log = formatLog(str2, objArr);
        Throwable throwableToLog = getThrowableToLog(objArr);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag(str), log, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag(str), log);
        }
    }

    public static void d(String str, String str2, Object obj) {
        debug(str, str2, obj);
    }
}
