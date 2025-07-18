package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bce extends bdl implements Parcelable {
    public static final Parcelable.Creator<bce> CREATOR = new av(17);

    public bce(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(e());
    }
}
