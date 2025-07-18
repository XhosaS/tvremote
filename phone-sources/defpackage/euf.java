package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euf implements Parcelable {
    public static final Parcelable.Creator<euf> CREATOR = new dyy(4);
    public final long a;
    public final long b;

    public euf(long j, long j2) {
        a.H(j >= 0);
        a.H(j2 >= 0 || j2 == -1);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof euf)) {
            return false;
        }
        euf eufVar = (euf) obj;
        return this.a == eufVar.a && this.b == eufVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
