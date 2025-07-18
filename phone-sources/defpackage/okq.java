package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okq extends ocg {
    public static final Parcelable.Creator<okq> CREATOR = new oeg(1);
    public final okp a;
    public final okn b;

    public okq(okp okpVar, okn oknVar) {
        this.a = okpVar;
        this.b = oknVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof okq) {
            okq okqVar = (okq) obj;
            if (a.Q(this.a, okqVar.a) && a.Q(this.b, okqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        okp okpVar = this.a;
        int iV = ocv.v(parcel);
        int i2 = i | 1;
        ocv.N(parcel, 1, okpVar, i2);
        ocv.N(parcel, 2, this.b, i2);
        ocv.x(parcel, iV);
    }
}
