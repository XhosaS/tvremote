package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agdl {
    public final ahwx a;
    agdj[] b = new agdj[8];
    int c;
    public int d;
    private int e;

    public agdl(ahwx ahwxVar) {
        this.d = r0.length - 1;
        this.a = ahwxVar;
    }

    public final void a(agdj agdjVar) {
        int i;
        int i2 = agdjVar.h;
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
            agdj[] agdjVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(agdjVarArr, i6, agdjVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        agdj[] agdjVarArr2 = this.b;
        int length2 = agdjVarArr2.length;
        if (i7 > length2) {
            agdj[] agdjVarArr3 = new agdj[length2 + length2];
            System.arraycopy(agdjVarArr2, 0, agdjVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = agdjVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        this.b[i8] = agdjVar;
        this.c++;
        this.e += i2;
    }

    final void b(ahxb ahxbVar) {
        c(ahxbVar.b(), 127, 0);
        ahxbVar.k(this.a, ahxbVar.b());
    }

    final void c(int i, int i2, int i3) {
        if (i < i2) {
            this.a.u(i | i3);
            return;
        }
        ahwx ahwxVar = this.a;
        ahwxVar.u(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            ahwxVar.u(128 | (i4 & 127));
            i4 >>>= 7;
        }
        ahwxVar.u(i4);
    }
}
