package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adh implements bdy {
    private final int a;
    private final int b;
    private final bcb c;
    private int d;

    public adh(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = new bci(fh.q(i, i2, i3), bcz.c);
        this.d = i;
    }

    @Override // defpackage.bdy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ymd a() {
        return (ymd) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            this.c.b(fh.q(i, this.a, this.b));
        }
    }
}
