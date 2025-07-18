package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swc implements Parcelable {
    public static final Parcelable.Creator<swc> CREATOR = new swb(0);
    int a;
    sun b;

    public swc() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public swc(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (sun) parcel.readParcelable(getClass().getClassLoader());
    }
}
