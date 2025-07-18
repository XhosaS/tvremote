package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ktx extends lcm {
    public String a;
    public ktw b;
    public Boolean c;
    private Boolean d;

    public ktx(lbk lbkVar) {
        super(lbkVar);
        this.b = new ktw() { // from class: ktv
            @Override // defpackage.ktw
            public final String a(String str, String str2) {
                return null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List A() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            java.lang.String r0 = "analytics.safelisted_events"
            defpackage.kkk.h(r0)
            android.os.Bundle r1 = r4.o()
            r2 = 0
            if (r1 != 0) goto L1c
            lbk r0 = r4.y
            lab r1 = r0.f
            r0.o(r1)
            kzz r0 = r1.c
            java.lang.String r1 = "Failed to load metadata: Metadata bundle is null"
            r0.a(r1)
        L1a:
            r0 = r2
            goto L2b
        L1c:
            boolean r3 = r1.containsKey(r0)
            if (r3 != 0) goto L23
            goto L1a
        L23:
            int r0 = r1.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L2b:
            if (r0 == 0) goto L54
            lbk r1 = r4.y     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.content.Context r1 = r1.a     // Catch: android.content.res.Resources.NotFoundException -> L45
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L45
            int r0 = r0.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L45
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch: android.content.res.Resources.NotFoundException -> L45
            if (r0 != 0) goto L40
            return r2
        L40:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: android.content.res.Resources.NotFoundException -> L45
            return r0
        L45:
            r0 = move-exception
            lbk r1 = r4.y
            lab r3 = r1.f
            r1.o(r3)
            kzz r1 = r3.c
            java.lang.String r3 = "Failed to load string array from metadata: resource not found"
            r1.b(r3, r0)
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktx.A():java.util.List");
    }

    public final String B(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            kkk.k(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            lbk lbkVar3 = this.y;
            lab labVar3 = lbkVar3.f;
            lbkVar3.o(labVar3);
            labVar3.c.b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            lbk lbkVar4 = this.y;
            lab labVar4 = lbkVar4.f;
            lbkVar4.o(labVar4);
            labVar4.c.b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final int a() {
        return Math.max(0, ((Integer) kzg.j.a(null)).intValue());
    }

    final int b(String str) {
        return i(str, kzg.W, 500, 2000);
    }

    public final int c(String str, boolean z) {
        if (z) {
            return i(str, kzg.ah, 100, 500);
        }
        return 500;
    }

    final int d(String str, boolean z) {
        return Math.max(c(str, z), 256);
    }

    public final int e() {
        lbk lbkVar = this.y;
        lio lioVar = lbkVar.i;
        lbkVar.m(lioVar);
        return lioVar.as(201500000) ? 100 : 25;
    }

    public final int f(String str) {
        return i(str, kzg.X, 25, 100);
    }

    public final int h(String str, kzf kzfVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) kzfVar.a(null)).intValue();
        }
        String strA = this.b.a(str, kzfVar.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) kzfVar.a(null)).intValue();
        }
        try {
            return ((Integer) kzfVar.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) kzfVar.a(null)).intValue();
        }
    }

    public final int i(String str, kzf kzfVar, int i, int i2) {
        return Math.max(Math.min(h(str, kzfVar), i2), i);
    }

    public final long j() {
        return ((Long) kzg.e.a(null)).longValue();
    }

    public final long k() {
        return ((Integer) kzg.l.a(null)).intValue();
    }

    public final long l() {
        return ((Long) kzg.R.a(null)).longValue();
    }

    public final long m(String str, kzf kzfVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) kzfVar.a(null)).longValue();
        }
        String strA = this.b.a(str, kzfVar.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) kzfVar.a(null)).longValue();
        }
        try {
            return ((Long) kzfVar.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) kzfVar.a(null)).longValue();
        }
    }

    public final long n() {
        return ((Long) kzg.M.a(null)).longValue();
    }

    final Bundle o() {
        try {
            lbk lbkVar = this.y;
            Context context = lbkVar.a;
            if (context.getPackageManager() == null) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = kmb.a.a(context).a(context.getPackageName(), 128);
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.c.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            lbk lbkVar2 = this.y;
            lab labVar3 = lbkVar2.f;
            lbkVar2.o(labVar3);
            labVar3.c.b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final lcq p(String str, boolean z) {
        Object obj;
        kkk.h(str);
        Bundle bundleO = o();
        if (bundleO == null) {
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleO.get(str);
        }
        if (obj == null) {
            return lcq.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return lcq.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return lcq.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return lcq.POLICY;
        }
        lbk lbkVar2 = this.y;
        lab labVar2 = lbkVar2.f;
        lbkVar2.o(labVar2);
        labVar2.f.b("Invalid manifest metadata for", str);
        return lcq.UNINITIALIZED;
    }

    final Boolean q(String str) {
        kkk.h(str);
        Bundle bundleO = o();
        if (bundleO != null) {
            if (bundleO.containsKey(str)) {
                return Boolean.valueOf(bundleO.getBoolean(str));
            }
            return null;
        }
        lbk lbkVar = this.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.c.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final String r(String str, kzf kzfVar) {
        return TextUtils.isEmpty(str) ? (String) kzfVar.a(null) : (String) kzfVar.a(this.b.a(str, kzfVar.a));
    }

    public final boolean s() {
        Boolean boolQ = q("google_analytics_adid_collection_enabled");
        return boolQ == null || boolQ.booleanValue();
    }

    public final boolean t(String str, kzf kzfVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) kzfVar.a(null)).booleanValue();
        }
        String strA = this.b.a(str, kzfVar.a);
        return TextUtils.isEmpty(strA) ? ((Boolean) kzfVar.a(null)).booleanValue() : ((Boolean) kzfVar.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final boolean u(String str) {
        return "1".equals(this.b.a(str, "gaia_collection_enabled"));
    }

    public final boolean v() {
        Boolean boolQ = q("google_analytics_automatic_screen_reporting_enabled");
        return boolQ == null || boolQ.booleanValue();
    }

    public final boolean w() {
        kts ktsVar = this.y.c;
        Boolean boolQ = q("firebase_analytics_collection_deactivated");
        return boolQ != null && boolQ.booleanValue();
    }

    public final boolean x(String str) {
        return "1".equals(this.b.a(str, "measurement.event_sampling_enabled"));
    }

    final boolean y() {
        if (this.d == null) {
            Boolean boolQ = q("app_measurement_lite");
            this.d = boolQ;
            if (boolQ == null) {
                this.d = false;
            }
        }
        return this.d.booleanValue() || !this.y.b;
    }

    public final boolean z() {
        Boolean boolQ = q("google_analytics_sgtm_upload_enabled");
        if (boolQ == null) {
            return false;
        }
        return boolQ.booleanValue();
    }
}
