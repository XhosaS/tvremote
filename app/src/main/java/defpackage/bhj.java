package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bhj {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ bhk j;

    public bhj(bhk bhkVar, int i, int i2) {
        this.j = bhkVar;
        this.a = i;
        this.b = i2;
        b();
    }

    final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    final void b() {
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            bhk bhkVar = this.j;
            int[] iArr = bhkVar.a;
            int[] iArr2 = bhkVar.b;
            int i9 = iArr[i8];
            i += iArr2[i9];
            int iC = bhk.c(i9);
            int iB = bhk.b(i9);
            int i10 = i9 & 31;
            if (iC > i2) {
                i2 = iC;
            }
            if (iC < i4) {
                i4 = iC;
            }
            if (iB > i7) {
                i7 = iB;
            }
            if (iB < i5) {
                i5 = iB;
            }
            if (i10 > i3) {
                i3 = i10;
            }
            if (i10 < i6) {
                i6 = i10;
            }
        }
        this.d = i4;
        this.e = i2;
        this.f = i5;
        this.g = i7;
        this.h = i6;
        this.i = i3;
        this.c = i;
    }

    final boolean c() {
        return (this.b + 1) - this.a > 1;
    }
}
