package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdz extends gcz {
    public static final Parcelable.Creator<gdz> CREATOR = new geb(1);
    public int a;
    public int b;
    public int c;

    public gdz(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public gdz(Parcelable parcelable) {
        super(parcelable);
    }
}
