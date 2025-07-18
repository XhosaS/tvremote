package defpackage;

import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nol extends fus {
    private static final nsf a = new nsf("MediaRouterCallback");
    private final nok b;
    private final noo c;
    private final noq d;

    public nol(nok nokVar, noo nooVar, noq noqVar) {
        ocv.aF(nokVar);
        this.b = nokVar;
        this.c = nooVar;
        this.d = noqVar;
    }

    private final void R() {
        boolean zI;
        noq noqVar = this.d;
        if (noqVar == null || !noqVar.b()) {
            return;
        }
        nnm nnmVar = noqVar.e;
        RouteListingPreference routeListingPreferenceBuild = null;
        nmq nmqVarA = nnmVar != null ? nnmVar.a() : null;
        CastDevice castDeviceC = nmqVarA != null ? nmqVarA.c() : null;
        if (castDeviceC != null) {
            ArrayList arrayList = new ArrayList();
            for (fux fuxVar : fuy.m()) {
                CastDevice castDeviceC2 = CastDevice.c(fuxVar.q);
                if (castDeviceC2 != null) {
                    if (TextUtils.isEmpty(castDeviceC2.e()) || castDeviceC2.e().startsWith("__cast_ble__") || TextUtils.isEmpty(castDeviceC.e()) || castDeviceC.e().startsWith("__cast_ble__")) {
                        String str = castDeviceC2.l;
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = castDeviceC.l;
                            if (!TextUtils.isEmpty(str2)) {
                                zI = nrv.i(str, str2);
                            }
                        }
                        arrayList.add(new fvw(new dxc(fuxVar.d)));
                    } else {
                        zI = nrv.i(castDeviceC2.e(), castDeviceC.e());
                    }
                    if (!zI) {
                        arrayList.add(new fvw(new dxc(fuxVar.d)));
                    }
                }
            }
            arrayList.size();
            nsf.e();
            nxb nxbVar = new nxb((byte[]) null, (char[]) null, (byte[]) null);
            nxbVar.a = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
            noqVar.f = new fvx(nxbVar);
            fvx fvxVar = noqVar.f;
            fuy.e();
            ftw ftwVarA = fuy.a();
            if (ftwVarA.n == null || Build.VERSION.SDK_INT < 34) {
                return;
            }
            MediaRouter2 mediaRouter2 = ftwVarA.n.a;
            if (fvxVar != null) {
                ArrayList arrayList2 = new ArrayList();
                for (fvw fvwVar : fvxVar.a) {
                    RouteListingPreference.Item.Builder customSubtextMessage = new RouteListingPreference.Item.Builder(fvwVar.a).setFlags(0).setSubText(0).setCustomSubtextMessage(null);
                    int i = fvwVar.b;
                    arrayList2.add(customSubtextMessage.setSelectionBehavior(1).build());
                }
                routeListingPreferenceBuild = new RouteListingPreference.Builder().setItems(arrayList2).setLinkedItemComponentName(null).setUseSystemOrdering(true).build();
            }
            mediaRouter2.setRouteListingPreference(routeListingPreferenceBuild);
        }
    }

    @Override // defpackage.fus
    public final void onRouteAdded(fuy fuyVar, fux fuxVar) {
        try {
            this.b.b(fuxVar.d, fuxVar.q);
        } catch (RemoteException unused) {
            nsf.e();
        }
        R();
    }

    @Override // defpackage.fus
    public final void onRouteChanged(fuy fuyVar, fux fuxVar) {
        if (fuxVar.t()) {
            try {
                this.b.c(fuxVar.d, fuxVar.q);
            } catch (RemoteException unused) {
                nsf.e();
            }
            R();
        }
    }

    @Override // defpackage.fus
    public final void onRouteConnected(fuy fuyVar, fux fuxVar, fux fuxVar2) {
        if (fuxVar.k != 1) {
            a.a("ignore onRouteConnected for non-remote connected routeId: %s", fuxVar.d);
            return;
        }
        nsf nsfVar = a;
        String str = fuxVar.d;
        nsfVar.a("onRouteConnected with connectedRouteId = %s", str);
        this.c.h = true;
        try {
            nok nokVar = this.b;
            if (nokVar.a() >= 251600000) {
                nokVar.d(fuxVar2.d, str, fuxVar.q);
            } else {
                nokVar.h(fuxVar2.d, str, fuxVar.q);
            }
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    @Override // defpackage.fus
    public final void onRouteDisconnected(fuy fuyVar, fux fuxVar, fux fuxVar2, int i) {
        if (fuxVar == null || fuxVar.k != 1) {
            a.a("ignore onRouteDisconnected for invalid or non-remote disconnected route", new Object[0]);
            return;
        }
        String str = fuxVar.d;
        nsf nsfVar = a;
        String str2 = fuxVar2.d;
        nsfVar.a("onRouteDisconnected with disconnectedRouteId = %s, requestedRouteId = %s, reason = %d", str, str2, Integer.valueOf(i));
        this.c.h = false;
        try {
            nok nokVar = this.b;
            if (nokVar.a() >= 251600000) {
                nokVar.e(str2, str, fuxVar.q, i);
            } else {
                nokVar.i(str, fuxVar.q, i);
            }
        } catch (RemoteException unused) {
            nsf.e();
        }
    }

    @Override // defpackage.fus
    public final void onRouteRemoved(fuy fuyVar, fux fuxVar) {
        try {
            this.b.f(fuxVar.d, fuxVar.q);
        } catch (RemoteException unused) {
            nsf.e();
        }
        R();
    }

    @Override // defpackage.fus
    public final void onRouteSelected(fuy fuyVar, fux fuxVar, int i, fux fuxVar2) {
        if (fuxVar.k != 1) {
            a.a("ignore onRouteSelected for non-remote selected routeId: %s", fuxVar.d);
            return;
        }
        nsf nsfVar = a;
        Integer numValueOf = Integer.valueOf(i);
        String str = fuxVar.d;
        nsfVar.a("onRouteSelected with reason = %d, routeId = %s", numValueOf, str);
        try {
            nok nokVar = this.b;
            if (nokVar.a() >= 220400000) {
                nokVar.h(fuxVar2.d, str, fuxVar.q);
            } else {
                nokVar.g(fuxVar2.d, fuxVar.q);
            }
        } catch (RemoteException unused) {
            nsf.e();
        }
        R();
    }

    @Override // defpackage.fus
    public final void onRouteUnselected(fuy fuyVar, fux fuxVar, int i) {
        if (fuxVar.k != 1) {
            a.a("ignore onRouteUnselected for non-remote routeId: %s", fuxVar.d);
            return;
        }
        nsf nsfVar = a;
        Integer numValueOf = Integer.valueOf(i);
        String str = fuxVar.d;
        nsfVar.a("onRouteUnselected with reason = %d, routeId = %s", numValueOf, str);
        try {
            this.b.i(str, fuxVar.q, i);
        } catch (RemoteException unused) {
            nsf.e();
        }
        R();
    }
}
