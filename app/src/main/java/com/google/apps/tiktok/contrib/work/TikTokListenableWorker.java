package com.google.apps.tiktok.contrib.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import defpackage.agow;
import defpackage.cbv;
import defpackage.qsi;
import defpackage.qsk;
import defpackage.vtj;
import defpackage.vtu;
import defpackage.vwd;
import defpackage.wvx;
import defpackage.wwb;
import defpackage.wwc;
import defpackage.wwt;
import defpackage.wxc;
import defpackage.wyo;
import defpackage.wzg;
import defpackage.yqw;
import defpackage.zdv;
import defpackage.zdy;
import defpackage.zwk;
import defpackage.zxn;
import defpackage.zyd;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TikTokListenableWorker extends cbv {
    private final wxc g;
    private final Map h;
    private final agow i;
    private final WorkerParameters j;
    private final wwc k;
    private vtu l;
    private boolean m;
    private static final zdy f = zdy.h("com/google/apps/tiktok/contrib/work/TikTokListenableWorker");
    public static final qsi e = new qsk("UNKNOWN");

    public TikTokListenableWorker(Context context, wxc wxcVar, Map map, agow agowVar, WorkerParameters workerParameters, wwc wwcVar) {
        super(context, workerParameters);
        this.l = null;
        this.m = false;
        this.h = map;
        this.i = agowVar;
        this.g = wxcVar;
        this.j = workerParameters;
        this.k = wwcVar;
    }

    public static /* synthetic */ void c(zyd zydVar, qsi qsiVar) {
        try {
            zxn.o(zydVar);
        } catch (CancellationException unused) {
            ((zdv) ((zdv) f.d()).q("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 190, "TikTokListenableWorker.java")).x("TikTokListenableWorker was cancelled while running client worker: %s", qsiVar);
        } catch (ExecutionException e2) {
            ((zdv) ((zdv) ((zdv) f.c()).p(e2.getCause())).q("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "logOnCancellationOrFailure", 185, "TikTokListenableWorker.java")).x("TikTokListenableWorker encountered an exception while running client worker: %s", qsiVar);
        }
    }

    @Override // defpackage.cbv
    public final zyd a() {
        wxc wxcVar = this.g;
        WorkerParameters workerParameters = this.j;
        String strB = vwd.b(workerParameters);
        wwt wwtVarE = wxcVar.e("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "getForegroundInfoAsync", 150, "WorkManager:TikTokListenableWorker getForegroundInfoAsync()");
        try {
            boolean z = true;
            wvx wvxVarF = wzg.f(strB + " getForegroundInfoAsync()", this.k, true);
            try {
                if (this.l != null) {
                    z = false;
                }
                yqw.M(z, "A TikTokListenableWorker's worker was null during getForegroundInfoAsync(), which should always be called before `startWork()`. Please report any instance of this Exception at go/tiktok-bug.");
                vtu vtuVar = (vtu) this.i.a();
                this.l = vtuVar;
                zyd zydVarA = vtuVar.a(workerParameters);
                wvxVarF.a(zydVarA);
                wvxVarF.close();
                wwtVarE.close();
                return zydVarA;
            } finally {
            }
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbv
    public final zyd b() {
        wxc wxcVar = this.g;
        WorkerParameters workerParameters = this.j;
        String strB = vwd.b(workerParameters);
        wwt wwtVarE = wxcVar.e("com/google/apps/tiktok/contrib/work/TikTokListenableWorker", "startWork", 92, "WorkManager:TikTokListenableWorker startWork");
        try {
            wvx wvxVarF = wzg.f(strB + " startWork()", this.k, true);
            try {
                String strB2 = vwd.b(workerParameters);
                wvx wvxVarF2 = wzg.f(String.valueOf(strB2).concat(" startWork()"), wwb.a, true);
                try {
                    yqw.M(!this.m, "A TikTokListenableWorker started twice. Please report any instance of this Exception at go/tiktok-bug.");
                    this.m = true;
                    if (this.l == null) {
                        this.l = (vtu) this.i.a();
                    }
                    this.l.d(new vtj());
                    final zyd zydVarB = this.l.b(workerParameters);
                    final qsi qsiVar = (qsi) Map.EL.getOrDefault(this.h, strB2, e);
                    zydVarB.d(wyo.h(new Runnable() { // from class: vti
                        @Override // java.lang.Runnable
                        public final void run() {
                            TikTokListenableWorker.c(zydVarB, qsiVar);
                        }
                    }), zwk.a);
                    wvxVarF2.a(zydVarB);
                    wvxVarF2.close();
                    wvxVarF.a(zydVarB);
                    wvxVarF.close();
                    wwtVarE.close();
                    return zydVarB;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                wwtVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
