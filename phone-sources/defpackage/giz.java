package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giz extends View.BaseSavedState {
    public static final Parcelable.Creator<giz> CREATOR = new geb(2);
    public final boolean a;

    public giz(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public giz(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }
}
