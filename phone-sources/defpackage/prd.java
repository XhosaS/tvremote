package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class prd extends View.BaseSavedState {
    public static final Parcelable.Creator<prd> CREATOR = new omd(18);
    public String a;
    public boolean b;

    public prd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readInt() == 1;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public prd(Parcelable parcelable) {
        super(parcelable);
    }
}
