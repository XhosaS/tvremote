package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxi implements qxl {
    public static final Parcelable.Creator<qxi> CREATOR = new ous(4);
    public final String a;

    public qxi(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxi) && yks.e(this.a, ((qxi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountMessagesOnResult(accountId=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
