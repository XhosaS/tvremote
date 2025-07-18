package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gec extends gcz {
    public static final Parcelable.Creator<gec> CREATOR = new geb(0);
    public boolean a;

    public gec(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public gec(Parcelable parcelable) {
        super(parcelable);
    }
}
