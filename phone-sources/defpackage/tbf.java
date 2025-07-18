package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbf extends dam {
    public static final Parcelable.Creator<tbf> CREATOR = new spm(7);
    public final ko a;

    public tbf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new ko(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.a.toString() + "}";
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ko koVar = this.a;
        int i2 = koVar.d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) koVar.d(i3);
            bundleArr[i3] = (Bundle) koVar.g(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public tbf(Parcelable parcelable) {
        super(parcelable);
        this.a = new ko();
    }
}
