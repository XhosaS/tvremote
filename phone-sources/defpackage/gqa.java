package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gqa {
    public boolean a;
    public UUID b;
    public guw c;
    public final Set d;
    private final Class e;

    public gqa(Class cls) {
        this.e = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = this.b.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new guw(string, (gpx) null, name, (String) null, (gox) null, (gox) null, 0L, 0L, 0L, (gou) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(yfm.e(1));
        yfm.bt(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public abstract cvi a();

    public final void b(String str) {
        this.d.add(str);
    }

    public final void c(gou gouVar) {
        gouVar.getClass();
        this.c.k = gouVar;
    }

    public final void d(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.h = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.h) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void e(gox goxVar) {
        this.c.f = goxVar;
    }

    public final cvi f() {
        cvi cviVarA = a();
        gou gouVar = this.c.k;
        boolean z = gouVar.b() || gouVar.e || gouVar.c || gouVar.d;
        guw guwVar = this.c;
        if (guwVar.q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (guwVar.h > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = guwVar.w;
        if (str == null) {
            List listAa = ylh.aa(guwVar.d, new String[]{"."});
            String strAe = listAa.size() == 1 ? (String) listAa.get(0) : (String) yfm.W(listAa);
            if (strAe.length() > 127) {
                strAe = ylh.ae(strAe, 127);
            }
            guwVar.w = strAe;
        } else if (str.length() > 127) {
            guwVar.w = ylh.ae(str, 127);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        guw guwVar2 = this.c;
        guwVar2.getClass();
        this.c = new guw(string, guwVar2.c, guwVar2.d, guwVar2.e, new gox(guwVar2.f), new gox(guwVar2.g), guwVar2.h, guwVar2.i, guwVar2.j, new gou(guwVar2.k), guwVar2.l, guwVar2.y, guwVar2.m, guwVar2.n, guwVar2.o, guwVar2.p, guwVar2.q, guwVar2.z, guwVar2.r, guwVar2.t, guwVar2.u, guwVar2.v, guwVar2.w, guwVar2.x, 524288);
        return cviVarA;
    }
}
