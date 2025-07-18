package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oll extends ocg implements Parcelable {
    public static final Parcelable.Creator<oll> CREATOR = new oeg(8);
    public final olo a;
    public final String b;

    public oll(olo oloVar, String str) {
        this.a = oloVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oll)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        oll ollVar = (oll) obj;
        return a.Q(this.a, ollVar.a) && a.Q(this.b, ollVar.b);
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
