package com.google.android.apps.googletv.app.presentation.widgets.toppicks;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.aps;
import defpackage.cwm;
import defpackage.dlj;
import defpackage.dls;
import defpackage.dlt;
import defpackage.dlv;
import defpackage.dwe;
import defpackage.isy;
import defpackage.klm;
import defpackage.krd;
import defpackage.lie;
import defpackage.nbe;
import defpackage.opn;
import defpackage.opt;
import defpackage.opu;
import defpackage.opv;
import defpackage.oqa;
import defpackage.oqb;
import defpackage.oqc;
import defpackage.oqe;
import defpackage.osk;
import defpackage.vtw;
import defpackage.wae;
import defpackage.wcv;
import defpackage.xbw;
import defpackage.xjk;
import defpackage.yih;
import defpackage.yks;
import defpackage.ylb;
import defpackage.ylf;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TopPicksWidgetReceiver extends dlv {
    private static final oqc g = new oqc();
    private static final oqe h = oqe.y;
    public xbw c;
    public lie d;
    public xjk e;
    public isy f;

    @Override // defpackage.dlv
    public final dlj a() {
        return new klm();
    }

    public final lie c() {
        lie lieVar = this.d;
        if (lieVar != null) {
            return lieVar;
        }
        yks.c("eventLogger");
        return null;
    }

    public final isy d() {
        isy isyVar = this.f;
        if (isyVar != null) {
            return isyVar;
        }
        yks.c("widgetWorkerScheduler");
        return null;
    }

    @Override // defpackage.dlv, android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        bundle.getClass();
        cwm.C(this, this.a, new dls(this, context, i, bundle, null));
        oqc oqcVar = g;
        oqe oqeVar = h;
        int i2 = oqc.a;
        ExecutorService executorServiceA = opn.a();
        oqeVar.getClass();
        executorServiceA.getClass();
        vtw vtwVarM = wcv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcv wcvVar = (wcv) vtwVarM.b;
        wcvVar.c = 5;
        wcvVar.b |= 1;
        oqcVar.b(oqeVar, context, vtwVarM);
    }

    @Override // defpackage.dlv, android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        context.getClass();
        iArr.getClass();
        cwm.C(this, this.a, new dlt(this, context, iArr, null));
        for (int i : iArr) {
            c().aE(i);
        }
        oqc oqcVar = g;
        oqe oqeVar = h;
        int i2 = oqc.a;
        ExecutorService executorServiceA = opn.a();
        oqeVar.getClass();
        executorServiceA.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        opt optVarA = oqcVar.a(context, executorServiceA);
        for (int i3 : iArr) {
            ylf ylfVar = new ylf();
            osk.i(osk.n(osk.m(((opv) optVarA).b, new nbe(new aps(ylfVar, i3, 6), 11)), new nbe(ylfVar, 12)), new oqa(i3, jCurrentTimeMillis, oqcVar, oqeVar, context));
        }
    }

    @Override // defpackage.dlv, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        krd.b("TopPicksWidgetReceiver is running");
        wae.B(this, context);
        super.onReceive(context, intent);
        boolean booleanExtra = intent.getBooleanExtra("FORCE_REFRESH", false);
        xbw xbwVar = this.c;
        if (xbwVar == null) {
            yks.c("observables");
            xbwVar = null;
        }
        xbwVar.b();
        d().n(booleanExtra, false);
    }

    @Override // defpackage.dlv, android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        cwm.C(this, this.a, new dwe(this, context, iArr, (yih) null, 1));
        xjk xjkVar = this.e;
        if (xjkVar == null) {
            yks.c("glanceWidgetFeatureFlags");
            xjkVar = null;
        }
        if (xjkVar.a()) {
            isy.p(d());
        } else {
            d().m();
        }
        for (int i : iArr) {
            c().aF(i);
        }
        oqc oqcVar = g;
        oqe oqeVar = h;
        int i2 = oqc.a;
        ExecutorService executorServiceA = opn.a();
        oqeVar.getClass();
        executorServiceA.getClass();
        if (iArr.length == 0) {
            return;
        }
        vtw vtwVarM = wcv.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wcv wcvVar = (wcv) vtwVarM.b;
        wcvVar.c = 4;
        wcvVar.b |= 1;
        oqcVar.b(oqeVar, context, vtwVarM);
        opt optVarA = oqcVar.a(context, executorServiceA);
        for (int i3 : iArr) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ylb ylbVar = new ylb();
            osk.i(osk.n(osk.m(((opv) optVarA).b, new nbe(new opu(ylbVar, i3, jCurrentTimeMillis, 0), 9)), new nbe(ylbVar, 10)), new oqb(oqcVar, oqeVar, context, i3));
        }
    }
}
