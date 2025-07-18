package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqw implements yow {
    private final /* synthetic */ yow b;
    public final yyk a = new yyk();
    private final Map c = new LinkedHashMap();

    public iqw(yow yowVar) {
        this.b = yowVar;
    }

    public final synchronized ysn a(Object obj) {
        Object obj2;
        Map map = this.c;
        Object obj3 = map.get(obj);
        obj2 = obj3;
        if (obj3 == null) {
            ysn ysnVarT = vyf.T(this, 0, new aki(this, (yih) null, 17), 15);
            ysnVarT.eL(new iky(this, obj, 14));
            map.put(obj, ysnVarT);
            obj2 = ysnVarT;
        }
        return (ysn) obj2;
    }

    public final synchronized void b(Object obj) {
        this.c.remove(obj);
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.b).a;
    }
}
