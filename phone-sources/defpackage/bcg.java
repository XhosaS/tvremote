package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcg extends bdp implements Parcelable {
    public static final Parcelable.Creator<bcg> CREATOR = new av(19);

    public bcg(long j) {
        super(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(e());
    }
}
