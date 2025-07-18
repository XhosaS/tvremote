package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdk {
    public final ahwz b;
    int f;
    public final List a = new ArrayList();
    agdj[] e = new agdj[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public agdk(ahxq ahxqVar) {
        this.f = r0.length - 1;
        this.b = new ahxk(ahxqVar);
    }

    private final int h() {
        return this.b.c() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            agdj[] agdjVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(agdjVarArr, i5, agdjVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int iH = h();
            if ((iH & 128) == 0) {
                return i2 + (iH << i4);
            }
            i2 += (iH & 127) << i4;
            i4 += 7;
        }
    }

    public final ahxb c(int i) throws IOException {
        if (f(i)) {
            return agdm.b[i].f;
        }
        int length = agdm.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            agdj[] agdjVarArr = this.e;
            if (iA < agdjVarArr.length) {
                return agdjVarArr[iA].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final ahxb d() throws EOFException {
        int i;
        int i2;
        int iH = h();
        int i3 = iH & 128;
        long jB = b(iH, 127);
        if (i3 != 128) {
            return this.b.j(jB);
        }
        ahwz ahwzVar = this.b;
        agdt agdtVar = agdt.a;
        ahxk ahxkVar = (ahxk) ahwzVar;
        ahxkVar.n(jB);
        byte[] bArrQ = ahxkVar.b.q(jB);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        agds agdsVar = agdtVar.b;
        int i4 = 0;
        agds agdsVar2 = agdsVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < bArrQ.length) {
            int i7 = bArrQ[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    agdsVar2 = agdsVar2.a[(i2 >>> i9) & 255];
                    if (agdsVar2.a == null) {
                        byteArrayOutputStream.write(agdsVar2.b);
                        i6 -= agdsVar2.c;
                        agdsVar2 = agdsVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i2;
        }
        while (i6 > 0) {
            agds agdsVar3 = agdsVar2.a[(i5 << (8 - i6)) & 255];
            if (agdsVar3.a != null || (i = agdsVar3.c) > i6) {
                break;
            }
            byteArrayOutputStream.write(agdsVar3.b);
            i6 -= i;
            agdsVar2 = agdsVar;
        }
        return ahxb.a.b(byteArrayOutputStream.toByteArray());
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final boolean f(int i) {
        if (i < 0) {
            return false;
        }
        int length = agdm.b.length;
        return i <= 60;
    }

    public final void g(agdj agdjVar) {
        this.a.add(agdjVar);
        int i = agdjVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        agdj[] agdjVarArr = this.e;
        int length = agdjVarArr.length;
        if (i3 > length) {
            agdj[] agdjVarArr2 = new agdj[length + length];
            System.arraycopy(agdjVarArr, 0, agdjVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = agdjVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = agdjVar;
        this.g++;
        this.h += i;
    }
}
