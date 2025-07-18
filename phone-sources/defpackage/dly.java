package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dly implements RemoteViewsService.RemoteViewsFactory {
    public final int a;
    private final Context b;
    private final int c;
    private final String d;

    public dly(Context context, int i, int i2, String str) {
        this.b = context;
        this.a = i;
        this.c = i2;
        this.d = str;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    private final dmj b() {
        dmj dmjVar;
        int i = this.a;
        int i2 = this.c;
        String str = this.d;
        dhq dhqVar = GlanceRemoteViewsService.a;
        synchronized (dhqVar) {
            dmjVar = (dmj) dhqVar.a.get(dhq.a(i, i2, str));
            if (dmjVar == null) {
                dmjVar = dmj.a;
            }
        }
        return dmjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        if (r11 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (r8.p(r6) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.djz r10, defpackage.yih r11) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dlw
            if (r0 == 0) goto L13
            r0 = r11
            dlw r0 = (defpackage.dlw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlw r0 = new dlw
            r0.<init>(r9, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r7 = 3
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L43
            if (r1 == r2) goto L3f
            r10 = 2
            if (r1 == r10) goto L38
            if (r1 != r7) goto L30
            defpackage.ybn.f(r11)
            goto La1
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.ybn.f(r11)
            r8 = r11
            yqe r8 = (defpackage.yqe) r8
            goto L96
        L3f:
            defpackage.ybn.f(r11)
            goto L88
        L43:
            defpackage.ybn.f(r11)
            r11 = r2
            android.content.Context r2 = r9.b
            int r1 = r9.a
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r2)
            android.appwidget.AppWidgetProviderInfo r1 = r3.getAppWidgetInfo(r1)
            if (r1 == 0) goto L75
            android.content.ComponentName r1 = r1.provider
            if (r1 == 0) goto L75
            java.lang.String r1 = r1.getClassName()
            if (r1 == 0) goto L75
            java.lang.Class r1 = java.lang.Class.forName(r1)
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r8)
            java.lang.Object r1 = r1.newInstance(r8)
            r1.getClass()
            dlv r1 = (defpackage.dlv) r1
            dlj r1 = r1.a()
            goto L76
        L75:
            r1 = r8
        L76:
            if (r1 == 0) goto L8f
            dlx r5 = new dlx
            r3 = 0
            r5.<init>(r8, r3)
            r6.c = r11
            r4 = 0
            r3 = r10
            java.lang.Object r11 = r1.c(r2, r3, r4, r5, r6)
            if (r11 == r0) goto La0
        L88:
            yqe r11 = (defpackage.yqe) r11
            if (r11 != 0) goto L8d
            goto L8f
        L8d:
            r8 = r11
            goto L96
        L8f:
            java.util.Map r10 = androidx.glance.appwidget.UnmanagedSessionReceiver.a
            int r10 = r9.a
            defpackage.cwo.f(r10)
        L96:
            if (r8 == 0) goto La1
            r6.c = r7
            java.lang.Object r10 = r8.p(r6)
            if (r10 != r0) goto La1
        La0:
            return r0
        La1:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dly.a(djz, yih):java.lang.Object");
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return b().b(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return b().c(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.b.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return b().b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() throws Throwable {
        ykr.n(yim.a, new btr(this, (yih) null, 8));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        int i = this.a;
        int i2 = this.c;
        String str = this.d;
        dhq dhqVar = GlanceRemoteViewsService.a;
        synchronized (dhqVar) {
            dhqVar.a.remove(dhq.a(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
