package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpp extends kes implements kox {
    static final keh a = new keh();
    public static final kei l = new kei("LocationServices.API", new kpn());

    public kpp(Context context) {
        super(context, null, l, kee.a, ker.a);
    }

    @Override // defpackage.kox
    public final void a(final LocationRequest locationRequest, Executor executor, kpd kpdVar) {
        kkk.l("kpd", "Listener type must not be null");
        khi khiVar = new khi(executor, kpdVar, "kpd");
        final kpo kpoVar = new kpo(this, khiVar);
        khv khvVar = new khv() { // from class: kpm
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                kpw kpwVar;
                kpo kpoVar2 = kpoVar;
                kpx kpxVar = (kpx) obj;
                khi khiVarB = kpoVar2.b();
                khg khgVar = khiVarB.b;
                khgVar.getClass();
                boolean zJ = kpxVar.J(kow.j);
                wx wxVar = kpxVar.t;
                synchronized (wxVar) {
                    kpw kpwVar2 = (kpw) wxVar.get(khgVar);
                    if (kpwVar2 == null || zJ) {
                        kpwVar = new kpw(kpoVar2);
                        wxVar.put(khgVar, kpwVar);
                    } else {
                        kpwVar2.a.c(khiVarB);
                        kpwVar = kpwVar2;
                        kpwVar2 = null;
                    }
                    LocationRequest locationRequest2 = locationRequest;
                    if (zJ) {
                        kpl kplVar = (kpl) kpxVar.v();
                        LocationReceiver locationReceiverA = LocationReceiver.a(kpwVar2, kpwVar, khgVar.a());
                        kpq kpqVar = new kpq(null, (lvj) obj2);
                        Parcel parcelA = kplVar.a();
                        erv.b(parcelA, locationReceiverA);
                        erv.b(parcelA, locationRequest2);
                        erv.c(parcelA, kpqVar);
                        kplVar.J(88, parcelA);
                    } else {
                        ((kpl) kpxVar.v()).e(new LocationRequestUpdateData(1, new LocationRequestInternal(locationRequest2, null, false, false, false, false, Long.MAX_VALUE), kpwVar.asBinder(), null, null, new kps((lvj) obj2, kpwVar), khgVar.a()));
                    }
                }
            }
        };
        kht khtVar = new kht();
        khtVar.a = khvVar;
        khtVar.b = kpoVar;
        khtVar.c = khiVar;
        khtVar.f = 2435;
        h(khtVar.a());
    }
}
