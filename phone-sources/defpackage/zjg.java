package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjg extends IllegalStateException {
    private Throwable a;

    public zjg(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public zjg(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
