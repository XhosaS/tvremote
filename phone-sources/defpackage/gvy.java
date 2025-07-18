package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvy {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Object c = new Object();
    public final cb d;

    static {
        gpn.a("WorkTimer");
    }

    public gvy(cb cbVar) {
        this.d = cbVar;
    }

    public final void a(gun gunVar) {
        synchronized (this.c) {
            if (((gqz) this.a.remove(gunVar)) != null) {
                gpn.b();
                Objects.toString(gunVar);
                this.b.remove(gunVar);
            }
        }
    }
}
