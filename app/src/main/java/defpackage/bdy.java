package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdy implements Runnable {
    private final bco a;
    private final bce b;
    private boolean c;

    public bdy(bco bcoVar, bce bceVar) {
        bceVar.getClass();
        this.a = bcoVar;
        this.b = bceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
