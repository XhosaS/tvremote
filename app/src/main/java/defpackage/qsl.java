package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class qsl {
    public int a = 1;

    public abstract void g(qpi qpiVar);

    public abstract void j(qpi qpiVar);

    public final void k(qpi qpiVar) {
        if (this.a == 3) {
            return;
        }
        this.a = 3;
        g(qpiVar);
    }

    public final void l(qpi qpiVar) {
        if (this.a == 2) {
            return;
        }
        this.a = 2;
        j(qpiVar);
    }
}
