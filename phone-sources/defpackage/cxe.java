package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.graphics.Region;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxe {
    public final Object a;

    public cxe(Context context, String str) {
        csd csdVar = new csd();
        this.a = csdVar;
        csdVar.a = context;
        csdVar.b = str;
    }

    public static cxe j(int i, int i2, int i3, int i4, boolean z) {
        return new cxe(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static cxe k(int i, int i2, boolean z, int i3) {
        return new cxe(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    public static int l(dfb dfbVar, Object obj, Object obj2) {
        return def.a((dgl) dfbVar.c, 1, obj) + def.a((dgl) dfbVar.d, 2, obj2);
    }

    public static void m(ddz ddzVar, dfb dfbVar, Object obj, Object obj2) {
        def.f(ddzVar, (dgl) dfbVar.c, 1, obj);
        def.f(ddzVar, (dgl) dfbVar.d, 2, obj2);
    }

    public final void A(int i, int i2) {
        ((ddz) this.a).aj(i, i2);
    }

    public final void B(int i, long j) {
        ((ddz) this.a).al(i, j);
    }

    public final void C(int i, int i2) {
        ((ddz) this.a).A(i, i2);
    }

    public final void D(int i, long j) {
        ((ddz) this.a).C(i, j);
    }

    public final dcq E() {
        return (dcq) ((yvc) this.a).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.dcq r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.lang.Object r0 = r5.a
            yvc r0 = (defpackage.yvc) r0
            java.lang.Object r1 = r0.d()
            r2 = r1
            dcq r2 = (defpackage.dcq) r2
            boolean r3 = r2 instanceof defpackage.dck
            if (r3 != 0) goto L34
            dcs r3 = defpackage.dcs.a
            boolean r3 = defpackage.yks.e(r2, r3)
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            boolean r3 = r2 instanceof defpackage.dax
            if (r3 == 0) goto L29
            int r3 = r6.c
            r4 = r2
            dax r4 = (defpackage.dax) r4
            int r4 = r4.c
            if (r3 <= r4) goto L35
            goto L34
        L29:
            boolean r3 = r2 instanceof defpackage.dcj
            if (r3 == 0) goto L2e
            goto L35
        L2e:
            yfu r6 = new yfu
            r6.<init>()
            throw r6
        L34:
            r2 = r6
        L35:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxe.F(dcq):void");
    }

    public final csd G() {
        csd csdVar = (csd) this.a;
        if (TextUtils.isEmpty(csdVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = csdVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return csdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(defpackage.cix r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cim
            if (r0 == 0) goto L13
            r0 = r8
            cim r0 = (defpackage.cim) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cim r0 = new cim
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L2f
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.a
            defpackage.ybn.f(r8)
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            cjo r7 = (defpackage.cjo) r7
            throw r3
        L39:
            defpackage.ybn.f(r8)
            return r8
        L3d:
            defpackage.ybn.f(r8)
            boolean r8 = r7 instanceof defpackage.cil
            if (r8 == 0) goto L56
            cil r7 = (defpackage.cil) r7
            cik r8 = r7.a
            java.lang.Object r2 = r6.a
            r0.c = r5
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r7 = r8.b(r2, r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        L56:
            boolean r8 = r7 instanceof defpackage.cjo
            if (r8 == 0) goto L6e
            r8 = r7
            cjo r8 = (defpackage.cjo) r8
            r0.a = r7
            r0.c = r4
            yof r7 = new yof
            yih r8 = defpackage.wcq.S(r0)
            r7.<init>(r8, r5)
            r7.v()
            throw r3
        L6e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Unknown font type: "
            java.lang.String r7 = r0.concat(r7)
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxe.H(cix, yih):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object I(cix cixVar) {
        if (cixVar instanceof cil) {
            cil cilVar = (cil) cixVar;
            return cilVar.a.a((Context) this.a, cilVar);
        }
        if (!(cixVar instanceof cjo)) {
            return null;
        }
        throw null;
    }

    public final cmg J() {
        return bnj.r(((Region) this.a).getBounds());
    }

    public final void K(cmg cmgVar) {
        ((Region) this.a).set(cmgVar.b, cmgVar.c, cmgVar.d, cmgVar.e);
    }

    public final void L() {
        synchronized (this) {
            ((jc) this.a).e();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final jhv M() {
        return new jhv(this.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    public final jhs N() {
        return new jhs(this.a);
    }

    public final void a() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void c(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void d(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void e(cxf cxfVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (cxfVar != null) {
                view.animate().setListener(new cxd(cxfVar, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void f(cxh cxhVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(cxhVar != null ? new gio(cxhVar, view, 1) : null);
        }
    }

    public final void g(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void h(boolean z) {
        ((cwp) this.a).c(z);
    }

    public final void i(boolean z) {
        ((cwp) this.a).d(z);
    }

    public final void n(int i, boolean z) {
        ((ddz) this.a).k(i, z);
    }

    public final void o(int i, dds ddsVar) {
        ((ddz) this.a).l(i, ddsVar);
    }

    public final void p(int i, double d) {
        ((ddz) this.a).ae(i, d);
    }

    public final void q(int i, int i2) {
        ((ddz) this.a).r(i, i2);
    }

    public final void r(int i, int i2) {
        ((ddz) this.a).n(i, i2);
    }

    public final void s(int i, long j) {
        ((ddz) this.a).p(i, j);
    }

    public final void t(int i, float f) {
        ((ddz) this.a).ag(i, f);
    }

    public final void u(int i, Object obj, dfs dfsVar) {
        ddz ddzVar = (ddz) this.a;
        ddzVar.z(i, 3);
        dfsVar.j((dfh) obj, ddzVar.f);
        ddzVar.z(i, 4);
    }

    public final void v(int i, int i2) {
        ((ddz) this.a).r(i, i2);
    }

    public final void w(int i, long j) {
        ((ddz) this.a).C(i, j);
    }

    public final void x(int i, Object obj, dfs dfsVar) {
        ((ddz) this.a).t(i, (dfh) obj, dfsVar);
    }

    public final void y(int i, int i2) {
        ((ddz) this.a).n(i, i2);
    }

    public final void z(int i, long j) {
        ((ddz) this.a).p(i, j);
    }

    public cxe(dgl dglVar, dgl dglVar2, Object obj) {
        this.a = new dfb(dglVar, dglVar2, obj);
    }

    public cxe(Object obj) {
        this.a = obj;
    }

    public cxe(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cxe(byte[] bArr) {
        this.a = cko.f();
    }

    public cxe() {
        this.a = yvd.a(dcs.a);
    }

    public cxe(Context context, ShortcutInfo shortcutInfo) {
        crx[] crxVarArr;
        String string;
        csd csdVar = new csd();
        this.a = csdVar;
        csdVar.a = context;
        csdVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        csdVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        csdVar.d = shortcutInfo.getActivity();
        csdVar.e = shortcutInfo.getShortLabel();
        csdVar.f = shortcutInfo.getLongLabel();
        csdVar.g = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        csdVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        csa csaVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            crxVarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            crxVarArr = new crx[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                crw crwVar = new crw();
                crwVar.a = persistableBundle.getString("name");
                crwVar.b = persistableBundle.getString("uri");
                crwVar.c = persistableBundle.getString("key");
                crwVar.d = persistableBundle.getBoolean("isBot");
                crwVar.e = persistableBundle.getBoolean("isImportant");
                crxVarArr[i2] = new crx(crwVar);
                i2 = i3;
            }
        }
        csdVar.i = crxVarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        Object obj = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                crl.k(locusId, "locusId cannot be null");
                String id = locusId.getId();
                crl.l(id);
                csaVar = new csa(id);
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                csaVar = new csa(string);
            }
        }
        ((csd) obj).k = csaVar;
        ((csd) this.a).l = shortcutInfo.getRank();
        ((csd) this.a).m = shortcutInfo.getExtras();
    }

    public cxe(View view) {
        this.a = new WeakReference(view);
    }

    public /* synthetic */ cxe(String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

    public cxe(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new jc((byte[]) null);
    }

    public cxe(Window window, View view) {
        cvw cvwVar = new cvw(view, (byte[]) null);
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new cyn(window, cvwVar);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new cyl(window);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.a = new cyk(window, cvwVar);
        } else {
            this.a = new cyj(window, cvwVar);
        }
    }

    public cxe(yfo yfoVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(boolean z) {
        this.a = new AtomicBoolean(z);
    }

    public cxe(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new Region();
    }

    public cxe(ddz ddzVar) {
        Charset charset = dep.a;
        this.a = ddzVar;
        ddzVar.f = this;
    }

    public cxe(yfo yfoVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(byte[] bArr, byte[] bArr2) {
        this.a = new eux(1);
    }

    public cxe(Context context) {
        this.a = context.getApplicationContext();
    }

    public cxe(yfo yfoVar, char[] cArr, char[] cArr2) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar, byte[] bArr, short[] sArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar, int[] iArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cxe(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }
}
