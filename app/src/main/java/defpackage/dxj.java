package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxj {
    private final AtomicInteger a = new AtomicInteger(1);
    private final HashMap b = new HashMap();

    public final synchronized int a(String str) {
        HashMap map = this.b;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        int andIncrement = this.a.getAndIncrement();
        map.put(str, Integer.valueOf(andIncrement));
        return andIncrement;
    }
}
