package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdl extends gcz {
    public static final Parcelable.Creator<gdl> CREATOR = new dyy(20);
    public final int a;

    public gdl(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public gdl(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
