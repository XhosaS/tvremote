package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxe extends gqb {
    private final Map a;

    public lxe(Map map) {
        this.a = map;
    }

    @Override // defpackage.gqb
    public final gpm a(Context context, String str, WorkerParameters workerParameters) {
        gox goxVar = workerParameters.b;
        String strA = goxVar.a("worker_name_key");
        if (TextUtils.isEmpty(strA)) {
            krd.c("No worker key associated with this task with tags: ".concat(workerParameters.c.toString()));
            return null;
        }
        yfo yfoVar = (yfo) this.a.get(strA);
        lxd lxdVar = yfoVar != null ? (lxd) yfoVar.b() : null;
        if (lxdVar == null) {
            krd.c("No worker was found for worker key: ".concat(String.valueOf(strA)));
            return null;
        }
        krd.e(String.format("Worker is being created using MoviesWorkerFactory. %s", goxVar));
        return new MoviesWorkerWrapper(context, workerParameters, lxdVar);
    }
}
