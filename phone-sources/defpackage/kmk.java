package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.googletv.app.services.workmanager.WorkerWrapper;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmk extends gqb {
    private final Map a;

    public kmk(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // defpackage.gqb
    public final /* bridge */ /* synthetic */ gpm a(Context context, String str, WorkerParameters workerParameters) {
        gox goxVar = workerParameters.b;
        String strA = goxVar.a("google_tv_worker_name_key");
        if (strA == null) {
            strA = "";
        }
        if (TextUtils.isEmpty(strA)) {
            Set set = workerParameters.c;
            Objects.toString(set);
            krd.c("No worker key associated with this task with tags: ".concat(set.toString()));
            return null;
        }
        yfo yfoVar = (yfo) this.a.get(strA);
        kmj kmjVar = yfoVar != null ? (kmj) yfoVar.b() : null;
        if (kmjVar == null) {
            krd.c("No worker was found for worker key: ".concat(strA));
            return null;
        }
        Objects.toString(goxVar);
        krd.e("Worker is being created using GoogleTvWorkerFactory: ".concat(String.valueOf(goxVar)));
        return new WorkerWrapper(context, workerParameters, kmjVar);
    }
}
