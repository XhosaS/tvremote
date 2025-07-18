package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhu extends zgq {
    public static final zgq a = new zhu();

    private zhu() {
    }

    @Override // defpackage.zgq
    public final zei a(Class cls, int i) {
        StackTraceElement stackTraceElementA = zit.a(cls, i + 1);
        return stackTraceElementA != null ? new zfb(stackTraceElementA) : zei.a;
    }

    @Override // defpackage.zgq
    public final String b(Class cls) {
        StackTraceElement stackTraceElementA = zit.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
