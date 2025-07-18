package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olr extends ocg implements Parcelable {
    public static final Parcelable.Creator<olr> CREATOR = new oeg(15);
    public final String a;
    public final Integer b;
    public final Integer c;

    public olr(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olr)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olr olrVar = (olr) obj;
        return a.Q(this.a, olrVar.a) && a.Q(this.b, olrVar.b) && a.Q(this.c, olrVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.J(parcel, 3, this.b);
        ocv.J(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
