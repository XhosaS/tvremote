package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class oix implements nzz {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ oix(long j, Instant instant, int i) {
        this.c = i;
        this.a = j;
        this.b = instant;
    }

    @Override // defpackage.nzz
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            ojb ojbVar = (ojb) obj;
            nnh nnhVar = new nnh((kwy) obj2, 7, (byte[]) null);
            oiw oiwVar = (oiw) ojbVar.L();
            Context context = ojbVar.u;
            long epochMilli = ((Instant) this.b).toEpochMilli();
            nwl nwlVarQ = ocv.q();
            Parcel parcelK = oiwVar.k();
            ifl.e(parcelK, nnhVar);
            parcelK.writeLong(this.a);
            parcelK.writeLong(epochMilli);
            ifl.c(parcelK, nwlVarQ);
            oiwVar.m(2, parcelK);
            return;
        }
        if (i == 1) {
            try {
                ((oei) obj).m((odz) this.b, this.a);
                ((kwy) obj2).u(null);
                return;
            } catch (RemoteException e) {
                Log.e("gF_FeedbackClient", "Failed to start feedback", e);
                ((kwy) obj2).t(new RemoteException("Internall Error: Failed to start feedback"));
                return;
            }
        }
        ojb ojbVar2 = (ojb) obj;
        oiy oiyVar = new oiy((kwy) obj2);
        oiw oiwVar2 = (oiw) ojbVar2.L();
        Context context2 = ojbVar2.u;
        long epochMilli2 = ((Instant) this.b).toEpochMilli();
        nwl nwlVarQ2 = ocv.q();
        Parcel parcelK2 = oiwVar2.k();
        ifl.e(parcelK2, oiyVar);
        parcelK2.writeLong(this.a);
        parcelK2.writeLong(epochMilli2);
        ifl.c(parcelK2, nwlVarQ2);
        oiwVar2.m(1, parcelK2);
    }

    public /* synthetic */ oix(odz odzVar, long j, int i) {
        this.c = i;
        this.b = odzVar;
        this.a = j;
    }
}
