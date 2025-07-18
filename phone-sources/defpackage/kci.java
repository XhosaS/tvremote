package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kci extends yiz implements yjz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(GtvHomePageActivity gtvHomePageActivity, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = gtvHomePageActivity;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((kci) create((sbr) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((kci) create((wfo) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((kci) create((ysy) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((kci) create((wox) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((kci) create((mnx) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((kci) create((mlk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((kci) create((mlk) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((kci) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.b) {
            case 0:
                return new kci((kcl) this.a, yihVar, 0);
            case 1:
                return new kci((GtvHomePageActivity) this.a, yihVar, 1);
            case 2:
                return new kci((kfh) this.a, yihVar, 2);
            case 3:
                return new kci((wxd) this.a, yihVar, 3);
            case 4:
                return new kci((mnv) this.a, yihVar, 4);
            case 5:
                return new kci((mok) this.a, yihVar, 5);
            case 6:
                return new kci((mpb) this.a, yihVar, 6);
            case 7:
                return new kci((ovq) this.a, yihVar, 7);
            case 8:
                return new kci((ovq) this.a, yihVar, 8, (byte[]) null);
            case 9:
                return new kci((ovv) this.a, yihVar, 9);
            case 10:
                return new kci((ovv) this.a, yihVar, 10, (byte[]) null);
            case 11:
                return new kci((ovv) this.a, yihVar, 11, (char[]) null);
            case 12:
                return new kci((pey) this.a, yihVar, 12);
            case 13:
                return new kci((pfa) this.a, yihVar, 13);
            case 14:
                return new kci((Exception) this.a, yihVar, 14);
            case 15:
                return new kci((qgi) this.a, yihVar, 15);
            case 16:
                return new kci((qgi) this.a, yihVar, 16, (byte[]) null);
            default:
                return new kci((qji) this.a, yihVar, 17);
        }
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        xbw xbwVar;
        Object obj3;
        xbw xbwVar2;
        switch (this.b) {
            case 0:
                ybn.f(obj);
                kcl kclVar = (kcl) this.a;
                kclVar.h = ykr.o(kclVar.d, null, new jbb(kclVar, (yih) null, 17), 3);
                break;
            case 1:
                ybn.f(obj);
                ((GtvHomePageActivity) this.a).I();
                break;
            case 2:
                ybn.f(obj);
                ((kfh) this.a).e();
                break;
            case 3:
                ybn.f(obj);
                wxd wxdVar = (wxd) this.a;
                wox woxVar = wxdVar.b == 1 ? (wox) wxdVar.c : wox.a;
                woxVar.getClass();
                break;
            case 4:
                ybn.f(obj);
                kch kchVar = new kch();
                String name = kch.class.getName();
                name.getClass();
                at atVar = new at(((mnv) this.a).a.getSupportFragmentManager());
                atVar.e = R.anim.fade_in;
                atVar.f = R.anim.fade_out;
                atVar.g = 0;
                atVar.h = 0;
                atVar.u(R.id.content, kchVar, name);
                atVar.a();
                break;
            case 5:
                ybn.f(obj);
                ((mok) this.a).a();
                break;
            case 6:
                ybn.f(obj);
                ((mpb) this.a).a();
                break;
            case 7:
                ybn.f(obj);
                oui ouiVar = ((ovq) this.a).d;
                if (ouiVar != null) {
                    ouh ouhVar = ouh.c;
                    ouhVar.getClass();
                    ((tug) jcm.a.f().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$trailerControllerListener$1", "onStreamsError", 256, "TrailerPlayerFragment.kt")).B("Stream Error with error type: %s and error message: %s", ouhVar, "Error fetching streams. No StreamInfoForDash response.");
                    jcm jcmVar = (jcm) ((jcv) ouiVar).a;
                    jcmVar.q().w(jcmVar.a((wdq) PlayerActivity.q.get(ouhVar)));
                }
                break;
            case 8:
                ybn.f(obj);
                oui ouiVar2 = ((ovq) this.a).d;
                if (ouiVar2 != null) {
                    ((tug) jcm.a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TrailerPlayerFragment$trailerControllerListener$1", "onStreamsFetchedSuccessfully", 263, "TrailerPlayerFragment.kt")).s("Stream for the video been fetched successfully");
                    jcm jcmVar2 = (jcm) ((jcv) ouiVar2).a;
                    jcmVar2.q().x(jcmVar2.a(null));
                }
                break;
            case 9:
                ybn.f(obj);
                ovv ovvVar = (ovv) this.a;
                ExoPlayer exoPlayer = ovvVar.d;
                if (exoPlayer != null) {
                    ebh ebhVarP = exoPlayer.P();
                    ebhVarP.getClass();
                    ovvVar.B(ebhVarP);
                }
                break;
            case 10:
                ybn.f(obj);
                oui ouiVar3 = ((ovv) this.a).f;
                if (ouiVar3 != null) {
                    ouh ouhVar2 = ouh.c;
                    ouhVar2.getClass();
                    ((tug) jdd.a.f().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerControllerListener$1", "onStreamsError", 597, "TvodPlayerFragment.kt")).B("[Kinetoscope] Stream Error with error type: %s and error message: %s", new rom(ouhVar2), "Error fetching streams. No StreamInfoForDash response.");
                    jdd jddVar = (jdd) ((jcv) ouiVar3).a;
                    jddVar.T().w(jddVar.h((wdq) PlayerActivity.q.get(ouhVar2)));
                }
                break;
            case 11:
                ybn.f(obj);
                oui ouiVar4 = ((ovv) this.a).f;
                if (ouiVar4 != null) {
                    jdd jddVar2 = (jdd) ((jcv) ouiVar4).a;
                    jddVar2.T().x(jddVar2.h(null));
                    ((tug) ((tug) jdd.a.g().h(tvo.a, "[GTVM-Kinetoscope]")).g(4, TimeUnit.HOURS).j("com/google/android/apps/googletv/app/player/TvodPlayerFragment$playerControllerListener$1", "onStreamsFetchedSuccessfully", 612, "TvodPlayerFragment.kt")).s("[Kinetoscope] Stream for the video been fetched successfully");
                }
                break;
            case 12:
                ybn.f(obj);
                ona.a(((pey) this.a).c);
                break;
            case 13:
                ybn.f(obj);
                ona.a(((pfa) this.a).c);
                break;
            case 14:
                ybn.f(obj);
                tuv tuvVarG = pfk.a.g();
                Throwable th = (Throwable) this.a;
                ((tvk) ((tvk) tuvVarG).i(th)).s("Failed to install security provider, GNP in-app sync can't run.");
                break;
            case 15:
                ybn.f(obj);
                try {
                    obj2 = this.a;
                    xbwVar = ((qgi) obj2).c;
                } catch (Exception e) {
                    ((tvk) ((tvk) qgi.a.g()).i(e)).s("Failed to disable the RestartReceiver");
                }
                if (!((SharedPreferences) xbwVar.b()).getBoolean("restart_receiver_enabled", true)) {
                    qgi.a.l().s("aborting restart receiver disabling as it is already disabled");
                    break;
                } else {
                    Context context = ((qgi) obj2).b;
                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.libraries.notifications.platform.entrypoints.restart.RestartReceiver"), 2, 1);
                    Object objB = xbwVar.b();
                    objB.getClass();
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) objB).edit();
                    editorEdit.putBoolean("restart_receiver_enabled", false);
                    editorEdit.apply();
                    qgi.a.l().s("Disabled the RestartReceiver");
                    break;
                }
            case 16:
                ybn.f(obj);
                try {
                    obj3 = this.a;
                    xbwVar2 = ((qgi) obj3).c;
                } catch (Exception e2) {
                    ((tvk) ((tvk) qgi.a.g()).i(e2)).s("Failed to enable the RestartReceiver");
                }
                if (!((SharedPreferences) xbwVar2.b()).getBoolean("restart_receiver_enabled", false)) {
                    Context context2 = ((qgi) obj3).b;
                    context2.getPackageManager().setComponentEnabledSetting(new ComponentName(context2, "com.google.android.libraries.notifications.platform.entrypoints.restart.RestartReceiver"), 1, 1);
                    Object objB2 = xbwVar2.b();
                    objB2.getClass();
                    SharedPreferences.Editor editorEdit2 = ((SharedPreferences) objB2).edit();
                    editorEdit2.putBoolean("restart_receiver_enabled", true);
                    editorEdit2.apply();
                    qgi.a.l().s("Enabled the RestartReceiver");
                    break;
                } else {
                    qgi.a.l().s("aborting restart receiver enabling as it is already enabled");
                    break;
                }
            default:
                ybn.f(obj);
                try {
                    break;
                } catch (Exception e3) {
                    return qji.n(e3, 60);
                }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(Exception exc, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(kcl kclVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = kclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(kfh kfhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = kfhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(mnv mnvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = mnvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(mok mokVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = mokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(mpb mpbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = mpbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(ovq ovqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = ovqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(ovq ovqVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = ovqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(ovv ovvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = ovvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(ovv ovvVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = ovvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(ovv ovvVar, yih yihVar, int i, char[] cArr) {
        super(2, yihVar);
        this.b = i;
        this.a = ovvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(pey peyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = peyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(pfa pfaVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = pfaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(qgi qgiVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = qgiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(qgi qgiVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.b = i;
        this.a = qgiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(qji qjiVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = qjiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kci(wxd wxdVar, yih yihVar, int i) {
        super(2, yihVar);
        this.b = i;
        this.a = wxdVar;
    }
}
