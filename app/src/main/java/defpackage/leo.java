package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import com.google.android.gms.measurement.internal.UploadBatchParcel;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class leo extends ksw {
    public len a;
    public final Set b;
    public final AtomicReference c;
    public boolean d;
    public int e;
    public kuj f;
    public kuj g;
    public boolean h;
    final ktm i;
    protected boolean j;
    public kuj k;
    public SharedPreferences.OnSharedPreferenceChangeListener l;
    public kuj m;
    public final lin n;
    private boolean o;
    private final Object p;
    private PriorityQueue q;
    private lct r;
    private final AtomicLong s;
    private long t;
    private ktf u;

    public leo(lbk lbkVar) {
        super(lbkVar);
        this.b = new CopyOnWriteArraySet();
        this.p = new Object();
        this.d = false;
        this.e = 1;
        this.j = true;
        this.n = new lec(this);
        this.c = new AtomicReference();
        this.r = lct.a;
        this.t = -1L;
        this.s = new AtomicLong(0L);
        this.i = new ktm(lbkVar);
    }

    public final void A(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        lcp.a(bundle2, "app_id", String.class, null);
        lcp.a(bundle2, "origin", String.class, null);
        lcp.a(bundle2, "name", String.class, null);
        lcp.a(bundle2, "value", Object.class, null);
        lcp.a(bundle2, "trigger_event_name", String.class, null);
        lcp.a(bundle2, "trigger_timeout", Long.class, 0L);
        lcp.a(bundle2, "timed_out_event_name", String.class, null);
        lcp.a(bundle2, "timed_out_event_params", Bundle.class, null);
        lcp.a(bundle2, "triggered_event_name", String.class, null);
        lcp.a(bundle2, "triggered_event_params", Bundle.class, null);
        lcp.a(bundle2, "time_to_live", Long.class, 0L);
        lcp.a(bundle2, "expired_event_name", String.class, null);
        lcp.a(bundle2, "expired_event_params", Bundle.class, null);
        kkk.h(bundle2.getString("name"));
        kkk.h(bundle2.getString("origin"));
        kkk.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        lbk lbkVar2 = this.y;
        lio lioVar = lbkVar2.i;
        lbkVar2.m(lioVar);
        if (lioVar.l(string) != 0) {
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Invalid conditional user property name", lbkVar2.j.e(string));
            return;
        }
        lbkVar2.m(lioVar);
        if (lioVar.e(string, obj) != 0) {
            lab labVar3 = lbkVar2.f;
            lbkVar2.o(labVar3);
            labVar3.c.c("Invalid conditional user property value", lbkVar2.j.e(string), obj);
            return;
        }
        lbkVar2.m(lioVar);
        Object objB = lioVar.B(string, obj);
        if (objB == null) {
            lab labVar4 = lbkVar2.f;
            lbkVar2.o(labVar4);
            labVar4.c.c("Unable to normalize conditional user property value", lbkVar2.j.e(string), obj);
            return;
        }
        lcp.b(bundle2, objB);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            ktx ktxVar = lbkVar2.d;
            if (j2 > 15552000000L || j2 < 1) {
                lab labVar5 = lbkVar2.f;
                lbkVar2.o(labVar5);
                labVar5.c.c("Invalid conditional user property timeout", lbkVar2.j.e(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong("time_to_live");
        ktx ktxVar2 = lbkVar2.d;
        if (j3 > 15552000000L || j3 < 1) {
            lab labVar6 = lbkVar2.f;
            lbkVar2.o(labVar6);
            labVar6.c.c("Invalid conditional user property time to live", lbkVar2.j.e(string), Long.valueOf(j3));
        } else {
            lbh lbhVar = lbkVar2.g;
            lbkVar2.o(lbhVar);
            lbhVar.h(new ldx(this, bundle2));
        }
    }

    public final void B(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        a();
        lct lctVar = lct.a;
        lcs[] lcsVarArr = lcr.STORAGE.c;
        int length = lcsVarArr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            String str = lcsVarArr[i2].e;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = true;
                } else if (string.equals("denied")) {
                    obj = false;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzz kzzVar = labVar.h;
            kzzVar.b("Ignoring invalid consent setting", obj);
            lbkVar.o(labVar);
            kzzVar.a("Valid consent values are 'granted', 'denied'");
        }
        lbk lbkVar2 = this.y;
        lbh lbhVar = lbkVar2.g;
        lbkVar2.o(lbhVar);
        boolean zK = lbhVar.k();
        lct lctVarG = lct.g(bundle, i);
        Iterator it = lctVarG.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((lcq) it.next()) != lcq.UNINITIALIZED) {
                G(lctVarG, zK);
                break;
            }
        }
        kuk kukVarA = kuk.a(bundle, i);
        if (kukVarA.e()) {
            C(kukVarA, zK);
        }
        Boolean boolD = kuk.d(bundle);
        if (boolD != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zK) {
                I(str2, "allow_personalized_ads", boolD.toString(), j);
            } else {
                H(str2, "allow_personalized_ads", boolD.toString(), false, j);
            }
        }
    }

    final void C(kuk kukVar, boolean z) {
        lei leiVar = new lei(this, kukVar);
        if (z) {
            g();
            leiVar.run();
        } else {
            lbk lbkVar = this.y;
            lbh lbhVar = lbkVar.g;
            lbkVar.o(lbhVar);
            lbhVar.h(leiVar);
        }
    }

    public final void D(Boolean bool) {
        a();
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new leh(this, bool));
    }

    final void E(lct lctVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g();
        boolean z = (lctVar.n(lcs.ANALYTICS_STORAGE) && lctVar.n(lcs.AD_STORAGE)) || this.y.k().x();
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        if (z != lbkVar.w) {
            lbkVar.o(lbhVar);
            lbhVar.g();
            lbkVar.w = z;
            lbk lbkVar2 = this.y;
            lao laoVar = lbkVar2.e;
            lbkVar2.m(laoVar);
            lbk lbkVar3 = laoVar.y;
            laoVar.g();
            Boolean boolValueOf = laoVar.c().contains("measurement_enabled_from_api") ? Boolean.valueOf(laoVar.c().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                F(Boolean.valueOf(z), false);
            }
        }
    }

    public final void F(Boolean bool, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g();
        a();
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.j.b("Setting app measurement enabled (FE)", bool);
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        laoVar.j(bool);
        if (z) {
            lbkVar.m(laoVar);
            lbk lbkVar2 = laoVar.y;
            laoVar.g();
            SharedPreferences.Editor editorEdit = laoVar.c().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        lbk lbkVar3 = this.y;
        lbh lbhVar = lbkVar3.g;
        lbkVar3.o(lbhVar);
        lbhVar.g();
        if (lbkVar3.w || !(bool == null || bool.booleanValue())) {
            J();
        }
    }

    public final void G(lct lctVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        lct lctVar2 = lctVar;
        a();
        int i2 = lctVar2.c;
        if (i2 != -10) {
            lcq lcqVarC = lctVar2.c();
            lcq lcqVar = lcq.UNINITIALIZED;
            if (lcqVarC == lcqVar && lctVar2.d() == lcqVar) {
                lbk lbkVar = this.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.h.a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.p) {
            lct lctVar3 = this.r;
            i = 0;
            if (lct.o(i2, lctVar3.c)) {
                EnumMap enumMap = lctVar2.b;
                lcs[] lcsVarArr = (lcs[]) enumMap.keySet().toArray(new lcs[0]);
                int length = lcsVarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    }
                    lcs lcsVar = lcsVarArr[i3];
                    lcq lcqVar2 = (lcq) enumMap.get(lcsVar);
                    lcq lcqVar3 = (lcq) lctVar3.b.get(lcsVar);
                    lcq lcqVar4 = lcq.DENIED;
                    if (lcqVar2 == lcqVar4 && lcqVar3 != lcqVar4) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                lcs lcsVar2 = lcs.ANALYTICS_STORAGE;
                boolean z4 = lctVar2.n(lcsVar2) && !this.r.n(lcsVar2);
                lct lctVar4 = this.r;
                EnumMap enumMap2 = new EnumMap(lcs.class);
                lcs[] lcsVarArr2 = lcr.STORAGE.c;
                int length2 = lcsVarArr2.length;
                while (i < length2) {
                    lcs lcsVar3 = lcsVarArr2[i];
                    lcq lcqVar5 = (lcq) enumMap.get(lcsVar3);
                    if (lcqVar5 == lcq.UNINITIALIZED) {
                        lcqVar5 = (lcq) lctVar4.b.get(lcsVar3);
                    }
                    if (lcqVar5 != null) {
                        enumMap2.put((EnumMap) lcsVar3, (lcs) lcqVar5);
                    }
                    i++;
                }
                lct lctVar5 = new lct(enumMap2, i2);
                this.r = lctVar5;
                z3 = z4;
                lctVar2 = lctVar5;
                i = 1;
            } else {
                z2 = false;
                z3 = false;
            }
        }
        if (i == 0) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.i.b("Ignoring lower-priority consent settings, proposed settings", lctVar2);
            return;
        }
        long andIncrement = this.s.getAndIncrement();
        if (z2) {
            this.c.set(null);
            lej lejVar = new lej(this, lctVar2, andIncrement, z3);
            if (z) {
                g();
                lejVar.run();
                return;
            } else {
                lbk lbkVar3 = this.y;
                lbh lbhVar = lbkVar3.g;
                lbkVar3.o(lbhVar);
                lbhVar.j(lejVar);
                return;
            }
        }
        lek lekVar = new lek(this, lctVar2, andIncrement, z3);
        if (z) {
            g();
            lekVar.run();
            return;
        }
        if (i2 == 30 || i2 == -10) {
            lbk lbkVar4 = this.y;
            lbh lbhVar2 = lbkVar4.g;
            lbkVar4.o(lbhVar2);
            lbhVar2.j(lekVar);
            return;
        }
        lbk lbkVar5 = this.y;
        lbh lbhVar3 = lbkVar5.g;
        lbkVar5.o(lbhVar3);
        lbhVar3.h(lekVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L18
            lbk r5 = r0.y
            lio r6 = r5.i
            r5.m(r6)
            int r5 = r6.l(r2)
        L16:
            r12 = r5
            goto L42
        L18:
            lbk r5 = r0.y
            lio r6 = r5.i
            r5.m(r6)
            java.lang.String r5 = "user property"
            boolean r7 = r6.af(r5, r2)
            r8 = 6
            if (r7 != 0) goto L2a
        L28:
            r12 = r8
            goto L42
        L2a:
            java.lang.String[] r7 = defpackage.lcw.a
            r9 = 0
            boolean r7 = r6.ab(r5, r7, r9, r2)
            if (r7 != 0) goto L36
            r5 = 15
            goto L16
        L36:
            lbk r7 = r6.y
            ktx r7 = r7.d
            boolean r5 = r6.aa(r5, r4, r2)
            if (r5 != 0) goto L41
            goto L28
        L41:
            r12 = r3
        L42:
            r5 = 1
            if (r12 == 0) goto L69
            lbk r1 = r0.y
            lio r6 = r1.i
            r1.m(r6)
            ktx r1 = r1.d
            java.lang.String r14 = r6.D(r2, r4, r5)
            if (r2 == 0) goto L58
            int r3 = r2.length()
        L58:
            r15 = r3
            lbk r1 = r0.y
            lio r9 = r1.i
            r1.m(r9)
            lin r10 = r0.n
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.M(r10, r11, r12, r13, r14, r15)
            return
        L69:
            if (r17 != 0) goto L6e
            java.lang.String r6 = "app"
            goto L70
        L6e:
            r6 = r17
        L70:
            if (r1 == 0) goto Lb9
            lbk r7 = r0.y
            lio r8 = r7.i
            r7.m(r8)
            int r12 = r8.e(r2, r1)
            if (r12 == 0) goto La9
            r7.m(r8)
            ktx r6 = r7.d
            java.lang.String r14 = r8.D(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L90
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L98
        L90:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
        L98:
            r15 = r3
            lbk r1 = r0.y
            lio r9 = r1.i
            r1.m(r9)
            lin r10 = r0.n
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.M(r10, r11, r12, r13, r14, r15)
            return
        La9:
            r7.m(r8)
            java.lang.Object r5 = r8.B(r2, r1)
            if (r5 == 0) goto Lb8
            r3 = r21
            r1 = r6
            r0.z(r1, r2, r3, r5)
        Lb8:
            return
        Lb9:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.z(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leo.H(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void I(java.lang.String r11, java.lang.String r12, java.lang.Object r13, long r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leo.I(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void J() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        leo leoVar;
        g();
        lbk lbkVar = this.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        lan lanVar = laoVar.l;
        lanVar.a();
        String str = lanVar.a;
        if (str == null) {
            leoVar = this;
        } else if ("unset".equals(str)) {
            klk klkVar = lbkVar.B;
            leoVar = this;
            leoVar.I("app", "_npa", null, System.currentTimeMillis());
        } else {
            long j = true != "true".equals(str) ? 0L : 1L;
            klk klkVar2 = lbkVar.B;
            I("app", "_npa", Long.valueOf(j), System.currentTimeMillis());
            leoVar = this;
        }
        if (!leoVar.y.s() || !leoVar.j) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.j.a("Updating Scion state (FE)");
            lgp lgpVarK = leoVar.y.k();
            lgpVarK.g();
            lgpVarK.a();
            lgpVarK.p(new lga(lgpVarK, lgpVarK.i(true)));
            return;
        }
        lab labVar2 = lbkVar.f;
        lbkVar.o(labVar2);
        labVar2.j.a("Recording app launch after enabling measurement for the first time (FE)");
        n();
        lbk lbkVar2 = leoVar.y;
        lhg lhgVar = lbkVar2.h;
        lbkVar2.n(lhgVar);
        lhgVar.c.a();
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ldp(this));
    }

    public final void K(ktf ktfVar) {
        g();
        a();
        ktf ktfVar2 = this.u;
        if (ktfVar != ktfVar2) {
            kkk.g(ktfVar2 == null, "EventInterceptor already set.");
        }
        this.u = ktfVar;
    }

    public final void L(String str, Bundle bundle, String str2) {
        this.y.p();
        klk klkVar = this.y.B;
        y("auto", str, System.currentTimeMillis(), bundle, false, true, true, str2);
    }

    public final void M(String str, String str2, Bundle bundle) {
        lbk lbkVar = this.y;
        klk klkVar = lbkVar.B;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kkk.h(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ldy(this, bundle2));
    }

    public final void N(Object obj) {
        klk klkVar = this.y.B;
        H("auto", "_ldl", obj, true, System.currentTimeMillis());
    }

    public final void O(lct lctVar, long j, boolean z) {
        g();
        a();
        lbk lbkVar = this.y;
        lao laoVar = lbkVar.e;
        lbkVar.m(laoVar);
        lct lctVarF = laoVar.f();
        if (j <= this.t && lct.o(lctVarF.c, lctVar.c)) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.i.b("Dropped out-of-date consent setting, proposed settings", lctVar);
            return;
        }
        lbkVar.m(laoVar);
        lbk lbkVar2 = laoVar.y;
        laoVar.g();
        int i = lctVar.c;
        if (!laoVar.m(i)) {
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.i.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = laoVar.c().edit();
        editorEdit.putString("consent_settings", lctVar.m());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        lab labVar3 = lbkVar.f;
        lbkVar.o(labVar3);
        labVar3.k.b("Setting storage consent(FE)", lctVar);
        this.t = j;
        lbk lbkVar3 = this.y;
        if (lbkVar3.k().y()) {
            final lgp lgpVarK = lbkVar3.k();
            lgpVarK.g();
            lgpVarK.a();
            lgpVarK.p(new Runnable() { // from class: lfh
                @Override // java.lang.Runnable
                public final void run() {
                    lgp lgpVar = lgpVarK;
                    kzj kzjVar = lgpVar.b;
                    if (kzjVar == null) {
                        lbk lbkVar4 = lgpVar.y;
                        lab labVar4 = lbkVar4.f;
                        lbkVar4.o(labVar4);
                        labVar4.c.a("Failed to send storage consent settings to service");
                        return;
                    }
                    try {
                        kzjVar.z(lgpVar.i(false));
                        lgpVar.o();
                    } catch (RemoteException e) {
                        lbk lbkVar5 = lgpVar.y;
                        lab labVar5 = lbkVar5.f;
                        lbkVar5.o(labVar5);
                        labVar5.c.b("Failed to send storage consent settings to the service", e);
                    }
                }
            });
        } else {
            lbkVar3.k().A();
        }
        if (z) {
            lbkVar3.k().m(new AtomicReference());
        }
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return false;
    }

    public final lew i(final UploadBatchParcel uploadBatchParcel) throws MalformedURLException {
        try {
            URL url = new URI(uploadBatchParcel.c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            kzq kzqVarE = this.y.e();
            kzqVarE.a();
            kkk.k(kzqVarE.b);
            String str = kzqVarE.b;
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzz kzzVar = labVar.k;
            Long lValueOf = Long.valueOf(uploadBatchParcel.a);
            kzzVar.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, uploadBatchParcel.c, Integer.valueOf(uploadBatchParcel.b.length));
            if (!TextUtils.isEmpty(uploadBatchParcel.g)) {
                lbkVar.o(labVar);
                kzzVar.c("[sgtm] Uploading data from app. row_id", lValueOf, uploadBatchParcel.g);
            }
            HashMap map = new HashMap();
            Bundle bundle = uploadBatchParcel.d;
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str2, string);
                }
            }
            let letVar = lbkVar.n;
            lbkVar.o(letVar);
            byte[] bArr = uploadBatchParcel.b;
            leq leqVar = new leq() { // from class: ldf
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
                @Override // defpackage.leq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(int r9, java.lang.Throwable r10, byte[] r11) {
                    /*
                        r8 = this;
                        leo r11 = r8.a
                        r11.g()
                        com.google.android.gms.measurement.internal.UploadBatchParcel r0 = r3
                        r1 = 200(0xc8, float:2.8E-43)
                        if (r9 == r1) goto L14
                        r1 = 204(0xcc, float:2.86E-43)
                        if (r9 == r1) goto L14
                        r1 = 304(0x130, float:4.26E-43)
                        if (r9 != r1) goto L2d
                        r9 = r1
                    L14:
                        if (r10 != 0) goto L2d
                        lbk r9 = r11.y
                        lab r10 = r9.f
                        r9.o(r10)
                        kzz r9 = r10.k
                        long r1 = r0.a
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
                        r9.b(r1, r10)
                        lew r9 = defpackage.lew.SUCCESS
                        goto L67
                    L2d:
                        lbk r1 = r11.y
                        lab r2 = r1.f
                        r1.o(r2)
                        kzz r1 = r2.f
                        long r2 = r0.a
                        java.lang.Long r2 = java.lang.Long.valueOf(r2)
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                        java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
                        r1.d(r4, r2, r3, r10)
                        kzf r10 = defpackage.kzg.u
                        r1 = 0
                        java.lang.Object r10 = r10.a(r1)
                        java.lang.String r10 = (java.lang.String) r10
                        java.lang.String r1 = ","
                        java.lang.String[] r10 = r10.split(r1)
                        java.util.List r10 = java.util.Arrays.asList(r10)
                        java.lang.String r9 = java.lang.String.valueOf(r9)
                        boolean r9 = r10.contains(r9)
                        if (r9 == 0) goto L65
                        lew r9 = defpackage.lew.BACKOFF
                        goto L67
                    L65:
                        lew r9 = defpackage.lew.FAILURE
                    L67:
                        java.util.concurrent.atomic.AtomicReference r10 = r2
                        lbk r1 = r11.y
                        lgp r1 = r1.k()
                        com.google.android.gms.measurement.internal.BatchUploadStatusParcel r2 = new com.google.android.gms.measurement.internal.BatchUploadStatusParcel
                        long r3 = r0.a
                        long r6 = r0.f
                        int r5 = r9.e
                        r2.<init>(r3, r5, r6)
                        r1.g()
                        r1.a()
                        r0 = 1
                        com.google.android.gms.measurement.internal.AppMetadata r0 = r1.i(r0)
                        lfj r5 = new lfj
                        r5.<init>()
                        r1.p(r5)
                        lbk r11 = r11.y
                        lab r0 = r11.f
                        r11.o(r0)
                        kzz r11 = r0.k
                        java.lang.Long r0 = java.lang.Long.valueOf(r3)
                        java.lang.String r1 = "[sgtm] Updated status for row_id"
                        r11.c(r1, r0, r9)
                        monitor-enter(r10)
                        r10.set(r9)     // Catch: java.lang.Throwable -> La8
                        r10.notifyAll()     // Catch: java.lang.Throwable -> La8
                        monitor-exit(r10)     // Catch: java.lang.Throwable -> La8
                        return
                    La8:
                        r0 = move-exception
                        r9 = r0
                        monitor-exit(r10)     // Catch: java.lang.Throwable -> La8
                        throw r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ldf.a(int, java.lang.Throwable, byte[]):void");
                }
            };
            letVar.o();
            kkk.k(url);
            kkk.k(bArr);
            lbk lbkVar2 = letVar.y;
            lbh lbhVar = lbkVar2.g;
            lbkVar2.o(lbhVar);
            lbhVar.f(new les(letVar, str, url, bArr, map, leqVar));
            try {
                lio lioVar = lbkVar.i;
                lbkVar.m(lioVar);
                klk klkVar = lioVar.y.B;
                long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                        atomicReference.wait(jCurrentTimeMillis2);
                    }
                }
            } catch (InterruptedException unused) {
                lbk lbkVar3 = this.y;
                lab labVar2 = lbkVar3.f;
                lbkVar3.o(labVar2);
                labVar2.f.a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? lew.UNKNOWN : (lew) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e) {
            lbk lbkVar4 = this.y;
            lab labVar3 = lbkVar4.f;
            lbkVar4.o(labVar3);
            labVar3.c.d("[sgtm] Bad upload url for row_id", uploadBatchParcel.c, Long.valueOf(uploadBatchParcel.a), e);
            return lew.FAILURE;
        }
    }

    public final String j() {
        return (String) this.c.get();
    }

    public final String k() {
        lbk lbkVar = this.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        lbk lbkVar2 = lfgVar.y;
        lez lezVar = lfgVar.a;
        if (lezVar != null) {
            return lezVar.b;
        }
        return null;
    }

    public final String l() {
        lbk lbkVar = this.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        lbk lbkVar2 = lfgVar.y;
        lez lezVar = lfgVar.a;
        if (lezVar != null) {
            return lezVar.a;
        }
        return null;
    }

    final PriorityQueue m() {
        if (this.q == null) {
            this.q = new PriorityQueue(Comparator$CC.comparing(new Function() { // from class: lcz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo116andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((TriggerUriParcel) obj).b);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Comparator() { // from class: lda
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.q;
    }

    public final void n() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g();
        a();
        if (this.y.t()) {
            lbk lbkVar = this.y;
            ktx ktxVar = lbkVar.d;
            kts ktsVar = ktxVar.y.c;
            Boolean boolQ = ktxVar.q("google_analytics_deferred_deep_link_enabled");
            if (boolQ != null && boolQ.booleanValue()) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.j.a("Deferred Deep Link feature enabled.");
                lbh lbhVar = lbkVar.g;
                lbkVar.o(lbhVar);
                lbhVar.h(new Runnable() { // from class: ldg
                    @Override // java.lang.Runnable
                    public final void run() {
                        leo leoVar = this.a;
                        leoVar.g();
                        lbk lbkVar2 = leoVar.y;
                        lao laoVar = lbkVar2.e;
                        lbkVar2.m(laoVar);
                        laj lajVar = laoVar.s;
                        lajVar.a();
                        if (lajVar.a) {
                            lab labVar2 = lbkVar2.f;
                            lbkVar2.o(labVar2);
                            labVar2.j.a("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        lbkVar2.m(laoVar);
                        lal lalVar = laoVar.t;
                        lalVar.a();
                        long j = lalVar.a;
                        lbkVar2.m(laoVar);
                        lalVar.b(1 + j);
                        ktx ktxVar2 = lbkVar2.d;
                        if (j < 5) {
                            if (leoVar.k == null) {
                                leoVar.k = new ldv(leoVar, leoVar.y);
                            }
                            leoVar.k.c(0L);
                        } else {
                            lab labVar3 = lbkVar2.f;
                            lbkVar2.o(labVar3);
                            labVar3.f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            lbkVar2.m(laoVar);
                            lajVar.b(true);
                        }
                    }
                });
            }
            lgp lgpVarK = this.y.k();
            lgpVarK.g();
            lgpVarK.a();
            AppMetadata appMetadataI = lgpVarK.i(true);
            lbk lbkVar2 = lgpVarK.y;
            kts ktsVar2 = lbkVar2.c;
            lbkVar2.d.t(null, kzg.bc);
            lgpVarK.y.f().k(3, new byte[0]);
            lgpVarK.p(new lft(lgpVarK, appMetadataI));
            this.j = false;
            lao laoVar = lbkVar.e;
            lbkVar.m(laoVar);
            laoVar.g();
            String string = laoVar.c().getString("previous_os_version", null);
            laoVar.y.d().o();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = laoVar.c().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            lbkVar.d().o();
            if (string.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void o() {
        Context context = this.y.a;
        if (!(context.getApplicationContext() instanceof Application) || this.a == null) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.a);
    }

    final void p() {
        aeuw.a.eV();
        kzf kzfVar = kzg.aQ;
        lbk lbkVar = this.y;
        if (lbkVar.d.t(null, kzfVar)) {
            lbh lbhVar = lbkVar.g;
            lbkVar.o(lbhVar);
            if (lbhVar.k()) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (lbkVar.c.a()) {
                lab labVar2 = lbkVar.f;
                lbkVar.o(labVar2);
                labVar2.c.a("Cannot get trigger URIs from main thread");
                return;
            }
            a();
            lab labVar3 = lbkVar.f;
            lbkVar.o(labVar3);
            labVar3.k.a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            lbkVar.o(lbhVar);
            lbhVar.b(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: ldb
                @Override // java.lang.Runnable
                public final void run() {
                    leo leoVar = this.a;
                    lbk lbkVar2 = leoVar.y;
                    lao laoVar = lbkVar2.e;
                    lbkVar2.m(laoVar);
                    final Bundle bundleA = laoVar.m.a();
                    final lgp lgpVarK = leoVar.y.k();
                    lgpVarK.g();
                    lgpVarK.a();
                    final AppMetadata appMetadataI = lgpVarK.i(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    lgpVarK.p(new Runnable() { // from class: lfk
                        @Override // java.lang.Runnable
                        public final void run() {
                            kzj kzjVar;
                            AppMetadata appMetadata = appMetadataI;
                            lgp lgpVar = lgpVarK;
                            AtomicReference atomicReference3 = atomicReference2;
                            Bundle bundle = bundleA;
                            synchronized (atomicReference3) {
                                try {
                                    kzjVar = lgpVar.b;
                                } catch (RemoteException e) {
                                    lbk lbkVar3 = lgpVar.y;
                                    lab labVar4 = lbkVar3.f;
                                    lbkVar3.o(labVar4);
                                    labVar4.c.b("Failed to request trigger URIs; remote exception", e);
                                    atomicReference3.notifyAll();
                                }
                                if (kzjVar != null) {
                                    kzjVar.q(appMetadata, bundle, new lfn(atomicReference3));
                                    lgpVar.o();
                                } else {
                                    lbk lbkVar4 = lgpVar.y;
                                    lab labVar5 = lbkVar4.f;
                                    lbkVar4.o(labVar5);
                                    labVar5.c.a("Failed to request trigger URIs; not connected to service");
                                }
                            }
                        }
                    });
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                lbkVar.o(labVar3);
                labVar3.e.a("Timed out waiting for get trigger URIs");
            } else {
                lbkVar.o(lbhVar);
                lbhVar.h(new Runnable() { // from class: ldc
                    @Override // java.lang.Runnable
                    public final void run() {
                        leo leoVar = this.a;
                        leoVar.g();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<TriggerUriParcel> list2 = list;
                        lbk lbkVar2 = leoVar.y;
                        lao laoVar = lbkVar2.e;
                        lbkVar2.m(laoVar);
                        SparseArray sparseArrayD = laoVar.d();
                        for (TriggerUriParcel triggerUriParcel : list2) {
                            int i = triggerUriParcel.c;
                            if (!sparseArrayD.contains(i) || ((Long) sparseArrayD.get(i)).longValue() < triggerUriParcel.b) {
                                leoVar.m().add(triggerUriParcel);
                            }
                        }
                        leoVar.x();
                    }
                });
            }
        }
    }

    public final void q() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        lbk lbkVar;
        lab labVar;
        kzf kzfVar;
        String str;
        lhh lhhVar;
        lhh lhhVar2;
        leo leoVar;
        yyr yyrVarA;
        zzi zziVar;
        g();
        lbk lbkVar2 = this.y;
        lab labVar2 = lbkVar2.f;
        lbkVar2.o(labVar2);
        labVar2.j.a("Handle tcf update.");
        lao laoVar = lbkVar2.e;
        lbkVar2.m(laoVar);
        SharedPreferences sharedPreferencesB = laoVar.b();
        HashMap map = new HashMap();
        kzf kzfVar2 = kzg.aZ;
        int i = 2;
        if (((Boolean) kzfVar2.a(null)).booleanValue()) {
            int i2 = lhk.b;
            zzh zzhVar = zzh.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            boolean z = true;
            lhj lhjVar = lhj.CONSENT;
            Map.Entry entryA = lhi.a(zzhVar, lhjVar);
            kzfVar = kzfVar2;
            zzh zzhVar2 = zzh.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            lbkVar = lbkVar2;
            lhj lhjVar2 = lhj.FLEXIBLE_LEGITIMATE_INTEREST;
            Map.Entry entryA2 = lhi.a(zzhVar2, lhjVar2);
            zzh zzhVar3 = zzh.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            Map.Entry entryA3 = lhi.a(zzhVar3, lhjVar);
            labVar = labVar2;
            zzh zzhVar4 = zzh.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Map.Entry entryA4 = lhi.a(zzhVar4, lhjVar);
            zzh zzhVar5 = zzh.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            yyr yyrVarI = yyr.i(Arrays.asList(entryA, entryA2, entryA3, entryA4, lhi.a(zzhVar5, lhjVar2), lhi.a(zzh.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, lhjVar2), lhi.a(zzh.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, lhjVar2)));
            zdd zddVar = new zdd("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesB.contains("IABTCF_TCString");
            int iA = lhk.a(sharedPreferencesB, "IABTCF_CmpSdkID");
            int iA2 = lhk.a(sharedPreferencesB, "IABTCF_PolicyVersion");
            int iA3 = lhk.a(sharedPreferencesB, "IABTCF_gdprApplies");
            int iA4 = lhk.a(sharedPreferencesB, "IABTCF_PurposeOneTreatment");
            int iA5 = lhk.a(sharedPreferencesB, "IABTCF_EnableAdvertiserConsentMode");
            String strB = lhk.b(sharedPreferencesB, "IABTCF_PublisherCC");
            yyn yynVar = new yyn(4);
            zdl it = yyrVarI.keySet().iterator();
            while (true) {
                zdl zdlVar = it;
                if (!it.hasNext()) {
                    break;
                }
                zzh zzhVar6 = (zzh) zdlVar.next();
                int i3 = iA2;
                String str2 = strB;
                int i4 = iA4;
                String strB2 = lhk.b(sharedPreferencesB, "IABTCF_PublisherRestrictions" + zzhVar6.a());
                if (TextUtils.isEmpty(strB2) || strB2.length() < 755) {
                    zziVar = zzi.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strB2.charAt(754), 10);
                    zziVar = (iDigit < 0 || iDigit > zzi.values().length || iDigit == 0) ? zzi.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != z ? iDigit != i ? zzi.PURPOSE_RESTRICTION_UNDEFINED : zzi.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : zzi.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                yynVar.c(zzhVar6, zziVar);
                iA2 = i3;
                it = zdlVar;
                iA4 = i4;
                strB = str2;
                z = true;
                i = 2;
            }
            int i5 = iA4;
            String str3 = strB;
            int i6 = iA2;
            yyr yyrVarA2 = yynVar.a(z);
            String strB3 = lhk.b(sharedPreferencesB, "IABTCF_PurposeConsents");
            String strB4 = lhk.b(sharedPreferencesB, "IABTCF_VendorConsents");
            boolean z2 = !TextUtils.isEmpty(strB4) && strB4.length() >= 755 && strB4.charAt(754) == '1';
            String strB5 = lhk.b(sharedPreferencesB, "IABTCF_PurposeLegitimateInterests");
            String strB6 = lhk.b(sharedPreferencesB, "IABTCF_VendorLegitimateInterests");
            boolean z3 = !TextUtils.isEmpty(strB6) && strB6.length() >= 755 && strB6.charAt(754) == '1';
            cArr[0] = '2';
            if (!((Boolean) kzg.ba.a(null)).booleanValue() || zContains) {
                zzi zziVar2 = (zzi) yyrVarA2.get(zzhVar);
                zzi zziVar3 = (zzi) yyrVarA2.get(zzhVar3);
                zzi zziVar4 = (zzi) yyrVarA2.get(zzhVar4);
                zzi zziVar5 = (zzi) yyrVarA2.get(zzhVar5);
                yyn yynVar2 = new yyn(4);
                yynVar2.c("Version", "2");
                boolean z4 = z2;
                yynVar2.c("VendorConsent", true != z2 ? "0" : "1");
                yynVar2.c("VendorLegitimateInterest", true != z3 ? "0" : "1");
                yynVar2.c("gdprApplies", iA3 != 1 ? "0" : "1");
                yynVar2.c("EnableAdvertiserConsentMode", iA5 != 1 ? "0" : "1");
                yynVar2.c("PolicyVersion", String.valueOf(i6));
                yynVar2.c("CmpSdkID", String.valueOf(iA));
                yynVar2.c("PurposeOneTreatment", i5 != 1 ? "0" : "1");
                yynVar2.c("PublisherCC", str3);
                yynVar2.c("PublisherRestrictions1", String.valueOf(zziVar2 != null ? zziVar2.a() : zzi.PURPOSE_RESTRICTION_UNDEFINED.a()));
                yynVar2.c("PublisherRestrictions3", String.valueOf(zziVar3 != null ? zziVar3.a() : zzi.PURPOSE_RESTRICTION_UNDEFINED.a()));
                yynVar2.c("PublisherRestrictions4", String.valueOf(zziVar4 != null ? zziVar4.a() : zzi.PURPOSE_RESTRICTION_UNDEFINED.a()));
                yynVar2.c("PublisherRestrictions7", String.valueOf(zziVar5 != null ? zziVar5.a() : zzi.PURPOSE_RESTRICTION_UNDEFINED.a()));
                yynVar2.f(yyr.n("Purpose1", lhk.c(zzhVar, strB3, strB5), "Purpose3", lhk.c(zzhVar3, strB3, strB5), "Purpose4", lhk.c(zzhVar4, strB3, strB5), "Purpose7", lhk.c(zzhVar5, strB3, strB5)));
                boolean z5 = z3;
                yynVar2.f(yyr.o("AuthorizePurpose1", true != lhk.d(zzhVar, yyrVarI, yyrVarA2, zddVar, cArr, iA5, iA3, i5, str3, strB3, strB5, z4, z5) ? "0" : "1", "AuthorizePurpose3", true != lhk.d(zzhVar3, yyrVarI, yyrVarA2, zddVar, cArr, iA5, iA3, i5, str3, strB3, strB5, z4, z5) ? "0" : "1", "AuthorizePurpose4", true != lhk.d(zzhVar4, yyrVarI, yyrVarA2, zddVar, cArr, iA5, iA3, i5, str3, strB3, strB5, z4, z5) ? "0" : "1", "AuthorizePurpose7", true != lhk.d(zzhVar5, yyrVarI, yyrVarA2, zddVar, cArr, iA5, iA3, i5, str3, strB3, strB5, z4, z5) ? "0" : "1", "PurposeDiagnostics", new String(cArr)));
                yyrVarA = yynVar2.a(true);
            } else {
                yyrVarA = zcl.a;
            }
            lhhVar = new lhh(yyrVarA);
            str = "";
        } else {
            lbkVar = lbkVar2;
            labVar = labVar2;
            kzfVar = kzfVar2;
            String strB7 = lhk.b(sharedPreferencesB, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strB7) && strB7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strB7.charAt(754)));
            }
            int iA6 = lhk.a(sharedPreferencesB, "IABTCF_gdprApplies");
            if (iA6 != -1) {
                map.put("gdprApplies", String.valueOf(iA6));
            }
            int iA7 = lhk.a(sharedPreferencesB, "IABTCF_EnableAdvertiserConsentMode");
            if (iA7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iA7));
            }
            int iA8 = lhk.a(sharedPreferencesB, "IABTCF_PolicyVersion");
            if (iA8 != -1) {
                map.put("PolicyVersion", String.valueOf(iA8));
            }
            String strB8 = lhk.b(sharedPreferencesB, "IABTCF_PurposeConsents");
            if (!str.equals(strB8)) {
                map.put("PurposeConsents", strB8);
            }
            int iA9 = lhk.a(sharedPreferencesB, "IABTCF_CmpSdkID");
            if (iA9 != -1) {
                map.put("CmpSdkID", String.valueOf(iA9));
            }
            lhhVar = new lhh(map);
        }
        lbk lbkVar3 = lbkVar;
        lab labVar3 = labVar;
        lbkVar3.o(labVar3);
        kzz kzzVar = labVar3.k;
        kzzVar.b("Tcf preferences read", lhhVar);
        if (!lbkVar3.d.t(null, kzfVar)) {
            lbkVar3.m(laoVar);
            if (laoVar.n(lhhVar)) {
                Bundle bundleA = lhhVar.a();
                lbkVar3.o(labVar3);
                kzzVar.b("Consent generated from Tcf", bundleA);
                if (bundleA != Bundle.EMPTY) {
                    klk klkVar = lbkVar3.B;
                    B(bundleA, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", lhhVar.b());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        lbkVar3.m(laoVar);
        laoVar.g();
        String string = laoVar.c().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            lhhVar2 = new lhh(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && lhk.a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            lhhVar2 = new lhh(map2);
        }
        lbkVar3.m(laoVar);
        if (laoVar.n(lhhVar)) {
            Bundle bundleA2 = lhhVar.a();
            lbkVar3.o(labVar3);
            kzzVar.b("Consent generated from Tcf", bundleA2);
            if (bundleA2 != Bundle.EMPTY) {
                klk klkVar2 = lbkVar3.B;
                leoVar = this;
                leoVar.B(bundleA2, -30, System.currentTimeMillis());
            } else {
                leoVar = this;
            }
            Bundle bundle2 = new Bundle();
            Map map3 = lhhVar2.a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleA3 = lhhVar.a();
            Bundle bundleA4 = lhhVar2.a();
            bundle2.putString("_tcfm", str5.concat((bundleA3.size() == bundleA4.size() && Objects.equals(bundleA3.getString("ad_storage"), bundleA4.getString("ad_storage")) && Objects.equals(bundleA3.getString("ad_personalization"), bundleA4.getString("ad_personalization")) && Objects.equals(bundleA3.getString("ad_user_data"), bundleA4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) lhhVar.a.get("PurposeDiagnostics");
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", lhhVar.b());
            leoVar.t("auto", "_tcf", bundle2);
        }
    }

    public final void r(String str, String str2, Bundle bundle) {
        klk klkVar = this.y.B;
        s(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            y(str == null ? "app" : str, str2, j, bundle2, z2, !z2 || this.u == null || lio.am(str2), z, null);
            return;
        }
        lbk lbkVar = this.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        synchronized (lfgVar.j) {
            if (!lfgVar.i) {
                lbk lbkVar2 = lfgVar.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.h.a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle2.getString("screen_name");
            if (string != null && (string.length() <= 0 || string.length() > lfgVar.y.d.c(null, false))) {
                lbk lbkVar3 = lfgVar.y;
                lab labVar2 = lbkVar3.f;
                lbkVar3.o(labVar2);
                labVar2.h.b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle2.getString("screen_class");
            if (string2 != null && (string2.length() <= 0 || string2.length() > lfgVar.y.d.c(null, false))) {
                lbk lbkVar4 = lfgVar.y;
                lab labVar3 = lbkVar4.f;
                lbkVar4.o(labVar3);
                labVar3.h.b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                ScionActivityInfo scionActivityInfo = lfgVar.e;
                string2 = scionActivityInfo != null ? lfgVar.o(scionActivityInfo.b) : "Activity";
            }
            String str3 = string2;
            lez lezVar = lfgVar.a;
            if (lfgVar.f && lezVar != null) {
                lfgVar.f = false;
                boolean zEquals = Objects.equals(lezVar.b, str3);
                boolean zEquals2 = Objects.equals(lezVar.a, string);
                if (zEquals && zEquals2) {
                    lbk lbkVar5 = lfgVar.y;
                    lab labVar4 = lbkVar5.f;
                    lbkVar5.o(labVar4);
                    labVar4.h.a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            lbk lbkVar6 = lfgVar.y;
            lab labVar5 = lbkVar6.f;
            lbkVar6.o(labVar5);
            labVar5.k.c("Logging screen view with name, class", string == null ? "null" : string, str3 == null ? "null" : str3);
            lez lezVar2 = lfgVar.a == null ? lfgVar.b : lfgVar.a;
            lio lioVar = lbkVar6.i;
            lbkVar6.m(lioVar);
            lez lezVar3 = new lez(string, str3, lioVar.v(), true, j);
            lfgVar.a = lezVar3;
            lfgVar.b = lezVar2;
            lfgVar.g = lezVar3;
            klk klkVar = lbkVar6.B;
            lbh lbhVar = lbkVar6.g;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            lbkVar6.o(lbhVar);
            lbhVar.h(new lfa(lfgVar, bundle2, lezVar3, lezVar2, jElapsedRealtime));
        }
    }

    final void t(String str, String str2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g();
        klk klkVar = this.y.B;
        v(str, str2, System.currentTimeMillis(), bundle);
    }

    final void v(String str, String str2, long j, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        g();
        boolean z = true;
        if (this.u != null && !lio.am(str2)) {
            z = false;
        }
        w(str, str2, j, bundle, true, z, true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void w(java.lang.String r24, java.lang.String r25, long r26, android.os.Bundle r28, boolean r29, boolean r30, boolean r31, java.lang.String r32) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leo.w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    final void x() {
        TriggerUriParcel triggerUriParcel;
        g();
        this.h = false;
        if (m().isEmpty() || this.d || (triggerUriParcel = (TriggerUriParcel) m().poll()) == null) {
            return;
        }
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        bke bkeVarZ = lioVar.z();
        if (bkeVarZ != null) {
            this.d = true;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            kzz kzzVar = labVar.k;
            String str = triggerUriParcel.a;
            kzzVar.b("Registering trigger URI", str);
            zxn.p(bkeVarZ.e(Uri.parse(str)), new ldm(this, triggerUriParcel), new ldl(this));
        }
    }

    protected final void y(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String[] strArr = lio.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new lds(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    final void z(String str, String str2, long j, Object obj) {
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(new ldt(this, str, str2, obj, j));
    }
}
