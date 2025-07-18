package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyt {
    public static final dyt a = new dyt(1, 2, 3, null, -1, -1);
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public static final String e = edt.Z(3);
    public static final String f = edt.Z(4);
    public static final String g = edt.Z(5);
    public final int h;
    public final int i;
    public final int j;
    public final byte[] k;
    public final int l;
    public final int m;
    private int n;

    public dyt(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = bArr;
        this.l = i4;
        this.m = i5;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String c(int i) {
        return i != -1 ? i != 1 ? i != 2 ? a.cf(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String d(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? a.cf(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String e(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? a.cf(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean h(dyt dytVar) {
        if (dytVar == null) {
            return true;
        }
        int i = dytVar.h;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = dytVar.i;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = dytVar.j;
        if ((i3 != -1 && i3 != 3) || dytVar.k != null) {
            return false;
        }
        int i4 = dytVar.m;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = dytVar.l;
        return i5 == -1 || i5 == 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyt dytVar = (dyt) obj;
            if (this.h == dytVar.h && this.i == dytVar.i && this.j == dytVar.j && Arrays.equals(this.k, dytVar.k) && this.l == dytVar.l && this.m == dytVar.m) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.l == -1 || this.m == -1) ? false : true;
    }

    public final boolean g() {
        return (this.h == -1 || this.i == -1 || this.j == -1) ? false : true;
    }

    public final int hashCode() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((this.h + 527) * 31) + this.i) * 31) + this.j) * 31) + Arrays.hashCode(this.k)) * 31) + this.l) * 31) + this.m;
        this.n = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.l;
        int i2 = this.j;
        int i3 = this.i;
        String strD = d(this.h);
        String strC = c(i3);
        String strE = e(i2);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i4 = this.m;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        return "ColorInfo(" + strD + ", " + strC + ", " + strE + ", " + (this.k != null) + ", " + str + ", " + str2 + ")";
    }
}
