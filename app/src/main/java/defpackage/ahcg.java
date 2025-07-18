package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcg extends Exception {
    public final Throwable a;

    public ahcg(Throwable th, ahbm ahbmVar, agte agteVar) {
        super(a.d(agteVar, ahbmVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
