package com.google.android.apps.play.movies.common.service.pinning;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import defpackage.hfx;
import defpackage.isy;
import defpackage.krf;
import defpackage.ksk;
import defpackage.ksn;
import defpackage.lgr;
import defpackage.lie;
import defpackage.ljq;
import defpackage.ljr;
import defpackage.mbq;
import defpackage.wae;
import defpackage.xca;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PinBroadcastReceiver extends xca {
    public lie a;
    public lgr b;
    public ExecutorService c;
    public isy d;
    public hfx e;

    public static void a(Context context, ksn ksnVar, String str) {
        krf.c(str);
        Intent intent = new Intent(context, (Class<?>) PinBroadcastReceiver.class);
        intent.setAction("com.google.android.videos.CLEAR_ERROR");
        intent.putExtra("account", ksnVar.a);
        intent.putExtra("video_id", str);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, lgr lgrVar) {
        ksk.l(context, TransferService.a(context, false));
        lgrVar.a();
    }

    public static void c(Context context, ksn ksnVar, String str) {
        krf.c(str);
        Intent intent = new Intent(context, (Class<?>) PinBroadcastReceiver.class);
        intent.setAction("com.google.android.videos.SET_UNPINNED");
        intent.putExtra("account", ksnVar.a);
        intent.putExtra("video_id", str);
        context.sendBroadcast(intent);
    }

    public static void d(Context context, lgr lgrVar, hfx hfxVar) {
        ksk.k(context, TransferService.a(context, true));
        lgrVar.a();
        hfxVar.s(4);
    }

    public static void e(Context context, isy isyVar, lgr lgrVar, hfx hfxVar, ksn ksnVar, String str) {
        SQLiteDatabase sQLiteDatabaseF = isyVar.f();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("pinning_status");
            contentValues.putNull("pinning_status_reason");
            contentValues.putNull("pinning_drm_error_code");
            int iUpdate = sQLiteDatabaseF.update("purchased_assets", contentValues, "account = ? AND asset_type IN (6,20) AND asset_id = ? AND NOT (pinned IS NOT NULL AND pinned > 0) AND pinning_status = 4", new String[]{ksnVar.a, str});
            if (iUpdate > 0) {
                isyVar.l(sQLiteDatabaseF, ksnVar, str);
            } else {
                isyVar.g(sQLiteDatabaseF, true);
            }
            if (iUpdate > 0) {
                ksk.k(context, TransferService.a(context, true));
                lgrVar.a();
                hfxVar.s(5);
            }
        } catch (Throwable th) {
            isyVar.g(sQLiteDatabaseF, false);
            throw th;
        }
    }

    @Override // defpackage.xca, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Runnable mbqVar;
        wae.B(this, context);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        ksn ksnVarB = ksn.b(intent.getStringExtra("account"));
        String stringExtra = intent.getStringExtra("video_id");
        switch (action.hashCode()) {
            case -1778185913:
                if (action.equals("com.google.android.videos.CLEAR_ERROR")) {
                    mbqVar = new mbq(goAsync(), context, this.d, this.e, ksnVarB, stringExtra, this.b, 1);
                    break;
                } else {
                    return;
                }
            case -621383580:
                if (action.equals("com.google.android.videos.SET_PINNED")) {
                    mbqVar = new ljq(goAsync(), context, this.d, this.a, ksnVarB, stringExtra, intent.getIntExtra("quality", 0), intent.getIntExtra("storage", 0));
                    break;
                } else {
                    return;
                }
            case 89916683:
                if (action.equals("com.google.android.videos.SET_UNPINNED_LEGACY")) {
                    mbqVar = new ljr(goAsync(), context, this.d, this.a, this.e, ksnVarB, stringExtra, this.b, true);
                    break;
                } else {
                    return;
                }
            case 170422589:
                if (action.equals("com.google.android.videos.SET_UNPINNED")) {
                    mbqVar = new ljr(goAsync(), context, this.d, this.a, this.e, ksnVarB, stringExtra, this.b, false);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        this.c.execute(mbqVar);
    }
}
