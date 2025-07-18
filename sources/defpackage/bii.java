package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bii extends tr {
    public static final Parcelable.Creator CREATOR = new bib(2);
    public boolean a;

    public bii(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.tr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public bii(Parcelable parcelable) {
        super(parcelable);
    }
}
