package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omv extends ocg {
    public static final Parcelable.Creator<omv> CREATOR = new omd(3);
    public final String a;

    public omv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof omv) {
            return a.Q(this.a, ((omv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.x(parcel, iV);
    }
}
