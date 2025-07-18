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
import com.google.android.tv.remote.service.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zd extends zn {
    public static final /* synthetic */ int e = 0;
    final MediaRouter2 a;
    final Map b;
    public List c;
    final byj d;
    private final MediaRouter2$RouteCallback m;
    private final MediaRouter2$TransferCallback n;
    private final MediaRouter2$ControllerCallback o;
    private final Handler p;
    private final Executor q;
    private final Map r;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public zd(Context context, byj byjVar) {
        super(context, null);
        this.b = new ArrayMap();
        this.n = new zc(this);
        this.o = new yw(this);
        this.c = new ArrayList();
        this.r = new ArrayMap();
        this.a = MediaRouter2.getInstance(context);
        this.d = byjVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.p = handler;
        this.q = new aha(handler, 1);
        if (Build.VERSION.SDK_INT >= 34) {
            this.m = new zb(this);
        } else {
            this.m = new za(this);
        }
    }

    @Override // defpackage.zn
    public final zi C(String str, zm zmVar) {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            yy yyVar = (yy) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, yyVar.a)) {
                return yyVar;
            }
        }
        return null;
    }

    @Override // defpackage.zn
    public final zl E(String str, String str2) {
        String str3 = (String) this.r.get(str);
        for (yy yyVar : this.b.values()) {
            zf zfVar = yyVar.i;
            if (TextUtils.equals(str2, zfVar != null ? zfVar.n() : yyVar.b.getId())) {
                return new yz(str3, yyVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new yz(str3, null);
    }

    @Override // defpackage.zn
    public final zl b(String str) {
        return new yz((String) this.r.get(str), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.zn
    public final void d(zg zgVar) {
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        if (zv.a == null || zv.a().q <= 0) {
            MediaRouter2 mediaRouter2 = this.a;
            mediaRouter2.unregisterRouteCallback(this.m);
            mediaRouter2.unregisterTransferCallback(this.n);
            mediaRouter2.unregisterControllerCallback(this.o);
            return;
        }
        zv.a();
        if (zgVar == null) {
            zgVar = new zg(zp.a, false);
        }
        List listA = zgVar.a().a();
        listA.remove("android.media.intent.category.LIVE_AUDIO");
        apl aplVar = new apl();
        aplVar.b(listA);
        zg zgVar2 = new zg(aplVar.a(), zgVar.b());
        MediaRouter2 mediaRouter22 = this.a;
        Executor executor = this.q;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.m;
        if (zgVar2.c()) {
            boolean zB = zgVar2.b();
            ArrayList arrayList = new ArrayList();
            for (String str : zgVar2.a().a()) {
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
        mediaRouter22.registerTransferCallback(executor, this.n);
        mediaRouter22.registerControllerCallback(executor, this.o);
    }

    protected final void e() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.a.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM50m = pd$$ExternalSyntheticApiModelOutline3.m50m(it.next());
            if (mediaRoute2InfoM50m != null && !arraySet.contains(mediaRoute2InfoM50m) && !mediaRoute2InfoM50m.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoM50m);
                arrayList.add(mediaRoute2InfoM50m);
            }
        }
        if (arrayList.equals(this.c)) {
            return;
        }
        this.c = arrayList;
        Map map = this.r;
        map.clear();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM50m2 = pd$$ExternalSyntheticApiModelOutline3.m50m(it2.next());
            Bundle extras = mediaRoute2InfoM50m2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Objects.toString(mediaRoute2InfoM50m2);
                Log.w("MR2Provider", "Cannot find the original route Id. route=".concat(String.valueOf(mediaRoute2InfoM50m2)));
            } else {
                map.put(mediaRoute2InfoM50m2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            zf zfVarC = tj.c(pd$$ExternalSyntheticApiModelOutline3.m50m(it3.next()));
            if (zfVarC != null) {
                arrayList2.add(zfVarC);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                se.h((zf) it4.next(), arrayList3);
            }
        }
        F(new zo(arrayList3, true));
    }

    final void f(MediaRouter2.RoutingController routingController) {
        ze zeVar;
        yy yyVar = (yy) this.b.get(routingController);
        if (yyVar == null) {
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
        List listD = tj.d(selectedRoutes);
        zf zfVarC = tj.c(pd$$ExternalSyntheticApiModelOutline3.m50m(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f.getString(R.string.mr_dialog_default_group_name);
        zf zfVarL = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (true != TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    zfVarL = zf.l(bundle);
                }
            } catch (Exception e2) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e2);
            }
        }
        if (zfVarL == null) {
            zeVar = new ze(routingController.getId(), string);
            zeVar.d(2);
            zeVar.i(1);
        } else {
            zeVar = new ze(zfVarL);
        }
        zeVar.k(routingController.getVolume());
        zeVar.m(routingController.getVolumeMax());
        zeVar.l(routingController.getVolumeHandling());
        zeVar.c.clear();
        zeVar.b(zfVarC.p());
        zeVar.b.clear();
        zeVar.c(listD);
        zf zfVarA = zeVar.a();
        List listD2 = tj.d(routingController.getSelectableRoutes());
        List listD3 = tj.d(routingController.getDeselectableRoutes());
        zo zoVar = this.j;
        if (zoVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<zf> list = zoVar.a;
        if (!list.isEmpty()) {
            for (zf zfVar : list) {
                String strN = zfVar.n();
                if (zfVar == null) {
                    throw new NullPointerException("descriptor must not be null");
                }
                int i = true != listD.contains(strN) ? 1 : 3;
                listD2.contains(strN);
                listD3.contains(strN);
                arrayList.add(new dln(zfVar, i));
            }
        }
        yyVar.i = zfVarA;
        yyVar.k(zfVarA, arrayList);
    }
}
