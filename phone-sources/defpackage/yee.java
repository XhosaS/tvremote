package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yee {
    public final zgk a;
    yec[] b = new yec[8];
    int c;
    public int d;
    private int e;

    public yee(zgk zgkVar) {
        this.d = r0.length - 1;
        this.a = zgkVar;
    }

    public final void a(yec yecVar) {
        int i;
        int i2 = yecVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            yec[] yecVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(yecVarArr, i6, yecVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        yec[] yecVarArr2 = this.b;
        int length2 = yecVarArr2.length;
        if (i7 > length2) {
            yec[] yecVarArr3 = new yec[length2 + length2];
            System.arraycopy(yecVarArr2, 0, yecVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = yecVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = yecVar;
        this.c++;
        this.e += i2;
    }

    final void b(zgn zgnVar) {
        c(zgnVar.c(), 127, 0);
        this.a.J(zgnVar);
    }

    final void c(int i, int i2, int i3) {
        if (i < i2) {
            this.a.M(i | i3);
            return;
        }
        zgk zgkVar = this.a;
        zgkVar.M(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            zgkVar.M(128 | (i4 & 127));
            i4 >>>= 7;
        }
        zgkVar.M(i4);
    }
}
