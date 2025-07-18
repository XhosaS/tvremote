package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmd {
    public Context a;
    ExecutorService b;
    public ScheduledExecutorService c;
    public Handler d;
    public qgw f;
    public final kcx e = kcx.a;
    public final mcw h = new mcw();
    public final yrp g = yru.a(new yrp() { // from class: qma
        @Override // defpackage.yrp
        public final Object eV() {
            zyw zywVar = new zyw();
            zywVar.b("OneGoogle #%d");
            zywVar.a = false;
            zywVar.c(5);
            zywVar.b = new ThreadFactory() { // from class: qjt
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new Thread(runnable);
                }
            };
            return zyw.a(zywVar);
        }
    });
}
