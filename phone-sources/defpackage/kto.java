package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kto extends kul {
    public static final Parcelable.Creator<kto> CREATOR = new jbu(1);

    public kto(int i, ktz ktzVar, String str, tst tstVar, int i2, String str2, String str3) {
        super(i, ktzVar, str, tstVar, i2, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
