package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mvf extends mvl {
    public static final Parcelable.Creator<mvf> CREATOR = new mur(2);

    public mvf(String str, String str2, List list, String str3) {
        super(str, str2, list, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeList(this.c);
        parcel.writeString(this.d);
    }
}
