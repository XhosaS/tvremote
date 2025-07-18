package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfb extends zei {
    private final StackTraceElement b;

    public zfb(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.zei
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.zei
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.zei
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.zei
    public final String e() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zfb) && this.b.equals(((zfb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
