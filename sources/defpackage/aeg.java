package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeg extends ack implements IInterface {
    public aeg() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                c(status);
                return true;
            case 2:
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                acl.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                b(status2);
                return true;
            default:
                return false;
        }
    }
}
