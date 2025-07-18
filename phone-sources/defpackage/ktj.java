package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktj extends kte {
    public static final Parcelable.Creator<ktj> CREATOR = new geb(16);

    public ktj(String str, boolean z, kzp kzpVar, kzq kzqVar) {
        super(str, z, kzpVar, kzqVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
    }
}
