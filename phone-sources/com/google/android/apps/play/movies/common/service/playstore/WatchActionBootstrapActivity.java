package com.google.android.apps.play.movies.common.service.playstore;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.a;
import defpackage.by;
import defpackage.idr;
import defpackage.ieg;
import defpackage.krd;
import defpackage.krn;
import defpackage.ksn;
import defpackage.ksr;
import defpackage.ksy;
import defpackage.ktw;
import defpackage.kuf;
import defpackage.kuw;
import defpackage.kvk;
import defpackage.kxg;
import defpackage.lfn;
import defpackage.lid;
import defpackage.lie;
import defpackage.ljt;
import defpackage.ltw;
import defpackage.luj;
import defpackage.lyl;
import defpackage.lys;
import defpackage.lyz;
import defpackage.mdy;
import defpackage.trk;
import defpackage.tst;
import defpackage.wae;
import defpackage.xby;
import defpackage.xcd;
import defpackage.xce;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WatchActionBootstrapActivity extends by implements xce {
    public lfn a;
    public lie b;
    public ExecutorService c;
    public Executor d;
    public idr e;
    public xcd f;
    public ltw g;
    public lys h;
    public lyz i;
    public kuw j;

    public static /* synthetic */ Object $r8$lambda$5GLx5ZqsSnX889VPy9_1jLJicAI(WatchActionBootstrapActivity watchActionBootstrapActivity, luj lujVar) {
        Object objB = watchActionBootstrapActivity.g.b(lujVar);
        ieg iegVar = (ieg) objB;
        if (!iegVar.m() || !watchActionBootstrapActivity.a.cA()) {
            krd.g("Failed to upload watch action", iegVar.i());
            return objB;
        }
        watchActionBootstrapActivity.j.d(2);
        watchActionBootstrapActivity.e.c(Long.valueOf(System.currentTimeMillis()));
        return objB;
    }

    private static Intent a(Context context, ksr ksrVar, lid lidVar) {
        String str = "&external_client_id=" + lidVar.d() + "&referrer=utm_source%3Dplay-guide%26utm_medium%3Dorganic";
        return new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + ksrVar.b + str)).putExtra("overlay", true).putExtra("callerId", context.getPackageName());
    }

    private final void b(Uri uri, ksr ksrVar, ksy ksyVar) {
        try {
            try {
                startActivity(Intent.parseUri(uri.toString(), 0).addFlags(335544320).putExtra("android.intent.extra.START_PLAYBACK", true).putExtra("source", "play-guide").setPackage(ksrVar.b));
                setResult(-1);
            } catch (Exception e) {
                krd.c(String.format("Failed to start deeplink intent, URI=%s", uri.toString()));
                if (!(e instanceof ActivityNotFoundException)) {
                    this.b.aq(ksyVar, ksrVar.b);
                }
                Intent intent = new Intent("android.intent.action.VIEW").setPackage(ksrVar.b);
                if (intent != null) {
                    intent.addFlags(335577088).putExtra("source", "play-guide");
                    try {
                        startActivity(intent);
                        setResult(-1);
                    } catch (ActivityNotFoundException e2) {
                        krd.d("Unable to start app launch intent", e2);
                        startActivityForResult(a(this, ksrVar, lid.a), 1007);
                        setResult(-1);
                    }
                } else {
                    krd.c("Failed to get app launch intent");
                    setResult(0, new Intent().putExtra("client-token", String.format("assetId=%s deeplink=%s androidApp=%s exception=%s", ksyVar, uri, ksrVar.b, e.getMessage())));
                }
            }
        } finally {
            finish();
        }
    }

    public static ieg<kvk> startAppActivity(Context context, mdy mdyVar, ksr ksrVar, ksn ksnVar) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(ksrVar.b);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(335577088).putExtra("source", "play-guide");
            mdyVar.a(launchIntentForPackage);
            return kvk.b;
        }
        krd.c("Failed to get app launch intent");
        try {
            startInstallAppActivity(context, mdyVar, ksnVar, ksrVar, lid.a);
            return kvk.b;
        } catch (ActivityNotFoundException unused) {
            return ieg.b(new Throwable(String.format("androidApp=%s exception=%s", ksrVar.b, "PackageManager.getLaunchIntentForPackage")));
        }
    }

    public static void startInstallAppActivity(Context context, mdy mdyVar, ksn ksnVar, ksr ksrVar, lid lidVar) {
        try {
            mdyVar.b(a(context, ksrVar, lidVar), 1007);
        } catch (ActivityNotFoundException e) {
            krd.c(e.getMessage());
            throw e;
        }
    }

    public static void startWatchActionActivity(Context context, mdy mdyVar, ksn ksnVar, ksy ksyVar, ieg<ksy> iegVar, ieg<ksy> iegVar2, kxg kxgVar, lid lidVar) {
        mdyVar.b(new Intent(context, (Class<?>) WatchActionBootstrapActivity.class).putExtra("account", ksnVar).putExtra("asset_id", ksyVar).putExtra("show_id", (Parcelable) iegVar.c).putExtra("season_id", (Parcelable) iegVar2.c).putExtra("watch_action", kxgVar).putExtra("parent_event_id", lidVar), 1009);
    }

    public static void startWatchActionActivityOrOpenPlayStore(Context context, mdy mdyVar, ksn ksnVar, ksy ksyVar, ieg<ksy> iegVar, ieg<ksy> iegVar2, tst<kxg> tstVar, lid lidVar) {
        mdyVar.b(new Intent(context, (Class<?>) WatchActionBootstrapActivity.class).putExtra("account", ksnVar).putExtra("asset_id", ksyVar).putExtra("show_id", (Parcelable) iegVar.c).putExtra("season_id", (Parcelable) iegVar2.c).putExtra("watch_action", (Parcelable) tstVar.c()).putExtra("parent_event_id", lidVar), 1009);
    }

    public static void startWatchActionOrInstallActivity(Context context, mdy mdyVar, ksn ksnVar, ksy ksyVar, ieg<ksy> iegVar, ieg<ksy> iegVar2, kxg kxgVar, lid lidVar) {
        startWatchActionActivityOrOpenPlayStore(context, mdyVar, ksnVar, ksyVar, iegVar, iegVar2, tst.i(kxgVar), lidVar);
    }

    @Override // defpackage.xce
    public final xby<Object> androidInjector() {
        return this.f;
    }

    @Override // defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        wae.y(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        ieg iegVarA = ieg.a((ksn) intent.getParcelableExtra("account"));
        ieg iegVarA2 = ieg.a((ksy) intent.getParcelableExtra("asset_id"));
        ieg iegVarA3 = ieg.a((ksy) intent.getParcelableExtra("show_id"));
        ieg iegVarA4 = ieg.a((ksy) intent.getParcelableExtra("season_id"));
        ieg iegVarA5 = ieg.a((kxg) intent.getParcelableExtra("watch_action"));
        a.ab(iegVarA.m());
        a.ab(iegVarA2.m());
        a.ab(iegVarA5.m());
        ksn ksnVar = (ksn) iegVarA.g();
        ksy ksyVar = (ksy) iegVarA2.g();
        kxg kxgVar = (kxg) iegVarA5.g();
        kuf kufVar = kxgVar.c;
        ksr ksrVar = kxgVar.d;
        Uri uri = kxgVar.e;
        if (bundle != null) {
            return;
        }
        byte[] bArr = null;
        ktw.o(ksnVar, ksyVar, iegVarA4, iegVarA3, kufVar, this.h, this.a).o(new krn(this.c, new lyl(this.i, 0), 1, bArr));
        long jCurrentTimeMillis = System.currentTimeMillis();
        new krn(this.d, new ljt(this, 3), 9, bArr).c(new luj(ksnVar, ksyVar, jCurrentTimeMillis, jCurrentTimeMillis, trk.a, tst.i(kxgVar)));
        b(uri, ksrVar, ksyVar);
    }
}
