package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agee {
    public final afen a;
    public final afem b;

    protected agee(afen afenVar, afem afemVar) {
        this.a = afenVar;
        this.b = afemVar;
    }

    public abstract agee a(afen afenVar, afem afemVar);

    public final agee f(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.c(afft.c(j, timeUnit, afft.a)));
    }

    public final agee g(afer... aferVarArr) {
        return a(afet.a(this.a, Arrays.asList(aferVarArr)), this.b);
    }

    public final agee h(afel afelVar, Object obj) {
        return a(this.a, this.b.f(afelVar, obj));
    }
}
