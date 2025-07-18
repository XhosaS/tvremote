package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class and extends ack implements IInterface {
    public and() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, anc ancVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) acl.a(parcel, Status.CREATOR);
                anc ancVar = (anc) acl.a(parcel, anc.CREATOR);
                acl.b(parcel);
                b(status, ancVar);
                return true;
            case 3:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                c(status2);
                return true;
            case 5:
                Status status3 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                acl.e(parcel);
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                acl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
