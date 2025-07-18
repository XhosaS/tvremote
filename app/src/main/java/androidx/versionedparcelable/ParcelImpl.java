package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bwt;
import defpackage.bwx;
import defpackage.bwy;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bwt();
    public final bwy a;

    public ParcelImpl(Parcel parcel) {
        this.a = new bwx(parcel).i();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new bwx(parcel).A(this.a);
    }
}
