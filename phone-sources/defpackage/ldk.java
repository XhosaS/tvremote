package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import com.google.android.apps.play.movies.common.service.playstore.WatchActionBootstrapActivity;
import com.google.android.apps.play.movies.mobile.usecase.downloads.ManageDownloadsActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldk implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ldk(Activity activity, ksn ksnVar, lie lieVar, int i) {
        this.d = i;
        this.b = activity;
        this.c = ksnVar;
        this.a = lieVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, lod] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, mdy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, mem] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) throws Resources.NotFoundException {
        int i = this.d;
        if (i == 0) {
            mvn mvnVar = (mvn) lhfVar;
            Map map = mvnVar.a;
            boolean zContainsKey = map.containsKey("setting_dialog_network_group");
            Object obj = this.a;
            if (zContainsKey) {
                ((mta) obj).j.edit().putString(krh.DOWNLOAD_NETWORK, (String) map.get("setting_dialog_network_group")).apply();
            }
            if (map.containsKey("setting_dialog_quality_group")) {
                ((mta) obj).j.edit().putString(krh.DOWNLOAD_QUALITY, (String) map.get("setting_dialog_quality_group")).apply();
            }
            if (map.containsKey("setting_dialog_audio_group")) {
                ((mta) obj).j.edit().putString(krh.AUDIO_LANGUAGE, (String) map.get("setting_dialog_audio_group")).apply();
            }
            if (map.containsKey("setting_dialog_audio_prism_group")) {
                ((mta) obj).j.edit().putString(krh.AUDIO_LANGUAGE_PRISM_DOWNLOADS, (String) map.get("setting_dialog_audio_prism_group")).apply();
            }
            ieg iegVar = mvnVar.b;
            if (iegVar.m()) {
                Object obj2 = this.c;
                mta mtaVar = (mta) obj;
                mta.e((Activity) this.b, (lyz) mtaVar.e, mtaVar.b, mtaVar.j, (ksn) obj2, ((ksy) iegVar.g()).b);
            }
            mta mtaVar2 = (mta) obj;
            ?? r15 = mtaVar2.j;
            r15.edit().putInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, r15.getInt(krh.DOWNLOAD_SETTING_SHOWN_FLAGS, 0) | ((Integer) mtaVar2.d.a()).intValue()).apply();
            return;
        }
        if (i == 1) {
            PinBroadcastReceiver.c((Context) this.b, (ksn) this.c, ((mux) lhfVar).a);
            this.a.q(true);
            return;
        }
        if (i == 2) {
            Object obj3 = this.b;
            Context context = (Context) obj3;
            ((Activity) obj3).startActivity(ManageDownloadsActivity.createIntent(context, lid.a));
            this.a.r();
            PinBroadcastReceiver.a(context, (ksn) this.c, ((mva) lhfVar).a);
            return;
        }
        if (i == 3) {
            this.a.r();
            String str = ((muz) lhfVar).a;
            String strConcat = "download:".concat(str);
            Object obj4 = this.b;
            DownloadAnimationView downloadAnimationView = (DownloadAnimationView) ((Activity) obj4).findViewById(R.id.content).findViewWithTag(strConcat);
            if (downloadAnimationView != null) {
                downloadAnimationView.d(false);
            }
            PinBroadcastReceiver.a((Context) obj4, (ksn) this.c, str);
            return;
        }
        if (i == 4) {
            ?? r1 = this.c;
            mzq mzqVar = (mzq) lhfVar;
            krk krkVar = new krk(r1, 13);
            Object obj5 = this.a;
            String str2 = (String) obj5;
            miu miuVar = new miu(r1, str2, (Intent) this.b, krkVar, ((mmv) r1).F);
            muj mujVar = mzqVar.a;
            miuVar.a(mujVar, mzqVar.b, nqq.d(mujVar.a));
            return;
        }
        if (i == 5) {
            mxu mxuVar = (mxu) lhfVar;
            lid lidVarD = nqq.d(new lif(liq.e(600), mxuVar.c));
            kxg kxgVar = mxuVar.b;
            kuo kuoVar = mxuVar.a;
            boolean zC = kxg.c(kxgVar);
            ?? r6 = this.a;
            Object obj6 = this.b;
            if (zC) {
                r6.a(BootstrapWatchActivity.createEpisodeIntent((Context) obj6, kuoVar, "details", null));
                return;
            }
            ldy ldyVar = (ldy) this.c;
            if (ldyVar.a().m()) {
                WatchActionBootstrapActivity.startWatchActionActivity((Context) obj6, r6, (ksn) ldyVar.a().g(), kuoVar.c, ieg.f(ksy.l(kuoVar.k)), ieg.f(ksy.k(kuoVar.j)), kxgVar, lidVarD);
                return;
            }
            return;
        }
        Map map2 = ((mvn) lhfVar).a;
        boolean zContainsKey2 = map2.containsKey("caption_options");
        ?? r5 = this.a;
        if (zContainsKey2) {
            ?? r3 = this.b;
            String str3 = (String) map2.get("caption_options");
            for (kwx kwxVar : (List) r3.a()) {
                if (str3.contentEquals(mjo.w(kwxVar))) {
                    if (true == kwxVar.isDisableTrack()) {
                        kwxVar = null;
                    }
                    r5.v(kwxVar);
                }
            }
        }
        if (map2.containsKey("audio_options")) {
            ?? r2 = this.c;
            String str4 = (String) map2.get("audio_options");
            List list = (List) r2.a();
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (str4.contentEquals(mjo.v((kzo) list.get(i2)))) {
                    r5.u(i2);
                }
            }
        }
    }

    public /* synthetic */ ldk(Object obj, Context context, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.b = context;
        this.c = obj2;
    }

    public /* synthetic */ ldk(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ldk(mmv mmvVar, String str, Intent intent, int i) {
        this.d = i;
        this.c = mmvVar;
        this.a = str;
        this.b = intent;
    }
}
