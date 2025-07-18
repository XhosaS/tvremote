package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oie implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oid createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            if (ocv.V(i) != 1) {
                ocv.am(parcel, i);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) ocv.ad(parcel, i, ParcelFileDescriptor.CREATOR);
            }
        }
        ocv.al(parcel, iZ);
        return new oid(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new oid[i];
    }
}
