package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msg extends icu {
    public final san g;
    public final rzy h;
    public rzy i;
    public boolean j;
    public boolean k;
    private final mfy l;

    public msg(san sanVar, rzy rzyVar, mfy mfyVar) {
        this.g = sanVar;
        this.h = rzyVar;
        this.l = mfyVar;
        ((mfx) mfyVar).j = this;
        this.j = mfyVar.k();
    }

    public final void a() {
        boolean zK = this.l.k();
        if (this.j != zK) {
            this.j = zK;
            eb();
        }
    }

    final void b(boolean z) {
        if (z != this.k) {
            this.k = z;
            eb();
            this.l.g(true != this.k ? 0 : 100);
        }
    }
}
