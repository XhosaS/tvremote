package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcp extends gcz {
    public static final Parcelable.Creator<gcp> CREATOR = new dyy(16);
    public String a;

    public gcp(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public gcp(Parcelable parcelable) {
        super(parcelable);
    }
}
