package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nuc extends ifk implements IInterface {
    public nuc() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                b(status);
                return true;
            case 2:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                a(status2);
                return true;
            default:
                return false;
        }
    }
}
