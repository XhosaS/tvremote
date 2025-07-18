package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glo extends agtq {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ glp c;
    int d;
    Instant e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glo(glp glpVar, agsw agswVar) {
        super(agswVar);
        this.c = glpVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n(null, this);
    }
}
