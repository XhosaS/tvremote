package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acf;
import defpackage.acg;
import defpackage.e;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e(12);
    private final acg a;

    public ParcelImpl(Parcel parcel) {
        this.a = new acf(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new acf(parcel).k(this.a);
    }
}
