package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pza implements aejg {
    private final aejl a;
    private final aejl b;
    private final aejl c;
    private final aejl d;
    private final aejl e;
    private final aejl f;

    public pza(aejl aejlVar, aejl aejlVar2, aejl aejlVar3, aejl aejlVar4, aejl aejlVar5, aejl aejlVar6) {
        this.a = aejlVar;
        this.b = aejlVar2;
        this.c = aejlVar3;
        this.d = aejlVar4;
        this.e = aejlVar5;
        this.f = aejlVar6;
    }

    @Override // defpackage.agow
    public final /* bridge */ /* synthetic */ Object a() {
        ((pym) this.a).a.a.getClass();
        pmq pmqVar = (pmq) this.b.a();
        pkn pknVar = (pkn) this.c.a();
        ujk ujkVar = (ujk) this.d.a();
        Executor executor = (Executor) this.e.a();
        return new pvv(pmqVar, pknVar, ujkVar, executor);
    }
}
