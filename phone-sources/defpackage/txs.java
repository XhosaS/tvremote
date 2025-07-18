package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txs extends twt {
    public static final twt a = new txs();

    private txs() {
    }

    @Override // defpackage.twt
    public final tuq a(Class<?> cls, int i) {
        StackTraceElement stackTraceElementA = tym.a(cls, i + 1);
        return stackTraceElementA != null ? new tvi(stackTraceElementA) : tuq.a;
    }

    @Override // defpackage.twt
    public final String b(Class<? extends ttz<?>> cls) {
        StackTraceElement stackTraceElementA = tym.a(cls, 1);
        if (stackTraceElementA != null) {
            return stackTraceElementA.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
