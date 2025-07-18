package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohq extends ocg {
    public static final Parcelable.Creator<ohq> CREATOR = new odt(10);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ohq);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ocv.x(parcel, ocv.v(parcel));
    }
}
