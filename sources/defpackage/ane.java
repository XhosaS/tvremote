package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ane extends ack implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ane(adx adxVar, int i) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = i;
        this.b = adxVar;
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        if (this.a == 0) {
            if (i != 2) {
                return false;
            }
            ((ahi) this.b).a(new anj());
            return true;
        }
        switch (i) {
            case 1:
                Status status = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status, (adx) this.b);
                return true;
            case 2:
                Status status2 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status2, (adx) this.b);
                return true;
            case 3:
                Status status3 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status3, (adx) this.b);
                return true;
            case 4:
                Status status4 = (Status) acl.a(parcel, Status.CREATOR);
                akp akpVar = (akp) acl.a(parcel, akp.CREATOR);
                acl.b(parcel);
                qp.v(status4, akpVar, (adx) this.b);
                return true;
            case 5:
                Status status5 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status5, (adx) this.b);
                return true;
            case 6:
                Status status6 = (Status) acl.a(parcel, Status.CREATOR);
                akt aktVar = (akt) acl.a(parcel, akt.CREATOR);
                acl.b(parcel);
                qp.v(status6, aktVar, (adx) this.b);
                return true;
            case 7:
                Status status7 = (Status) acl.a(parcel, Status.CREATOR);
                akq akqVar = (akq) acl.a(parcel, akq.CREATOR);
                acl.b(parcel);
                qp.v(status7, akqVar, (adx) this.b);
                return true;
            case 8:
                Status status8 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status8, (adx) this.b);
                return true;
            case 9:
                Status status9 = (Status) acl.a(parcel, Status.CREATOR);
                akv akvVar = (akv) acl.a(parcel, akv.CREATOR);
                acl.b(parcel);
                qp.v(status9, akvVar, (adx) this.b);
                return true;
            case 10:
                Status status10 = (Status) acl.a(parcel, Status.CREATOR);
                akp akpVar2 = (akp) acl.a(parcel, akp.CREATOR);
                acl.b(parcel);
                qp.v(status10, akpVar2, (adx) this.b);
                return true;
            case 11:
                Status status11 = (Status) acl.a(parcel, Status.CREATOR);
                parcel.readLong();
                acl.b(parcel);
                qp.v(status11, null, (adx) this.b);
                return true;
            case 12:
                Status status12 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status12, (adx) this.b);
                return true;
            case 13:
                Status status13 = (Status) acl.a(parcel, Status.CREATOR);
                akx akxVar = (akx) acl.a(parcel, akx.CREATOR);
                acl.b(parcel);
                qp.v(status13, akxVar, (adx) this.b);
                return true;
            case 14:
                Status status14 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status14, (adx) this.b);
                return true;
            case 15:
                Status status15 = (Status) acl.a(parcel, Status.CREATOR);
                acl.b(parcel);
                qp.u(status15, (adx) this.b);
                return true;
            case 16:
                Status status16 = (Status) acl.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                acl.b(parcel);
                qp.v(status16, Long.valueOf(j), (adx) this.b);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ane(ahi ahiVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = ahiVar;
    }
}
