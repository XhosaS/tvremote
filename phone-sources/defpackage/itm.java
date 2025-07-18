package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.googletv.app.device.impl.MediaDeviceControllerForegroundService;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import com.google.android.apps.googletv.app.player.PlayerActivity;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import com.google.android.apps.googletv.app.presentation.pages.home.GtvHomePageActivity;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class itm implements iej {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ itm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v31, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [itk, java.lang.Object] */
    @Override // defpackage.iej
    public final void dM() {
        idr idrVar;
        gag gagVar = null;
        switch (this.b) {
            case 0:
                MediaDeviceControllerForegroundService mediaDeviceControllerForegroundService = (MediaDeviceControllerForegroundService) this.a;
                itk itkVar = mediaDeviceControllerForegroundService.a;
                if ((itkVar != null ? itkVar.e() : null) == null) {
                    mediaDeviceControllerForegroundService.stopSelf();
                    break;
                }
                break;
            case 1:
                iqo iqoVar = (iqo) this.a;
                ykr.q(iqoVar.f, null, 0, new gow(iqoVar, (yih) null, 12), 3);
                break;
            case 2:
                itv itvVar = (itv) this.a;
                Object objA = itvVar.u.k.a();
                objA.getClass();
                Iterator it = ((List) objA).iterator();
                while (it.hasNext()) {
                    itvVar.t((fux) it.next());
                }
                break;
            case 3:
                ((iua) this.a).u();
                break;
            case 4:
                gag gagVar2 = (gag) this.a;
                ith ithVarE = gagVar2.d.e();
                if (ithVarE == null || ((iua) ithVarE).d) {
                    gagVar2.e.c(false);
                    break;
                }
                break;
            case 5:
                ((iui) this.a).h();
                break;
            case 6:
                ((iul) this.a).c();
                break;
            case 7:
                ((MediaDeviceFloatingActionButton) this.a).c();
                break;
            case 8:
                ((MediaDeviceFloatingActionButton) this.a).d();
                break;
            case 9:
                mdw mdwVar = (mdw) this.a;
                ykr.q(mdwVar.d, null, 0, new jbb(mdwVar, (yih) null, 0), 3);
                break;
            case 10:
                krd.b("Parental controls have changed");
                Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
                Context context = (Context) ((mdw) this.a).c;
                intent.setPackage(context.getPackageName());
                intent.putExtra("FORCE_REFRESH", true);
                context.sendBroadcast(intent);
                break;
            case 11:
                PlayerActivity.$r8$lambda$YT6v3sfjM4Kc1EBCZv_R4TIVtP4((PlayerActivity) this.a);
                break;
            case 12:
                PlayerActivity playerActivity = (PlayerActivity) this.a;
                ith ithVarE2 = playerActivity.a().e();
                if (ithVarE2 != null && (idrVar = ((iua) ithVarE2).m) != null && ((itf) idrVar.a()).c() != null) {
                    try {
                        idrVar.ee(this);
                    } catch (IllegalStateException e) {
                        ((tug) ((tug) PlayerActivity.p.f().h(tvo.a, "[GTVM-Kinetoscope]")).i(e).j("com/google/android/apps/googletv/app/player/PlayerActivity$stateRepositoryUpdatable$1", "update", 129, "PlayerActivity.kt")).s("Encountered error while trying to remove stateRepositoryUpdatable");
                    }
                    playerActivity.finishAndRemoveTask();
                    gag gagVar3 = playerActivity.n;
                    if (gagVar3 == null) {
                        yks.c("mediaDeviceUiController");
                    } else {
                        gagVar = gagVar3;
                    }
                    gagVar.e.c(true);
                    break;
                }
                break;
            case 13:
                ((jxn) this.a).a();
                break;
            case 14:
                ((DeviceNotificationActivity) this.a).a();
                break;
            case 15:
                GtvHomePageActivity.$r8$lambda$sKNn9WDi35pRTej8XCaqMAlVbUE((GtvHomePageActivity) this.a);
                break;
            case 16:
                ((MediaDeviceAwarePlayButton) this.a).b();
                break;
            case 17:
                ((kmy) this.a).c();
                break;
            case 18:
                Object obj = this.a;
                lgj lgjVar = (lgj) obj;
                iea ieaVar = lgjVar.g;
                Object objA2 = ieaVar.a();
                objA2.getClass();
                kuk kukVar = (kuk) objA2;
                ImmutableMap immutableMap = kukVar.b;
                ImmutableMap immutableMap2 = lgjVar.j.b;
                ArrayList<ksy> arrayList = new ArrayList();
                UnmodifiableIterator it2 = immutableMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    ksy ksyVar = (ksy) entry.getKey();
                    if (!Objects.equals((kuj) entry.getValue(), (kuj) immutableMap2.get(ksyVar))) {
                        arrayList.add(ksyVar);
                    }
                }
                UnmodifiableIterator it3 = immutableMap2.keySet().iterator();
                while (it3.hasNext()) {
                    ksy ksyVar2 = (ksy) it3.next();
                    if (!immutableMap.containsKey(ksyVar2)) {
                        arrayList.add(ksyVar2);
                    }
                }
                if (!yks.e(lgjVar.j.b(), kukVar.b())) {
                    ((icu) obj).eb();
                }
                lgjVar.j = kukVar;
                for (ksy ksyVar3 : arrayList) {
                    if (((kuk) ieaVar.a()).a(ksyVar3).f()) {
                        ino inoVar = lgjVar.h;
                        ksyVar3.getClass();
                        inoVar.D(ksyVar3, true);
                    } else {
                        kuj kujVarA = ((kuk) ieaVar.a()).a(ksyVar3);
                        if (kujVarA.c == 4 || kujVarA.j()) {
                            ino inoVar2 = lgjVar.h;
                            ksyVar3.getClass();
                            inoVar2.D(ksyVar3, false);
                        }
                    }
                }
                for (ksy ksyVar4 : arrayList) {
                    krp krpVar = lgjVar.k;
                    ksyVar4.getClass();
                    krpVar.b(ksyVar4);
                }
                break;
            case 19:
                ((lkp) this.a).h();
                break;
            default:
                lkp lkpVar = (lkp) this.a;
                boolean zA = lkpVar.r.a();
                boolean z = lkpVar.t.a;
                if (zA) {
                    lkpVar.h();
                } else {
                    lkpVar.i();
                }
                lkpVar.U.D(zA && !z);
                break;
        }
    }

    public itm(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
