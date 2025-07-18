package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.geb;
import defpackage.glj;
import defpackage.glk;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new geb(3);
    public final glk a;

    public ParcelImpl(glk glkVar) {
        this.a = glkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        new glj(parcel).k(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new glj(parcel).c();
    }
}
