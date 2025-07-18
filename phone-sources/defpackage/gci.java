package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gci {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    final /* synthetic */ gcj j;

    public gci(gcj gcjVar, int i, int i2) {
        this.j = gcjVar;
        this.a = i;
        this.b = i2;
        b();
    }

    public final int a() {
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
            gcj gcjVar = this.j;
            int[] iArr = gcjVar.a;
            int[] iArr2 = gcjVar.b;
            int i9 = iArr[i8];
            i += iArr2[i9];
            int iD = gcj.d(i9);
            int iC = gcj.c(i9);
            int iB = gcj.b(i9);
            if (iD > i2) {
                i2 = iD;
            }
            if (iD < i4) {
                i4 = iD;
            }
            if (iC > i7) {
                i7 = iC;
            }
            if (iC < i5) {
                i5 = iC;
            }
            if (iB > i3) {
                i3 = iB;
            }
            if (iB < i6) {
                i6 = iB;
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
