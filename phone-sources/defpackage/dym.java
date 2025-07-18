package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dym {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public static final String h = edt.Z(7);
    public static final String i = edt.Z(8);
    public static final String j = edt.Z(9);
    public static final String k = edt.Z(10);
    public final long l;
    public final int m;

    @Deprecated
    public final Uri[] n;
    public final dzy[] o;
    public final int[] p;
    public final long[] q;
    public final String[] r;
    public final long s;
    public final boolean t;

    public dym(int i2, int[] iArr, dzy[] dzyVarArr, long[] jArr, String[] strArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = dzyVarArr.length;
        int i3 = 0;
        a.H(length == length2);
        this.l = 0L;
        this.m = i2;
        this.p = iArr;
        this.o = dzyVarArr;
        this.q = jArr;
        this.s = 0L;
        this.t = false;
        this.n = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.n;
            if (i3 >= uriArr.length) {
                this.r = strArr;
                return;
            }
            dzy dzyVar = dzyVarArr[i3];
            if (dzyVar == null) {
                uri = null;
            } else {
                dzt dztVar = dzyVar.c;
                dztVar.getClass();
                uri = dztVar.i;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.p;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean c() {
        return this.m == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dym dymVar = (dym) obj;
            if (this.m == dymVar.m && Arrays.equals(this.o, dymVar.o) && Arrays.equals(this.p, dymVar.p) && Arrays.equals(this.q, dymVar.q) && Arrays.equals(this.r, dymVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.m * 31) - 1) * 961) + Arrays.hashCode(this.o)) * 31) + Arrays.hashCode(this.p)) * 31) + Arrays.hashCode(this.q)) * 29791) + Arrays.hashCode(this.r)) * 31;
    }
}
