package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxn {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object objE;
        Object objE2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objE = Class.forName("yit").getCanonicalName();
        } catch (Throwable th) {
            objE = ybn.e(th);
        }
        if (yfy.a(objE) != null) {
            objE = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objE;
        try {
            objE2 = Class.forName("yxn").getCanonicalName();
        } catch (Throwable th2) {
            objE2 = ybn.e(th2);
        }
        if (yfy.a(objE2) != null) {
            objE2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.yiw r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxn.a(java.lang.Throwable, yiw):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable thA;
        if (!yoy.b || (thA = ywx.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (yks.e(c, stackTrace[i].getClassName())) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
            i = -1;
        } else {
            i = -1;
        }
        int iE = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (iE == -1 ? 0 : length - iE);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (yks.e(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return ylh.ac(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (yks.e(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
