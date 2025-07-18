package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oov extends ifk implements IInterface {
    public oov() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status, oou oouVar) {
        throw new IllegalStateException("Not implemented.");
    }

    public void b(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                oou oouVar = (oou) ifl.a(parcel, oou.CREATOR);
                ifl.b(parcel);
                a(status, oouVar);
                return true;
            case 3:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                b(status2);
                return true;
            case 5:
                Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                c(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                ifl.f(parcel);
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                ifl.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
