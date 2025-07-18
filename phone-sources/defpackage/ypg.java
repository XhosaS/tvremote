package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypg extends Exception {
    public final Throwable a;

    public ypg(Throwable th, yot yotVar, yil yilVar) {
        super(a.ck(yilVar, yotVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
