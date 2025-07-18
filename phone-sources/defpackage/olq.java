package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olq extends ocg implements Parcelable {
    public static final Parcelable.Creator<olq> CREATOR = new oeg(14);
    public final olo a;
    public final String b;

    public olq(olo oloVar, String str) {
        this.a = oloVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olq)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olq olqVar = (olq) obj;
        return a.Q(this.a, olqVar.a) && a.Q(this.b, olqVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        olo oloVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, oloVar, i);
        ocv.O(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
