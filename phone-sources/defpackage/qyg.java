package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyg implements qxl {
    public static final qyg a = new qyg();
    public static final Parcelable.Creator<qyg> CREATOR = new ous(7);

    private qyg() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -962738605;
    }

    public final String toString() {
        return "NoOpOnResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
