package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scu implements Parcelable {
    public static final sct CREATOR = new sct(0);
    public final Parcelable a;
    public sdh b;

    public scu(Parcelable parcelable) {
        this.a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public scu(Parcel parcel) {
        this.a = parcel.readParcelable(RecyclerView.SavedState.class.getClassLoader());
        this.b = (sdh) parcel.readParcelable(sdh.class.getClassLoader());
    }
}
