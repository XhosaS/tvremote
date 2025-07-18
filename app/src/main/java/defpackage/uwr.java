package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwr implements egx {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private final int[] f;
    private int g;

    public uwr(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = new int[i4];
    }

    @Override // defpackage.egx
    public final int a() {
        return this.g;
    }

    @Override // defpackage.egx
    public final void b(ejm ejmVar, int i, int i2) {
        int[] iArr = this.f;
        int i3 = this.e;
        int i4 = iArr[i3];
        if (1 == this.c) {
            i = i2;
        }
        int i5 = i4 + i;
        iArr[i3] = i5;
        this.g = Math.max(this.g, i5);
        int i6 = this.e + 1;
        this.e = i6;
        if (i6 == this.d) {
            this.e = 0;
        }
    }

    @Override // defpackage.egx
    public final boolean c() {
        return this.g < (this.c == 1 ? this.b : this.a);
    }
}
