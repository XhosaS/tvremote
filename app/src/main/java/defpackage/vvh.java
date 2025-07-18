package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvh extends ccz {
    private static final zdy a = zdy.h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final wxc c;
    private final Map d;

    public vvh(Map map, wxc wxcVar, Map map2) {
        this.b = map;
        this.c = wxcVar;
        this.d = map2;
    }

    @Override // defpackage.ccz
    public final cbv a(Context context, String str, WorkerParameters workerParameters) {
        agow agowVar;
        String str2;
        try {
            wxc wxcVar = this.c;
            wwt wwtVarE = wxcVar.e("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 69, "WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    yzq yzqVarA = vwd.a(workerParameters.c);
                    if (yzqVarA.size() != 1) {
                        ((zdv) ((zdv) a.c()).q("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).x("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new qsg(yzqVarA.size()));
                        wwtVarE.close();
                        return null;
                    }
                    str2 = (String) zag.f(yzqVarA);
                    agowVar = (agow) this.b.get(str2);
                } else {
                    agowVar = (agow) this.b.get(str);
                    if (agowVar != null) {
                        Set set = workerParameters.c;
                        int i = vwd.c;
                        set.add("TikTokWorker#".concat(str));
                    }
                    str2 = str;
                }
                agow agowVar2 = agowVar;
                if (agowVar2 != null) {
                    if (str2 != null) {
                        TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, wxcVar, this.d, agowVar2, workerParameters, wwb.a);
                        wwtVarE.close();
                        return tikTokListenableWorker;
                    }
                    str2 = null;
                }
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    ((zdv) ((zdv) a.c()).q("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).x("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                }
                wwtVarE.close();
                return null;
            } finally {
            }
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).u("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
