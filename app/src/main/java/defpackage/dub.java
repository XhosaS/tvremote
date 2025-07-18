package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dub implements emk {
    public final Map a = new HashMap();
    private final Executor b;

    public dub(Executor executor) {
        this.b = executor;
    }

    @Override // defpackage.emk
    public final void a(Runnable runnable) {
        Map map = this.a;
        synchronized (map) {
            map.remove(runnable);
        }
    }

    @Override // defpackage.emk
    public final void c(Runnable runnable) {
        Map map = this.a;
        synchronized (map) {
            Integer num = (Integer) map.get(runnable);
            map.put(runnable, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
        this.b.execute(new dua(this, runnable));
    }

    @Override // defpackage.emk
    public final void b() {
    }
}
