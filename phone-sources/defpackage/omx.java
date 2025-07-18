package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class omx extends ifk implements IInterface {
    public omx() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public void a(Status status, omv omvVar) {
        throw null;
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) ifl.a(parcel, Status.CREATOR);
            omv omvVar = (omv) ifl.a(parcel, omv.CREATOR);
            ifl.b(parcel);
            a(status, omvVar);
            return true;
        }
        if (i == 2) {
            ifl.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            parcel.readLong();
            ifl.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 4) {
            parcel.createTypedArrayList(omw.CREATOR);
            ifl.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 5) {
            return false;
        }
        ifl.b(parcel);
        throw new UnsupportedOperationException();
    }
}
