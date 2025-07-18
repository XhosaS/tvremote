package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohg extends ocg {
    public static final Parcelable.Creator<ohg> CREATOR = new odt(4);
    public final ParcelFileDescriptor a;

    public ohg(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, parcelFileDescriptor, i | 1);
        ocv.x(parcel, iV);
    }
}
