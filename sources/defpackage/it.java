package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class it extends tr {
    public static final Parcelable.Creator CREATOR = new jt(1);
    public Parcelable a;

    public it(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? in.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.tr, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public it(Parcelable parcelable) {
        super(parcelable);
    }
}
