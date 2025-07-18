package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bun implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akz(14);
    private final buk a;

    public bun(buk bukVar) {
        this.a = bukVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.g());
    }
}
