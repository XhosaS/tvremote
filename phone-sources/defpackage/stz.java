package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stz extends dam {
    public static final Parcelable.Creator<stz> CREATOR = new spm(4);
    public boolean a;

    public stz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public stz(Parcelable parcelable) {
        super(parcelable);
    }
}
