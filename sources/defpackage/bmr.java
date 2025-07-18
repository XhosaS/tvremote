package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bmr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new akz(13);

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract ParcelFileDescriptor e();

    public abstract bod f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptorE = e();
        parcel.writeTypedObject(parcelFileDescriptorE, i);
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeInt(d());
        parcel.writeInt(0);
        if (parcelFileDescriptorE == null) {
            parcel.writeStrongInterface(f());
            parcel.writeInt(c());
        }
    }
}
