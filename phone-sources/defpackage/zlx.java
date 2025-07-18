package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlx {
    public Object a;
    public Object b;

    public zlx(xpv xpvVar) {
        this.b = xpvVar;
    }

    public final xpv a() {
        if (this.a != null) {
            Object obj = this.b;
            xpv xpvVar = xpv.a;
            for (Map.Entry entry : ((xpv) obj).b.entrySet()) {
                if (!((IdentityHashMap) this.a).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.a).put((xpu) entry.getKey(), entry.getValue());
                }
            }
            this.b = new xpv((IdentityHashMap) this.a);
            this.a = null;
        }
        return (xpv) this.b;
    }

    public final void b(xpu xpuVar, Object obj) {
        if (this.a == null) {
            this.a = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.a).put(xpuVar, obj);
    }

    public zlx() {
        this(zma.N);
    }

    public zlx(zly zlyVar) {
        this.b = new Vector();
        this.a = zlyVar;
    }
}
