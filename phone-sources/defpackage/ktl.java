package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktl extends kua {
    public static final Parcelable.Creator<ktl> CREATOR = new geb(18);

    public ktl(String str, int i) {
        super(str, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        int i2 = this.b;
        parcel.writeString(i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNRECOGNIZED" : "SUBTITLE" : "OPEN_CAPTION" : "CLOSED_CAPTION" : "UNKNOWN");
    }
}
