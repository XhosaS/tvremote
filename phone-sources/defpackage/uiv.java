package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uiv {
    public static uiv a;

    public static boolean A(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static final void B(crm crmVar, uor uorVar) {
        if (uorVar != null) {
            try {
                onz onzVar = uorVar.c;
                ocv.aF(onzVar);
                Bitmap bitmap = (Bitmap) osk.t(onzVar, 5L, TimeUnit.SECONDS);
                crmVar.k(bitmap);
                crj crjVar = new crj();
                crjVar.c(bitmap);
                crjVar.b(null);
                crmVar.p(crjVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                uorVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e.getCause()))));
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                uorVar.close();
            }
        }
    }

    private static boolean C(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static unj a(uki ukiVar, Class cls) {
        return ukiVar.a(new ulb(ula.class, cls));
    }

    public static Object b(uki ukiVar, ulb ulbVar) {
        unj unjVarA = ukiVar.a(ulbVar);
        if (unjVarA == null) {
            return null;
        }
        return unjVarA.a();
    }

    public static Object c(uki ukiVar, Class cls) {
        return b(ukiVar, new ulb(ula.class, cls));
    }

    public static Set d(uki ukiVar, Class cls) {
        ulb ulbVar = new ulb(ula.class, cls);
        uld uldVar = (uld) ukiVar;
        if (uldVar.a.contains(ulbVar)) {
            return (Set) uldVar.b.c(ulbVar).a();
        }
        throw new uks(String.format("Attempting to request an undeclared dependency Set<%s>.", ulbVar));
    }

    public static final void e(ukh ukhVar, List list) {
        list.add(ukhVar);
    }

    public static final void f(ComponentRegistrar componentRegistrar, List list) {
        list.add(new ukn(componentRegistrar, 0));
    }

    public static ComponentRegistrar g(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new uku(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new uku(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new uku(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new uku(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new uku(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static int h(int i) {
        return i - 1;
    }

    public static void i(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Set] */
    public static void j(List list) {
        Set<aafi> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (aafi aafiVar : (Set) it2.next()) {
                        for (ukq ukqVar : ((ukh) aafiVar.c).c) {
                            if (ukqVar.a() && (set = (Set) map.get(new ukp(ukqVar.a, ukqVar.b()))) != null) {
                                for (aafi aafiVar2 : set) {
                                    aafiVar.b.add(aafiVar2);
                                    aafiVar2.a.add(aafiVar);
                                }
                            }
                        }
                    }
                }
                HashSet<aafi> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (aafi aafiVar3 : hashSet) {
                    if (aafiVar3.m()) {
                        hashSet2.add(aafiVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    aafi aafiVar4 = (aafi) hashSet2.iterator().next();
                    hashSet2.remove(aafiVar4);
                    i++;
                    for (aafi aafiVar5 : aafiVar4.b) {
                        aafiVar5.a.remove(aafiVar4);
                        if (aafiVar5.m()) {
                            hashSet2.add(aafiVar5);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (aafi aafiVar6 : hashSet) {
                    if (!aafiVar6.m() && !aafiVar6.b.isEmpty()) {
                        arrayList.add(aafiVar6.c);
                    }
                }
                throw new ukr(arrayList);
            }
            ukh ukhVar = (ukh) it.next();
            aafi aafiVar7 = new aafi(ukhVar);
            for (ulb ulbVar : ukhVar.b) {
                ukp ukpVar = new ukp(ulbVar, !ukhVar.f());
                if (!map.containsKey(ukpVar)) {
                    map.put(ukpVar, new HashSet());
                }
                Set set2 = (Set) map.get(ukpVar);
                if (!set2.isEmpty() && !ukpVar.a) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", ulbVar));
                }
                set2.add(aafiVar7);
            }
        }
    }

    public static int k(xsm xsmVar) {
        int length = 0;
        for (String str : xsmVar.e()) {
            int length2 = str.length();
            if (str.endsWith("-bin")) {
                xsg xsgVar = xsm.b;
                int i = xsj.c;
                xsh xshVar = new xsh((xsi) xsmVar.b(new xsf(str, xsgVar)));
                while (xshVar.hasNext()) {
                    length = length + length2 + ((byte[]) xshVar.next()).length;
                }
            } else {
                xse xseVar = xsm.c;
                int i2 = xsj.c;
                xsh xshVar2 = new xsh((xsi) xsmVar.b(new xsd(str, xseVar)));
                while (xshVar2.hasNext()) {
                    length = length + length2 + ((String) xshVar2.next()).length();
                }
            }
        }
        return length;
    }

    public static uqe l(xsm xsmVar) {
        vtw vtwVarM = uqe.a.m();
        for (String str : xsmVar.e()) {
            vtw vtwVarM2 = uqd.a.m();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            uqd uqdVar = (uqd) vtwVarM2.b;
            str.getClass();
            uqdVar.b |= 1;
            uqdVar.e = str;
            if (str.endsWith("-bin")) {
                vtw vtwVarM3 = uqc.a.m();
                xsg xsgVar = xsm.b;
                int i = xsj.c;
                xsh xshVar = new xsh((xsi) xsmVar.b(new xsf(str, xsgVar)));
                while (xshVar.hasNext()) {
                    vsz vszVarQ = vsz.q((byte[]) xshVar.next());
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    uqc uqcVar = (uqc) vtwVarM3.b;
                    vun vunVar = uqcVar.b;
                    if (!vunVar.c()) {
                        uqcVar.b = vuc.s(vunVar);
                    }
                    uqcVar.b.add(vszVarQ);
                }
                uqc uqcVar2 = (uqc) vtwVarM3.r();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                uqd uqdVar2 = (uqd) vtwVarM2.b;
                uqcVar2.getClass();
                uqdVar2.d = uqcVar2;
                uqdVar2.c = 3;
            } else {
                vtw vtwVarM4 = uqb.a.m();
                xse xseVar = xsm.c;
                int i2 = xsj.c;
                Iterable iterableB = xsmVar.b(new xsd(str, xseVar));
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                uqb uqbVar = (uqb) vtwVarM4.b;
                vun vunVar2 = uqbVar.b;
                if (!vunVar2.c()) {
                    uqbVar.b = vuc.s(vunVar2);
                }
                vsf.h(iterableB, uqbVar.b);
                uqb uqbVar2 = (uqb) vtwVarM4.r();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                uqd uqdVar3 = (uqd) vtwVarM2.b;
                uqbVar2.getClass();
                uqdVar3.d = uqbVar2;
                uqdVar3.c = 2;
            }
            uqd uqdVar4 = (uqd) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uqe uqeVar = (uqe) vtwVarM.b;
            uqdVar4.getClass();
            vun vunVar3 = uqeVar.b;
            if (!vunVar3.c()) {
                uqeVar.b = vuc.s(vunVar3);
            }
            uqeVar.b.add(uqdVar4);
        }
        return (uqe) vtwVarM.r();
    }

    public static xsm m(uqe uqeVar) {
        xsm xsmVar = new xsm();
        for (uqd uqdVar : uqeVar.b) {
            if (uqdVar.c == 2) {
                String str = uqdVar.e;
                xse xseVar = xsm.c;
                int i = xsj.c;
                xsd xsdVar = new xsd(str, xseVar);
                Iterator<E> it = (uqdVar.c == 2 ? (uqb) uqdVar.d : uqb.a).b.iterator();
                while (it.hasNext()) {
                    xsmVar.h(xsdVar, (String) it.next());
                }
            } else {
                String str2 = uqdVar.e;
                xsg xsgVar = xsm.b;
                int i2 = xsj.c;
                xsf xsfVar = new xsf(str2, xsgVar);
                Iterator<E> it2 = (uqdVar.c == 3 ? (uqc) uqdVar.d : uqc.a).b.iterator();
                while (it2.hasNext()) {
                    xsmVar.h(xsfVar, ((vsz) it2.next()).w());
                }
            }
        }
        return xsmVar;
    }

    public static ukh n(String str, String str2) {
        return ukh.d(new upr(str, str2), upr.class);
    }

    public static ukh o(String str, ups upsVar) {
        ukg ukgVarC = ukh.c(upr.class);
        ukgVarC.b(new ukq(Context.class, 1, 0));
        ukgVarC.c = new upv(str, upsVar, 1);
        return ukgVarC.a();
    }

    public static SharedPreferences p(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void q(Context context) {
        ApplicationInfo applicationInfo;
        int i = 0;
        if (p(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        fba fbaVar = new fba(13);
        boolean z = true;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (ocv.h()) {
            fbaVar.execute(new uot(context, z, new kwy((byte[]) null, (byte[]) null), i));
        } else {
            osk.r(null);
        }
    }

    public static boolean r(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    static String s(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String t(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String u(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String v(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[PHI: r10
  0x00db: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v16 java.lang.String) binds: [B:42:0x00c3, B:46:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(android.content.Intent r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uiv.w(android.content.Intent):void");
    }

    public static void x(String str, Bundle bundle) {
        try {
            uiz.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String strS = s(bundle);
            if (strS != null) {
                bundle2.putString("_nmn", strS);
            }
            String strU = u(bundle);
            if (!TextUtils.isEmpty(strU)) {
                bundle2.putString("label", strU);
            }
            String string2 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("message_channel", string2);
            }
            String strV = v(bundle);
            if (strV != null) {
                bundle2.putString("_nt", strV);
            }
            String string3 = bundle.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string3));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string4 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string4 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string4));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = true != ulp.q(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            ujh ujhVar = (ujh) uiz.b().e(ujh.class);
            if (ujhVar != null) {
                ujhVar.a();
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean y() {
        Context contextA;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        try {
            uiz.b();
            contextA = uiz.b().a();
            sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = contextA.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static boolean z(Intent intent) {
        if (intent == null || C(intent)) {
            return false;
        }
        return A(intent.getExtras());
    }
}
