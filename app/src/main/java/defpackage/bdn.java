package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdn implements AutoCloseable, bcj {
    public final bdl a;
    public boolean b;
    private final String c;

    public bdn(String str, bdl bdlVar) {
        this.c = str;
        this.a = bdlVar;
    }

    @Override // defpackage.bcj
    public final void a(bcl bclVar, bce bceVar) {
        if (bceVar == bce.ON_DESTROY) {
            this.b = false;
            bclVar.ek().c(this);
        }
    }

    public final void b(bqo bqoVar, bcg bcgVar) {
        if (this.b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.b = true;
        bcgVar.b(this);
        bqoVar.a(this.c, this.a.b.a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
