package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class geo {
    public final gex a;
    public final gft b;
    public final Map c;
    public final ReentrantLock d;
    public final yjk e;
    public final yjk f;
    public final Object g;
    public gez h;
    public final ghd i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public geo(gex gexVar, Map map, Map map2, String... strArr) {
        this.a = gexVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        gft gftVar = new gft(gexVar, map, map2, strArr, gexVar.i, new ahf((Object) this, 3, (short[]) null));
        this.b = gftVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new gel(1);
        int i = 0;
        this.f = new gel(i);
        this.i = new ghd(gexVar);
        this.g = new Object();
        gftVar.c = new gem(this, i);
    }

    public final Object a(yih yihVar) {
        Object objE = this.b.e(yihVar);
        return objE == yio.a ? objE : ygi.a;
    }

    public final void b() {
        this.b.g(this.e, this.f);
    }
}
