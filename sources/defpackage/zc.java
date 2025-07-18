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
final class zc extends MediaRouter2$TransferCallback {
    final /* synthetic */ zd a;

    public zc(zd zdVar) {
        this.a = zdVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        zd zdVar = this.a;
        zl zlVar = (zl) zdVar.b.remove(routingController);
        if (zlVar == null) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
        } else {
            byj byjVar = zdVar.d;
            if (zlVar == ((yv) byjVar.a).e) {
                byjVar.j(2);
            }
        }
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        zu zuVar;
        zd zdVar = this.a;
        Map map = zdVar.b;
        map.remove(routingController);
        if (routingController2 == zdVar.a.getSystemController()) {
            zdVar.d.j(3);
            return;
        }
        List selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = pd$$ExternalSyntheticApiModelOutline3.m50m(selectedRoutes.get(0)).getId();
        map.put(routingController2, new yy(routingController2, id));
        yv yvVar = (yv) zdVar.d.a;
        Iterator it = yvVar.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                zuVar = null;
                break;
            }
            zuVar = (zu) it.next();
            if (zuVar.d() == yvVar.k && TextUtils.equals(id, zuVar.b)) {
                break;
            }
        }
        if (zuVar == null) {
            Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=".concat(String.valueOf(id)));
        } else {
            yvVar.k(zuVar, 3, true);
        }
        zdVar.f(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Objects.toString(mediaRoute2Info);
        Log.w("MR2Provider", "Transfer failed. requestedRoute=".concat(String.valueOf(mediaRoute2Info)));
    }
}
