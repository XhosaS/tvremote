package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daa extends IllegalStateException {
    private Throwable a;

    public daa(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public daa(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
