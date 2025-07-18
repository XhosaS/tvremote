package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goa {
    public static final /* synthetic */ int a = 0;
    private static final String b = "goa";

    public static final gns a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        gnn gnnVar;
        gnl gnlVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new gns(yhb.a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iP = gli.P(sidecarDeviceState);
        try {
            try {
                sidecarDeviceState2.posture = iP;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iP));
        }
        List<SidecarDisplayFeature> listQ = gli.Q(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listQ) {
            sidecarDisplayFeature.getClass();
            b.getClass();
            Object objB = new gne(sidecarDisplayFeature).a("Type must be either TYPE_FOLD or TYPE_HINGE", new fyh(15)).a("Feature bounds must not be 0", new fyh(16)).a("TYPE_FOLD must have 0 area", new fyh(17)).a("Feature be pinned to either left or top", new fyh(18)).b();
            gno gnoVar = null;
            if (objB != null) {
                int type = ((SidecarDisplayFeature) objB).getType();
                if (type == 1) {
                    gnnVar = gnn.a;
                } else if (type == 2) {
                    gnnVar = gnn.b;
                }
                int iP2 = gli.P(sidecarDeviceState2);
                if (iP2 == 2) {
                    gnlVar = gnl.b;
                } else if (iP2 == 3) {
                    gnlVar = gnl.a;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                gnoVar = new gno(new gmx(rect), gnnVar, gnlVar);
            }
            if (gnoVar != null) {
                arrayList.add(gnoVar);
            }
        }
        return new gns(arrayList);
    }
}
