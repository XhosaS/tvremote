package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class xvx implements Runnable {
    private final xqo a;

    protected xvx(xqo xqoVar) {
        this.a = xqoVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        xqo xqoVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.c(xqoVarA);
        }
    }
}
