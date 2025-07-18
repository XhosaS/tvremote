package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.appindexing.internal.Thing;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulp {
    private static WeakReference b;
    public final Object a;

    public ulp() {
        throw null;
    }

    public static uhp aE(onz onzVar) {
        return ues.j(qtl.aH(onzVar), nwk.class, new pri(9), ugk.a);
    }

    private static final String aJ(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    private static String aK(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private final synchronized String aL(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized String aM(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void aN() {
        ?? r0 = this.a;
        long j = r0.getLong("fire-count", 0L);
        String key = "";
        String str = null;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(r0.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        r0.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void aO(String str) {
        String strAM = aM(str);
        if (strAM == null) {
            return;
        }
        ?? r1 = this.a;
        HashSet hashSet = new HashSet(r1.getStringSet(strAM, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            r1.edit().remove(strAM).commit();
        } else {
            r1.edit().putStringSet(strAM, hashSet).commit();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences, java.lang.Object] */
    private final synchronized void aP(String str, String str2) {
        aO(str2);
        HashSet hashSet = new HashSet();
        ?? r2 = this.a;
        HashSet hashSet2 = new HashSet(r2.getStringSet(str, hashSet));
        hashSet2.add(str2);
        r2.edit().putStringSet(str, hashSet2).commit();
    }

    private static String aQ(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return a.cq(str2, str, " : ");
    }

    public static long ap(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jAp = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jAp += ap(file2);
            }
        }
        return jAp;
    }

    public static synchronized ulp c(Context context) {
        WeakReference weakReference = b;
        ulp ulpVar = weakReference == null ? null : (ulp) weakReference.get();
        if (ulpVar != null) {
            return ulpVar;
        }
        ulp ulpVar2 = new ulp(context.getApplicationContext());
        b = new WeakReference(ulpVar2);
        return ulpVar2;
    }

    public static String n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean q(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(aK("gcm.n.e")));
    }

    public final void A(int i, vsz vszVar) {
        ((vtj) this.a).n(i, vszVar);
    }

    public final void B(int i, double d) {
        ((vtj) this.a).ak(i, d);
    }

    public final void C(int i, int i2) {
        ((vtj) this.a).t(i, i2);
    }

    public final void D(int i, int i2) {
        ((vtj) this.a).p(i, i2);
    }

    public final void E(int i, long j) {
        ((vtj) this.a).r(i, j);
    }

    public final void F(int i, float f) {
        ((vtj) this.a).am(i, f);
    }

    public final void G(int i, Object obj, vvy vvyVar) {
        vtj vtjVar = (vtj) this.a;
        vtjVar.B(i, 3);
        vvyVar.m((vvj) obj, vtjVar.f);
        vtjVar.B(i, 4);
    }

    public final void H(int i, int i2) {
        ((vtj) this.a).t(i, i2);
    }

    public final void I(int i, long j) {
        ((vtj) this.a).E(i, j);
    }

    public final void J(int i, Object obj, vvy vvyVar) {
        ((vtj) this.a).v(i, (vvj) obj, vvyVar);
    }

    public final void K(int i, Object obj) {
        if (obj instanceof vsz) {
            ((vtj) this.a).y(i, (vsz) obj);
        } else {
            ((vtj) this.a).x(i, (vvj) obj);
        }
    }

    public final void L(int i, int i2) {
        ((vtj) this.a).p(i, i2);
    }

    public final void M(int i, long j) {
        ((vtj) this.a).r(i, j);
    }

    public final void N(int i, int i2) {
        ((vtj) this.a).ap(i, i2);
    }

    public final void O(int i, long j) {
        ((vtj) this.a).ar(i, j);
    }

    public final void P(int i, String str) {
        ((vtj) this.a).z(i, str);
    }

    public final void Q(int i, int i2) {
        ((vtj) this.a).C(i, i2);
    }

    public final void R(int i, long j) {
        ((vtj) this.a).E(i, j);
    }

    public final /* synthetic */ vkl S() {
        vuc vucVarO = ((vtw) this.a).r();
        vucVarO.getClass();
        return (vkl) vucVarO;
    }

    public final void T(String str) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkl vklVar = (vkl) vtwVar.b;
        vkl vklVar2 = vkl.a;
        vklVar.b |= 1;
        vklVar.e = str;
    }

    public final void U(vkk vkkVar) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkl vklVar = (vkl) vtwVar.b;
        vkl vklVar2 = vkl.a;
        vklVar.d = vkkVar;
        vklVar.c = 1;
    }

    public final /* synthetic */ vkk V() {
        vuc vucVarO = ((vtw) this.a).r();
        vucVarO.getClass();
        return (vkk) vucVarO;
    }

    public final void W(viq viqVar) {
        viqVar.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkk vkkVar = (vkk) vtwVar.b;
        vkk vkkVar2 = vkk.a;
        vkkVar.d = viqVar;
        vkkVar.b |= 2;
    }

    public final void X(String str) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkk vkkVar = (vkk) vtwVar.b;
        vkk vkkVar2 = vkk.a;
        vkkVar.b |= 4;
        vkkVar.e = str;
    }

    public final void Y(int i) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vkk vkkVar = (vkk) vtwVar.b;
        vkk vkkVar2 = vkk.a;
        vkkVar.c = i - 1;
        vkkVar.b |= 1;
    }

    public final /* synthetic */ vji Z() {
        vuc vucVarO = ((vtw) this.a).r();
        vucVarO.getClass();
        return (vji) vucVarO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Executor, ont] */
    public final onz a(ukd ukdVar) {
        boolean zIsEmpty;
        ?? r1 = this.a;
        ukb ukbVar = (ukb) r1;
        uka ukaVar = new uka(ukbVar, ukdVar);
        onz onzVar = (onz) ((kwy) ukaVar.c).a;
        onzVar.l(r1, r1);
        Queue queue = ukbVar.b;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
            queue.add(ukaVar);
        }
        if (zIsEmpty) {
            ukaVar.a();
        }
        return onzVar;
    }

    public final long aA() {
        long andIncrement;
        Object obj = this.a;
        long andIncrement2 = ((AtomicLong) obj).getAndIncrement();
        if (andIncrement2 >= 1) {
            return andIncrement2;
        }
        synchronized (obj) {
            if (((AtomicLong) obj).get() < 1) {
                ((AtomicLong) obj).set(1L);
            }
            andIncrement = ((AtomicLong) obj).getAndIncrement();
        }
        return andIncrement;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.Spanned aB(java.lang.String r23, java.lang.String r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ulp.aB(java.lang.String, java.lang.String, int, int):android.text.Spanned");
    }

    public final int aC() {
        return ((AtomicInteger) this.a).get();
    }

    public final uhp aD(String str) {
        str.getClass();
        return aE(((omi) this.a).a(str));
    }

    public final String aF(Uri uri, String str, String str2) {
        ko koVar;
        if (uri != null) {
            koVar = (ko) ((ko) this.a).get(uri.toString());
        } else {
            koVar = null;
        }
        if (koVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) koVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yfo] */
    public final rvi aG(float f) {
        Random random = (Random) this.a.b();
        random.getClass();
        return new rvi(random, f);
    }

    public final uge aH(rzy rzyVar) {
        return ((smq) this.a).b().b(trc.d(new smh(rzyVar, 1)), ugk.a);
    }

    public final uhp aI(tvv tvvVar) {
        String str;
        String simpleName = omq.class.getSimpleName();
        nwq nwqVar = (nwq) this.a;
        nzt nztVarO = nwqVar.o(tvvVar, simpleName);
        String strA = ocu.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + "|" + System.identityHashCode(omq.class);
        }
        nkx nkxVar = new nkx(str, nztVarO, 8, null);
        nku nkuVar = new nku(7);
        nzy nzyVar = new nzy();
        nzyVar.c = nztVarO;
        nzyVar.a = nkxVar;
        nzyVar.b = nkuVar;
        nzyVar.d = new nvg[]{olz.d};
        nzyVar.e = false;
        return aE(nwqVar.y(nzyVar.a()));
    }

    public final vkn aa() {
        vkn vknVar = ((vji) ((vtw) this.a).b).d;
        if (vknVar == null) {
            vknVar = vkn.a;
        }
        vknVar.getClass();
        return vknVar;
    }

    public final void ab(vkn vknVar) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vji vjiVar = (vji) vtwVar.b;
        vji vjiVar2 = vji.a;
        vjiVar.d = vknVar;
        vjiVar.b |= 2;
    }

    public final /* synthetic */ vjc ac() {
        vuc vucVarO = ((vtw) this.a).r();
        vucVarO.getClass();
        return (vjc) vucVarO;
    }

    public final void ad(String str) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.c |= 1;
        vjcVar.d = str;
    }

    public final void ae(vlo vloVar) {
        vloVar.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.h = vloVar.p;
        vjcVar.c |= 32;
    }

    public final void af(long j) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.c |= 4;
        vjcVar.f = j;
    }

    public final void ag(vki vkiVar) {
        vkiVar.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.g = vkiVar;
        vjcVar.c |= 16;
    }

    public final void ah(vme vmeVar) {
        vmeVar.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.i = vmeVar;
        vjcVar.c |= 64;
    }

    public final void ai(vkl vklVar) {
        vklVar.getClass();
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vjcVar.e = vklVar;
        vjcVar.c |= 2;
    }

    public final /* synthetic */ void aj(Iterable iterable) {
        vtw vtwVar = (vtw) this.a;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        vjc vjcVar = (vjc) vtwVar.b;
        vuk vukVar = vjc.a;
        vun vunVar = vjcVar.l;
        if (!vunVar.c()) {
            vjcVar.l = vuc.s(vunVar);
        }
        vsf.h(iterable, vjcVar.l);
    }

    public final /* synthetic */ void ak() {
        DesugarCollections.unmodifiableList(((vjc) ((vtw) this.a).b).l).getClass();
    }

    public final void al(tli tliVar) {
        ((tug) ((tug) tks.a.b()).j("com/google/android/tv/remote/support/discovery/LegacyNsdAgent$LegacyListener", "onDeviceOffline", 75, "LegacyNsdAgent.java")).v("Device %s is now offline", tliVar);
        tliVar.getClass();
        ((tkq) this.a).b(tks.c(tliVar));
    }

    public final void am(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", aQ((String) this.a, str, objArr));
        }
    }

    public final void an(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", aQ((String) this.a, str, objArr), th);
        }
    }

    public final void ao(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", aQ((String) this.a, str, objArr));
        }
    }

    public final uhp aq(smx smxVar) {
        return ((smq) this.a).b().b(trc.d(new smh(smxVar, 0)), ugk.a).f();
    }

    public final uhp ar(smy smyVar) {
        return ((smq) this.a).b().b(trc.d(new smh(smyVar, 2)), ugk.a).f();
    }

    public final uhp as(IOException iOException, skz skzVar) {
        return !(iOException.getCause() instanceof vuq) ? sfy.B(iOException) : ues.j(skzVar.a(sfy.C(this.a)), IOException.class, new sls(iOException, 9), ugk.a);
    }

    public final void at(List list) {
        Collections.sort(list, new sib(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void au(String str) {
        ?? r0 = this.a;
        SharedPreferences.Editor editorEdit = r0.edit();
        tst tstVarA = sij.a(str);
        if (tstVarA.g()) {
            Set<String> stringSet = r0.getStringSet((String) tstVarA.c(), new HashSet());
            stringSet.add(str);
            editorEdit.putStringSet((String) tstVarA.c(), stringSet);
        }
        editorEdit.putLong(str, System.currentTimeMillis());
        editorEdit.apply();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void av(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = ((shu) it.next()).a();
            ?? r1 = this.a;
            if (!r1.containsKey(strA)) {
                r1.put(strA, 1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void aw(String str) {
        ?? r0 = this.a;
        SharedPreferences.Editor editorEdit = r0.edit();
        tst tstVarA = sij.a(str);
        if (tstVarA.g()) {
            Set<String> stringSet = r0.getStringSet((String) tstVarA.c(), new HashSet());
            stringSet.add(str);
            editorEdit.putStringSet((String) tstVarA.c(), stringSet);
        }
        editorEdit.putInt(str, r0.getInt(str, 0) + 1);
        editorEdit.apply();
    }

    public final void ax(List list) {
        Collections.sort(list, new sib(this, 0));
    }

    public final void ay(sbn sbnVar) {
        Object obj = this.a;
        if (((sbu) obj).d()) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(obj);
        while (!arrayDeque.isEmpty()) {
            sbu sbuVar = (sbu) arrayDeque.pollFirst();
            if (sbuVar != null && !yks.e(sbuVar, null)) {
                if (rrx.A(sbuVar, sbnVar)) {
                    return;
                } else {
                    arrayDeque.addAll(sbuVar.i);
                }
            }
        }
    }

    public final void az(sbn sbnVar) {
        Object obj = this.a;
        if (((sbu) obj).d()) {
            return;
        }
        while (obj != null) {
            sbu sbuVar = (sbu) obj;
            if (rrx.A(sbuVar, sbnVar)) {
                return;
            } else {
                obj = sbuVar.a;
            }
        }
    }

    public final onz b(Thing... thingArr) {
        Thing[] thingArr2;
        if (thingArr == null) {
            thingArr2 = null;
        } else {
            try {
                int length = thingArr.length;
                Thing[] thingArr3 = new Thing[length];
                System.arraycopy(thingArr, 0, thingArr3, 0, length);
                thingArr2 = thingArr3;
            } catch (ArrayStoreException unused) {
                return osk.q(new ujp("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        return thingArr2 == null ? osk.q(new ujp("Indexables cannot be null.")) : a(new ukd(1, thingArr2, null, null, null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Object obj, Executor executor) {
        executor.getClass();
        if (obj != 0) {
            ((ugb) this.a).a(obj, executor);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized uoy e(String str, String str2) {
        uoy uoyVar;
        ?? r0 = this.a;
        String strAJ = aJ(str, str2);
        uoyVar = null;
        String string = r0.getString(strAJ, null);
        long j = uoy.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    uoyVar = new uoy(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                uoyVar = new uoy(string, null, 0L);
            }
        }
        return uoyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void f() {
        this.a.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void g(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = uoy.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(aJ(str, str2), string);
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized boolean h() {
        return this.a.getAll().isEmpty();
    }

    public final Bundle i() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final Integer j(String str) {
        String strM = m(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n(str) + "(" + strM + ") into an int");
            return null;
        }
    }

    public final String k(Resources resources, String str, String str2) {
        String[] strArr;
        String strM = m(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayO = o(str2.concat("_loc_args"));
        if (jSONArrayO == null) {
            strArr = null;
        } else {
            int length = jSONArrayO.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayO.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + n(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public final String l(Resources resources, String str, String str2) {
        String strM = m(str2);
        return !TextUtils.isEmpty(strM) ? strM : k(resources, str, str2);
    }

    public final String m(String str) {
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strAK = aK(str);
            if (bundle.containsKey(strAK)) {
                str = strAK;
            }
        }
        return bundle.getString(str);
    }

    public final JSONArray o(String str) {
        String strM = m(str);
        if (TextUtils.isEmpty(strM)) {
            return null;
        }
        try {
            return new JSONArray(strM);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + n(str) + ": " + strM + ", falling back to default");
            return null;
        }
    }

    public final boolean p(String str) {
        String strM = m(str);
        return "1".equals(strM) || Boolean.parseBoolean(strM);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized List r() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(aL(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new umx(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        v(System.currentTimeMillis());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void s() {
        ?? r0 = this.a;
        SharedPreferences.Editor editorEdit = r0.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : r0.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String strAL = aL(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(strAL)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(strAL);
                    editorEdit.putStringSet(key, hashSet);
                    i++;
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i);
        }
        editorEdit.commit();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void t() {
        String strAL = aL(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", strAL).commit();
        aO(strAL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void u(long j, String str) {
        ?? r0 = this.a;
        String strAL = aL(j);
        if (r0.getString("last-used-date", "").equals(strAL)) {
            String strAM = aM(strAL);
            if (strAM != null && !strAM.equals(str)) {
                aP(str, strAL);
                return;
            }
            return;
        }
        long j2 = r0.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            aN();
            j2 = r0.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(r0.getStringSet(str, new HashSet()));
        hashSet.add(strAL);
        r0.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strAL).commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized void v(long j) {
        this.a.edit().putLong("fire-global", j).commit();
    }

    final synchronized boolean w(long j, long j2) {
        return aL(j).equals(aL(j2));
    }

    public final synchronized boolean x(long j) {
        return y(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    final synchronized boolean y(long j) {
        ?? r0 = this.a;
        if (!r0.contains("fire-global")) {
            r0.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (w(r0.getLong("fire-global", -1L), j)) {
            return false;
        }
        r0.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final void z(int i, boolean z) {
        ((vtj) this.a).m(i, z);
    }

    public ulp(Object obj) {
        this.a = obj;
    }

    public ulp(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ulp(byte[] bArr) {
        this.a = new tlh();
    }

    public ulp(Context context) {
        this.a = new ukb(new nwq(context, (char[]) null));
    }

    public ulp(Context context, char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = sij.l(new riu(context, 16));
    }

    public ulp(byte[] bArr, char[] cArr) {
        this.a = new AtomicInteger();
    }

    public ulp(char[] cArr) {
        long jNextLong = new SecureRandom().nextLong();
        this.a = new AtomicLong(jNextLong == Long.MIN_VALUE ? 1L : Math.abs(jNextLong));
    }

    public ulp(Class cls, int i) {
        this.a = (Object[]) Array.newInstance((Class<?>) cls, i);
    }

    public ulp(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public ulp(ulq ulqVar) {
        Bundle bundle;
        if (ulqVar.d == 0) {
            ulqVar.d = System.currentTimeMillis();
        }
        this.a = ulqVar;
        Bundle bundle2 = new Bundle();
        ulqVar.a();
        Bundle bundle3 = ulqVar.a().getBundle("scionData");
        if (bundle3 == null || (bundle = bundle3.getBundle("_cmp")) == null) {
            return;
        }
        uiv.i("medium", "utm_medium", bundle, bundle2);
        uiv.i("source", "utm_source", bundle, bundle2);
        uiv.i("campaign", "utm_campaign", bundle, bundle2);
    }

    public ulp(Context context, short[] sArr) {
        this.a = context.getSharedPreferences("ThirdPartyAppsClicksPreference", 0);
    }

    public ulp(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context.getSharedPreferences("ThirdPartyAppsRecencyPreference", 0);
    }

    public ulp(byte[] bArr, byte[] bArr2) {
        this.a = DesugarCollections.synchronizedSet(new HashSet());
    }

    public ulp(String str, byte[] bArr) {
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public ulp(ContentResolver contentResolver, String[] strArr) {
        this.a = contentResolver;
        opc.e(contentResolver, strArr);
    }

    public ulp(Context context, char[] cArr) {
        this.a = context.getSharedPreferences("keystore-cache-version-file", 0);
    }

    public ulp(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public ulp(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public ulp(Context context, byte[] bArr) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            f();
        } catch (IOException unused) {
        }
    }

    public ulp(vtj vtjVar) {
        Charset charset = vuo.a;
        this.a = vtjVar;
        vtjVar.f = this;
    }
}
