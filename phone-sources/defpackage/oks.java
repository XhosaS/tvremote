package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oks extends ifk implements IInterface {
    public oks() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            parcel.readInt();
            ifl.b(parcel);
            return true;
        }
        if (i == 15) {
            parcel.readInt();
            parcel.readString();
            ifl.b(parcel);
            return true;
        }
        if (i == 16) {
            parcel.readInt();
            ifl.b(parcel);
            return true;
        }
        if (i == 18) {
            parcel.readInt();
            ifl.b(parcel);
            return true;
        }
        if (i == 19) {
            ifl.b(parcel);
            return true;
        }
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                c(i2, bundle);
                return true;
            case 2:
                int i3 = parcel.readInt();
                Bundle bundle2 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                DataHolder dataHolder = (DataHolder) ifl.a(parcel, DataHolder.CREATOR);
                ifl.b(parcel);
                a(i3, bundle2, dataHolder);
                return true;
            case 3:
                parcel.readInt();
                ifl.b(parcel);
                throw new RuntimeException("Shouldn't be called");
            case 4:
                parcel.readInt();
                ifl.b(parcel);
                return true;
            case 5:
                int i4 = parcel.readInt();
                Bundle bundle3 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ifl.a(parcel, ParcelFileDescriptor.CREATOR);
                Bundle bundle4 = (Bundle) ifl.a(parcel, Bundle.CREATOR);
                ifl.b(parcel);
                b(i4, bundle3, parcelFileDescriptor, bundle4);
                return true;
            case 6:
                parcel.readInt();
                ifl.b(parcel);
                return true;
            case 7:
                parcel.readInt();
                ifl.b(parcel);
                return true;
            case 8:
                parcel.readInt();
                ifl.b(parcel);
                return true;
            default:
                return false;
        }
    }

    public void c(int i, Bundle bundle) {
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }
}
