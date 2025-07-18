package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxw extends IllegalStateException {
    private final Throwable a;

    public zxw(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
