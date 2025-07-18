package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ogy extends ifk implements IInterface {
    public ogy() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, ohg ohgVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) ifl.a(parcel, Status.CREATOR);
            ohg ohgVar = (ohg) ifl.a(parcel, ohg.CREATOR);
            ifl.b(parcel);
            b(status, ohgVar);
        } else if (i == 2) {
            Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
            ifl.b(parcel);
            a(status2);
        } else {
            if (i != 3) {
                return false;
            }
            Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
            ifl.b(parcel);
            c(status3);
        }
        return true;
    }
}
