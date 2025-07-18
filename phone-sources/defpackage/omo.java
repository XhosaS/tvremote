package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omo extends ifk implements IInterface {
    private final kwy a;

    public omo(kwy kwyVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = kwyVar;
    }

    public final void a(Status status, olu oluVar) {
        ocv.aS(status, oluVar, this.a);
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status, this.a);
                return true;
            case 2:
                Status status2 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status2, this.a);
                return true;
            case 3:
                Status status3 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status3, this.a);
                return true;
            case 4:
                Status status4 = (Status) ifl.a(parcel, Status.CREATOR);
                olu oluVar = (olu) ifl.a(parcel, olu.CREATOR);
                ifl.b(parcel);
                a(status4, oluVar);
                return true;
            case 5:
                Status status5 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status5, this.a);
                return true;
            case 6:
                Status status6 = (Status) ifl.a(parcel, Status.CREATOR);
                oly olyVar = (oly) ifl.a(parcel, oly.CREATOR);
                ifl.b(parcel);
                ocv.aS(status6, olyVar, this.a);
                return true;
            case 7:
                Status status7 = (Status) ifl.a(parcel, Status.CREATOR);
                olv olvVar = (olv) ifl.a(parcel, olv.CREATOR);
                ifl.b(parcel);
                ocv.aS(status7, olvVar, this.a);
                return true;
            case 8:
                Status status8 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status8, this.a);
                return true;
            case 9:
                Status status9 = (Status) ifl.a(parcel, Status.CREATOR);
                oma omaVar = (oma) ifl.a(parcel, oma.CREATOR);
                ifl.b(parcel);
                ocv.aS(status9, omaVar, this.a);
                return true;
            case 10:
                Status status10 = (Status) ifl.a(parcel, Status.CREATOR);
                olu oluVar2 = (olu) ifl.a(parcel, olu.CREATOR);
                ifl.b(parcel);
                ocv.aS(status10, oluVar2, this.a);
                return true;
            case 11:
                Status status11 = (Status) ifl.a(parcel, Status.CREATOR);
                parcel.readLong();
                ifl.b(parcel);
                ocv.aS(status11, null, this.a);
                return true;
            case 12:
                Status status12 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status12, this.a);
                return true;
            case 13:
                Status status13 = (Status) ifl.a(parcel, Status.CREATOR);
                omc omcVar = (omc) ifl.a(parcel, omc.CREATOR);
                ifl.b(parcel);
                ocv.aS(status13, omcVar, this.a);
                return true;
            case 14:
                Status status14 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status14, this.a);
                return true;
            case 15:
                Status status15 = (Status) ifl.a(parcel, Status.CREATOR);
                ifl.b(parcel);
                ocv.aR(status15, this.a);
                return true;
            case 16:
                Status status16 = (Status) ifl.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                ifl.b(parcel);
                ocv.aS(status16, Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }

    public omo() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }
}
