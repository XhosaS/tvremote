package defpackage;

import android.os.Parcel;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oef extends ocg {
    public static final oeg CREATOR = new oeg(0);
    final String a;
    final String b;
    final String[] c;
    final int d;
    final boolean e;

    public oef(String str, String str2, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.cf(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oef oefVar = (oef) obj;
            if (this.e == oefVar.e && this.d == oefVar.d && this.a.equals(oefVar.a) && this.b.equals(oefVar.b) && Arrays.equals(this.c, oefVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.P(parcel, 3, this.c);
        ocv.B(parcel, 4, this.d);
        ocv.y(parcel, 5, this.e);
        ocv.O(parcel, 6, this.b);
        ocv.x(parcel, iV);
    }
}
