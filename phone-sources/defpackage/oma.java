package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oma extends ocg implements Comparable<oma> {
    public static final Parcelable.Creator<oma> CREATOR = new oeg(20);
    public final String a;
    final long b;
    final boolean c;
    final double d;
    final String e;
    final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public oma(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        if (this.g != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        String str = this.e;
        ocv.aF(str);
        return str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(oma omaVar) {
        oma omaVar2 = omaVar;
        int iCompareTo = this.a.compareTo(omaVar2.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.g;
        int iG = g(i, omaVar2.g);
        if (iG != 0) {
            return iG;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.b;
            long j2 = omaVar2.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == omaVar2.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, omaVar2.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = omaVar2.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.cf(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = omaVar2.f;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i2 >= Math.min(length2, length)) {
                return g(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    final void d(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            ocv.aF(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError(a.cy(i, str, "Invalid type: ", ", "));
            }
            sb.append("'");
            byte[] bArr = this.f;
            ocv.aF(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof oma) {
            oma omaVar = (oma) obj;
            if (a.Q(this.a, omaVar.a) && (i = this.g) == omaVar.g && this.h == omaVar.h && this.i == omaVar.i) {
                if (i == 1) {
                    return this.b == omaVar.b;
                }
                if (i == 2) {
                    return this.c == omaVar.c;
                }
                if (i == 3) {
                    return this.d == omaVar.d;
                }
                if (i == 4) {
                    return a.Q(this.e, omaVar.e);
                }
                if (i == 5) {
                    return Arrays.equals(this.f, omaVar.f);
                }
                throw new AssertionError(a.cf(i, "Invalid enum value: "));
            }
        }
        return false;
    }

    public final byte[] f() {
        if (this.g != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        byte[] bArr = this.f;
        ocv.aF(bArr);
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        String str = this.a;
        if (!oeg.b(str)) {
            ocv.O(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            ocv.C(parcel, 3, j);
        }
        if (this.c) {
            ocv.y(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            ocv.z(parcel, 5, d);
        }
        String str2 = this.e;
        if (!oeg.b(str2)) {
            ocv.O(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!oeg.b(bArr)) {
            ocv.F(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!oeg.a(i2)) {
            ocv.B(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!oeg.a(i3)) {
            ocv.B(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!oeg.a(i4)) {
            ocv.B(parcel, 10, i4);
        }
        ocv.x(parcel, iV);
    }
}
