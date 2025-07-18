package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olo extends ocg implements Parcelable {
    public static final Parcelable.Creator<olo> CREATOR = new oeg(12);
    public final Integer a;
    public final Boolean b;

    public olo(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olo oloVar = (olo) obj;
        return a.Q(this.a, oloVar.a) && a.Q(this.b, oloVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iV = ocv.v(parcel);
        ocv.J(parcel, 3, num);
        ocv.D(parcel, 4, this.b);
        ocv.x(parcel, iV);
    }
}
