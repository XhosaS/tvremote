package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oju extends ifk implements IInterface {
    public oju() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                ifl.b(parcel);
                return true;
            case 2:
                ifl.b(parcel);
                return true;
            case 3:
                ifl.b(parcel);
                return true;
            case 4:
                ifl.b(parcel);
                return true;
            case 5:
                ifl.b(parcel);
                return true;
            case 6:
                ifl.b(parcel);
                return true;
            case 7:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                okc okcVar = (okc) ifl.a(parcel, okc.CREATOR);
                ifl.b(parcel);
                b(status, okcVar);
                return true;
            case 8:
                ifl.b(parcel);
                return true;
            case 9:
                ifl.b(parcel);
                return true;
            case 10:
                parcel.createTypedArrayList(ojo.CREATOR);
                ifl.b(parcel);
                return true;
            case 11:
                ifl.b(parcel);
                return true;
            case 12:
                ifl.b(parcel);
                return true;
            case 13:
                ifl.g(parcel);
                ifl.b(parcel);
                return true;
            case 14:
                ifl.b(parcel);
                return true;
            case 15:
                ifl.b(parcel);
                return true;
            case 16:
                parcel.readInt();
                ifl.b(parcel);
                return true;
            case 17:
                ifl.g(parcel);
                ifl.b(parcel);
                return true;
            case 18:
                a();
                return true;
            case 19:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                d(status2);
                return true;
            case 20:
                ifl.b(parcel);
                return true;
            case 21:
                Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
                String string = parcel.readString();
                ifl.b(parcel);
                c(status3, string);
                return true;
            case 22:
                ifl.b(parcel);
                return true;
            case 23:
                parcel.createTypedArrayList(okj.CREATOR);
                ifl.b(parcel);
                return true;
            case 24:
                ifl.b(parcel);
                return true;
            case 25:
                parcel.createTypedArrayList(okr.CREATOR);
                ifl.b(parcel);
                return true;
            case 26:
                ifl.b(parcel);
                return true;
            case 27:
                parcel.createTypedArrayList(okp.CREATOR);
                ifl.b(parcel);
                return true;
            default:
                return false;
        }
    }

    public void a() {
    }

    public void d(Status status) {
    }

    public void b(Status status, okc okcVar) {
    }

    public void c(Status status, String str) {
    }
}
