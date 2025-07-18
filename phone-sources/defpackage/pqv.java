package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqv extends ocv {
    protected final pqw b;
    protected final Runnable c;

    public pqv(pqw pqwVar) {
        super((short[]) null);
        this.c = new pqi(this, 5);
        this.b = pqwVar;
    }

    @Override // defpackage.ocv
    public final void bE(int i) {
        this.b.g(this.c);
    }

    @Override // defpackage.ocv
    public final void bF() {
        this.b.f(this.c);
    }
}
