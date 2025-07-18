package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcs extends gcz {
    public static final Parcelable.Creator<gcs> CREATOR = new dyy(17);
    public String a;

    public gcs(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public gcs(Parcelable parcelable) {
        super(parcelable);
    }
}
