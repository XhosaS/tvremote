package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqh {
    public static final dqh a = new dqh();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final dpu c = new dpu();

    private dqh() {
    }

    public final dqk a(Class cls) {
        cws cwsVarA;
        dqk dqkVarJ;
        Class cls2;
        byte[] bArr = dpk.b;
        a.ar(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        dqk dqkVar = (dqk) concurrentMap.get(cls);
        if (dqkVar != null) {
            return dqkVar;
        }
        dpu dpuVar = this.c;
        Class cls3 = dql.a;
        if (!dpf.class.isAssignableFrom(cls) && (cls2 = dql.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        dpx dpxVarA = dpuVar.a.a(cls);
        if (!dpxVarA.b()) {
            if (dpu.b(cls)) {
                cwt cwtVar = dqf.a;
                cws cwsVar = dpq.a;
                dqt dqtVar = dql.c;
                cwsVarA = dpu.a(dpxVarA) ? doy.a : null;
                cwt cwtVar2 = dpw.a;
                dqkVarJ = dqd.j(dpxVarA, dqtVar, cwsVarA);
            } else {
                cwt cwtVar3 = dqf.a;
                cws cwsVar2 = dpq.a;
                dqt dqtVar2 = dql.b;
                cwsVarA = dpu.a(dpxVarA) ? doy.a() : null;
                cwt cwtVar4 = dpw.a;
                dqkVarJ = dqd.j(dpxVarA, dqtVar2, cwsVarA);
            }
        } else if (dpu.b(cls)) {
            dqt dqtVar3 = dql.c;
            cws cwsVar3 = doy.a;
            dqkVarJ = new dqe(dqtVar3, dpxVarA.a());
        } else {
            dqt dqtVar4 = dql.b;
            doy.a();
            dqkVarJ = new dqe(dqtVar4, dpxVarA.a());
        }
        a.ar(cls, "messageType");
        dqk dqkVar2 = (dqk) concurrentMap.putIfAbsent(cls, dqkVarJ);
        return dqkVar2 != null ? dqkVar2 : dqkVarJ;
    }

    public final dqk b(Object obj) {
        return a(obj.getClass());
    }
}
