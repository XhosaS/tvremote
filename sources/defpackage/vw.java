package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.leanback.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vw implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e(11);
    public int a;
    public Bundle b;

    public vw() {
        this.b = Bundle.EMPTY;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }

    public vw(Parcel parcel) {
        this.b = Bundle.EMPTY;
        this.a = parcel.readInt();
        this.b = parcel.readBundle(GridLayoutManager.class.getClassLoader());
    }
}
