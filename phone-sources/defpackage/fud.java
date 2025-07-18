package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fud extends MediaRouter2$TransferCallback {
    final /* synthetic */ fue a;

    public fud(fue fueVar) {
        this.a = fueVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        fue fueVar = this.a;
        fun funVar = (fun) fueVar.b.remove(routingController);
        if (funVar == null) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
        } else {
            pku pkuVar = fueVar.d;
            if (funVar == ((ftw) pkuVar.a).e) {
                pkuVar.l(2);
            }
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        fux fuxVar;
        fue fueVar = this.a;
        Map map = fueVar.b;
        map.remove(routingController);
        if (routingController2 == fueVar.a.getSystemController()) {
            fueVar.d.l(3);
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = agx$$ExternalSyntheticApiModelOutline0.m31m(selectedRoutes.get(0)).getId();
        map.put(routingController2, new ftz(fueVar, routingController2, id));
        ftw ftwVar = (ftw) fueVar.d.a;
        Iterator it = ftwVar.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                fuxVar = null;
                break;
            }
            fuxVar = (fux) it.next();
            if (fuxVar.i() == ftwVar.n && TextUtils.equals(id, fuxVar.c)) {
                break;
            }
        }
        if (fuxVar == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=".concat(String.valueOf(id)));
        } else {
            ftwVar.m(fuxVar, 3, true);
        }
        fueVar.g(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
