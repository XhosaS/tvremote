package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olj extends ocg implements Parcelable {
    public static final Parcelable.Creator<olj> CREATOR = new oeg(6);
    public final olo a;
    public final Long b;

    public olj(olo oloVar, Long l) {
        this.a = oloVar;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olj oljVar = (olj) obj;
        return a.Q(this.a, oljVar.a) && a.Q(this.b, oljVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        olo oloVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, oloVar, i);
        ocv.M(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
