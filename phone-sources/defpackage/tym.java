package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tym {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final typ b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [typ] */
    static {
        tyr tyrVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                tyrVar = new tyr();
                break;
            }
            tyrVar = null;
            try {
                tyrVar = (typ) Class.forName(a[i]).asSubclass(typ.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (tyrVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = tyrVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.cf(i, "skip count cannot be negative: "));
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
