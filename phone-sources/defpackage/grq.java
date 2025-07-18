package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import com.google.android.videos.R;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class grq implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ grq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r0v59, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ysx] */
    @Override // defpackage.yjk
    public final Object a() {
        int largeMemoryClass;
        View view = null;
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                grs grsVar = (grs) this.a;
                Context context = grsVar.b;
                int i = gsr.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    gsp.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List listE = gsr.e(context, jobScheduler);
                if (listE != null && !listE.isEmpty()) {
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        gsr.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                grsVar.c.D().y();
                gqv.a(grsVar.h, grsVar.c, grsVar.d);
                break;
            case 6:
                break;
            case 7:
                Bitmap.Config config = hat.a;
                Object obj = ((cvi) this.a).b;
                double d = 0.2d;
                try {
                    Object systemService = ((Context) obj).getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (true == ((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                nue nueVar = new nue((char[]) null);
                try {
                    Object systemService2 = ((Context) obj).getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (((Context) obj).getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                int i2 = (int) (d * largeMemoryClass * 1024.0d * 1024.0d);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                zbm zbmVar = zbm.a;
                break;
            case 11:
                String strB = ((gzg) this.a).d.b("Content-Type");
                if (strB != null) {
                    Pattern pattern = zcg.a;
                    break;
                }
                break;
            case 12:
                ity ityVar = (ity) this.a;
                break;
            case 13:
                break;
            case 14:
                Object obj2 = this.a;
                CompanionBarFragment companionBarFragment = (CompanionBarFragment) obj2;
                iuq iuqVar = new iuq(companionBarFragment.e, companionBarFragment.g, false, 12);
                ivd ivdVar = companionBarFragment.a;
                if (ivdVar == null) {
                    yks.c("presenter");
                    ivdVar = null;
                }
                ivh ivhVar = (ivh) ivdVar.l(iuqVar);
                View view2 = companionBarFragment.d;
                if (view2 == null) {
                    yks.c("fragmentView");
                } else {
                    view = view2;
                }
                View viewFindViewById = view.findViewById(R.id.companion_bar_container);
                viewFindViewById.getClass();
                sfy.l((bv) obj2, viewFindViewById).a(ivhVar);
                break;
            case 15:
                tui tuiVar = ivd.a;
                ?? r0 = this.a;
                if (r0 != 0) {
                    r0.k();
                }
                break;
            case 16:
                tui tuiVar2 = ivd.a;
                ?? r02 = this.a;
                if (r02 != 0) {
                    r02.e();
                }
                break;
            case 17:
                tui tuiVar3 = ivd.a;
                ?? r03 = this.a;
                if (r03 != 0) {
                    r03.f();
                }
                break;
            case 18:
                tui tuiVar4 = ivd.a;
                ?? r04 = this.a;
                if (r04 != 0) {
                    r04.j();
                }
                break;
            case 19:
                tui tuiVar5 = ivd.a;
                ?? r05 = this.a;
                if (r05 != 0) {
                    r05.k();
                }
                break;
            default:
                ((iye) this.a).d();
                break;
        }
        return ygi.a;
    }
}
