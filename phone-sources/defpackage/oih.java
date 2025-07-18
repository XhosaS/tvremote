package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oih extends ocg {
    public static final Parcelable.Creator<oih> CREATOR = new oii();
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public final long f;
    public ParcelFileDescriptor g;
    public Uri h;
    public final long i;
    public final boolean j;
    public oid k;
    public final long l;
    public String m;
    public String n;
    public oij o;
    public oik p;
    public oig q;
    public int r;

    public oih() {
        this.f = -1L;
        this.i = 0L;
        this.j = false;
        this.l = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oih) {
            oih oihVar = (oih) obj;
            if (a.Q(Long.valueOf(this.a), Long.valueOf(oihVar.a)) && a.Q(Integer.valueOf(this.b), Integer.valueOf(oihVar.b)) && Arrays.equals(this.c, oihVar.c) && a.Q(this.d, oihVar.d) && a.Q(this.e, oihVar.e) && a.Q(Long.valueOf(this.f), Long.valueOf(oihVar.f)) && a.Q(this.g, oihVar.g) && a.Q(this.h, oihVar.h) && a.Q(Long.valueOf(this.i), Long.valueOf(oihVar.i)) && a.Q(Boolean.valueOf(this.j), Boolean.valueOf(oihVar.j)) && a.Q(this.k, oihVar.k) && a.Q(Long.valueOf(this.l), Long.valueOf(oihVar.l)) && a.Q(this.m, oihVar.m) && a.Q(this.n, oihVar.n) && a.Q(this.o, oihVar.o) && a.Q(this.p, oihVar.p) && a.Q(this.q, oihVar.q) && a.Q(Integer.valueOf(this.r), Integer.valueOf(oihVar.r))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Long.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), Boolean.valueOf(this.j), this.k, Long.valueOf(this.l), this.m, this.n, this.o, this.p, this.q, Integer.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.C(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.F(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.O(parcel, 5, this.e);
        ocv.C(parcel, 6, this.f);
        ocv.N(parcel, 7, this.g, i);
        ocv.N(parcel, 8, this.h, i);
        ocv.C(parcel, 9, this.i);
        ocv.y(parcel, 10, this.j);
        ocv.N(parcel, 11, this.k, i);
        ocv.C(parcel, 12, this.l);
        ocv.O(parcel, 13, this.m);
        ocv.O(parcel, 14, this.n);
        ocv.N(parcel, 15, this.o, i);
        ocv.N(parcel, 16, this.p, i);
        ocv.B(parcel, 17, this.r);
        ocv.N(parcel, 18, this.q, i);
        ocv.x(parcel, iV);
    }

    public oih(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri, long j3, boolean z, oid oidVar, long j4, String str2, String str3, oij oijVar, oik oikVar, oig oigVar, int i2) {
        this.a = j;
        this.b = i;
        this.c = bArr;
        this.d = parcelFileDescriptor;
        this.e = str;
        this.f = j2;
        this.g = parcelFileDescriptor2;
        this.h = uri;
        this.i = j3;
        this.j = z;
        this.k = oidVar;
        this.l = j4;
        this.m = str2;
        this.n = str3;
        this.o = oijVar;
        this.p = oikVar;
        this.q = oigVar;
        this.r = i2;
    }
}
