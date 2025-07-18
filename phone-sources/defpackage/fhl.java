package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhl {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final edi f;
    private final edi g;
    private int h;
    private int i;

    public fhl(edi ediVar, edi ediVar2, boolean z) throws eaf {
        this.g = ediVar;
        this.f = ediVar2;
        this.e = z;
        ediVar2.K(12);
        this.a = ediVar2.m();
        ediVar.K(12);
        this.i = ediVar.m();
        fki.W(ediVar.e() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.s() : this.f.r();
        if (this.b == this.h) {
            edi ediVar = this.g;
            this.c = ediVar.m();
            ediVar.L(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + ediVar.m() : -1;
        }
        return true;
    }
}
