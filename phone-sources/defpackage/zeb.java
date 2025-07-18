package defpackage;

import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeb {
    public final zgm c;
    public int e;
    public int f;
    private int g;
    public int a = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    public final List b = new ArrayList();
    public zea[] d = new zea[8];

    public zeb(zho zhoVar) {
        this.c = new zhi(zhoVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i < 0) {
            return false;
        }
        zea[] zeaVarArr = zed.a;
        int length = zed.a.length;
        return i <= 60;
    }

    private final int i() {
        return zcr.x(this.c.d());
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i();
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final zgn c(int i) {
        if (h(i)) {
            zea[] zeaVarArr = zed.a;
            return zed.a[i].g;
        }
        zea[] zeaVarArr2 = zed.a;
        int length = zed.a.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            zea[] zeaVarArr3 = this.d;
            if (iA < zeaVarArr3.length) {
                zea zeaVar = zeaVarArr3[iA];
                zeaVar.getClass();
                return zeaVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final zgn d() {
        int i;
        int i2;
        int i3 = i();
        int i4 = i3 & 128;
        long jB = b(i3, 127);
        if (i4 != 128) {
            return this.c.t(jB);
        }
        zgk zgkVar = new zgk();
        int[] iArr = zfe.a;
        zgm zgmVar = this.c;
        zfd zfdVar = zfe.c;
        int i5 = 0;
        zfd zfdVar2 = zfdVar;
        long j = 0;
        int i6 = 0;
        while (j < jB) {
            int iX = zcr.x(zgmVar.d());
            int i7 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i7 | iX;
                if (i6 >= 8) {
                    int i8 = i6 - 8;
                    Object obj = zfdVar2.c;
                    obj.getClass();
                    zfdVar2 = ((zfd[]) obj)[(i2 >>> i8) & 255];
                    zfdVar2.getClass();
                    if (zfdVar2.c == null) {
                        zgkVar.M(zfdVar2.a);
                        i6 -= zfdVar2.b;
                        zfdVar2 = zfdVar;
                    } else {
                        i6 = i8;
                    }
                }
            }
            j++;
            i5 = i2;
        }
        while (i6 > 0) {
            Object obj2 = zfdVar2.c;
            obj2.getClass();
            zfd zfdVar3 = ((zfd[]) obj2)[(i5 << (8 - i6)) & 255];
            zfdVar3.getClass();
            if (zfdVar3.c != null || (i = zfdVar3.b) > i6) {
                break;
            }
            zgkVar.M(zfdVar3.a);
            i6 -= i;
            zfdVar2 = zfdVar;
        }
        return zgkVar.s();
    }

    public final void e() {
        zea[] zeaVarArr = this.d;
        yfm.aD(zeaVarArr, null, 0, zeaVarArr.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                zea zeaVar = this.d[length];
                zeaVar.getClass();
                int i4 = this.f;
                int i5 = zeaVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            zea[] zeaVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(zeaVarArr, i6, zeaVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(zea zeaVar) {
        this.b.add(zeaVar);
        int i = zeaVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        zea[] zeaVarArr = this.d;
        int length = zeaVarArr.length;
        if (i3 > length) {
            zea[] zeaVarArr2 = new zea[length + length];
            System.arraycopy(zeaVarArr, 0, zeaVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = zeaVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.d[i4] = zeaVar;
        this.e++;
        this.f += i;
    }
}
