package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkp extends ocg {
    public static final Parcelable.Creator<nkp> CREATOR = new nhv(17);
    public final String a;
    public final String b;

    public nkp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkp)) {
            return false;
        }
        nkp nkpVar = (nkp) obj;
        return a.Q(this.a, nkpVar.a) && a.Q(this.b, nkpVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.O(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
