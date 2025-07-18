package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ffh {
    protected final fel d;

    protected ffh(fel felVar) {
        this.d = felVar;
    }

    protected abstract boolean a(edi ediVar);

    protected abstract boolean b(edi ediVar, long j);

    public final boolean c(edi ediVar, long j) {
        return a(ediVar) && b(ediVar, j);
    }
}
