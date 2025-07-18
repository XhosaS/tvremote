package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class dua implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dub b;

    public dua(dub dubVar, Runnable runnable) {
        this.a = runnable;
        this.b = dubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Map map = this.b.a;
        synchronized (map) {
            Runnable runnable = this.a;
            Integer num = (Integer) map.get(runnable);
            if (num != null) {
                z = num.intValue() > 0;
                int iIntValue = num.intValue() - 1;
                Integer numValueOf = Integer.valueOf(iIntValue);
                numValueOf.getClass();
                if (iIntValue > 0) {
                    map.put(runnable, numValueOf);
                } else {
                    map.remove(runnable);
                }
            }
        }
        if (z) {
            this.a.run();
        }
    }
}
