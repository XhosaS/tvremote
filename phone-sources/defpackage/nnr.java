package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnr {
    public static boolean a;
    public final Context b;
    public final nrn c;
    public final nnm d;
    public final noq e;
    public final nod f;
    public Long h;
    public nor i;
    public pkg k;
    private final ExecutorService l;
    public int j = 1;
    public final String g = UUID.randomUUID().toString();

    static {
        new nsf("ClientCastAnalytics");
        a = true;
    }

    public nnr(Context context, nrn nrnVar, nnm nnmVar, noq noqVar, nod nodVar) {
        this.b = context;
        this.c = nrnVar;
        this.d = nnmVar;
        this.e = noqVar;
        this.f = nodVar;
        ocv ocvVar = ogg.a;
        this.l = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public final void a(uco ucoVar, int i) {
        this.l.execute(new fk(this, ucoVar, i, 7, (byte[]) null));
    }
}
