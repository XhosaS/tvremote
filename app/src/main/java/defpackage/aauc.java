package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauc extends aask {
    public final aasi a;
    public final List b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();

    public aauc(aasi aasiVar, List list) {
        this.a = aasiVar;
        this.b = list;
    }

    @Override // defpackage.aask
    public final afen a(final aasp aaspVar) {
        String str = adlf.g.a;
        ConcurrentHashMap concurrentHashMap = this.c;
        afen afenVar = (afen) concurrentHashMap.get(aaspVar);
        if (afenVar != null) {
            return afenVar;
        }
        ConcurrentHashMap concurrentHashMap2 = this.d;
        afen afenVarB = (afen) concurrentHashMap2.get(str);
        if (afenVarB == null) {
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            yyfVar.g(aauy.b(new agow() { // from class: aaub
                @Override // defpackage.agow
                public final Object a() {
                    return yyk.p(new aatv(this.a.a), new aawh());
                }
            }));
            aasi aasiVar = this.a;
            yyfVar.g(new aaud());
            yyfVar.g(new aatx());
            yyfVar.g(aauy.b(new agow() { // from class: aaty
                @Override // defpackage.agow
                public final Object a() {
                    return yyk.p(new aawl(), new aawk());
                }
            }));
            yyfVar.g(aauy.b(new agow() { // from class: aatz
                @Override // defpackage.agow
                public final Object a() {
                    int i2 = yyk.e;
                    yyf yyfVar2 = new yyf(4);
                    Iterator it = this.a.b.iterator();
                    while (it.hasNext()) {
                        yyfVar2.g(((aasm) it.next()).a());
                    }
                    return yyfVar2.f();
                }
            }));
            afenVarB = afet.b(new aaur(str, aasiVar), yyfVar.f());
            afen afenVar2 = (afen) concurrentHashMap2.putIfAbsent(str, afenVarB);
            if (afenVar2 != null) {
                afenVarB = afenVar2;
            }
        }
        afen afenVarB2 = afet.b(afenVarB, Arrays.asList(aauy.b(new agow() { // from class: aaua
            @Override // defpackage.agow
            public final Object a() {
                return yyk.o(new aaue(aaspVar));
            }
        })));
        afen afenVar3 = (afen) concurrentHashMap.putIfAbsent(aaspVar, afenVarB2);
        return afenVar3 != null ? afenVar3 : afenVarB2;
    }
}
