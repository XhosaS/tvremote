package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqr {
    private final Object a;
    private final Map b;
    private final eui c;

    public vqr(eui euiVar) {
        euiVar.getClass();
        this.c = euiVar;
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public final vqq a(Class cls) {
        vqq vqqVar;
        cls.getClass();
        synchronized (this.a) {
            Map map = this.b;
            Object obj = map.get(cls);
            if (obj == null) {
                eup eupVar = this.c.a.a;
                zyh zyhVar = (zyh) eupVar.m.a();
                eupVar.f();
                vqq vqqVar2 = new vqq(zyhVar, eupVar.ed());
                map.put(cls, vqqVar2);
                obj = vqqVar2;
            }
            vqqVar = (vqq) obj;
        }
        return vqqVar;
    }
}
