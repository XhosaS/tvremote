package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uiz {
    public static final Object a = new Object();
    public static final Map b = new ir();
    public final uko c;
    public final ukv e;
    public final unj f;
    private final Context h;
    private final String i;
    private final ujf j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    protected uiz(Context context, String str, ujf ujfVar) throws PackageManager.NameNotFoundException {
        List arrayList;
        int i;
        new CopyOnWriteArrayList();
        ocv.aF(context);
        this.h = context;
        ocv.aD(str);
        this.i = str;
        this.j = ujfVar;
        ujg ujgVar = upu.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList2.add(new ukn((String) it.next(), 1));
            }
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ull ullVar = ull.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        uiv.f(new FirebaseCommonRegistrar(), arrayList3);
        uiv.f(new ExecutorsRegistrar(), arrayList3);
        uiv.e(ukh.e(context, Context.class, new Class[0]), arrayList4);
        uiv.e(ukh.e(this, uiz.class, new Class[0]), arrayList4);
        uiv.e(ukh.e(ujfVar, ujf.class, new Class[0]), arrayList4);
        upw upwVar = new upw();
        if (crh.h(context) && upu.b.get()) {
            uiv.e(ukh.e(ujgVar, ujg.class, new Class[0]), arrayList4);
        }
        uko ukoVar = new uko(ullVar, arrayList3, arrayList4, upwVar);
        this.c = ukoVar;
        Trace.endSection();
        this.e = new ukv(new ukl(this, context, i));
        this.f = uiv.a(ukoVar, ums.class);
        zft zftVar = new zft(this);
        h();
        if (this.d.get() && nxq.a.c()) {
            zftVar.e(true);
        }
        this.g.add(zftVar);
        Trace.endSection();
    }

    public static uiz b() {
        uiz uizVar;
        synchronized (a) {
            uizVar = (uiz) b.get("[DEFAULT]");
            if (uizVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ocu.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((ums) uizVar.f.a()).c();
        }
        return uizVar;
    }

    public static uiz c(Context context, ujf ujfVar, String str) {
        uiz uizVar;
        AtomicReference atomicReference = uix.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = uix.a;
            if (atomicReference2.get() == null) {
                uix uixVar = new uix();
                if (a.v(atomicReference2, uixVar)) {
                    nxq.b(application);
                    nxq.a.a(uixVar);
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            ocv.aA(!map.containsKey(strTrim), a.cg(strTrim, "FirebaseApp name ", " already exists!"));
            ocv.aG(context, "Application context cannot be null.");
            uizVar = new uiz(context, strTrim, ujfVar);
            map.put(strTrim, uizVar);
        }
        uizVar.i();
        return uizVar;
    }

    public final Context a() {
        h();
        return this.h;
    }

    public final ujf d() {
        h();
        return this.j;
    }

    public final Object e(Class cls) {
        h();
        return uiv.c(this.c, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uiz) {
            return this.i.equals(((uiz) obj).f());
        }
        return false;
    }

    public final String f() {
        h();
        return this.i;
    }

    public final String g() {
        return ocv.s(f().getBytes(Charset.defaultCharset())) + "+" + ocv.s(d().b.getBytes(Charset.defaultCharset()));
    }

    public final void h() {
        ocv.aA(!this.k.get(), "FirebaseApp was deleted");
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final void i() {
        HashMap map;
        Context context = this.h;
        if (crh.h(context)) {
            f();
            uko ukoVar = this.c;
            if (a.v(ukoVar.b, Boolean.valueOf(j()))) {
                synchronized (ukoVar) {
                    map = new HashMap(ukoVar.a);
                }
                ukoVar.f(map);
            }
            ((ums) this.f.a()).c();
            return;
        }
        f();
        AtomicReference atomicReference = uiy.a;
        if (atomicReference.get() == null) {
            uiy uiyVar = new uiy(context);
            if (a.v(atomicReference, uiyVar)) {
                context.registerReceiver(uiyVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean j() {
        return "[DEFAULT]".equals(f());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ocv.aK("name", this.i, arrayList);
        ocv.aK("options", this.j, arrayList);
        return ocv.aJ(arrayList, this);
    }
}
