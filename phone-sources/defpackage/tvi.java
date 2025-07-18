package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvi extends tuq {
    private final StackTraceElement b;

    public tvi(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.tuq
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.tuq
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.tuq
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.tuq
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tvi) && this.b.equals(((tvi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
