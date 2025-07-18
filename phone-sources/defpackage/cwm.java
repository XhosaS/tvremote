package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.RemoteViews;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwm {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(defpackage.dlj r6, android.content.Context r7, defpackage.yih r8) {
        /*
            boolean r0 = r8 instanceof defpackage.dll
            if (r0 == 0) goto L13
            r0 = r8
            dll r0 = (defpackage.dll) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dll r0 = new dll
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.b
            java.lang.Object r7 = r0.a
            klm r2 = r0.e
            defpackage.ybn.f(r8)
            goto L63
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r7 = r0.a
            klm r6 = r0.e
            defpackage.ybn.f(r8)
            goto L5b
        L40:
            defpackage.ybn.f(r8)
            dlr r8 = new dlr
            r8.<init>(r7)
            java.lang.Class r2 = r6.getClass()
            r5 = r6
            klm r5 = (defpackage.klm) r5
            r0.e = r5
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.b(r2, r0)
            if (r8 == r1) goto L9f
        L5b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = r6
            r6 = r8
        L63:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r6.next()
            djz r8 = (defpackage.djz) r8
            r4 = r2
            klm r4 = (defpackage.klm) r4
            r0.e = r4
            r0.a = r7
            r0.b = r6
            r0.d = r3
            boolean r4 = r8 instanceof defpackage.djz
            if (r4 == 0) goto L94
            boolean r4 = defpackage.cwk.s(r8)
            if (r4 == 0) goto L94
            int r8 = r8.a
            r4 = r7
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r8 = defpackage.dlj.e(r2, r4, r8, r0)
            if (r8 == r1) goto L91
            ygi r8 = defpackage.ygi.a
        L91:
            if (r8 != r1) goto L63
            goto L9f
        L94:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid Glance ID"
            r6.<init>(r7)
            throw r6
        L9c:
            ygi r6 = defpackage.ygi.a
            return r6
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwm.A(dlj, android.content.Context, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(defpackage.yjz r4, defpackage.yih r5) {
        /*
            boolean r0 = r5 instanceof defpackage.dlk
            if (r0 == 0) goto L13
            r0 = r5
            dlk r0 = (defpackage.dlk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dlk r0 = new dlk
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.ybn.f(r5)
            goto L49
        L2f:
            defpackage.ybn.f(r5)
            yil r5 = r0.getContext()
            bbx r2 = defpackage.dkr.c
            yij r5 = r5.get(r2)
            dkr r5 = (defpackage.dkr) r5
            if (r5 == 0) goto L4f
            r0.b = r3
            java.lang.Object r4 = r5.a(r4, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            yfs r4 = new yfs
            r4.<init>()
            throw r4
        L4f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwm.B(yjz, yih):java.lang.Object");
    }

    public static final void C(BroadcastReceiver broadcastReceiver, yil yilVar, yjz yjzVar) {
        yow yowVarL = yoz.l(yilVar);
        ykr.q(yowVarL, null, 0, new th(yowVarL, broadcastReceiver.goAsync(), yjzVar, (yih) null, 11), 3);
    }

    public static float a(View view) {
        return view.getElevation();
    }

    public static float b(View view) {
        return view.getZ();
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static cyh e(View view, cyh cyhVar, Rect rect) {
        WindowInsets windowInsetsE = cyhVar.e();
        if (windowInsetsE != null) {
            return cyh.p(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return cyhVar;
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    static void g(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f) {
        view.setElevation(f);
    }

    public static void k(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void l(View view, cvq cvqVar) {
        cwl cwlVar = cvqVar != null ? new cwl(view, cvqVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, cwlVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (cwlVar != null) {
            view.setOnApplyWindowInsetsListener(cwlVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void m(View view, String str) {
        view.setTransitionName(str);
    }

    static void n(View view) {
        view.stopNestedScroll();
    }

    public static void o(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof cvn) {
            ((cvn) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void p(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof cvo) {
            ((cvo) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof cvn) {
            ((cvn) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void q(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cvn) {
            ((cvn) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void r(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof cvn) {
            ((cvn) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean s(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean t(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean u(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof cvn) {
            return ((cvn) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.cj(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }

    public static final cyq v(kp kpVar, int i) {
        return (cyq) kpVar.e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void x(defpackage.bao r4, int r5) {
        /*
            r0 = 1257244356(0x4af006c4, float:7865186.0)
            bao r4 = r4.d(r0)
            if (r5 != 0) goto L16
            boolean r5 = r4.K()
            r0 = 0
            if (r5 != 0) goto L12
            r5 = r0
            goto L16
        L12:
            r4.t()
            goto L5d
        L16:
            r0 = r4
            bas r0 = (defpackage.bas) r0
            java.lang.Object r1 = r0.T()
            java.lang.Object r2 = defpackage.ban.a
            if (r1 != r2) goto L26
            dlz r1 = defpackage.dlz.a
            r0.ae(r1)
        L26:
            ymj r1 = (defpackage.ymj) r1
            yjk r1 = (defpackage.yjk) r1
            r2 = -1115894518(0xffffffffbd7ccd0a, float:-0.061718978)
            r4.y(r2)
            r2 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r4.y(r2)
            bad r2 = r0.a
            boolean r2 = r2 instanceof defpackage.dio
            if (r2 != 0) goto L3f
            defpackage.zy.n()
        L3f:
            r4.w()
            boolean r2 = r0.w
            if (r2 == 0) goto L50
            dji r2 = new dji
            r3 = 2
            r2.<init>(r1, r3)
            r4.k(r2)
            goto L53
        L50:
            r4.B()
        L53:
            r4.o()
            r0.aa()
            r0.aa()
            r0 = r5
        L5d:
            bcr r4 = r4.M()
            if (r4 == 0) goto L6b
            jtq r5 = new jtq
            r1 = 1
            r5.<init>(r0, r1)
            r4.d = r5
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwm.x(bao, int):void");
    }

    public static final boolean y(diz dizVar) {
        if (dizVar instanceof dkw) {
            return true;
        }
        if (!(dizVar instanceof djd)) {
            return false;
        }
        List list = ((djd) dizVar).d;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (y((diz) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    public static final void z(RemoteViews remoteViews, dmw dmwVar, int i, String str, dmj dmjVar) {
        if (Build.VERSION.SDK_INT > 31) {
            RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(dmjVar.b).setViewTypeCount(dmjVar.c);
            int iA = dmjVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                viewTypeCount.addItem(dmjVar.b(i2), dmjVar.c(i2));
            }
            remoteViews.setRemoteAdapter(i, viewTypeCount.build());
            return;
        }
        Context context = dmwVar.a;
        int i3 = dmwVar.b;
        Intent intentPutExtra = new Intent().setComponent((ComponentName) dmwVar.o.c).putExtra("appWidgetId", i3).putExtra("androidx.glance.widget.extra.view_id", i).putExtra("androidx.glance.widget.extra.size_info", str);
        intentPutExtra.setData(Uri.parse(intentPutExtra.toUri(1)));
        if (context.getPackageManager().resolveService(intentPutExtra, 0) == null) {
            ComponentName component = intentPutExtra.getComponent();
            Objects.toString(component);
            throw new IllegalStateException(String.valueOf(component).concat(" could not be resolved, check the app manifest."));
        }
        remoteViews.setRemoteAdapter(i, intentPutExtra);
        dhq dhqVar = GlanceRemoteViewsService.a;
        synchronized (dhqVar) {
            dhqVar.a.put(dhq.a(i3, i, str), dmjVar);
        }
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i3, i);
    }
}
