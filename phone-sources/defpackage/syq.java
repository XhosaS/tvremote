package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syq extends dam {
    public static final Parcelable.Creator<syq> CREATOR = new cqy(6);
    String a;
    int b;

    public syq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public syq(Parcelable parcelable) {
        super(parcelable);
    }
}
