package defpackage;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zec {
    public final zgk a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public int d = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
    public zea[] e = new zea[8];

    public zec(zgk zgkVar) {
        this.a = zgkVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        zea[] zeaVarArr = this.e;
        yfm.aD(zeaVarArr, null, 0, zeaVarArr.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(zea zeaVar) {
        int i = zeaVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        zea[] zeaVarArr = this.e;
        int length = zeaVarArr.length;
        if (i3 > length) {
            zea[] zeaVarArr2 = new zea[length + length];
            System.arraycopy(zeaVarArr, 0, zeaVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = zeaVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = zeaVar;
        this.g++;
        this.h += i;
    }

    public final void c(zgn zgnVar) {
        long j;
        int[] iArr = zfe.a;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < zgnVar.c(); i2++) {
            j2 += zfe.b[zcr.x(zgnVar.a(i2))];
        }
        if (((int) ((j2 + 7) >> 3)) >= zgnVar.c()) {
            d(zgnVar.c(), 127, 0);
            this.a.J(zgnVar);
            return;
        }
        zgk zgkVar = new zgk();
        int iC = zgnVar.c();
        long j3 = 0;
        int i3 = 0;
        while (i < iC) {
            int iX = zcr.x(zgnVar.a(i));
            int i4 = zfe.a[iX];
            byte b = zfe.b[iX];
            long j4 = j3 << b;
            long j5 = i4;
            i3 += b;
            while (true) {
                j = j4 | j5;
                if (i3 >= 8) {
                    i3 -= 8;
                    zgkVar.M((int) (j >> i3));
                }
            }
            i++;
            j3 = j;
        }
        if (i3 > 0) {
            zgkVar.M((int) ((255 >>> i3) | (j3 << (8 - i3))));
        }
        zgn zgnVarS = zgkVar.s();
        d(zgnVarS.c(), 127, 128);
        this.a.J(zgnVarS);
    }

    public final void d(int i, int i2, int i3) {
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

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                zea zeaVar = this.e[length];
                zeaVar.getClass();
                int i4 = this.h;
                zeaVar.getClass();
                int i5 = zeaVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            zea[] zeaVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(zeaVarArr, i6, zeaVarArr, i6 + i3, this.g);
            zea[] zeaVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(zeaVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
