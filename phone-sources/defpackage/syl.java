package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syl extends dam {
    public static final Parcelable.Creator<syl> CREATOR = new cqy(5);
    String a;

    public syl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readString();
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
    }

    public syl(Parcelable parcelable) {
        super(parcelable);
    }
}
