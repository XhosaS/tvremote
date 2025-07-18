package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcf extends bdn implements Parcelable {
    public static final Parcelable.Creator<bcf> CREATOR = new av(18);

    public bcf(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
    }
}
