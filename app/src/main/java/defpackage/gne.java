package defpackage;

import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gne {
    static final Instant a = Instant.ofEpochMilli(-1);
    public Queue b = new ArrayDeque();
    public Queue c = new ArrayDeque();
    public final Map d = new HashMap();
    public final zbp e = new yxu(3);
    public final zbp f = new yxu(3);

    public static Queue b(Queue queue, Queue queue2) {
        yyk yykVarP = yyk.p(queue, queue2);
        zbv zbvVar = zbv.a;
        yykVarP.getClass();
        zaf<gnh> zafVar = new zaf(new zae(yykVarP, zbvVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        for (gnh gnhVar : zafVar) {
            if (gnhVar.a()) {
                arrayDeque.offer(gnhVar);
            }
        }
        while (arrayDeque.size() > 40) {
            arrayDeque.poll();
        }
        return arrayDeque;
    }

    public static void c(Queue queue, zbp zbpVar, gnh gnhVar) {
        queue.offer(gnhVar);
        ((yvo) zbpVar).h(gnhVar.a, 1);
        while (queue.size() > 40) {
            zbpVar.remove(((gnh) queue.poll()).a);
        }
    }

    final double a(String str, int i) {
        zbp zbpVar = i == 2 ? this.e : this.f;
        if (zbpVar.isEmpty()) {
            return 0.0d;
        }
        yvi yviVar = (yvi) zbpVar;
        return yviVar.a.b(str) / ztm.d(yviVar.b);
    }

    public final void d(gnh gnhVar) {
        Map map = this.d;
        String str = gnhVar.a;
        boolean zContainsKey = map.containsKey(str);
        Instant instant = gnhVar.b;
        if (!zContainsKey) {
            map.put(str, instant);
        } else if (instant.isAfter((Instant) map.get(str))) {
            map.put(str, instant);
        }
    }
}
