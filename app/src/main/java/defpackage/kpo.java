package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes.dex */
class kpo implements khv, kpt {
    public khi a;
    public boolean b = true;
    final /* synthetic */ kpp c;

    public kpo(kpp kppVar, khi khiVar) {
        this.c = kppVar;
        this.a = khiVar;
    }

    @Override // defpackage.khv
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        khg khgVar;
        boolean z;
        kpx kpxVar = (kpx) obj;
        synchronized (this) {
            khgVar = this.a.b;
            z = this.b;
            khi khiVar = this.a;
            khiVar.a = null;
            khiVar.b = null;
        }
        if (khgVar == null) {
            ((lvj) obj2).a.p(false);
            return;
        }
        wx wxVar = kpxVar.t;
        synchronized (wxVar) {
            kpw kpwVar = (kpw) wxVar.remove(khgVar);
            if (kpwVar == null) {
                ((lvj) obj2).a.p(Boolean.FALSE);
                return;
            }
            khi khiVarB = kpwVar.a.b();
            khiVarB.a = null;
            khiVarB.b = null;
            if (!z) {
                ((lvj) obj2).a.p(Boolean.TRUE);
            } else if (kpxVar.J(kow.j)) {
                kpl kplVar = (kpl) kpxVar.v();
                LocationReceiver locationReceiverA = LocationReceiver.a(null, kpwVar, "ILocationListener@" + System.identityHashCode(kpwVar.asBinder()));
                kpq kpqVar = new kpq(Boolean.TRUE, (lvj) obj2);
                Parcel parcelA = kplVar.a();
                erv.b(parcelA, locationReceiverA);
                erv.c(parcelA, kpqVar);
                kplVar.J(89, parcelA);
            } else {
                ((kpl) kpxVar.v()).e(new LocationRequestUpdateData(2, null, kpwVar.asBinder(), null, null, new kpr(Boolean.TRUE, (lvj) obj2), null));
            }
        }
    }

    @Override // defpackage.kpt
    public final synchronized khi b() {
        return this.a;
    }

    @Override // defpackage.kpt
    public final synchronized void c(khi khiVar) {
        khi khiVar2 = this.a;
        if (khiVar2 != khiVar) {
            khiVar2.a = null;
            khiVar2.b = null;
            this.a = khiVar;
        }
    }
}
