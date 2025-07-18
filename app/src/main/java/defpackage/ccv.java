package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ccv {
    public boolean a;
    public UUID b;
    public cld c;
    public final Set d;
    private final Class e;

    public ccv(Class cls) {
        this.e = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = this.b.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new cld(string, (ccq) null, name, (String) null, (caz) null, (caz) null, 0L, 0L, 0L, (caq) null, 0, (cah) null, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(agrj.b(1));
        agqj.s(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public abstract ccw a();

    public final ccw b() {
        ccw ccwVarA = a();
        caq caqVar = this.c.l;
        boolean z = caqVar.a() || caqVar.e || caqVar.c || caqVar.d;
        cld cldVar = this.c;
        if (cldVar.s) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (cldVar.i > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = cldVar.y;
        if (str == null) {
            List listT = agyv.t(cldVar.e, new String[]{"."});
            String strV = listT.size() == 1 ? (String) listT.get(0) : (String) agqq.q(listT);
            if (strV.length() > 127) {
                strV = agyv.v(strV);
            }
            cldVar.y = strV;
        } else if (str.length() > 127) {
            cldVar.y = agyv.v(str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        cld cldVar2 = this.c;
        cldVar2.getClass();
        this.c = new cld(string, cldVar2.d, cldVar2.e, cldVar2.f, new caz(cldVar2.g), new caz(cldVar2.h), cldVar2.i, cldVar2.j, cldVar2.k, new caq(cldVar2.l), cldVar2.m, cldVar2.n, cldVar2.o, cldVar2.p, cldVar2.q, cldVar2.r, cldVar2.s, cldVar2.A, cldVar2.t, cldVar2.v, cldVar2.w, cldVar2.x, cldVar2.y, cldVar2.z, 524288);
        return ccwVarA;
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.c.i = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
