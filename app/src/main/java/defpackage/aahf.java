package defpackage;

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
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aahf {
    public static final Object a = new Object();
    public static final Map b = new we();
    public final Context c;
    public final String d;
    public final aahp e;
    public final aais f;
    public final aamy h;
    private final aajc k;
    public final AtomicBoolean g = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List i = new CopyOnWriteArrayList();

    public aahf(final Context context, String str, aahp aahpVar) throws PackageManager.NameNotFoundException {
        List<String> arrayList;
        new CopyOnWriteArrayList();
        kkk.k(context);
        this.c = context;
        kkk.h(str);
        this.d = str;
        this.e = aahpVar;
        aahq aahqVar = FirebaseInitProvider.a;
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
        for (final String str3 : arrayList) {
            arrayList2.add(new aamy() { // from class: aaii
                @Override // defpackage.aamy
                public final Object a() {
                    return aaij.a(str3);
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        aakm aakmVar = aakm.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        aair.a(new FirebaseCommonRegistrar(), arrayList3);
        aair.a(new ExecutorsRegistrar(), arrayList3);
        arrayList4.add(aaif.d(context, Context.class, new Class[0]));
        arrayList4.add(aaif.d(this, aahf.class, new Class[0]));
        arrayList4.add(aaif.d(aahpVar, aahp.class, new Class[0]));
        aarq aarqVar = new aarq();
        if (adw.a(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(aaif.d(aahqVar, aahq.class, new Class[0]));
        }
        aais aaisVar = new aais(aakmVar, arrayList3, arrayList4, aarqVar);
        this.f = aaisVar;
        Trace.endSection();
        this.k = new aajc(new aamy() { // from class: aahb
            @Override // defpackage.aamy
            public final Object a() {
                aahf aahfVar = this.a;
                aais aaisVar2 = aahfVar.f;
                String strC = aahfVar.c();
                return new aaoh(context, strC);
            }
        });
        this.h = aaig.a(aaisVar, aalt.class);
        aahc aahcVar = new aahc(this);
        d();
        if (this.g.get()) {
            kft.a.b.get();
        }
        this.i.add(aahcVar);
        Trace.endSection();
    }

    public static aahf a() {
        aahf aahfVar;
        synchronized (a) {
            aahfVar = (aahf) b.get("[DEFAULT]");
            if (aahfVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + klq.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((aalt) aahfVar.h.a()).c();
        }
        return aahfVar;
    }

    public final Object b(Class cls) {
        d();
        return aaig.b(this.f, cls);
    }

    public final String c() {
        d();
        String strA = kli.a(this.d.getBytes(Charset.defaultCharset()));
        d();
        return strA + "+" + kli.a(this.e.b.getBytes(Charset.defaultCharset()));
    }

    public final void d() {
        kkk.g(!this.j.get(), "FirebaseApp was deleted");
    }

    public final void e() {
        HashMap map;
        Context context = this.c;
        if (!adw.a(context)) {
            d();
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(this.d)));
            AtomicReference atomicReference = aahe.a;
            if (atomicReference.get() == null) {
                aahe aaheVar = new aahe(context);
                while (!atomicReference.compareAndSet(null, aaheVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(aaheVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        d();
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(this.d)));
        aais aaisVar = this.f;
        boolean zG = g();
        Boolean boolValueOf = Boolean.valueOf(zG);
        while (true) {
            AtomicReference atomicReference2 = aaisVar.b;
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (aaisVar) {
                    map = new HashMap(aaisVar.a);
                }
                aaisVar.g(map, zG);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((aalt) this.h.a()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aahf)) {
            return false;
        }
        String str = this.d;
        aahf aahfVar = (aahf) obj;
        aahfVar.d();
        return str.equals(aahfVar.d);
    }

    public final boolean f() {
        d();
        return ((aaoh) this.k.a()).a();
    }

    public final boolean g() {
        d();
        return "[DEFAULT]".equals(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kkh.b("name", this.d, arrayList);
        kkh.b("options", this.e, arrayList);
        return kkh.a(arrayList, this);
    }
}
