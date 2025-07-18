package defpackage;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Rational;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.ui.PlayerView;
import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;
import com.google.android.videos.R;
import j$.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kw<K, V> {
    public final Object a;

    public kw(Object obj) {
        this.a = obj;
    }

    public static final hfx C(yjz yjzVar) {
        return ihz.aa(ihz.ab(yjzVar));
    }

    private final RemoteAction D(int i, int i2, int i3, String str) {
        Intent intentPutExtra = new Intent("com.google.android.apps.googletv.app.player.PIP_ACTION").putExtra("PIP_ACTION_EXTRA", i).putExtra("source_of_action", str);
        Context context = (Context) this.a;
        return new RemoteAction(Icon.createWithResource(context, i2), context.getString(i3), context.getString(i3), PendingIntent.getBroadcast(context, i, intentPutExtra.setPackage(context.getPackageName()), 201326592));
    }

    public static final void r(PictureInPictureParams.Builder builder, PlayerView playerView) {
        Rect rect = new Rect();
        playerView.getGlobalVisibleRect(rect);
        if (rect.isEmpty()) {
            return;
        }
        float fFloatValue = new Rational(16, 9).floatValue();
        if (fFloatValue < rect.width() / rect.height()) {
            int iHeight = (int) (rect.height() * fFloatValue);
            rect.set(rect.left + ((rect.width() - iHeight) / 2), rect.top, rect.left + ((rect.width() + iHeight) / 2), rect.bottom);
        } else {
            int iWidth = (int) (rect.width() / fFloatValue);
            rect.set(rect.left, rect.top + ((rect.height() - iWidth) / 2), rect.right, rect.top + ((rect.height() + iWidth) / 2));
        }
        builder.setSourceRectHint(rect);
    }

    public static /* synthetic */ void t(ivp ivpVar, View.OnClickListener onClickListener) {
        try {
            ivpVar.r(R.id.assistant_button, onClickListener);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "assistant_button", "com.google.android.apps.googletv.app.device.presentation.companionbar.ExpandedRemoteCompanionBarViewBindable"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(long r11, defpackage.yih r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.inf
            if (r0 == 0) goto L13
            r0 = r13
            inf r0 = (defpackage.inf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            inf r0 = new inf
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r13)
            goto L48
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ybn.f(r13)
            yot r13 = defpackage.ypk.a
            yya r13 = defpackage.yya.a
            vo r4 = new vo
            r8 = 0
            r9 = 6
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.b = r3
            java.lang.Object r13 = defpackage.ykr.l(r13, r4, r0)
            if (r13 != r1) goto L48
            return r1
        L48:
            r13.getClass()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.A(long, yih):java.lang.Object");
    }

    public final hfx B(yjz yjzVar, ita itaVar) {
        return new hfx(new ivx(ihz.ab(yjzVar), new irc(new ibg(itaVar, this, (yih) null, 2), new itd(this, itaVar, null), (byte[]) null)));
    }

    public final Object a(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final Object b(Object obj) {
        obj.getClass();
        return ((LinkedHashMap) this.a).remove(obj);
    }

    public final Set c() {
        Set<Map.Entry<K, V>> setEntrySet = ((LinkedHashMap) this.a).entrySet();
        setEntrySet.getClass();
        return setEntrySet;
    }

    public final boolean d() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final aci e(int i, int i2) {
        aci aciVar = new aci(i, i2);
        ((bfz) this.a).o(aciVar);
        return aciVar;
    }

    public final void f(aci aciVar) {
        ((bfz) this.a).n(aciVar);
    }

    public final boolean g() {
        return ((bfz) this.a).b != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yuj] */
    public final Object h(wq wqVar, yih yihVar) {
        Object objEmit = this.a.emit(wqVar, yihVar);
        return objEmit == yio.a ? objEmit : ygi.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yuj] */
    public final void i(wq wqVar) {
        this.a.eV(wqVar);
    }

    public final void j(Throwable th) {
        bfz bfzVar = (bfz) this.a;
        int i = bfzVar.b;
        yoe[] yoeVarArr = new yoe[i];
        for (int i2 = 0; i2 < i; i2++) {
            yoeVarArr[i2] = ((te) bfzVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            yoeVarArr[i3].e(th);
        }
        if (bfzVar.b == 0) {
            return;
        }
        wv.d("uncancelled requests present");
    }

    public final long k(long j, boolean z) {
        if (j < 2147483647L) {
            int i = z ? 7 : 3;
            if (Build.VERSION.SDK_INT >= 29) {
                int recommendedTimeoutMillis = ((AccessibilityManager) this.a).getRecommendedTimeoutMillis((int) j, i);
                if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return recommendedTimeoutMillis;
            }
            if (z && ((AccessibilityManager) this.a).isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final int l() {
        return ((brt) this.a.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bcb, java.lang.Object] */
    public final void m(int i) {
        this.a.b(new brt(i));
    }

    public final float n() {
        return ((PathMeasure) this.a).getLength();
    }

    public final void o(float f, float f2, bni bniVar) {
        if (!(bniVar instanceof bni)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        ((PathMeasure) this.a).getSegment(f, f2, bniVar.a, true);
    }

    public final void p(bni bniVar) {
        ((PathMeasure) this.a).setPath(bniVar.a, false);
    }

    public final List q(boolean z, String str) {
        return yfm.s(D(1, R.drawable.ic_rewind_10, R.string.accessibility_rewind_10s, str), z ? D(2, R.drawable.ic_pause_24dp, R.string.accessibility_pause, str) : D(3, R.drawable.ic_play_arrow_24dp, R.string.accessibility_play, str));
    }

    public final void s() {
        gpo gpoVar = new gpo(WorkerWrapper.class);
        yfw[] yfwVarArr = {new yfw("google_tv_worker_name_key", "parental_controls_worker_key")};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i <= 0; i++) {
            yfw yfwVar = yfwVarArr[i];
            gli.z((String) yfwVar.a, yfwVar.b, linkedHashMap);
        }
        gpoVar.e(gli.y(linkedHashMap));
        ((gpz) this.a).g("parental_controls_worker_key", 1, gpoVar.f());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Object u(Object obj) {
        ira iraVar = (ira) this.a.get(obj);
        if (iraVar == null) {
            return null;
        }
        return iraVar.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void v(Object obj, Object obj2) {
        ?? r0 = this.a;
        Object iraVar = r0.get(obj);
        if (iraVar == null) {
            iraVar = new ira();
            r0.put(obj, iraVar);
        }
        ira iraVar2 = (ira) iraVar;
        iraVar2.a = obj2;
        iraVar2.b++;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void w() {
        Collection.EL.removeIf(this.a.values(), new ldw(new gwp(11), 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void x(Object obj, boolean z) {
        int i;
        ?? r0 = this.a;
        ira iraVar = (ira) r0.get(obj);
        if (iraVar == null || (i = iraVar.b) <= 0) {
            throw new IllegalStateException(a.cj(obj, "Inconsistent release, item with key ", " was never acquired"));
        }
        int i2 = i - 1;
        iraVar.b = i2;
        if (i2 > 0 || !z) {
            return;
        }
        r0.remove(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.iqp
            if (r0 == 0) goto L13
            r0 = r8
            iqp r0 = (defpackage.iqp) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            iqp r0 = new iqp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L54
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r7.a
            wwg r2 = defpackage.wwg.a
            r2.getClass()
            r0.b = r3
            kdj r8 = (defpackage.kdj) r8
            java.lang.Object r3 = r8.b
            java.lang.Object r3 = r3.b()
            ahk r4 = new ahk
            r5 = 0
            r6 = 9
            r4.<init>(r8, r2, r5, r6)
            hfx r3 = (defpackage.hfx) r3
            java.lang.Object r8 = r3.c(r4, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            wwh r8 = (defpackage.wwh) r8
            vun r8 = r8.b
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.y(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ioz
            if (r0 == 0) goto L13
            r0 = r8
            ioz r0 = (defpackage.ioz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ioz r0 = new ioz
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L60
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r7.a
            wwa r2 = defpackage.wwa.a
            vtw r2 = r2.m()
            r2.getClass()
            vuc r2 = r2.r()
            r2.getClass()
            wwa r2 = (defpackage.wwa) r2
            r0.b = r3
            kdj r8 = (defpackage.kdj) r8
            java.lang.Object r3 = r8.b
            java.lang.Object r3 = r3.b()
            ahk r4 = new ahk
            r5 = 0
            r6 = 15
            r4.<init>(r8, r2, r5, r6)
            hfx r3 = (defpackage.hfx) r3
            java.lang.Object r8 = r3.c(r4, r0)
            if (r8 == r1) goto L6c
        L60:
            wwb r8 = (defpackage.wwb) r8
            wma r8 = r8.b
            if (r8 != 0) goto L68
            wma r8 = defpackage.wma.a
        L68:
            r8.getClass()
            return r8
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.z(yih):java.lang.Object");
    }

    public kw(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kw(byte[] bArr) {
        this.a = new bfz(new aci[16], 0);
    }

    public kw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new bfz(new te[16], 0);
    }

    public kw() {
        this(16);
    }

    public kw(ldv ldvVar) {
        ldvVar.getClass();
        this.a = ldvVar;
    }

    public kw(byte[] bArr, byte[] bArr2) {
        this.a = yuq.e(0, 16, 2, 1);
    }

    public kw(byte[] bArr, char[] cArr) {
        this.a = new bnb();
    }

    public kw(int i) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public kw(int i, byte[] bArr) {
        this.a = new bci(new brt(i), bcz.c);
    }

    public kw(gpz gpzVar) {
        gpzVar.getClass();
        this.a = gpzVar;
    }

    public kw(clx clxVar) {
        this.a = new mj(mo.a, clxVar);
    }

    public kw(char[] cArr) {
        this.a = new jn((byte[]) null);
    }

    public kw(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[PHI: r9
  0x002c: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:11:0x001e, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kw(int[] r23, float[] r24, float[][] r25) {
        /*
            r22 = this;
            r0 = r24
            r22.<init>()
            int r1 = r0.length
            int r1 = r1 + (-1)
            ng[][] r2 = new defpackage.ng[r1][]
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r4
            r7 = r6
        Lf:
            if (r5 >= r1) goto L70
            r8 = r23[r5]
            r9 = 3
            if (r8 == 0) goto L2c
            if (r8 == r4) goto L29
            r10 = 2
            if (r8 == r10) goto L27
            if (r8 == r9) goto L25
            r9 = 4
            if (r8 == r9) goto L2c
            r9 = 5
            if (r8 == r9) goto L2c
            r8 = r7
            goto L2d
        L25:
            if (r6 != r4) goto L29
        L27:
            r6 = r10
            goto L2a
        L29:
            r6 = r4
        L2a:
            r8 = r6
            goto L2d
        L2c:
            r8 = r9
        L2d:
            r15 = r25[r5]
            int r16 = r5 + 1
            r17 = r25[r16]
            r9 = r0[r5]
            r10 = r0[r16]
            int r7 = r15.length
            int r11 = r7 >> 1
            r7 = r7 & r4
            int r7 = r7 + r11
            ng[] r11 = new defpackage.ng[r7]
            r12 = r3
        L3f:
            if (r12 >= r7) goto L68
            int r13 = r12 + r12
            r14 = r7
            ng r7 = new ng
            r18 = r11
            r11 = r15[r13]
            int r19 = r13 + 1
            r20 = r12
            r12 = r15[r19]
            r13 = r17[r13]
            r19 = r17[r19]
            r21 = r18
            r18 = r14
            r14 = r19
            r19 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r19[r20] = r7
            int r12 = r20 + 1
            r7 = r18
            r11 = r19
            goto L3f
        L68:
            r19 = r11
            r2[r5] = r19
            r7 = r8
            r5 = r16
            goto Lf
        L70:
            r5 = r22
            r5.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw.<init>(int[], float[], float[][]):void");
    }

    public kw(yfo yfoVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kw(kdj kdjVar, byte[] bArr) {
        kdjVar.getClass();
        this.a = kdjVar;
    }

    public kw(yfo yfoVar, char[] cArr, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kw(short[] sArr) {
        this.a = new LinkedHashMap();
    }

    public kw(ihq ihqVar) {
        ihqVar.getClass();
        this.a = ihqVar;
    }

    public kw(yfo yfoVar, char[] cArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kw(yfo yfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public kw(Map map) {
        map.getClass();
        this.a = map;
        map.keySet();
    }

    public kw(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }
}
