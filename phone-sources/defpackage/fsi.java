package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsi implements Parcelable {
    public static final Parcelable.Creator<fsi> CREATOR = new dyy(12);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public fsi(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.b);
    }
}
