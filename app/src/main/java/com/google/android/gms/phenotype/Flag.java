package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.kkk;
import defpackage.kkx;
import defpackage.lre;
import defpackage.lse;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new lre();
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
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

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    final void a(StringBuilder sb) {
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
            kkk.k(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError("Invalid type: " + str + ", " + i);
            }
            sb.append("'");
            byte[] bArr = this.f;
            kkk.k(bArr);
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

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Flag flag = (Flag) obj;
        int iCompareTo = this.a.compareTo(flag.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.g;
        int iB = b(i, flag.g);
        if (iB != 0) {
            return iB;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.b;
            long j2 = flag.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == flag.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, flag.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = flag.e;
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
            throw new AssertionError(a.b(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = flag.f;
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
                return b(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (lse.a(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h && this.i == flag.i) {
                if (i == 1) {
                    return this.b == flag.b;
                }
                if (i == 2) {
                    return this.c == flag.c;
                }
                if (i == 3) {
                    return this.d == flag.d;
                }
                if (i == 4) {
                    return lse.a(this.e, flag.e);
                }
                if (i == 5) {
                    return Arrays.equals(this.f, flag.f);
                }
                throw new AssertionError(a.b(i, "Invalid enum value: "));
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        String str = this.a;
        if (!lre.b(str)) {
            kkx.r(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            kkx.g(parcel, 3, j);
        }
        if (this.c) {
            kkx.c(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            kkx.e(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (!lre.b(str2)) {
            kkx.r(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (!lre.b(bArr)) {
            kkx.j(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (!lre.a(i2)) {
            kkx.f(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!lre.a(i3)) {
            kkx.f(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!lre.a(i4)) {
            kkx.f(parcel, 10, i4);
        }
        kkx.b(parcel, iA);
    }
}
