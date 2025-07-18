package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swi extends dam {
    public static final Parcelable.Creator<swi> CREATOR = new spm(6);
    Bundle a;

    public swi(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.a);
    }

    public swi(Parcelable parcelable) {
        super(parcelable);
    }
}
