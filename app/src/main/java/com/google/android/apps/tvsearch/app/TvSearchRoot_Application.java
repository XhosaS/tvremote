package com.google.android.apps.tvsearch.app;

import defpackage.aehg;
import defpackage.caj;
import defpackage.cak;
import defpackage.evj;
import defpackage.vtk;
import defpackage.wgw;
import defpackage.wim;
import defpackage.win;
import defpackage.wum;
import defpackage.wvl;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwc;
import defpackage.wwt;
import defpackage.wys;
import defpackage.wyt;
import defpackage.wzg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TvSearchRoot_Application extends evj implements caj {
    @Override // defpackage.caj
    public final cak a() {
        AutoCloseable autoCloseableB = !wum.t() ? ((vtk) aehg.a(this, vtk.class)).eG().a.b("getWorkManagerConfiguration", "com/google/apps/tiktok/tracing/contrib/androidx/work/WorkManagerTraceCreation", "beginGetWorkConfigurationRootTraceIfNotActive", 20) : new wwt() { // from class: wwx
            @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        };
        try {
            cak cakVarZ = ((vtk) aehg.a(this, vtk.class)).z();
            autoCloseableB.close();
            return cakVarZ;
        } catch (Throwable th) {
            try {
                autoCloseableB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.evj, defpackage.evk, defpackage.wil, android.app.Application
    public final void onCreate() {
        wvx wvxVarF;
        if (!f()) {
            super.onCreate();
            return;
        }
        wyt wytVarC = wyt.c();
        if (wytVarC.e()) {
            long jB = win.b();
            wvl wvlVarC = ((wim) wgw.a(this, wim.class)).l().c("com/google/apps/tiktok/inject/baseclasses/TikTokApplicationTrace", "beginOnCreateTrace", 52, win.a(jB), jB * 1000000);
            try {
                wum.o();
                wvxVarF = wzg.f("Application.onCreate", wwb.a, true);
                try {
                    super.onCreate();
                    wvxVarF.close();
                    wvlVarC.close();
                } finally {
                }
            } finally {
            }
        } else {
            wwt wwtVarA = wytVarC.a();
            try {
                wwc wwcVar = wwb.a;
                wvxVarF = wzg.f("Application creation", wwcVar, true);
                try {
                    wvx wvxVarF2 = wzg.f("Application.onCreate", wwcVar, true);
                    try {
                        super.onCreate();
                        wvxVarF2.close();
                        wvxVarF.close();
                        wum.g(wum.c(), ((wys) wwtVarA).a);
                    } finally {
                    }
                } finally {
                    try {
                        wvxVarF.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        }
    }
}
