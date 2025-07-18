package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fue extends fup {
    public final MediaRouter2 a;
    final Map b;
    public boolean c;
    final pku d;
    private final MediaRouter2$RouteCallback l;
    private final MediaRouter2$TransferCallback m;
    private final MediaRouter2$ControllerCallback n;
    private final Handler o;
    private final Executor p;
    private List q;
    private final Map r;

    public fue(Context context, pku pkuVar) {
        super(context, null);
        this.b = new ArrayMap();
        this.m = new fud(this);
        this.n = new ftx(this);
        this.q = new ArrayList();
        this.r = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.d = pkuVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.o = handler;
        this.p = new emk(handler, 6);
        if (Build.VERSION.SDK_INT >= 34) {
            this.l = new fuc(this);
        } else {
            this.l = new fub(this);
        }
    }

    final MediaRoute2Info a(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM31m = agx$$ExternalSyntheticApiModelOutline0.m31m(it.next());
            if (TextUtils.equals(mediaRoute2InfoM31m.getId(), str)) {
                return mediaRoute2InfoM31m;
            }
        }
        return null;
    }

    @Override // defpackage.fup
    public final fun c(String str) {
        return new fua((String) this.r.get(str), null);
    }

    @Override // defpackage.fup
    public final fuk dx(String str, fuo fuoVar) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            ftz ftzVar = (ftz) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, ftzVar.a)) {
                return ftzVar;
            }
        }
        return null;
    }

    @Override // defpackage.fup
    public final fun dz(String str, String str2) {
        String str3 = (String) this.r.get(str);
        for (ftz ftzVar : this.b.values()) {
            fug fugVar = ftzVar.i;
            if (TextUtils.equals(str2, fugVar != null ? fugVar.n() : ftzVar.b.getId())) {
                return new fua(str3, ftzVar);
            }
        }
        Log.w("MR2Provider", a.cz(str2, str, "Could not find the matching GroupRouteController. routeId=", ", routeGroupId="));
        return new fua(str3, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.fup
    public final void e(fuh fuhVar) {
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        if (fuy.a == null || fuy.a().v <= 0) {
            MediaRouter2 mediaRouter2 = this.a;
            mediaRouter2.unregisterRouteCallback(this.l);
            mediaRouter2.unregisterTransferCallback(this.m);
            mediaRouter2.unregisterControllerCallback(this.n);
            return;
        }
        boolean zI = fuy.i();
        if (fuhVar == null) {
            fuhVar = new fuh(fur.a, false);
        }
        List listB = fuhVar.a().b();
        if (!zI) {
            listB.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!listB.contains("android.media.intent.category.LIVE_AUDIO")) {
            listB.add("android.media.intent.category.LIVE_AUDIO");
        }
        nxb nxbVar = new nxb();
        nxbVar.h(listB);
        fuh fuhVar2 = new fuh(nxbVar.g(), fuhVar.b());
        MediaRouter2 mediaRouter22 = this.a;
        Executor executor = this.p;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.l;
        if (fuhVar2.c()) {
            boolean zB = fuhVar2.b();
            ArrayList arrayList = new ArrayList();
            for (String str : fuhVar2.a().b()) {
                switch (str.hashCode()) {
                    case -2065577523:
                        if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                            str = "android.media.route.feature.REMOTE_PLAYBACK";
                            break;
                        } else {
                            break;
                        }
                    case 956939050:
                        if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                            str = "android.media.route.feature.LIVE_AUDIO";
                            break;
                        } else {
                            break;
                        }
                    case 975975375:
                        if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                            str = "android.media.route.feature.LIVE_VIDEO";
                            break;
                        } else {
                            break;
                        }
                    case 1601181366:
                        if (str.equals("android.media.intent.category.REMOTE_AUDIO_PLAYBACK")) {
                            str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                            break;
                        } else {
                            break;
                        }
                    case 1693091761:
                        if (str.equals("android.media.intent.category.REMOTE_VIDEO_PLAYBACK")) {
                            str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                            break;
                        } else {
                            break;
                        }
                }
                arrayList.add(str);
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList, zB).build();
        } else {
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        mediaRouter22.registerRouteCallback(executor, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        mediaRouter22.registerTransferCallback(executor, this.m);
        mediaRouter22.registerControllerCallback(executor, this.n);
    }

    protected final void f() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.a.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM31m = agx$$ExternalSyntheticApiModelOutline0.m31m(it.next());
            if (mediaRoute2InfoM31m != null && !arraySet.contains(mediaRoute2InfoM31m) && !mediaRoute2InfoM31m.isSystemRoute() && (!this.c || mediaRoute2InfoM31m.getId().startsWith(String.valueOf(this.e.getPackageName()).concat("/")))) {
                arraySet.add(mediaRoute2InfoM31m);
                arrayList.add(mediaRoute2InfoM31m);
            }
        }
        if (arrayList.equals(this.q)) {
            return;
        }
        this.q = arrayList;
        Map map = this.r;
        map.clear();
        Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM31m2 = agx$$ExternalSyntheticApiModelOutline0.m31m(it2.next());
            Bundle extras = mediaRoute2InfoM31m2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Objects.toString(mediaRoute2InfoM31m2);
                Log.w("MR2Provider", "Cannot find the original route Id. route=".concat(String.valueOf(mediaRoute2InfoM31m2)));
            } else {
                map.put(mediaRoute2InfoM31m2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            fug fugVarD = fus.d(agx$$ExternalSyntheticApiModelOutline0.m31m(it3.next()));
            if (fugVarD != null) {
                arrayList2.add(fugVarD);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                fus.j((fug) it4.next(), arrayList3);
            }
        }
        dA(new fuq(arrayList3, true));
    }

    final void g(MediaRouter2.RoutingController routingController) {
        fuf fufVar;
        ftz ftzVar = (ftz) this.b.get(routingController);
        if (ftzVar == null) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Objects.toString(routingController);
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=".concat(String.valueOf(routingController)));
            return;
        }
        List listE = fus.e(selectedRoutes);
        fug fugVarD = fus.d(agx$$ExternalSyntheticApiModelOutline0.m31m(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.e.getString(R.string.mr_dialog_default_group_name);
        fug fugVarL = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    fugVarL = fug.l(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (fugVarL == null) {
            fufVar = new fuf(routingController.getId(), string);
            fufVar.d(2);
            fufVar.i(1);
        } else {
            fufVar = new fuf(fugVarL);
        }
        fufVar.k(routingController.getVolume());
        fufVar.m(routingController.getVolumeMax());
        fufVar.l(routingController.getVolumeHandling());
        fufVar.c.clear();
        fufVar.b(fugVarD.p());
        fufVar.b.clear();
        fufVar.c(listE);
        fug fugVarA = fufVar.a();
        List listE2 = fus.e(routingController.getSelectableRoutes());
        List listE3 = fus.e(routingController.getDeselectableRoutes());
        fuq fuqVar = this.i;
        if (fuqVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<fug> list = fuqVar.a;
        if (!list.isEmpty()) {
            for (fug fugVar : list) {
                String strN = fugVar.n();
                if (fugVar == null) {
                    throw new NullPointerException("descriptor must not be null");
                }
                arrayList.add(new fui(fugVar, true != listE.contains(strN) ? 1 : 3, listE3.contains(strN), listE2.contains(strN), true));
            }
        }
        ftzVar.i = fugVarA;
        ftzVar.p(fugVarA, arrayList);
    }
}
