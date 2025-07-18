package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oik extends ocg {
    public static final Parcelable.Creator<oik> CREATOR = new odt(18);
    public boolean a;
    public long b;
    public String c;
    public byte[][] d;
    public oif[] e;
    public boolean f;
    public oid[] g;

    public oik() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oik) {
            oik oikVar = (oik) obj;
            if (a.Q(Boolean.valueOf(this.a), Boolean.valueOf(oikVar.a)) && a.Q(Long.valueOf(this.b), Long.valueOf(oikVar.b)) && a.Q(this.c, oikVar.c) && Arrays.equals(this.d, oikVar.d) && Arrays.equals(this.e, oikVar.e) && a.Q(Boolean.valueOf(this.f), Boolean.valueOf(oikVar.f)) && Arrays.equals(this.g, oikVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(Arrays.deepHashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Boolean.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, this.a);
        ocv.C(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.G(parcel, 4, this.d);
        ocv.R(parcel, 5, this.e, i);
        ocv.y(parcel, 6, this.f);
        ocv.R(parcel, 7, this.g, i);
        ocv.x(parcel, iV);
    }

    public oik(boolean z, long j, String str, byte[][] bArr, oif[] oifVarArr, boolean z2, oid[] oidVarArr) {
        this.a = z;
        this.b = j;
        this.c = str;
        this.d = bArr;
        this.e = oifVarArr;
        this.f = z2;
        this.g = oidVarArr;
    }
}
