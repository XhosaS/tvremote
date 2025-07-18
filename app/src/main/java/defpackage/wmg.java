package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmg {
    public static afen a(final agow agowVar, wma wmaVar, aask aaskVar, yqt yqtVar) {
        afen afenVarB = afet.b(aaskVar.a(wmaVar.a()), Arrays.asList(aauy.b(new agow() { // from class: wmb
            @Override // defpackage.agow
            public final Object a() {
                int i = yyk.e;
                yyf yyfVar = new yyf(4);
                yyfVar.g(new wmf());
                yyfVar.h((Iterable) agowVar.a());
                yyfVar.g(new wme());
                return yyfVar.f();
            }
        })));
        return wmaVar.c() != null ? afet.b(afenVarB, Arrays.asList(new wmd(wmaVar))) : afenVarB;
    }
}
