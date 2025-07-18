package defpackage;

import android.content.Context;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljv {
    private static final tui b = tui.l("com/google/android/apps/play/movies/common/service/pinning/PinningModule");
    public boolean a = false;

    public final synchronized iea a(final Context context, lfn lfnVar, iea ieaVar, lzz lzzVar, lyz lyzVar, ExecutorService executorService, final xbw xbwVar) {
        final iea ieaVarA;
        iej krtVar;
        ljt ljtVar = new ljt(lzzVar, 0);
        String[] strArr = lyu.a;
        idh idhVarD = idh.d();
        idhVarD.e(lyu.d);
        idhVarD.e(ljtVar);
        idf idfVarB = idhVarD.b(new jxt(lyu.c, 7));
        krz krzVar = new krz(kuk.a);
        krzVar.a = new ids[]{ieaVar, lyzVar.c(10)};
        krzVar.b = executorService;
        krzVar.d(new ldj(ieaVar, idfVarB, 2));
        ieaVarA = krzVar.a();
        if (lfnVar.bN()) {
            ((tug) ((tug) b.e()).j("com/google/android/apps/play/movies/common/service/pinning/PinningModule", "getDownloadsRepository", 82, "PinningModule.java")).s("Using null updatable for downloads in progress");
            krtVar = new krt();
        } else {
            ((tug) ((tug) b.e()).j("com/google/android/apps/play/movies/common/service/pinning/PinningModule", "getDownloadsRepository", 85, "PinningModule.java")).s("Using transfer service starting updatable for downloads in progress");
            krtVar = new iej() { // from class: lju
                @Override // defpackage.iej
                public final void dM() {
                    kuk kukVar = (kuk) ieaVarA.a();
                    if (kukVar.equals(kuk.a)) {
                        return;
                    }
                    ljv ljvVar = this.a;
                    if (ljvVar.a) {
                        return;
                    }
                    ljvVar.a = true;
                    if (kukVar.d) {
                        PinBroadcastReceiver.b(context, (lgr) xbwVar.b());
                    }
                }
            };
        }
        ieaVarA.ea(krtVar);
        return ieaVarA;
    }
}
