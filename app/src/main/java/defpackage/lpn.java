package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lpn extends eru implements lpo {
    public lpn() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            parcel.readInt();
            O(parcel);
            return true;
        }
        if (i == 15) {
            parcel.readInt();
            parcel.readString();
            O(parcel);
            return true;
        }
        if (i == 16) {
            parcel.readInt();
            O(parcel);
            return true;
        }
        if (i == 18) {
            parcel.readInt();
            O(parcel);
            return true;
        }
        if (i == 19) {
            O(parcel);
            return true;
        }
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
                O(parcel);
                c(i2, bundle);
                return true;
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle2 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                DataHolder dataHolder = (DataHolder) erv.a(parcel, DataHolder.CREATOR);
                O(parcel);
                d(i3, bundle2, dataHolder);
                return true;
            case 3:
                parcel.readInt();
                O(parcel);
                f();
                return true;
            case 4:
                parcel.readInt();
                O(parcel);
                return true;
            case 5:
                int i4 = parcel.readInt();
                Bundle bundle3 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) erv.a(parcel, ParcelFileDescriptor.CREATOR);
                Bundle bundle4 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                O(parcel);
                e(i4, bundle3, parcelFileDescriptor, bundle4);
                return true;
            case 6:
                parcel.readInt();
                O(parcel);
                return true;
            case 7:
                parcel.readInt();
                O(parcel);
                return true;
            case 8:
                parcel.readInt();
                O(parcel);
                return true;
            default:
                return false;
        }
    }
}
