package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kcf {
    private static kcf c;
    public final Context a;
    public final ScheduledExecutorService b;
    private kbz d = new kbz(this);
    private int e = 1;

    public kcf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized kcf a(Context context) {
        if (c == null) {
            koq koqVar = kor.a;
            c = new kcf(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new klw("MessengerIpcClient"))));
        }
        return c;
    }

    private final synchronized int d() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    private final synchronized lvf e(kcc kccVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(kccVar.toString()));
        }
        if (!this.d.e(kccVar)) {
            kbz kbzVar = new kbz(this);
            this.d = kbzVar;
            kbzVar.e(kccVar);
        }
        return kccVar.b.a;
    }

    public final lvf b(int i, Bundle bundle) {
        return e(new kcb(d(), i, bundle));
    }

    public final lvf c(int i, Bundle bundle) {
        return e(new kce(d(), i, bundle));
    }
}
