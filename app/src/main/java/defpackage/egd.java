package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class egd implements egx {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;

    public egd(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.egx
    public final int a() {
        return this.e;
    }

    @Override // defpackage.egx
    public final void b(ejm ejmVar, int i, int i2) {
        if (this.f == 0) {
            int i3 = this.e;
            if (1 == this.c) {
                i = i2;
            }
            this.e = i3 + i;
        }
        if (ejmVar.g()) {
            this.f = 0;
            return;
        }
        int iA = this.f + ejmVar.a();
        this.f = iA;
        if (iA == this.d) {
            this.f = 0;
        }
    }

    @Override // defpackage.egx
    public final boolean c() {
        return this.e < (this.c == 1 ? this.b : this.a);
    }
}
