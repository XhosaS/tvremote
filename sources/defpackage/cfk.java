package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfk {
    public static final cfn a;
    private static final String[] b = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [cfn] */
    static {
        cfo cfoVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                cfoVar = new cfo();
                break;
            }
            cfoVar = null;
            try {
                cfoVar = (cfn) Class.forName(b[i]).asSubclass(cfn.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (cfoVar != null) {
                break;
            } else {
                i++;
            }
        }
        a = cfoVar;
    }
}
