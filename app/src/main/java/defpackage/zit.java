package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zit {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zix b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [zix] */
    static {
        ziz zizVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zizVar = new ziz();
                break;
            }
            zizVar = null;
            try {
                zizVar = (zix) Class.forName(a[i]).asSubclass(zix.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zizVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = zizVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.b(i, "skip count cannot be negative: "));
        }
        return b.a(cls, i + 1);
    }

    public static StackTraceElement[] b(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
