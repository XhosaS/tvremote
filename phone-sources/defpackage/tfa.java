package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tfa implements Parcelable {
    public static final Parcelable.Creator<tfa> CREATOR = new sct(4);

    public abstract PendingIntent a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
