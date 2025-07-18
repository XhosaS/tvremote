package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nie extends ifk implements IInterface {
    public nie() {
        super("com.google.android.gms.auth.aang.internal.IGoogleAuthAangCallbacks");
    }

    public void a(Status status, nhq nhqVar) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, nhw nhwVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, nhz nhzVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                nhw nhwVar = (nhw) ifl.a(parcel, nhw.CREATOR);
                ifl.b(parcel);
                b(status, nhwVar);
                return true;
            case 2:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                nhz nhzVar = (nhz) ifl.a(parcel, nhz.CREATOR);
                ifl.b(parcel);
                c(status2, nhzVar);
                return true;
            case 3:
                parcel.readInt();
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
                nhq nhqVar = (nhq) ifl.a(parcel, nhq.CREATOR);
                ifl.b(parcel);
                a(status3, nhqVar);
                return true;
            case 5:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                ifl.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
