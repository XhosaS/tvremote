package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yed {
    public final zgm b;
    int f;
    public final List a = new ArrayList();
    yec[] e = new yec[8];
    int g = 0;
    int h = 0;
    public int c = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    public int d = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    public yed(zho zhoVar) {
        this.f = r0.length - 1;
        this.b = new zhi(zhoVar);
    }

    public static final boolean g(int i) {
        if (i < 0) {
            return false;
        }
        int length = yef.b.length;
        return i <= 60;
    }

    private final int h() {
        return this.b.d() & 255;
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
            yec[] yecVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(yecVarArr, i5, yecVarArr, i5 + i3, this.g);
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

    public final zgn c(int i) throws IOException {
        if (g(i)) {
            return yef.b[i].f;
        }
        int length = yef.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            yec[] yecVarArr = this.e;
            if (iA < yecVarArr.length) {
                return yecVarArr[iA].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final zgn d() {
        int i;
        int i2;
        int iH = h();
        int i3 = iH & 128;
        long jB = b(iH, 127);
        if (i3 != 128) {
            return this.b.t(jB);
        }
        zgm zgmVar = this.b;
        yel yelVar = yel.a;
        byte[] bArrF = zgmVar.F(jB);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zfd zfdVar = yelVar.b;
        int i4 = 0;
        zfd zfdVar2 = zfdVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < bArrF.length) {
            int i7 = bArrF[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    zfdVar2 = ((zfd[]) zfdVar2.c)[(i2 >>> i9) & 255];
                    if (zfdVar2.c == null) {
                        byteArrayOutputStream.write(zfdVar2.a);
                        i6 -= zfdVar2.b;
                        zfdVar2 = zfdVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i2;
        }
        while (i6 > 0) {
            zfd zfdVar3 = ((zfd[]) zfdVar2.c)[(i5 << (8 - i6)) & 255];
            if (zfdVar3.c != null || (i = zfdVar3.b) > i6) {
                break;
            }
            byteArrayOutputStream.write(zfdVar3.a);
            i6 -= i;
            zfdVar2 = zfdVar;
        }
        return zgn.i(byteArrayOutputStream.toByteArray());
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

    public final void f(yec yecVar) {
        this.a.add(yecVar);
        int i = yecVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        yec[] yecVarArr = this.e;
        int length = yecVarArr.length;
        if (i3 > length) {
            yec[] yecVarArr2 = new yec[length + length];
            System.arraycopy(yecVarArr, 0, yecVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = yecVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = yecVar;
        this.g++;
        this.h += i;
    }
}
