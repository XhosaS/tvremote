package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olp extends ocg implements Parcelable {
    public static final Parcelable.Creator<olp> CREATOR = new oeg(13);
    public final olo a;
    public final String b;
    public final String c;

    public olp(olo oloVar, String str, String str2) {
        this.a = oloVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olp)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olp olpVar = (olp) obj;
        return a.Q(this.a, olpVar.a) && a.Q(this.b, olpVar.b) && a.Q(this.c, olpVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        olo oloVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, oloVar, i);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
