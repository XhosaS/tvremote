package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fem {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(fel felVar, fek fekVar) {
        if (this.c > 0) {
            felVar.e(this.d, this.e, this.f, this.g, fekVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(fel felVar, long j, int i, int i2, int i3, fek fekVar) {
        eci.b(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(felVar, fekVar);
            }
        }
    }

    public final void d(fdq fdqVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        fdqVar.i(bArr, 0, 10);
        fdqVar.k();
        int[] iArr = fcv.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
