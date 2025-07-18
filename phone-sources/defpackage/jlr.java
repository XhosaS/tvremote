package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.PeriodicSync;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.apps.play.movies.common.presenter.activity.AuxiliaryActivity;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import com.google.android.apps.play.movies.common.store.sync.SyncService;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jlr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jlr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r2v12, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r3v4, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ldv] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, ldv] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                jls jlsVar = (jls) this.a;
                jlw.i(jlsVar.b);
                jlw jlwVar = jlsVar.a;
                jlw.h(jlwVar.d(), 0.6f);
                jlwVar.e();
                jlsVar.d.d = true;
                break;
            case 1:
                ((sbt) this.a).z();
                break;
            case 2:
                jls jlsVar2 = (jls) this.a;
                jlsVar2.e = true;
                if (jlsVar2.f == 3) {
                    jlw jlwVar2 = jlsVar2.a;
                    ExoPlayer exoPlayer = jlwVar2.h;
                    if (exoPlayer != null) {
                        exoPlayer.ab(true);
                    }
                    jlw.i(jlwVar2.d());
                    jlw.h(jlsVar2.b, 1.0f);
                    break;
                }
                break;
            case 3:
                jlw jlwVar3 = (jlw) this.a;
                TextureView textureView = jlwVar3.j;
                if (textureView == null) {
                    yks.c("exoPlayerView");
                    textureView = null;
                }
                jlw.i(textureView);
                jlw.h(jlwVar3.d(), 0.6f);
                jlwVar3.e();
                break;
            case 4:
                ((sbt) this.a).z();
                break;
            case 5:
                ((sbt) this.a).z();
                break;
            case 6:
                GtvHomePageActivity gtvHomePageActivity = (GtvHomePageActivity) this.a;
                gtvHomePageActivity.D().h(gtvHomePageActivity);
                break;
            case 7:
                ((OpenSearchView) this.a).f();
                break;
            case 8:
                krd.b("Switching back to GTVm cast ID");
                String strBg = ((kmy) this.a).b.bg();
                nmg nmgVarC = nmg.c();
                if (nmgVarC != null) {
                    nmgVarC.j(strBg);
                    break;
                }
                break;
            case 9:
                kqy kqyVar = (kqy) this.a;
                kqyVar.k.c("");
                ieg iegVar = ieg.a;
                kqyVar.l.c(iegVar);
                kqyVar.m.c(iegVar);
                break;
            case 10:
                this.a.s();
                break;
            case 11:
                this.a.A();
                break;
            case 12:
                ((san) ((kqy) this.a).n.b()).d();
                break;
            case 13:
                kqy kqyVar2 = (kqy) this.a;
                kqyVar2.a(kqyVar2.f);
                break;
            case 14:
                Object obj = this.a;
                Thread.setDefaultUncaughtExceptionHandler(new rrt(obj, Thread.getDefaultUncaughtExceptionHandler(), i2));
                kqy kqyVar3 = (kqy) obj;
                Boolean bool = (Boolean) kqyVar3.g;
                if (!bool.booleanValue()) {
                    if (kqyVar3.c.bN()) {
                        krd.b("Starting transfer service in post startup");
                        PinBroadcastReceiver.b((Context) kqyVar3.b, (lgr) kqyVar3.a.b());
                    }
                    ((ljg) kqyVar3.j.b()).d();
                    if (kqyVar3.d.c()) {
                        Context context = (Context) kqyVar3.b;
                        ComponentName componentName = new ComponentName(context, "com.google.android.videos.ManageNetworkUsageActivity");
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                            krd.b("Enabling network usage management");
                            packageManager.setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                ?? r4 = kqyVar3.h;
                if (r4.getBoolean(krh.CHECK_ACCOUNTS_SYNC_STATUS, true)) {
                    for (Account account : kqyVar3.f.u()) {
                        SyncService.b(account, r4);
                    }
                    r4.edit().putBoolean(krh.CHECK_ACCOUNTS_SYNC_STATUS, false).apply();
                }
                if (r4.getBoolean(krh.CHECK_ACCOUNTS_PERIODIC_SYNC, true)) {
                    for (Account account2 : kqyVar3.f.u()) {
                        List<PeriodicSync> periodicSyncs = ContentResolver.getPeriodicSyncs(account2, "com.google.android.videos.sync");
                        int size = periodicSyncs.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            PeriodicSync periodicSync = periodicSyncs.get(i3);
                            ContentResolver.removePeriodicSync(periodicSync.account, periodicSync.authority, periodicSync.extras);
                        }
                    }
                    r4.edit().putBoolean(krh.CHECK_ACCOUNTS_PERIODIC_SYNC, false).apply();
                }
                kqyVar3.i.execute(new ley(((Context) kqyVar3.b).getCacheDir().getAbsolutePath(), true != bool.booleanValue() ? 5242880L : 33554432L, i));
                new krn(((jzs) kqyVar3.s).h(3000), new lyl(kqyVar3.q, 1), i2, null).c(mes.a);
                ?? r2 = kqyVar3.f;
                ieg iegVarG = ((ldy) r2.f()).a();
                if (iegVarG.m()) {
                    new kqx(kqyVar3, iegVarG).start();
                }
                kqyVar3.a(r2);
                break;
            case 15:
                try {
                    krd.c.a(((krc) this.a).a(true));
                    break;
                } catch (IOException e) {
                    if (krd.d) {
                        Log.e("PlayMovies", "Could not write to log buffer.", e);
                        krd.d = false;
                        return;
                    }
                    return;
                }
            case 16:
                Object obj2 = this.a;
                ApiActivity apiActivity = (ApiActivity) obj2;
                ((fl) obj2).startActivityForResult(apiActivity.h.e(ieg.f(apiActivity.a)), 903);
                break;
            case 17:
                AuxiliaryActivity.$r8$lambda$0dADJKIjHmoFveCNfNCVJkeAWhs((AuxiliaryActivity) this.a);
                break;
            case 18:
                lfb lfbVar = (lfb) this.a;
                File[] fileArrListFiles = new File(lfbVar.a).listFiles(lfbVar.d);
                if (fileArrListFiles != null) {
                    while (i < fileArrListFiles.length) {
                        lfbVar.c.put(fileArrListFiles[i].getName(), "");
                        i++;
                    }
                }
                lfbVar.e.open();
                break;
            case 19:
                ((lgk) this.a).c();
                break;
            default:
                ((Semaphore) this.a).release();
                break;
        }
    }
}
