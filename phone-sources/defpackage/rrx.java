package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.UserManager;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.support.v7.appcompat.R;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Status;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rrx {
    private static volatile float a;
    public static volatile long l;

    public rrx() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean A(sbu sbuVar, sbn sbnVar) {
        sbo sboVar;
        if (!sbuVar.o.v(sbnVar)) {
            Iterator it = sbuVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                sboVar = next instanceof sbo ? (sbo) next : null;
                if (sboVar != null && sboVar.v(sbnVar)) {
                    sboVar = next;
                    break;
                }
            }
            if (sboVar == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean B(long j) {
        return j == 0;
    }

    public static udi D(Set set, Set set2) {
        vty vtyVar = (vty) udi.a.m();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            vtyVar.x(((sax) it.next()).a());
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            vtyVar.x((udi) it2.next());
        }
        return (udi) vtyVar.r();
    }

    public static Object E(sap sapVar, Enum r5) {
        vtw vtwVarM = wgp.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        int i = ((wgi) r5).D;
        wgp wgpVar = (wgp) vtwVarM.b;
        wgpVar.b = 1;
        wgpVar.c = Integer.valueOf(i);
        return sapVar.c(new saq((wgp) vtwVarM.r(), r5.name()));
    }

    public static rzs[] F(String str) {
        char c;
        int length = str.length();
        char[] charArray = str.toCharArray();
        rzs[] rzsVarArr = new rzs[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && ((c = charArray[i]) == ' ' || c == '\t' || c == '\"')) {
                i++;
            }
            int i3 = i;
            while (i3 < length) {
                char c2 = charArray[i3];
                if (c2 == ' ' || c2 == '\t' || c2 == '\"') {
                    break;
                }
                i3++;
            }
            if (i != i3) {
                rzsVarArr[i2] = new rzs(charArray, i, i3);
                i2++;
            }
            i = i3;
        }
        rzs[] rzsVarArr2 = new rzs[i2];
        System.arraycopy(rzsVarArr, 0, rzsVarArr2, 0, i2);
        return rzsVarArr2;
    }

    public static SharedPreferences G(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }

    public static void H(uhp uhpVar) {
        uhpVar.c(new rtr(uhpVar, 13), ugk.a);
    }

    public static /* synthetic */ boolean I(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int J(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static void K(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(trc.f(new ejr(level, th, str, objArr, 15, (short[]) null)));
    }

    public static void L(Level level, Executor executor, String str, Object... objArr) {
        K(level, executor, null, str, objArr);
    }

    public static Object M(rwn rwnVar) {
        try {
            return rwnVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return rwnVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static rpf N(tst tstVar, yfo yfoVar) {
        return (rpf) ((yfo) tstVar.e(yfoVar)).b();
    }

    public static /* synthetic */ String O(int i) {
        return i != 1 ? "null" : "ALIGN_CENTER";
    }

    public static uhp P(final nwx nwxVar, final tsl tslVar, final Executor executor) {
        final uic uicVar = new uic();
        nwxVar.k(new nxd() { // from class: rkx
            @Override // defpackage.nxd
            public final void a(final nxc nxcVar) {
                Status statusE = nxcVar.e();
                if (statusE.f == 14) {
                    throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(nxcVar))));
                }
                final uic uicVar2 = uicVar;
                if (statusE.b()) {
                    final tsl tslVar2 = tslVar;
                    executor.execute(new Runnable() { // from class: rkw
                        @Override // java.lang.Runnable
                        public final void run() {
                            tsl tslVar3 = tslVar2;
                            uic uicVar3 = uicVar2;
                            nxc nxcVar2 = nxcVar;
                            try {
                                try {
                                    uicVar3.b(tslVar3.apply(nxcVar2));
                                } catch (RuntimeException e) {
                                    uicVar3.e(e);
                                }
                            } finally {
                                rrx.Q(nxcVar2);
                            }
                        }
                    });
                } else {
                    uicVar2.e(new rks(nxcVar, statusE));
                    rrx.Q(nxcVar);
                }
            }
        }, TimeUnit.SECONDS);
        uicVar.c(trc.f(new Runnable() { // from class: rky
            @Override // java.lang.Runnable
            public final void run() {
                if (uicVar.isCancelled()) {
                    nwxVar.h();
                }
            }
        }), ugk.a);
        return uicVar;
    }

    public static void Q(nxc nxcVar) {
        if (nxcVar instanceof nwz) {
            ((nwz) nxcVar).a();
        }
    }

    public static void R(String str, List list, Map map) {
        if (map.containsKey(str)) {
            return;
        }
        list.add(str);
        rjm rjmVarA = rjn.a();
        rjmVarA.b(str);
        map.put(str, rjmVarA);
    }

    public static rju S() {
        return Build.VERSION.SDK_INT >= 26 ? new rjz(0) : new rjz(1);
    }

    public static /* synthetic */ String T(int i) {
        return i != 1 ? "MENAGERIE" : "MDI";
    }

    public static /* synthetic */ String U(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static int V(int i) {
        if (i == 32) {
            return 0;
        }
        if (i == 48) {
            return 1;
        }
        if (i != 120) {
            return i != 240 ? 2 : 5;
        }
        return 3;
    }

    public static int W(Context context, int i) {
        if (i <= 0) {
            return 64;
        }
        float f = i / context.getResources().getDisplayMetrics().density;
        int[] iArr = {32, 48, 64, R.styleable.AppCompatTheme_windowFixedHeightMajor, 240};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            }
            if (f <= i3) {
                return i3;
            }
        }
        return 240;
    }

    public static tst X(ImageView imageView) {
        Object tag = imageView.getTag(com.google.android.videos.R.id.og_avatar_size_hint);
        return tag instanceof Integer ? tst.i((Integer) tag) : trk.a;
    }

    public static Drawable Y(Context context) {
        return aj(context, com.google.android.videos.R.drawable.og_gm3_list_divider, sss.d(context));
    }

    public static Context Z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{com.google.android.videos.R.attr.ogAccountMenuTheme});
        try {
            return sru.a(new ContextThemeWrapper(new ContextThemeWrapper(context, typedArrayObtainStyledAttributes.getResourceId(0, com.google.android.videos.R.style.OneGoogle_AccountMenu_GoogleMaterial3_DayNight)), com.google.android.videos.R.style.OneGoogle_AccountMenu_Attrs_GoogleMaterial3));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static rfc a(rfc rfcVar, int i, aafi aafiVar) {
        rhz rhzVar = new rhz(rfcVar.f);
        rhzVar.s(aafiVar, i);
        return rfcVar.b(new rhy(rhzVar));
    }

    public static /* synthetic */ void aA(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ae(recyclerView, adapter);
    }

    public static int aB(Context context, int i) {
        return context.getResources().getColor(i);
    }

    public static Object aC(qth qthVar, Object obj, ImmutableMap immutableMap, Object obj2) {
        if (obj == null) {
            return null;
        }
        qthVar.j(obj);
        Object obj3 = immutableMap.get(aD(qthVar, obj));
        return obj3 != null ? obj3 : obj2;
    }

    public static String aD(qth qthVar, Object obj) {
        return qthVar.d(obj);
    }

    public static Drawable aE(Context context, int i, int i2) {
        Drawable drawableAj = aj(context, com.google.android.videos.R.drawable.badge_exclamation_vd, i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        am(shapeDrawable, i2);
        return new LayerDrawable(new Drawable[]{shapeDrawable, drawableAj});
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, sat] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ java.lang.Object aF(defpackage.ulp r8) {
        /*
            java.lang.Object r8 = r8.a
            udj r0 = defpackage.udj.a
            android.net.NetworkInfo r8 = r8.a()
            whh r1 = defpackage.whh.a
            vtw r1 = r1.m()
            r2 = 0
            r3 = 1
            if (r8 != 0) goto L2a
            vuc r8 = r1.b
            boolean r8 = r8.A()
            if (r8 != 0) goto L1d
            r1.u()
        L1d:
            vuc r8 = r1.b
            whh r8 = (defpackage.whh) r8
            r8.c = r2
            int r2 = r8.b
            r2 = r2 | r3
            r8.b = r2
            goto Lb8
        L2a:
            boolean r4 = r8.isConnected()
            if (r4 != 0) goto L49
            vuc r8 = r1.b
            boolean r8 = r8.A()
            if (r8 != 0) goto L3b
            r1.u()
        L3b:
            vuc r8 = r1.b
            whh r8 = (defpackage.whh) r8
            int r3 = r8.b
            r3 = r3 | 4
            r8.b = r3
            r8.d = r2
            goto Lb8
        L49:
            vuc r2 = r1.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L54
            r1.u()
        L54:
            vuc r2 = r1.b
            whh r2 = (defpackage.whh) r2
            int r4 = r2.b
            r4 = r4 | 4
            r2.b = r4
            r2.d = r3
            int r2 = r8.getType()
            if (r2 == 0) goto L83
            if (r2 == r3) goto L81
            r8 = 6
            if (r2 == r8) goto L7e
            r8 = 7
            r4 = 9
            if (r2 == r8) goto La0
            if (r2 == r4) goto L7b
            r8 = 17
            if (r2 == r8) goto L78
            r4 = r3
            goto La0
        L78:
            r4 = 12
            goto La0
        L7b:
            r4 = 11
            goto La0
        L7e:
            r4 = 8
            goto La0
        L81:
            r4 = 3
            goto La0
        L83:
            int r8 = r8.getSubtype()
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            r5 = 15
            r6 = 14
            r7 = 13
            if (r2 < r4) goto L96
            switch(r8) {
                case 16: goto L9f;
                case 17: goto L9d;
                case 18: goto L9b;
                default: goto L96;
            }
        L96:
            switch(r8) {
                case 1: goto L9f;
                case 2: goto L9f;
                case 3: goto L9d;
                case 4: goto L9f;
                case 5: goto L9d;
                case 6: goto L9d;
                case 7: goto L9f;
                case 8: goto L9d;
                case 9: goto L9d;
                case 10: goto L9d;
                case 11: goto L9f;
                case 12: goto L9d;
                case 13: goto L9b;
                case 14: goto L9d;
                case 15: goto L9d;
                default: goto L99;
            }
        L99:
            r4 = 2
            goto La0
        L9b:
            r4 = r5
            goto La0
        L9d:
            r4 = r6
            goto La0
        L9f:
            r4 = r7
        La0:
            vuc r8 = r1.b
            boolean r8 = r8.A()
            if (r8 != 0) goto Lab
            r1.u()
        Lab:
            vuc r8 = r1.b
            whh r8 = (defpackage.whh) r8
            int r4 = r4 + (-1)
            r8.c = r4
            int r2 = r8.b
            r2 = r2 | r3
            r8.b = r2
        Lb8:
            sbb r8 = new sbb
            vuc r1 = r1.r()
            whh r1 = (defpackage.whh) r1
            r8.<init>(r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrx.aF(ulp):java.lang.Object");
    }

    public static void aa(View view) {
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 1280);
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 512);
    }

    public static void ab(View view, boolean z, boolean z2) {
        if (!z) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            return;
        }
        view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
        if (z2) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
        }
    }

    public static void ac(Runnable runnable) {
        if (sjl.g()) {
            runnable.run();
        } else {
            sjl.e(runnable);
        }
    }

    public static boolean ad(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public static void ae(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        cdr cdrVar = new cdr(recyclerView, adapter, 5);
        int[] iArr = cww.a;
        if (recyclerView.isAttachedToWindow()) {
            cdrVar.onViewAttachedToWindow(recyclerView);
        }
        recyclerView.addOnAttachStateChangeListener(cdrVar);
    }

    public static void af(ConstraintLayout constraintLayout, int[][] iArr) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        char c;
        char c2;
        cqn cqnVar = new cqn();
        cqnVar.e(constraintLayout);
        int i = 0;
        while (true) {
            int length = iArr.length;
            c = 4;
            if (i >= length) {
                break;
            }
            int iAJ = i == 0 ? 0 : yfm.aJ(iArr[i - 1]);
            int i2 = i + 1;
            int iAJ2 = i == length + (-1) ? 0 : yfm.aJ(iArr[i2]);
            int iAJ3 = yfm.aJ(iArr[i]);
            cqnVar.m(iAJ3, 3, iAJ, iAJ == 0 ? 3 : 4);
            cqnVar.m(iAJ3, 4, iAJ2, iAJ2 == 0 ? 4 : 3);
            if (iAJ != 0) {
                cqnVar.m(iAJ, 4, iAJ3, 3);
            }
            if (iAJ2 != 0) {
                cqnVar.m(iAJ2, 3, iAJ3, 4);
            }
            i = i2;
        }
        for (int[] iArr2 : iArr) {
            int length2 = iArr2.length;
            int i3 = 0;
            while (i3 < length2) {
                int i4 = i3 == 0 ? 0 : iArr2[i3 - 1];
                int i5 = i3 + 1;
                int i6 = i3 == iArr2.length + (-1) ? 0 : iArr2[i5];
                int i7 = iArr2[i3];
                cqnVar.m(i7, 6, i4, i4 == 0 ? 6 : 7);
                cqnVar.m(i7, 7, i6, i6 == 0 ? 7 : 6);
                if (i4 != 0) {
                    cqnVar.m(i4, 7, i7, 6);
                }
                if (i6 != 0) {
                    cqnVar.m(i6, 6, i7, 7);
                }
                if (i3 > 0) {
                    cqnVar.g(iArr2[i3], 3, iArr2[0], 3);
                    c2 = 4;
                    cqnVar.g(iArr2[i3], 4, iArr2[0], 4);
                } else {
                    c2 = 4;
                }
                c = c2;
                i3 = i5;
            }
        }
        cqnVar.c(constraintLayout);
    }

    public static void ag(View view, int i) {
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setGravity(i | 16);
        }
    }

    public static int ah(DisplayMetrics displayMetrics, int i) {
        return (int) (i * displayMetrics.density);
    }

    public static boolean ai(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{com.google.android.videos.R.attr.isMaterialTheme, com.google.android.videos.R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
                if (typedArrayObtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable aj(Context context, int i, int i2) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        am(drawable, i2);
        return drawable;
    }

    public static int ak(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.videos.R.attr.actionBarItemBackground});
        try {
            return typedArrayObtainStyledAttributes.getResourceId(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void al(Drawable drawable, ColorStateList colorStateList) {
        boolean z = true;
        if (!sjl.g() && drawable.getCallback() != null) {
            z = false;
        }
        sij.x(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        drawable.mutate().setTintList(colorStateList);
    }

    public static void am(Drawable drawable, int i) {
        al(drawable, ColorStateList.valueOf(i));
    }

    public static Intent an(String str, uzl uzlVar, tst tstVar, tst tstVar2) {
        str.getClass();
        uzlVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms").putExtra("extra.screenId", uzlVar.c).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", str).putExtra("extra.themeChoice", 0);
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(uzlVar.d);
        mapUnmodifiableMap.getClass();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            intent.putExtra("extra.screen.".concat(str2), str3);
        }
        String str4 = (String) tstVar2.f();
        if (str4 != null) {
            intent.putExtra("extra.utmMedium", str4);
        }
        return intent;
    }

    public static ThreadFactory ao() {
        uie uieVar = new uie();
        uieVar.d("OneGoogle #%d");
        uieVar.c(false);
        sij.t(true, "Thread priority (%s) must be >= %s", 5, 1);
        sij.t(true, "Thread priority (%s) must be <= %s", 5, 10);
        uieVar.c = 5;
        uieVar.d = new rhw(0);
        return uie.b(uieVar);
    }

    public static void ap(dvv dvvVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dvvVar.k(obj);
        } else {
            dvvVar.h(obj);
        }
    }

    public static String aq(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof nwk ? "ApiException" : "ObfuscatedException";
    }

    public static Throwable ar(Throwable th, Class cls) {
        if (th == null) {
            return null;
        }
        return th.getClass().equals(cls) ? th : ar(th.getCause(), cls);
    }

    public static float as(Context context, int i) {
        return aw(context, i).getDimension(context.getResources().getDisplayMetrics());
    }

    public static int at(Context context, int i) {
        return context.getResources().getColor(av(context, i));
    }

    public static int au(Context context, int i) {
        return TypedValue.complexToDimensionPixelSize(aw(context, i).data, context.getResources().getDisplayMetrics());
    }

    public static int av(Context context, int i) {
        return aw(context, i).resourceId;
    }

    public static TypedValue aw(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }

    public static boolean ax(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager == null || !userManager.hasUserRestriction("no_modify_accounts");
    }

    public static qvt ay(qwn qwnVar) {
        qth qthVar = qwnVar.c;
        if (qthVar == null) {
            throw new NullPointerException("Null accountConverter");
        }
        qwo qwoVar = qwnVar.b;
        if (qwoVar == null) {
            throw new NullPointerException("Null accountsModel");
        }
        qtr qtrVar = qwnVar.j;
        if (qtrVar == null) {
            throw new NullPointerException("Null avatarImageLoader");
        }
        ril rilVar = qwnVar.g;
        if (rilVar == null) {
            throw new NullPointerException("Null oneGoogleEventLogger");
        }
        rfg rfgVar = qwnVar.e;
        tst tstVar = rfgVar.a;
        if (tstVar == null) {
            throw new NullPointerException("Null deactivatedAccountsFeature");
        }
        tst tstVar2 = rfgVar.m;
        return new qvt(qtrVar, qthVar, qwoVar, rilVar, tstVar, trk.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableList az(Context context, qwn qwnVar, wds wdsVar) {
        String str;
        View.OnClickListener onClickListener;
        rht rhtVar;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        qwo qwoVar = qwnVar.b;
        rfc rfcVarA = null;
        aafi aafiVar = new aafi(qwnVar.g, wdsVar, qwoVar, (byte[]) null);
        rfc rfcVarA2 = qwt.a(qwnVar, context);
        if (rfcVarA2 != null) {
            rhz rhzVar = new rhz(rfcVarA2.f);
            rhzVar.s(aafiVar, true != qwt.b(context) ? 41 : 42);
            builder.add((ImmutableList.Builder) rfcVarA2.b(new rhy(rhzVar)));
        }
        qwoVar.a();
        tst tstVar = qwnVar.e.e;
        qwh qwhVar = qwnVar.d.b;
        int i = 0;
        if (ax(context)) {
            rhs rhsVar = new rhs(null);
            rhsVar.a(com.google.android.videos.R.id.og_ai_not_set);
            rhsVar.c = -1;
            rhsVar.h = (byte) (rhsVar.h | 2);
            rhsVar.b(-1);
            rhsVar.a(com.google.android.videos.R.id.og_ai_add_another_account);
            Drawable drawable = AppCompatResources.getDrawable(context, com.google.android.videos.R.drawable.quantum_gm_ic_person_add_vd_theme_24);
            drawable.getClass();
            rhsVar.b = drawable;
            String string = context.getString(com.google.android.videos.R.string.og_add_another_account);
            if (string == null) {
                throw new NullPointerException("Null label");
            }
            rhsVar.d = string;
            rhsVar.f = new phn(qwoVar, 10);
            rhsVar.b(90141);
            if ((rhsVar.h & 1) == 0) {
                throw new IllegalStateException("Property \"id\" has not been set");
            }
            sij.x(rhsVar.a != com.google.android.videos.R.id.og_ai_not_set, "Did you forget to setId()?");
            if ((rhsVar.h & 4) == 0) {
                throw new IllegalStateException("Property \"veId\" has not been set");
            }
            sij.x(rhsVar.e != -1, "Did you forget to setVeId()?");
            if ((rhsVar.h & 2) == 0) {
                throw new IllegalStateException("Property \"iconResId\" has not been set");
            }
            sij.x((rhsVar.c != -1) ^ (rhsVar.b != null), "Either icon id or icon drawable must be specified");
            if (rhsVar.h != 7 || (str = rhsVar.d) == null || (onClickListener = rhsVar.f) == null) {
                StringBuilder sb = new StringBuilder();
                if ((rhsVar.h & 1) == 0) {
                    sb.append(" id");
                }
                if ((rhsVar.h & 2) == 0) {
                    sb.append(" iconResId");
                }
                if (rhsVar.d == null) {
                    sb.append(" label");
                }
                if ((rhsVar.h & 4) == 0) {
                    sb.append(" veId");
                }
                if (rhsVar.f == null) {
                    sb.append(" onClickListener");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            rhtVar = new rht(rhsVar.a, rhsVar.b, rhsVar.c, str, rhsVar.e, onClickListener, rhsVar.g);
        } else {
            rhtVar = null;
        }
        if (rhtVar != null) {
            int i2 = rhtVar.a;
            rfa rfaVarA = rfc.a();
            rfaVarA.e(i2);
            rfaVarA.d = rhtVar.b;
            rfaVarA.d(rhtVar.c);
            rfaVarA.f(rhtVar.d);
            rfaVarA.c(rhtVar.g);
            rfaVarA.g(rhtVar.f);
            rfaVarA.h(rhtVar.e);
            builder.add((ImmutableList.Builder) a(rfaVarA.a(), 11, aafiVar));
        }
        if (ax(context)) {
            rfa rfaVarA2 = rfc.a();
            rfaVarA2.e(com.google.android.videos.R.id.og_ai_manage_accounts);
            Drawable drawable2 = AppCompatResources.getDrawable(context, com.google.android.videos.R.drawable.quantum_gm_ic_manage_accounts_vd_theme_24);
            drawable2.getClass();
            rfaVarA2.d = drawable2;
            rfaVarA2.f(context.getString(com.google.android.videos.R.string.og_manage_accounts));
            rfaVarA2.g(new phn(qwnVar, 3));
            rfaVarA2.h(90142);
            rfcVarA = rfaVarA2.a();
        }
        if (rfcVarA != null) {
            builder.add((ImmutableList.Builder) a(rfcVarA, 12, aafiVar));
        }
        ImmutableList immutableListBuild = builder.build();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        UnmodifiableIterator it = immutableListBuild.iterator();
        while (it.hasNext()) {
            rdh rdhVar = new rdh((rfc) it.next());
            rdhVar.m(rej.ALWAYS_HIDE_DIVIDER_CARD);
            builder2.add((ImmutableList.Builder) new rdn(new rgt(rdhVar, i)));
        }
        return builder2.build();
    }

    public static tst l(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return trk.a;
        }
        float f = a;
        if (f == 0.0f) {
            synchronized (rrx.class) {
                f = a;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    a = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return tst.i(Float.valueOf(f));
    }

    public static yzx m(yzx yzxVar, long j) {
        vtw vtwVar = (vtw) yzxVar.a(5, null);
        vtwVar.x(yzxVar);
        vuc vucVar = vtwVar.b;
        yzx yzxVar2 = (yzx) vucVar;
        if ((yzxVar2.b & 2) != 0) {
            long j2 = yzxVar2.d - j;
            if (!vucVar.A()) {
                vtwVar.u();
            }
            yzx yzxVar3 = (yzx) vtwVar.b;
            yzxVar3.b |= 2;
            yzxVar3.d = j2;
        }
        vuc vucVar2 = vtwVar.b;
        yzx yzxVar4 = (yzx) vucVar2;
        if ((yzxVar4.b & 4) != 0) {
            long j3 = yzxVar4.e - j;
            if (!vucVar2.A()) {
                vtwVar.u();
            }
            yzx yzxVar5 = (yzx) vtwVar.b;
            yzxVar5.b |= 4;
            yzxVar5.e = j3;
        }
        vuc vucVar3 = vtwVar.b;
        yzx yzxVar6 = (yzx) vucVar3;
        if ((yzxVar6.b & 8) != 0) {
            long j4 = yzxVar6.f - j;
            if (!vucVar3.A()) {
                vtwVar.u();
            }
            yzx yzxVar7 = (yzx) vtwVar.b;
            yzxVar7.b |= 8;
            yzxVar7.f = j4;
        }
        return (yzx) vtwVar.r();
    }

    public static long n(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List o(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : rpr.a.d(healthStats.getTimers(i));
    }

    public static Map p(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static yyz q(String str) {
        vtw vtwVarM = yyz.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yyz yyzVar = (yyz) vtwVarM.b;
        yyzVar.b |= 2;
        yyzVar.d = str;
        return (yyz) vtwVarM.r();
    }

    public static yze r(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return t(null, healthStats.getTimer(i));
    }

    public static yze s(yze yzeVar, yze yzeVar2) {
        if (yzeVar == null || yzeVar2 == null) {
            return yzeVar;
        }
        int i = yzeVar.c - yzeVar2.c;
        long j = yzeVar.d - yzeVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        vtw vtwVarM = yze.a.m();
        if ((yzeVar.b & 4) != 0) {
            yyz yyzVar = yzeVar.e;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yze yzeVar3 = (yze) vtwVarM.b;
            yyzVar.getClass();
            yzeVar3.e = yyzVar;
            yzeVar3.b |= 4;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        yze yzeVar4 = (yze) vucVar;
        yzeVar4.b |= 1;
        yzeVar4.c = i;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        yze yzeVar5 = (yze) vtwVarM.b;
        yzeVar5.b |= 2;
        yzeVar5.d = j;
        return (yze) vtwVarM.r();
    }

    public static yze t(String str, TimerStat timerStat) {
        vtw vtwVarM = yze.a.m();
        int count = timerStat.getCount();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        yze yzeVar = (yze) vtwVarM.b;
        yzeVar.b |= 1;
        yzeVar.c = count;
        long time = timerStat.getTime();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        yze yzeVar2 = (yze) vucVar;
        yzeVar2.b |= 2;
        yzeVar2.d = time;
        if (yzeVar2.c < 0) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            yze yzeVar3 = (yze) vtwVarM.b;
            yzeVar3.b |= 1;
            yzeVar3.c = 0;
        }
        if (str != null) {
            yyz yyzVarQ = q(str);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yze yzeVar4 = (yze) vtwVarM.b;
            yyzVarQ.getClass();
            yzeVar4.e = yyzVarQ;
            yzeVar4.b |= 4;
        }
        yze yzeVar5 = (yze) vtwVarM.b;
        if (yzeVar5.c == 0 && yzeVar5.d == 0) {
            return null;
        }
        return (yze) vtwVarM.r();
    }

    public static yzf u(yzf yzfVar, yzf yzfVar2) {
        yze yzeVar;
        yze yzeVar2;
        yze yzeVar3;
        yze yzeVar4;
        yze yzeVar5;
        yze yzeVar6;
        yze yzeVar7;
        yze yzeVar8;
        yze yzeVar9;
        yze yzeVar10;
        yze yzeVar11;
        yze yzeVar12;
        yze yzeVar13;
        yze yzeVar14;
        yze yzeVar15;
        yze yzeVar16;
        yze yzeVar17;
        yze yzeVar18;
        yze yzeVar19;
        yze yzeVar20;
        yze yzeVar21;
        yze yzeVar22;
        yze yzeVar23;
        yze yzeVar24;
        yze yzeVar25;
        yze yzeVar26;
        yze yzeVar27;
        yze yzeVar28;
        yze yzeVar29;
        yze yzeVar30;
        yze yzeVar31;
        yze yzeVar32;
        if (yzfVar != null && yzfVar2 != null) {
            vtw vtwVarM = yzf.a.m();
            if ((yzfVar.b & 1) != 0) {
                long j = yzfVar.d - yzfVar2.d;
                if (j != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar3 = (yzf) vtwVarM.b;
                    yzfVar3.b |= 1;
                    yzfVar3.d = j;
                }
            }
            if ((yzfVar.b & 2) != 0) {
                long j2 = yzfVar.e - yzfVar2.e;
                if (j2 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar4 = (yzf) vtwVarM.b;
                    yzfVar4.b |= 2;
                    yzfVar4.e = j2;
                }
            }
            if ((yzfVar.b & 4) != 0) {
                long j3 = yzfVar.f - yzfVar2.f;
                if (j3 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar5 = (yzf) vtwVarM.b;
                    yzfVar5.b |= 4;
                    yzfVar5.f = j3;
                }
            }
            if ((yzfVar.b & 8) != 0) {
                long j4 = yzfVar.g - yzfVar2.g;
                if (j4 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar6 = (yzf) vtwVarM.b;
                    yzfVar6.b |= 8;
                    yzfVar6.g = j4;
                }
            }
            rpr rprVar = rpr.a;
            vtwVarM.bg(rprVar.e(yzfVar.h, yzfVar2.h));
            vtwVarM.bh(rprVar.e(yzfVar.i, yzfVar2.i));
            vtwVarM.bi(rprVar.e(yzfVar.j, yzfVar2.j));
            vtwVarM.bf(rprVar.e(yzfVar.k, yzfVar2.k));
            vtwVarM.be(rprVar.e(yzfVar.l, yzfVar2.l));
            vtwVarM.ba(rprVar.e(yzfVar.m, yzfVar2.m));
            if ((yzfVar.b & 16) != 0) {
                yzeVar = yzfVar.n;
                if (yzeVar == null) {
                    yzeVar = yze.a;
                }
            } else {
                yzeVar = null;
            }
            if ((yzfVar2.b & 16) != 0) {
                yzeVar2 = yzfVar2.n;
                if (yzeVar2 == null) {
                    yzeVar2 = yze.a;
                }
            } else {
                yzeVar2 = null;
            }
            yze yzeVarS = s(yzeVar, yzeVar2);
            if (yzeVarS != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar7 = (yzf) vtwVarM.b;
                yzfVar7.n = yzeVarS;
                yzfVar7.b |= 16;
            }
            vtwVarM.bb(rprVar.e(yzfVar.o, yzfVar2.o));
            vtwVarM.bd(rpo.a.e(yzfVar.q, yzfVar2.q));
            vtwVarM.bc(rpn.a.e(yzfVar.r, yzfVar2.r));
            if ((yzfVar.b & 32) != 0) {
                long j5 = yzfVar.s - yzfVar2.s;
                if (j5 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar8 = (yzf) vtwVarM.b;
                    yzfVar8.b |= 32;
                    yzfVar8.s = j5;
                }
            }
            if ((yzfVar.b & 64) != 0) {
                long j6 = yzfVar.t - yzfVar2.t;
                if (j6 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar9 = (yzf) vtwVarM.b;
                    yzfVar9.b |= 64;
                    yzfVar9.t = j6;
                }
            }
            if ((yzfVar.b & 128) != 0) {
                long j7 = yzfVar.u - yzfVar2.u;
                if (j7 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar10 = (yzf) vtwVarM.b;
                    yzfVar10.b |= 128;
                    yzfVar10.u = j7;
                }
            }
            if ((yzfVar.b & 256) != 0) {
                long j8 = yzfVar.v - yzfVar2.v;
                if (j8 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar11 = (yzf) vtwVarM.b;
                    yzfVar11.b |= 256;
                    yzfVar11.v = j8;
                }
            }
            if ((yzfVar.b & 512) != 0) {
                long j9 = yzfVar.w - yzfVar2.w;
                if (j9 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar12 = (yzf) vtwVarM.b;
                    yzfVar12.b |= 512;
                    yzfVar12.w = j9;
                }
            }
            if ((yzfVar.b & 1024) != 0) {
                long j10 = yzfVar.x - yzfVar2.x;
                if (j10 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar13 = (yzf) vtwVarM.b;
                    yzfVar13.b |= 1024;
                    yzfVar13.x = j10;
                }
            }
            if ((yzfVar.b & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                long j11 = yzfVar.y - yzfVar2.y;
                if (j11 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar14 = (yzf) vtwVarM.b;
                    yzfVar14.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
                    yzfVar14.y = j11;
                }
            }
            if ((yzfVar.b & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                long j12 = yzfVar.z - yzfVar2.z;
                if (j12 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar15 = (yzf) vtwVarM.b;
                    yzfVar15.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    yzfVar15.z = j12;
                }
            }
            if ((yzfVar.b & 8192) != 0) {
                long j13 = yzfVar.A - yzfVar2.A;
                if (j13 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar16 = (yzf) vtwVarM.b;
                    yzfVar16.b |= 8192;
                    yzfVar16.A = j13;
                }
            }
            if ((yzfVar.b & 16384) != 0) {
                long j14 = yzfVar.B - yzfVar2.B;
                if (j14 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar17 = (yzf) vtwVarM.b;
                    yzfVar17.b |= 16384;
                    yzfVar17.B = j14;
                }
            }
            if ((yzfVar.b & 32768) != 0) {
                long j15 = yzfVar.C - yzfVar2.C;
                if (j15 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar18 = (yzf) vtwVarM.b;
                    yzfVar18.b |= 32768;
                    yzfVar18.C = j15;
                }
            }
            if ((yzfVar.b & 65536) != 0) {
                long j16 = yzfVar.D - yzfVar2.D;
                if (j16 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar19 = (yzf) vtwVarM.b;
                    yzfVar19.b |= 65536;
                    yzfVar19.D = j16;
                }
            }
            if ((yzfVar.b & 131072) != 0) {
                long j17 = yzfVar.E - yzfVar2.E;
                if (j17 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar20 = (yzf) vtwVarM.b;
                    yzfVar20.b |= 131072;
                    yzfVar20.E = j17;
                }
            }
            if ((yzfVar.b & 262144) != 0) {
                long j18 = yzfVar.F - yzfVar2.F;
                if (j18 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar21 = (yzf) vtwVarM.b;
                    yzfVar21.b |= 262144;
                    yzfVar21.F = j18;
                }
            }
            if ((yzfVar.b & 524288) != 0) {
                yzeVar3 = yzfVar.G;
                if (yzeVar3 == null) {
                    yzeVar3 = yze.a;
                }
            } else {
                yzeVar3 = null;
            }
            if ((yzfVar2.b & 524288) != 0) {
                yzeVar4 = yzfVar2.G;
                if (yzeVar4 == null) {
                    yzeVar4 = yze.a;
                }
            } else {
                yzeVar4 = null;
            }
            yze yzeVarS2 = s(yzeVar3, yzeVar4);
            if (yzeVarS2 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar22 = (yzf) vtwVarM.b;
                yzfVar22.G = yzeVarS2;
                yzfVar22.b |= 524288;
            }
            if ((yzfVar.b & 1048576) != 0) {
                long j19 = yzfVar.H - yzfVar2.H;
                if (j19 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar23 = (yzf) vtwVarM.b;
                    yzfVar23.b |= 1048576;
                    yzfVar23.H = j19;
                }
            }
            if ((yzfVar.b & 2097152) != 0) {
                yzeVar5 = yzfVar.I;
                if (yzeVar5 == null) {
                    yzeVar5 = yze.a;
                }
            } else {
                yzeVar5 = null;
            }
            if ((yzfVar2.b & 2097152) != 0) {
                yzeVar6 = yzfVar2.I;
                if (yzeVar6 == null) {
                    yzeVar6 = yze.a;
                }
            } else {
                yzeVar6 = null;
            }
            yze yzeVarS3 = s(yzeVar5, yzeVar6);
            if (yzeVarS3 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar24 = (yzf) vtwVarM.b;
                yzfVar24.I = yzeVarS3;
                yzfVar24.b |= 2097152;
            }
            if ((yzfVar.b & 4194304) != 0) {
                yzeVar7 = yzfVar.J;
                if (yzeVar7 == null) {
                    yzeVar7 = yze.a;
                }
            } else {
                yzeVar7 = null;
            }
            if ((yzfVar2.b & 4194304) != 0) {
                yzeVar8 = yzfVar2.J;
                if (yzeVar8 == null) {
                    yzeVar8 = yze.a;
                }
            } else {
                yzeVar8 = null;
            }
            yze yzeVarS4 = s(yzeVar7, yzeVar8);
            if (yzeVarS4 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar25 = (yzf) vtwVarM.b;
                yzfVar25.J = yzeVarS4;
                yzfVar25.b |= 4194304;
            }
            if ((yzfVar.b & 8388608) != 0) {
                yzeVar9 = yzfVar.K;
                if (yzeVar9 == null) {
                    yzeVar9 = yze.a;
                }
            } else {
                yzeVar9 = null;
            }
            if ((yzfVar2.b & 8388608) != 0) {
                yzeVar10 = yzfVar2.K;
                if (yzeVar10 == null) {
                    yzeVar10 = yze.a;
                }
            } else {
                yzeVar10 = null;
            }
            yze yzeVarS5 = s(yzeVar9, yzeVar10);
            if (yzeVarS5 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar26 = (yzf) vtwVarM.b;
                yzfVar26.K = yzeVarS5;
                yzfVar26.b |= 8388608;
            }
            if ((yzfVar.b & 16777216) != 0) {
                yzeVar11 = yzfVar.L;
                if (yzeVar11 == null) {
                    yzeVar11 = yze.a;
                }
            } else {
                yzeVar11 = null;
            }
            if ((yzfVar2.b & 16777216) != 0) {
                yzeVar12 = yzfVar2.L;
                if (yzeVar12 == null) {
                    yzeVar12 = yze.a;
                }
            } else {
                yzeVar12 = null;
            }
            yze yzeVarS6 = s(yzeVar11, yzeVar12);
            if (yzeVarS6 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar27 = (yzf) vtwVarM.b;
                yzfVar27.L = yzeVarS6;
                yzfVar27.b |= 16777216;
            }
            if ((yzfVar.b & 33554432) != 0) {
                yzeVar13 = yzfVar.Q;
                if (yzeVar13 == null) {
                    yzeVar13 = yze.a;
                }
            } else {
                yzeVar13 = null;
            }
            if ((yzfVar2.b & 33554432) != 0) {
                yzeVar14 = yzfVar2.Q;
                if (yzeVar14 == null) {
                    yzeVar14 = yze.a;
                }
            } else {
                yzeVar14 = null;
            }
            yze yzeVarS7 = s(yzeVar13, yzeVar14);
            if (yzeVarS7 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar28 = (yzf) vtwVarM.b;
                yzfVar28.Q = yzeVarS7;
                yzfVar28.b |= 33554432;
            }
            if ((yzfVar.b & 67108864) != 0) {
                yzeVar15 = yzfVar.R;
                if (yzeVar15 == null) {
                    yzeVar15 = yze.a;
                }
            } else {
                yzeVar15 = null;
            }
            if ((yzfVar2.b & 67108864) != 0) {
                yzeVar16 = yzfVar2.R;
                if (yzeVar16 == null) {
                    yzeVar16 = yze.a;
                }
            } else {
                yzeVar16 = null;
            }
            yze yzeVarS8 = s(yzeVar15, yzeVar16);
            if (yzeVarS8 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar29 = (yzf) vtwVarM.b;
                yzfVar29.R = yzeVarS8;
                yzfVar29.b |= 67108864;
            }
            if ((yzfVar.b & 134217728) != 0) {
                yzeVar17 = yzfVar.S;
                if (yzeVar17 == null) {
                    yzeVar17 = yze.a;
                }
            } else {
                yzeVar17 = null;
            }
            if ((yzfVar2.b & 134217728) != 0) {
                yzeVar18 = yzfVar2.S;
                if (yzeVar18 == null) {
                    yzeVar18 = yze.a;
                }
            } else {
                yzeVar18 = null;
            }
            yze yzeVarS9 = s(yzeVar17, yzeVar18);
            if (yzeVarS9 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar30 = (yzf) vtwVarM.b;
                yzfVar30.S = yzeVarS9;
                yzfVar30.b |= 134217728;
            }
            if ((yzfVar.b & 268435456) != 0) {
                yzeVar19 = yzfVar.T;
                if (yzeVar19 == null) {
                    yzeVar19 = yze.a;
                }
            } else {
                yzeVar19 = null;
            }
            if ((yzfVar2.b & 268435456) != 0) {
                yzeVar20 = yzfVar2.T;
                if (yzeVar20 == null) {
                    yzeVar20 = yze.a;
                }
            } else {
                yzeVar20 = null;
            }
            yze yzeVarS10 = s(yzeVar19, yzeVar20);
            if (yzeVarS10 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar31 = (yzf) vtwVarM.b;
                yzfVar31.T = yzeVarS10;
                yzfVar31.b |= 268435456;
            }
            if ((yzfVar.b & 536870912) != 0) {
                yzeVar21 = yzfVar.U;
                if (yzeVar21 == null) {
                    yzeVar21 = yze.a;
                }
            } else {
                yzeVar21 = null;
            }
            if ((yzfVar2.b & 536870912) != 0) {
                yzeVar22 = yzfVar2.U;
                if (yzeVar22 == null) {
                    yzeVar22 = yze.a;
                }
            } else {
                yzeVar22 = null;
            }
            yze yzeVarS11 = s(yzeVar21, yzeVar22);
            if (yzeVarS11 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar32 = (yzf) vtwVarM.b;
                yzfVar32.U = yzeVarS11;
                yzfVar32.b |= 536870912;
            }
            if ((yzfVar.b & 1073741824) != 0) {
                yzeVar23 = yzfVar.V;
                if (yzeVar23 == null) {
                    yzeVar23 = yze.a;
                }
            } else {
                yzeVar23 = null;
            }
            if ((yzfVar2.b & 1073741824) != 0) {
                yzeVar24 = yzfVar2.V;
                if (yzeVar24 == null) {
                    yzeVar24 = yze.a;
                }
            } else {
                yzeVar24 = null;
            }
            yze yzeVarS12 = s(yzeVar23, yzeVar24);
            if (yzeVarS12 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar33 = (yzf) vtwVarM.b;
                yzfVar33.V = yzeVarS12;
                yzfVar33.b |= 1073741824;
            }
            if ((yzfVar.b & Integer.MIN_VALUE) != 0) {
                yzeVar25 = yzfVar.W;
                if (yzeVar25 == null) {
                    yzeVar25 = yze.a;
                }
            } else {
                yzeVar25 = null;
            }
            if ((yzfVar2.b & Integer.MIN_VALUE) != 0) {
                yzeVar26 = yzfVar2.W;
                if (yzeVar26 == null) {
                    yzeVar26 = yze.a;
                }
            } else {
                yzeVar26 = null;
            }
            yze yzeVarS13 = s(yzeVar25, yzeVar26);
            if (yzeVarS13 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar34 = (yzf) vtwVarM.b;
                yzfVar34.W = yzeVarS13;
                yzfVar34.b |= Integer.MIN_VALUE;
            }
            if ((yzfVar.c & 1) != 0) {
                yzeVar27 = yzfVar.X;
                if (yzeVar27 == null) {
                    yzeVar27 = yze.a;
                }
            } else {
                yzeVar27 = null;
            }
            if ((yzfVar2.c & 1) != 0) {
                yzeVar28 = yzfVar2.X;
                if (yzeVar28 == null) {
                    yzeVar28 = yze.a;
                }
            } else {
                yzeVar28 = null;
            }
            yze yzeVarS14 = s(yzeVar27, yzeVar28);
            if (yzeVarS14 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar35 = (yzf) vtwVarM.b;
                yzfVar35.X = yzeVarS14;
                yzfVar35.c |= 1;
            }
            if ((yzfVar.c & 2) != 0) {
                yzeVar29 = yzfVar.Y;
                if (yzeVar29 == null) {
                    yzeVar29 = yze.a;
                }
            } else {
                yzeVar29 = null;
            }
            if ((yzfVar2.c & 2) != 0) {
                yzeVar30 = yzfVar2.Y;
                if (yzeVar30 == null) {
                    yzeVar30 = yze.a;
                }
            } else {
                yzeVar30 = null;
            }
            yze yzeVarS15 = s(yzeVar29, yzeVar30);
            if (yzeVarS15 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar36 = (yzf) vtwVarM.b;
                yzfVar36.Y = yzeVarS15;
                yzfVar36.c |= 2;
            }
            if ((yzfVar.c & 4) != 0) {
                long j20 = yzfVar.Z - yzfVar2.Z;
                if (j20 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar37 = (yzf) vtwVarM.b;
                    yzfVar37.c |= 4;
                    yzfVar37.Z = j20;
                }
            }
            if ((yzfVar.c & 8) != 0) {
                long j21 = yzfVar.aa - yzfVar2.aa;
                if (j21 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar38 = (yzf) vtwVarM.b;
                    yzfVar38.c |= 8;
                    yzfVar38.aa = j21;
                }
            }
            if ((yzfVar.c & 16) != 0) {
                long j22 = yzfVar.ab - yzfVar2.ab;
                if (j22 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar39 = (yzf) vtwVarM.b;
                    yzfVar39.c |= 16;
                    yzfVar39.ab = j22;
                }
            }
            if ((yzfVar.c & 32) != 0) {
                long j23 = yzfVar.ac - yzfVar2.ac;
                if (j23 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar40 = (yzf) vtwVarM.b;
                    yzfVar40.c |= 32;
                    yzfVar40.ac = j23;
                }
            }
            if ((yzfVar.c & 64) != 0) {
                long j24 = yzfVar.ad - yzfVar2.ad;
                if (j24 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar41 = (yzf) vtwVarM.b;
                    yzfVar41.c |= 64;
                    yzfVar41.ad = j24;
                }
            }
            if ((yzfVar.c & 128) != 0) {
                long j25 = yzfVar.ae - yzfVar2.ae;
                if (j25 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar42 = (yzf) vtwVarM.b;
                    yzfVar42.c |= 128;
                    yzfVar42.ae = j25;
                }
            }
            if ((yzfVar.c & 256) != 0) {
                long j26 = yzfVar.af - yzfVar2.af;
                if (j26 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar43 = (yzf) vtwVarM.b;
                    yzfVar43.c |= 256;
                    yzfVar43.af = j26;
                }
            }
            if ((yzfVar.c & 512) != 0) {
                long j27 = yzfVar.ag - yzfVar2.ag;
                if (j27 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar44 = (yzf) vtwVarM.b;
                    yzfVar44.c |= 512;
                    yzfVar44.ag = j27;
                }
            }
            if ((yzfVar.c & 1024) != 0) {
                long j28 = yzfVar.ah - yzfVar2.ah;
                if (j28 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar45 = (yzf) vtwVarM.b;
                    yzfVar45.c |= 1024;
                    yzfVar45.ah = j28;
                }
            }
            if ((yzfVar.c & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                long j29 = yzfVar.ai - yzfVar2.ai;
                if (j29 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar46 = (yzf) vtwVarM.b;
                    yzfVar46.c |= RecyclerView.ItemAnimator.FLAG_MOVED;
                    yzfVar46.ai = j29;
                }
            }
            if ((yzfVar.c & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                long j30 = yzfVar.aj - yzfVar2.aj;
                if (j30 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar47 = (yzf) vtwVarM.b;
                    yzfVar47.c |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                    yzfVar47.aj = j30;
                }
            }
            if ((yzfVar.c & 8192) != 0) {
                long j31 = yzfVar.ak - yzfVar2.ak;
                if (j31 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar48 = (yzf) vtwVarM.b;
                    yzfVar48.c |= 8192;
                    yzfVar48.ak = j31;
                }
            }
            if ((yzfVar.c & 16384) != 0) {
                long j32 = yzfVar.al - yzfVar2.al;
                if (j32 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar49 = (yzf) vtwVarM.b;
                    yzfVar49.c |= 16384;
                    yzfVar49.al = j32;
                }
            }
            if ((yzfVar.c & 32768) != 0) {
                long j33 = yzfVar.am - yzfVar2.am;
                if (j33 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar50 = (yzf) vtwVarM.b;
                    yzfVar50.c = 32768 | yzfVar50.c;
                    yzfVar50.am = j33;
                }
            }
            if ((yzfVar.c & 65536) != 0) {
                long j34 = yzfVar.an - yzfVar2.an;
                if (j34 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar51 = (yzf) vtwVarM.b;
                    yzfVar51.c |= 65536;
                    yzfVar51.an = j34;
                }
            }
            if ((yzfVar.c & 131072) != 0) {
                yzeVar31 = yzfVar.ao;
                if (yzeVar31 == null) {
                    yzeVar31 = yze.a;
                }
            } else {
                yzeVar31 = null;
            }
            if ((yzfVar2.c & 131072) != 0) {
                yzeVar32 = yzfVar2.ao;
                if (yzeVar32 == null) {
                    yzeVar32 = yze.a;
                }
            } else {
                yzeVar32 = null;
            }
            yze yzeVarS16 = s(yzeVar31, yzeVar32);
            if (yzeVarS16 != null) {
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                yzf yzfVar52 = (yzf) vtwVarM.b;
                yzfVar52.ao = yzeVarS16;
                yzfVar52.c |= 131072;
            }
            if ((yzfVar.c & 262144) != 0) {
                long j35 = yzfVar.ap - yzfVar2.ap;
                if (j35 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar53 = (yzf) vtwVarM.b;
                    yzfVar53.c |= 262144;
                    yzfVar53.ap = j35;
                }
            }
            if ((yzfVar.c & 524288) != 0) {
                long j36 = yzfVar.aq - yzfVar2.aq;
                if (j36 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar54 = (yzf) vtwVarM.b;
                    yzfVar54.c |= 524288;
                    yzfVar54.aq = j36;
                }
            }
            if ((yzfVar.c & 1048576) != 0) {
                long j37 = yzfVar.ar - yzfVar2.ar;
                if (j37 != 0) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    yzf yzfVar55 = (yzf) vtwVarM.b;
                    yzfVar55.c |= 1048576;
                    yzfVar55.ar = j37;
                }
            }
            yzfVar = (yzf) vtwVarM.r();
            if (y(yzfVar)) {
                return null;
            }
        }
        return yzfVar;
    }

    public static boolean v(yza yzaVar) {
        if (yzaVar != null) {
            return yzaVar.c.size() == 0 && yzaVar.d.size() == 0;
        }
        return true;
    }

    public static boolean w(yzc yzcVar) {
        if (yzcVar != null) {
            return yzcVar.c <= 0 && yzcVar.d <= 0 && yzcVar.e <= 0 && yzcVar.f <= 0 && yzcVar.g <= 0 && yzcVar.h <= 0;
        }
        return true;
    }

    public static boolean x(yzd yzdVar) {
        if (yzdVar != null) {
            return ((long) yzdVar.c) <= 0 && ((long) yzdVar.d) <= 0;
        }
        return true;
    }

    static boolean y(yzf yzfVar) {
        if (yzfVar != null) {
            return yzfVar.d <= 0 && yzfVar.e <= 0 && yzfVar.f <= 0 && yzfVar.g <= 0 && yzfVar.h.size() == 0 && yzfVar.i.size() == 0 && yzfVar.j.size() == 0 && yzfVar.k.size() == 0 && yzfVar.l.size() == 0 && yzfVar.m.size() == 0 && yzfVar.o.size() == 0 && yzfVar.p.size() == 0 && yzfVar.q.size() == 0 && yzfVar.r.size() == 0 && yzfVar.s <= 0 && yzfVar.t <= 0 && yzfVar.u <= 0 && yzfVar.v <= 0 && yzfVar.w <= 0 && yzfVar.x <= 0 && yzfVar.y <= 0 && yzfVar.z <= 0 && yzfVar.A <= 0 && yzfVar.B <= 0 && yzfVar.C <= 0 && yzfVar.D <= 0 && yzfVar.E <= 0 && yzfVar.F <= 0 && yzfVar.H <= 0 && yzfVar.Z <= 0 && yzfVar.aa <= 0 && yzfVar.ab <= 0 && yzfVar.ac <= 0 && yzfVar.ad <= 0 && yzfVar.ae <= 0 && yzfVar.af <= 0 && yzfVar.ag <= 0 && yzfVar.ah <= 0 && yzfVar.ai <= 0 && yzfVar.aj <= 0 && yzfVar.ak <= 0 && yzfVar.al <= 0 && yzfVar.am <= 0 && yzfVar.an <= 0 && yzfVar.ap <= 0 && yzfVar.aq <= 0 && yzfVar.ar <= 0;
        }
        return true;
    }

    public static rps z(Long l2, Long l3, HealthStats healthStats, rsh rshVar, int i) {
        Object obj;
        vtw vtwVarM = yzf.a.m();
        long jN = n(healthStats, 10001);
        if (jN != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar = (yzf) vtwVarM.b;
            yzfVar.b |= 1;
            yzfVar.d = jN;
        }
        long jN2 = n(healthStats, 10002);
        if (jN2 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar2 = (yzf) vtwVarM.b;
            yzfVar2.b |= 2;
            yzfVar2.e = jN2;
        }
        long jN3 = n(healthStats, 10003);
        if (jN3 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar3 = (yzf) vtwVarM.b;
            yzfVar3.b |= 4;
            yzfVar3.f = jN3;
        }
        long jN4 = n(healthStats, 10004);
        if (jN4 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar4 = (yzf) vtwVarM.b;
            yzfVar4.b |= 8;
            yzfVar4.g = jN4;
        }
        vtwVarM.bg(o(healthStats, 10005));
        vtwVarM.bh(o(healthStats, 10006));
        vtwVarM.bi(o(healthStats, 10007));
        vtwVarM.bf(o(healthStats, 10008));
        vtwVarM.be(o(healthStats, 10009));
        vtwVarM.ba(o(healthStats, 10010));
        yze yzeVarR = r(healthStats, 10011);
        if (yzeVarR != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar5 = (yzf) vtwVarM.b;
            yzfVar5.n = yzeVarR;
            yzfVar5.b |= 16;
        }
        vtwVarM.bb(o(healthStats, 10012));
        vtwVarM.bd(rpo.a.d(p(healthStats, 10014)));
        vtwVarM.bc(rpn.a.d(p(healthStats, 10015)));
        long jN5 = n(healthStats, 10016);
        if (jN5 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar6 = (yzf) vtwVarM.b;
            yzfVar6.b |= 32;
            yzfVar6.s = jN5;
        }
        long jN6 = n(healthStats, 10017);
        if (jN6 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar7 = (yzf) vtwVarM.b;
            yzfVar7.b |= 64;
            yzfVar7.t = jN6;
        }
        long jN7 = n(healthStats, 10018);
        if (jN7 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar8 = (yzf) vtwVarM.b;
            yzfVar8.b |= 128;
            yzfVar8.u = jN7;
        }
        long jN8 = n(healthStats, 10019);
        if (jN8 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar9 = (yzf) vtwVarM.b;
            yzfVar9.b |= 256;
            yzfVar9.v = jN8;
        }
        long jN9 = n(healthStats, 10020);
        if (jN9 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar10 = (yzf) vtwVarM.b;
            yzfVar10.b |= 512;
            yzfVar10.w = jN9;
        }
        long jN10 = n(healthStats, 10021);
        if (jN10 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar11 = (yzf) vtwVarM.b;
            yzfVar11.b |= 1024;
            yzfVar11.x = jN10;
        }
        long jN11 = n(healthStats, 10022);
        if (jN11 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar12 = (yzf) vtwVarM.b;
            yzfVar12.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
            yzfVar12.y = jN11;
        }
        long jN12 = n(healthStats, 10023);
        if (jN12 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar13 = (yzf) vtwVarM.b;
            yzfVar13.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            yzfVar13.z = jN12;
        }
        long jN13 = n(healthStats, 10024);
        if (jN13 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar14 = (yzf) vtwVarM.b;
            yzfVar14.b |= 8192;
            yzfVar14.A = jN13;
        }
        long jN14 = n(healthStats, 10025);
        if (jN14 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar15 = (yzf) vtwVarM.b;
            yzfVar15.b |= 16384;
            yzfVar15.B = jN14;
        }
        long jN15 = n(healthStats, 10026);
        if (jN15 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar16 = (yzf) vtwVarM.b;
            yzfVar16.b |= 32768;
            yzfVar16.C = jN15;
        }
        long jN16 = n(healthStats, 10027);
        if (jN16 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar17 = (yzf) vtwVarM.b;
            yzfVar17.b |= 65536;
            yzfVar17.D = jN16;
        }
        long jN17 = n(healthStats, 10028);
        if (jN17 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar18 = (yzf) vtwVarM.b;
            yzfVar18.b |= 131072;
            yzfVar18.E = jN17;
        }
        long jN18 = n(healthStats, 10029);
        if (jN18 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar19 = (yzf) vtwVarM.b;
            yzfVar19.b |= 262144;
            yzfVar19.F = jN18;
        }
        yze yzeVarR2 = r(healthStats, 10030);
        if (yzeVarR2 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar20 = (yzf) vtwVarM.b;
            yzfVar20.G = yzeVarR2;
            yzfVar20.b |= 524288;
        }
        long jN19 = n(healthStats, 10031);
        if (jN19 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar21 = (yzf) vtwVarM.b;
            yzfVar21.b |= 1048576;
            yzfVar21.H = jN19;
        }
        yze yzeVarR3 = r(healthStats, 10032);
        if (yzeVarR3 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar22 = (yzf) vtwVarM.b;
            yzfVar22.I = yzeVarR3;
            yzfVar22.b |= 2097152;
        }
        yze yzeVarR4 = r(healthStats, 10033);
        if (yzeVarR4 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar23 = (yzf) vtwVarM.b;
            yzfVar23.J = yzeVarR4;
            yzfVar23.b |= 4194304;
        }
        yze yzeVarR5 = r(healthStats, 10034);
        if (yzeVarR5 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar24 = (yzf) vtwVarM.b;
            yzfVar24.K = yzeVarR5;
            yzfVar24.b |= 8388608;
        }
        yze yzeVarR6 = r(healthStats, 10035);
        if (yzeVarR6 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar25 = (yzf) vtwVarM.b;
            yzfVar25.L = yzeVarR6;
            yzfVar25.b |= 16777216;
        }
        yze yzeVarR7 = r(healthStats, 10036);
        if (yzeVarR7 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar26 = (yzf) vtwVarM.b;
            yzfVar26.Q = yzeVarR7;
            yzfVar26.b |= 33554432;
        }
        yze yzeVarR8 = r(healthStats, 10037);
        if (yzeVarR8 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar27 = (yzf) vtwVarM.b;
            yzfVar27.R = yzeVarR8;
            yzfVar27.b |= 67108864;
        }
        yze yzeVarR9 = r(healthStats, 10038);
        if (yzeVarR9 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar28 = (yzf) vtwVarM.b;
            yzfVar28.S = yzeVarR9;
            yzfVar28.b |= 134217728;
        }
        yze yzeVarR10 = r(healthStats, 10039);
        if (yzeVarR10 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar29 = (yzf) vtwVarM.b;
            yzfVar29.T = yzeVarR10;
            yzfVar29.b |= 268435456;
        }
        yze yzeVarR11 = r(healthStats, 10040);
        if (yzeVarR11 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar30 = (yzf) vtwVarM.b;
            yzfVar30.U = yzeVarR11;
            yzfVar30.b |= 536870912;
        }
        yze yzeVarR12 = r(healthStats, 10041);
        if (yzeVarR12 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar31 = (yzf) vtwVarM.b;
            yzfVar31.V = yzeVarR12;
            yzfVar31.b |= 1073741824;
        }
        yze yzeVarR13 = r(healthStats, 10042);
        if (yzeVarR13 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar32 = (yzf) vtwVarM.b;
            yzfVar32.W = yzeVarR13;
            yzfVar32.b |= Integer.MIN_VALUE;
        }
        yze yzeVarR14 = r(healthStats, 10043);
        if (yzeVarR14 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar33 = (yzf) vtwVarM.b;
            yzfVar33.X = yzeVarR14;
            yzfVar33.c |= 1;
        }
        yze yzeVarR15 = r(healthStats, 10044);
        if (yzeVarR15 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar34 = (yzf) vtwVarM.b;
            yzfVar34.Y = yzeVarR15;
            yzfVar34.c |= 2;
        }
        long jN20 = n(healthStats, 10045);
        if (jN20 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar35 = (yzf) vtwVarM.b;
            yzfVar35.c |= 4;
            yzfVar35.Z = jN20;
        }
        long jN21 = n(healthStats, 10046);
        if (jN21 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar36 = (yzf) vtwVarM.b;
            yzfVar36.c |= 8;
            yzfVar36.aa = jN21;
        }
        long jN22 = n(healthStats, 10047);
        if (jN22 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar37 = (yzf) vtwVarM.b;
            yzfVar37.c |= 16;
            yzfVar37.ab = jN22;
        }
        long jN23 = n(healthStats, 10048);
        if (jN23 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar38 = (yzf) vtwVarM.b;
            yzfVar38.c |= 32;
            yzfVar38.ac = jN23;
        }
        long jN24 = n(healthStats, 10049);
        if (jN24 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar39 = (yzf) vtwVarM.b;
            yzfVar39.c |= 64;
            yzfVar39.ad = jN24;
        }
        long jN25 = n(healthStats, 10050);
        if (jN25 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar40 = (yzf) vtwVarM.b;
            yzfVar40.c |= 128;
            yzfVar40.ae = jN25;
        }
        long jN26 = n(healthStats, 10051);
        if (jN26 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar41 = (yzf) vtwVarM.b;
            yzfVar41.c |= 256;
            yzfVar41.af = jN26;
        }
        long jN27 = n(healthStats, 10052);
        if (jN27 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar42 = (yzf) vtwVarM.b;
            yzfVar42.c |= 512;
            yzfVar42.ag = jN27;
        }
        long jN28 = n(healthStats, 10053);
        if (jN28 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar43 = (yzf) vtwVarM.b;
            yzfVar43.c |= 1024;
            yzfVar43.ah = jN28;
        }
        long jN29 = n(healthStats, 10054);
        if (jN29 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar44 = (yzf) vtwVarM.b;
            yzfVar44.c |= RecyclerView.ItemAnimator.FLAG_MOVED;
            yzfVar44.ai = jN29;
        }
        long jN30 = n(healthStats, 10055);
        if (jN30 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar45 = (yzf) vtwVarM.b;
            yzfVar45.c |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            yzfVar45.aj = jN30;
        }
        long jN31 = n(healthStats, 10056);
        if (jN31 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar46 = (yzf) vtwVarM.b;
            yzfVar46.c |= 8192;
            yzfVar46.ak = jN31;
        }
        long jN32 = n(healthStats, 10057);
        if (jN32 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar47 = (yzf) vtwVarM.b;
            yzfVar47.c |= 16384;
            yzfVar47.al = jN32;
        }
        long jN33 = n(healthStats, 10058);
        if (jN33 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar48 = (yzf) vtwVarM.b;
            yzfVar48.c |= 32768;
            yzfVar48.am = jN33;
        }
        long jN34 = n(healthStats, 10059);
        if (jN34 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar49 = (yzf) vtwVarM.b;
            yzfVar49.c = 65536 | yzfVar49.c;
            yzfVar49.an = jN34;
        }
        yze yzeVarR16 = r(healthStats, 10061);
        if (yzeVarR16 != null) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar50 = (yzf) vtwVarM.b;
            yzfVar50.ao = yzeVarR16;
            yzfVar50.c |= 131072;
        }
        long jN35 = n(healthStats, 10062);
        if (jN35 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar51 = (yzf) vtwVarM.b;
            yzfVar51.c |= 262144;
            yzfVar51.ap = jN35;
        }
        long jN36 = n(healthStats, 10063);
        if (jN36 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar52 = (yzf) vtwVarM.b;
            yzfVar52.c = 524288 | yzfVar52.c;
            yzfVar52.aq = jN36;
        }
        long jN37 = n(healthStats, 10064);
        if (jN37 != 0) {
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            yzf yzfVar53 = (yzf) vtwVarM.b;
            yzfVar53.c |= 1048576;
            yzfVar53.ar = jN37;
        }
        yzf yzfVar54 = (yzf) vtwVarM.r();
        vtw vtwVar = (vtw) yzfVar54.a(5, null);
        vtwVar.x(yzfVar54);
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).h);
        int i2 = 0;
        while (true) {
            Object obj2 = rshVar.c;
            int size = ((yzf) vtwVar.b).h.size();
            obj = ((rzy) obj2).a;
            if (i2 >= size) {
                break;
            }
            vtwVar.bn(i2, ((rpl) obj).b(rpk.WAKELOCK, vtwVar.aX(i2)));
            i2++;
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).i);
        for (int i3 = 0; i3 < ((yzf) vtwVar.b).i.size(); i3++) {
            vtwVar.bo(i3, ((rpl) obj).b(rpk.WAKELOCK, vtwVar.aY(i3)));
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).j);
        for (int i4 = 0; i4 < ((yzf) vtwVar.b).j.size(); i4++) {
            vtwVar.bp(i4, ((rpl) obj).b(rpk.WAKELOCK, vtwVar.aZ(i4)));
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).k);
        for (int i5 = 0; i5 < ((yzf) vtwVar.b).k.size(); i5++) {
            vtwVar.bm(i5, ((rpl) obj).b(rpk.WAKELOCK, vtwVar.aW(i5)));
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).l);
        for (int i6 = 0; i6 < ((yzf) vtwVar.b).l.size(); i6++) {
            vtwVar.bl(i6, ((rpl) obj).b(rpk.SYNC, vtwVar.aV(i6)));
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).m);
        for (int i7 = 0; i7 < ((yzf) vtwVar.b).m.size(); i7++) {
            vtwVar.bj(i7, ((rpl) obj).b(rpk.JOB, vtwVar.aT(i7)));
        }
        DesugarCollections.unmodifiableList(((yzf) vtwVar.b).o);
        for (int i8 = 0; i8 < ((yzf) vtwVar.b).o.size(); i8++) {
            vtwVar.bk(i8, ((rpl) obj).b(rpk.SENSOR, vtwVar.aU(i8)));
        }
        return new rps((yzf) vtwVar.r(), l2, l3, 770518479L, Long.valueOf(rshVar.b != null ? ((String) r1).hashCode() : 0L), i, null, null, null);
    }

    public rrx(byte[] bArr) {
    }
}
