package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgn implements Parcelable {
    public static final Parcelable.Creator<tgn> CREATOR = new sct(5);
    public int a;
    public float b;

    public tgn() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }

    public tgn(tgn tgnVar) {
        this.a = tgnVar.a;
        this.b = tgnVar.b;
    }

    public tgn(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
    }
}
