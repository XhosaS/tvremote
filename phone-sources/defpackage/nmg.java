package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmg {
    public static volatile nmg b;
    public final Context c;
    public final nnm d;
    public final nmr e;
    public final nmj f;
    public final nrn g;
    final nod h;
    public final nom i;
    public final noq j;
    public ntp k;
    private final nmv m;
    private final noo n;
    private final List o;
    private yyh p;
    private static final nsf l = new nsf("CastContext");
    public static final Object a = new Object();

    public nmg(Context context, nmj nmjVar, List list, noo nooVar, nrn nrnVar) {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        this.c = context;
        this.f = nmjVar;
        this.n = nooVar;
        this.g = nrnVar;
        this.o = list;
        nom nomVar = new nom(context);
        this.i = nomVar;
        noq noqVar = nooVar.e;
        this.j = noqVar;
        n();
        Map mapM = m();
        nmjVar.r = new nmi(1);
        try {
            nmv nmvVarB = noe.a(context).b(new odc(context.getApplicationContext()), nmjVar, nooVar, mapM);
            this.m = nmvVarB;
            try {
                this.e = new nmr(nmvVarB.b());
                try {
                    nnm nnmVar = new nnm(nmvVarB.c(), context);
                    this.d = nnmVar;
                    new nsf("PrecacheManager");
                    if (noqVar != null) {
                        noqVar.e = nnmVar;
                        noqVar.c.post(new mpz(noqVar, 17));
                    }
                    int i = 3;
                    nss nssVar = new nss(context, sfy.v(Executors.newFixedThreadPool(3)));
                    new nsf("BaseNetUtils");
                    nsf.e();
                    if (!nssVar.e && (connectivityManager = nssVar.b) != null) {
                        Context context2 = nssVar.f;
                        if (czi.b(context2, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            Network activeNetwork = connectivityManager.getActiveNetwork();
                            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                                nssVar.a(activeNetwork, linkProperties);
                            }
                            NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
                            if (nssVar.h) {
                                builderAddTransportType.setIncludeOtherUidNetworks(true);
                            } else {
                                context2.registerReceiver(nssVar.i, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                            }
                            connectivityManager.registerNetworkCallback(builderAddTransportType.build(), nssVar.a);
                            nssVar.e = true;
                        }
                    }
                    nod nodVar = new nod();
                    this.h = nodVar;
                    try {
                        nmvVarB.d(nodVar);
                        nodVar.d(nomVar.e);
                        if (!nmjVar.a().isEmpty()) {
                            k();
                        }
                        nrnVar.a(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).q(new onv() { // from class: nmf
                            @Override // defpackage.onv
                            public final void e(Object obj) {
                                uck uckVarB;
                                Bundle bundle = (Bundle) obj;
                                if (nnr.a) {
                                    nmg nmgVar = this.a;
                                    final nnr nnrVar = new nnr(nmgVar.c, nmgVar.g, nmgVar.d, nmgVar.j, nmgVar.h);
                                    int i2 = 0;
                                    final int i3 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                                    boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                    boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                                    nnr.a = z2;
                                    if (i3 == 0) {
                                        if (!z && !z2) {
                                            return;
                                        } else {
                                            i3 = 0;
                                        }
                                    }
                                    long j = bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L);
                                    Context context3 = nnrVar.b;
                                    nnrVar.i = new nor(context3, j);
                                    final String packageName = context3.getPackageName();
                                    String str = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
                                    nnrVar.j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
                                    nea.b(context3);
                                    nnrVar.k = nea.a().c().a("CAST_SENDER_SDK", new ndt(), new nnp(i2));
                                    if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                        nnrVar.h = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                    }
                                    final SharedPreferences sharedPreferences = context3.getApplicationContext().getSharedPreferences(str, 0);
                                    if (i3 != 0) {
                                        nrn nrnVar2 = nnrVar.c;
                                        oaf oafVar = new oaf();
                                        oafVar.a = new nig(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 4);
                                        oafVar.b = new nvg[]{nks.g};
                                        oafVar.b();
                                        oafVar.c = 8426;
                                        nrnVar2.r(oafVar.a()).q(new onv() { // from class: nno
                                            /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
                                            @Override // defpackage.onv
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                                            */
                                            public final void e(java.lang.Object r10) {
                                                /*
                                                    r9 = this;
                                                    int r0 = r3
                                                    r5 = r10
                                                    android.os.Bundle r5 = (android.os.Bundle) r5
                                                    java.lang.String r6 = r2
                                                    nnr r3 = r1
                                                    nnm r10 = r3.d
                                                    noq r7 = r3.e
                                                    r1 = 3
                                                    r2 = 2
                                                    if (r0 == r1) goto L14
                                                    if (r0 != r2) goto L2f
                                                    r0 = r2
                                                L14:
                                                    nod r1 = r3.f
                                                    goe r4 = new goe
                                                    r4.<init>(r3, r1, r6)
                                                    kmx r1 = new kmx
                                                    r1.<init>(r4, r2)
                                                    java.lang.Class<nmq> r8 = defpackage.nmq.class
                                                    r10.c(r1, r8)
                                                    if (r7 == 0) goto L2f
                                                    nnz r1 = new nnz
                                                    r1.<init>(r4)
                                                    r7.c(r1)
                                                L2f:
                                                    r1 = 1
                                                    if (r0 == r1) goto L34
                                                    if (r0 != r2) goto L51
                                                L34:
                                                    android.content.SharedPreferences r2 = r4
                                                    nod r4 = r3.f
                                                    nnu r1 = new nnu
                                                    r1.<init>(r2, r3, r4, r5, r6)
                                                    nns r0 = new nns
                                                    r0.<init>(r1)
                                                    java.lang.Class<nmq> r2 = defpackage.nmq.class
                                                    r10.c(r0, r2)
                                                    if (r7 == 0) goto L51
                                                    nnt r10 = new nnt
                                                    r10.<init>(r1)
                                                    r7.c(r10)
                                                L51:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.nno.e(java.lang.Object):void");
                                            }
                                        });
                                    }
                                    if (z) {
                                        ocv.aF(sharedPreferences);
                                        nnx nnxVarA = nnx.a(sharedPreferences, nnrVar, packageName);
                                        SharedPreferences sharedPreferences2 = nnxVarA.c;
                                        String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                        String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                        Set set = nnxVarA.g;
                                        set.clear();
                                        Set set2 = nnxVarA.h;
                                        set2.clear();
                                        nnxVarA.i = 0L;
                                        String str2 = nnx.a;
                                        if (str2.equals(string) && nnxVarA.d.equals(string2)) {
                                            nnxVarA.i = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            HashSet hashSet = new HashSet();
                                            for (String str3 : sharedPreferences2.getAll().keySet()) {
                                                if (str3.startsWith("feature_usage_timestamp_")) {
                                                    long j2 = sharedPreferences2.getLong(str3, 0L);
                                                    if (j2 != 0 && jCurrentTimeMillis - j2 > 1209600000) {
                                                        hashSet.add(str3);
                                                    } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                        uck uckVarB2 = nnx.b(str3.substring(41));
                                                        if (uckVarB2 != null) {
                                                            set2.add(uckVarB2);
                                                            set.add(uckVarB2);
                                                        }
                                                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (uckVarB = nnx.b(str3.substring(41))) != null) {
                                                        set.add(uckVarB);
                                                    }
                                                }
                                            }
                                            nnxVarA.f(hashSet);
                                            Handler handler = nnxVarA.f;
                                            ocv.aF(nnxVarA.e);
                                            nnxVarA.g();
                                        } else {
                                            HashSet hashSet2 = new HashSet();
                                            for (String str4 : sharedPreferences2.getAll().keySet()) {
                                                if (str4.startsWith("feature_usage_timestamp_")) {
                                                    hashSet2.add(str4);
                                                }
                                            }
                                            hashSet2.add("feature_usage_last_report_time");
                                            nnxVarA.f(hashSet2);
                                            sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", nnxVarA.d).apply();
                                        }
                                        nnx.e(uck.CAST_CONTEXT);
                                    }
                                    if (nnr.a) {
                                        jys.y();
                                    }
                                }
                            }
                        });
                        oaf oafVar = new oaf();
                        oafVar.a = new nig(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 6);
                        oafVar.b = new nvg[]{nks.h};
                        oafVar.b();
                        oafVar.c = 8427;
                        nrnVar.r(oafVar.a()).q(new igu(this, i));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    public static nmg c() {
        ocv.aC();
        return b;
    }

    public static nmg d(Context context) {
        ocv.aC();
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    nnj nnjVarG = g(applicationContext);
                    nmj castOptions = nnjVarG.getCastOptions(applicationContext);
                    nrn nrnVar = new nrn(applicationContext);
                    try {
                        b = new nmg(applicationContext, castOptions, nnjVarG.getAdditionalSessionProviders(applicationContext), new noo(applicationContext, fuy.b(applicationContext), castOptions, nrnVar), nrnVar);
                    } catch (nni e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return b;
    }

    public static nmg e(Context context) {
        ocv.aC();
        try {
            return d(context);
        } catch (RuntimeException e) {
            l.b("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e);
            return null;
        }
    }

    public static nnj g(Context context) {
        try {
            Bundle bundle = oda.b(context).y(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (nnj) Class.forName(string).asSubclass(nnj.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    private final Map m() {
        HashMap map = new HashMap();
        yyh yyhVar = this.p;
        if (yyhVar != null) {
            map.put(yyhVar.b, yyhVar.e);
        }
        List<yyh> list = this.o;
        if (list != null) {
            for (yyh yyhVar2 : list) {
                ocv.aG(yyhVar2, "Additional SessionProvider must not be null.");
                Object obj = yyhVar2.b;
                ocv.aE((String) obj, "Category for SessionProvider must not be null or empty string.");
                ocv.au(!map.containsKey(obj), String.format("SessionProvider for category %s already added", obj));
                map.put(obj, yyhVar2.e);
            }
        }
        return map;
    }

    private final void n() {
        nmj nmjVar = this.f;
        if (TextUtils.isEmpty(nmjVar.d)) {
            this.p = null;
        } else {
            this.p = new yyh(this.c, nmjVar, this.n);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int a(int i) {
        Integer num;
        ntp ntpVar = this.k;
        if (ntpVar == null) {
            l.d("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        }
        ?? r0 = ntpVar.a;
        if (r0 != 0) {
            Integer numValueOf = Integer.valueOf(i);
            if (r0.containsKey(numValueOf) && (num = (Integer) r0.get(numValueOf)) != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public final fur b() {
        ocv.aC();
        try {
            return fur.a(this.m.a());
        } catch (RemoteException unused) {
            nsf.e();
            return null;
        }
    }

    public final nmj f() {
        ocv.aC();
        return this.f;
    }

    public final nnm h() {
        ocv.aC();
        return this.d;
    }

    public final Set i(String str) {
        return this.i.S(str);
    }

    public final void j(String str) {
        fur furVarB;
        cur supportActionProvider;
        fur furVarB2;
        ocv.aC();
        nmj nmjVar = this.f;
        if (TextUtils.equals(str, nmjVar.d)) {
            return;
        }
        nmjVar.d = str;
        n();
        try {
            this.m.e(str, m());
        } catch (RemoteException unused) {
            nsf.e();
        }
        nml nmlVar = new nml();
        nmlVar.a = a(2423);
        nmlVar.b = 2423;
        nmlVar.a();
        Context context = this.c;
        nmj nmjVar2 = this.f;
        nod nodVar = this.h;
        if (nrg.a == null) {
            nrg.a = new nrg(context, nmjVar2, nodVar, new obl(context));
        }
        nrg nrgVar = nrg.a;
        synchronized (nrgVar.c) {
            Iterator it = nrgVar.b.entrySet().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        Context context2 = this.c;
        synchronized (nme.c) {
            Iterator it2 = nme.b.iterator();
            while (it2.hasNext()) {
                MenuItem menuItem = (MenuItem) ((WeakReference) it2.next()).get();
                if (menuItem != null) {
                    try {
                        ocv.aC();
                        if (menuItem instanceof cti) {
                            supportActionProvider = ((cti) menuItem).getSupportActionProvider();
                        } else {
                            Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
                            supportActionProvider = null;
                        }
                        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) supportActionProvider;
                        if (mediaRouteActionProvider == null) {
                            mediaRouteActionProvider = null;
                        }
                        if (mediaRouteActionProvider == null) {
                            throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
                        }
                        nmg nmgVarE = e(context2);
                        if (nmgVarE != null && (furVarB2 = nmgVarE.b()) != null) {
                            mediaRouteActionProvider.setRouteSelector(furVarB2);
                        }
                    } catch (IllegalArgumentException e) {
                        nme.a.d("Unexpected exception when refreshing MediaRouteSelectors for Cast buttons", e);
                    }
                }
            }
        }
        synchronized (nme.e) {
            Iterator it3 = nme.d.iterator();
            while (it3.hasNext()) {
                MediaRouteButton mediaRouteButton = (MediaRouteButton) ((WeakReference) it3.next()).get();
                if (mediaRouteButton != null) {
                    ocv.aC();
                    nmg nmgVarE2 = e(context2);
                    if (nmgVarE2 != null && (furVarB = nmgVarE2.b()) != null) {
                        mediaRouteButton.setRouteSelector(furVarB);
                    }
                }
            }
        }
    }

    public final void k() {
        nsf nsfVar = l;
        nmj nmjVar = this.f;
        nsfVar.a("Setting Route Discovery for appIds: ".concat(String.valueOf(String.valueOf(nmjVar.a()))), new Object[0]);
        List listA = nmjVar.a();
        listA.size();
        nsf.e();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(sij.K((String) it.next()));
        }
        nom nomVar = this.i;
        Map map = nomVar.c;
        String.valueOf(map.keySet());
        nsf.e();
        HashMap map2 = new HashMap();
        synchronized (map) {
            for (String str : linkedHashSet) {
                nsf nsfVar2 = (nsf) map.get(sij.K(str));
                if (nsfVar2 != null) {
                    map2.put(str, nsfVar2);
                }
            }
            map.clear();
            map.putAll(map2);
        }
        String.valueOf(map.keySet());
        nsf.e();
        LinkedHashSet linkedHashSet2 = nomVar.d;
        synchronized (linkedHashSet2) {
            linkedHashSet2.clear();
            linkedHashSet2.addAll(linkedHashSet);
        }
        nomVar.T();
    }

    public final boolean l(String str, fux fuxVar) {
        ocv.aC();
        nxb nxbVar = new nxb();
        nxbVar.i(jys.C(str));
        if (!fuxVar.u(nxbVar.g())) {
            nom.a.d("Route does not support specified appId ".concat(String.valueOf(str)), new Object[0]);
        } else {
            if (fuxVar.k == 1) {
                fuy.b(this.c);
                if (!f().d.equals(str)) {
                    l.a("selectRoute updating receiver application id to ".concat(String.valueOf(str)), new Object[0]);
                    j(str);
                }
                if (!fuy.n().d.equals(fuxVar.d)) {
                    h().d(true);
                    l.a("selectDeviceRoute selecting new route ".concat(String.valueOf(nrv.d(fuxVar.e))), new Object[0]);
                    fuxVar.n();
                }
                return true;
            }
            nom.a.d("Route playback type is not PLAYBACK_TYPE_REMOTE.", new Object[0]);
        }
        l.d("selectRoute: Route is not valid for selection", new Object[0]);
        return false;
    }
}
