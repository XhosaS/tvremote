package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loe extends lof {
    public static final Parcelable.Creator<loe> CREATOR = new jbu(17);

    public loe(String str, String str2, String str3, int i, String str4, int i2, int i3, ksn ksnVar, Uri uri, boolean z) {
        super(str, str2, str3, i, str4, i2, i3, ksnVar, uri, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        String str = this.b;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.c;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
    }
}
