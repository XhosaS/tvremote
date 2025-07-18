package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class iqs extends icu implements yow {
    public final Map g = new LinkedHashMap();
    public Map h = yhc.a;
    public final kw i = new kw((short[]) null);
    private final /* synthetic */ yow j;
    private yqe k;
    private final iqw l;

    public iqs(iqw iqwVar, yow yowVar) {
        this.j = yowVar;
        this.l = iqwVar;
    }

    public final synchronized ids b(Object obj) {
        Object iqrVar;
        Map map = this.g;
        iqrVar = map.get(obj);
        if (iqrVar == null) {
            iqrVar = new iqr(this, obj);
            map.put(obj, iqrVar);
        }
        return (ids) iqrVar;
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.j).a;
    }

    public final Object e(Object obj) {
        Object objU = this.i.u(obj);
        return objU == null ? this.h.get(obj) : objU;
    }

    public abstract Object f(Object obj, Object obj2, yih yihVar);

    public final ypc g(Object obj, Object obj2) {
        this.i.v(obj, obj2);
        iqr iqrVar = (iqr) this.g.get(obj);
        if (iqrVar != null) {
            iqrVar.a(obj2);
        }
        eb();
        iqw iqwVar = this.l;
        iqt iqtVar = new iqt(new om(this, obj, obj2, (yih) null, 12));
        ykr.q(iqwVar, null, 0, new iqv(iqwVar, obj, iqtVar, null), 3);
        return iqtVar.b;
    }

    public final synchronized void m() {
        Map map = this.g;
        for (Object obj : map.keySet()) {
            iqr iqrVar = (iqr) map.get(obj);
            if (iqrVar != null) {
                iqrVar.a(e(obj));
            }
        }
    }

    public final synchronized void n(Object obj, boolean z) {
        this.i.x(obj, z);
    }

    public final synchronized void o(Object obj) {
        this.g.remove(obj);
    }

    public final void p(ysx ysxVar) {
        yqe yqeVar = this.k;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        this.k = ykr.q(this, null, 0, new uc(ysxVar, this, (yih) null, 17), 3);
    }
}
