package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dlv extends AppWidgetProvider {
    public static final /* synthetic */ int b = 0;
    public final yil a = ypk.a;

    public abstract dlj a();

    public final void b(yow yowVar, Context context) {
        ykr.q(yowVar, null, 0, new dbv(context, this, (yih) null, 2), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        cwm.C(this, this.a, new dls(this, context, i, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        cwm.C(this, this.a, new dlt(this, context, iArr, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1.equals("android.intent.action.LOCALE_CHANGED") != false) goto L32;
     */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "appWidgetIds"
            java.lang.String r1 = r9.getAction()     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            if (r1 == 0) goto La2
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            r3 = -19011148(0xfffffffffedde9b4, float:-1.4748642E38)
            if (r2 == r3) goto L63
            r3 = 649033583(0x26af776f, float:1.2175437E-15)
            if (r2 == r3) goto L58
            r0 = 1989767543(0x76997177, float:1.5560991E33)
            if (r2 == r0) goto L1d
            goto La2
        L1d:
            java.lang.String r0 = "ACTION_TRIGGER_LAMBDA"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            if (r0 != 0) goto L27
            goto La2
        L27:
            java.lang.String r0 = "EXTRA_ACTION_KEY"
            java.lang.String r5 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            if (r5 == 0) goto L4f
            java.lang.String r0 = "EXTRA_APPWIDGET_ID"
            r1 = -1
            int r4 = r9.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            if (r4 == r1) goto L46
            yil r9 = r7.a     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            dlu r1 = new dlu     // Catch: java.lang.Throwable -> Laa java.util.concurrent.CancellationException -> Lb1
            r6 = 0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            defpackage.cwm.C(r7, r9, r1)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            return
        L46:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            java.lang.String r9 = "Intent is missing AppWidgetId extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            throw r8     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
        L4f:
            r2 = r7
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            java.lang.String r9 = "Intent is missing ActionKey extra"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            throw r8     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
        L58:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "androidx.glance.appwidget.action.DEBUG_UPDATE"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            if (r8 != 0) goto L6d
            goto La4
        L63:
            r2 = r7
            r3 = r8
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            if (r8 == 0) goto La4
        L6d:
            android.appwidget.AppWidgetManager r8 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            java.lang.String r4 = r4.getCanonicalName()     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            if (r4 == 0) goto L9a
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            boolean r1 = r9.hasExtra(r0)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            if (r1 == 0) goto L92
            int[] r9 = r9.getIntArrayExtra(r0)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            r9.getClass()     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            goto L96
        L92:
            int[] r9 = r8.getAppWidgetIds(r5)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
        L96:
            r7.onUpdate(r3, r8, r9)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            return
        L9a:
            java.lang.String r8 = "no canonical name"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            r9.<init>(r8)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            throw r9     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
        La2:
            r2 = r7
            r3 = r8
        La4:
            super.onReceive(r3, r9)     // Catch: java.lang.Throwable -> La8 java.util.concurrent.CancellationException -> Lb2
            return
        La8:
            r0 = move-exception
            goto Lac
        Laa:
            r0 = move-exception
            r2 = r7
        Lac:
            r8 = r0
            defpackage.cwk.q(r8)
            return
        Lb1:
            r2 = r7
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlv.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        cwm.C(this, this.a, new dwe(this, context, iArr, (yih) null, 1));
    }
}
