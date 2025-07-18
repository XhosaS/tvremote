package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhr implements fhn {
    private final edi a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public fhr(edx edxVar) {
        edi ediVar = edxVar.a;
        this.a = ediVar;
        ediVar.K(12);
        this.c = ediVar.m() & 255;
        this.b = ediVar.m();
    }

    @Override // defpackage.fhn
    public final int a() {
        return -1;
    }

    @Override // defpackage.fhn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fhn
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.j();
        }
        if (i == 16) {
            return this.a.n();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iJ = this.a.j();
        this.e = iJ;
        return (iJ & 240) >> 4;
    }
}
