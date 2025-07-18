package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.ProgressBar;
import com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferencesActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.WatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kde implements iej {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kde(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [iea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [iea, java.lang.Object] */
    @Override // defpackage.iej
    public final void dM() {
        switch (this.c) {
            case 0:
                Object obj = this.b;
                NotificationPreferencesActivity notificationPreferencesActivity = (NotificationPreferencesActivity) this.a;
                sfy.q(notificationPreferencesActivity, new jzx(notificationPreferencesActivity, (ProgressBar) obj, 7));
                break;
            case 1:
                ?? r1 = this.b;
                r1.getClass();
                Object obj2 = this.a;
                SharedPreferences.Editor editorEdit = r1.edit();
                editorEdit.putBoolean("com.google.android.apps.googletv.app.device.ASKED_PERMS", true ^ ((Boolean) ((gag) obj2).a.a()).booleanValue());
                editorEdit.apply();
                break;
            case 2:
                idr idrVar = ((kmy) this.b).g;
                if (((ieg) idrVar.a()).m()) {
                    idrVar.ee(this);
                    nqj nqjVar = (nqj) ((ieg) idrVar.a()).g();
                    wld wldVar = ((wpm) this.a).h;
                    if (wldVar == null) {
                        wldVar = wld.a;
                    }
                    Uri data = Intent.parseUri(wldVar.c, 0).getData();
                    if (data != null) {
                        nle nleVar = new nle(data.toString(), null);
                        nleVar.e();
                        nqjVar.i(new nlh(nleVar.a(), null, true, -1L, 1.0d, null, null, null, null, null, null, 0L));
                        break;
                    }
                }
                break;
            case 3:
                int i = kqf.a;
                this.b.edit().putLong(krh.STALENESS_TIME, ((Long) this.a.a()).longValue()).apply();
                break;
            case 4:
                mmk mmkVar = (mmk) this.b;
                idr idrVar2 = mmkVar.e;
                if (!((Boolean) idrVar2.a()).booleanValue()) {
                    ?? r3 = ((ntp) this.a).a;
                    if (((ieg) r3.a()).m()) {
                        mmkVar.i.o(mlz.j((mxo) ((ieg) r3.a()).g()));
                        idrVar2.c(true);
                        break;
                    }
                }
                break;
            case 5:
                mmp mmpVar = (mmp) this.b;
                idr idrVar3 = mmpVar.b;
                if (!((Boolean) idrVar3.a()).booleanValue()) {
                    ?? r32 = ((ntp) this.a).a;
                    if (((ieg) r32.a()).m()) {
                        mmpVar.d.o(mlz.j((mxo) ((ieg) r32.a()).g()));
                        idrVar3.c(true);
                        break;
                    }
                }
                break;
            case 6:
                mmv mmvVar = (mmv) this.b;
                idr idrVar4 = mmvVar.b;
                if (!((Boolean) idrVar4.a()).booleanValue()) {
                    ?? r33 = ((ntp) this.a).a;
                    if (((ieg) r33.a()).m()) {
                        mmvVar.d.o(mlz.j((mxo) ((ieg) r33.a()).g()));
                        idrVar4.c(true);
                        break;
                    }
                }
                break;
            default:
                ?? r12 = this.b;
                if (((itf) r12.a()).c() != null) {
                    r12.ee(this);
                    WatchActivity watchActivity = ((mrz) this.a).a;
                    watchActivity.finishAndRemoveTask();
                    watchActivity.I.e.c(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kde(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public kde(kmy kmyVar, wpm wpmVar, int i) {
        this.c = i;
        this.b = kmyVar;
        this.a = wpmVar;
    }

    public kde(mrz mrzVar, iea ieaVar, int i) {
        this.c = i;
        this.b = ieaVar;
        this.a = mrzVar;
    }
}
