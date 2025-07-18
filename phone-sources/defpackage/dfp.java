package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfp {
    public static final dfp a = new dfp();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final dfa c = new dfa();

    private dfp() {
    }

    public final dfs a(Class cls) {
        cwt cwtVarA;
        dfs dfsVarI;
        Class cls2;
        Charset charset = dep.a;
        a.ar(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        dfs dfsVar = (dfs) concurrentMap.get(cls);
        if (dfsVar != null) {
            return dfsVar;
        }
        dfa dfaVar = this.c;
        Class cls3 = dft.a;
        if (!dek.class.isAssignableFrom(cls) && (cls2 = dft.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        dfe dfeVarA = dfaVar.a.a(cls);
        if (!dfeVarA.b()) {
            if (dfa.b(cls)) {
                cyg cygVar = dfm.a;
                cyf cyfVar = dew.a;
                dfz dfzVar = dft.c;
                cwtVarA = dfa.a(dfeVarA) ? dee.a : null;
                cyf cyfVar2 = dfd.a;
                dfsVarI = dfk.i(dfeVarA, dfzVar, cwtVarA);
            } else {
                cyg cygVar2 = dfm.a;
                cyf cyfVar3 = dew.a;
                dfz dfzVar2 = dft.b;
                cwtVarA = dfa.a(dfeVarA) ? dee.a() : null;
                cyf cyfVar4 = dfd.a;
                dfsVarI = dfk.i(dfeVarA, dfzVar2, cwtVarA);
            }
        } else if (dfa.b(cls)) {
            dfz dfzVar3 = dft.c;
            cwt cwtVar = dee.a;
            dfsVarI = new dfl(dfzVar3, dfeVarA.a());
        } else {
            dfz dfzVar4 = dft.b;
            dee.a();
            dfsVarI = new dfl(dfzVar4, dfeVarA.a());
        }
        a.ar(cls, "messageType");
        dfs dfsVar2 = (dfs) concurrentMap.putIfAbsent(cls, dfsVarI);
        return dfsVar2 != null ? dfsVar2 : dfsVarI;
    }

    public final dfs b(Object obj) {
        return a(obj.getClass());
    }
}
