package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olk extends ocg implements Parcelable {
    public static final Parcelable.Creator<olk> CREATOR = new oeg(7);
    public final Integer a;

    public olk(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.Q(this.a, ((olk) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iV = ocv.v(parcel);
        ocv.J(parcel, 2, num);
        ocv.x(parcel, iV);
    }
}
