package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aehv implements beg {
    final /* synthetic */ euq a;

    public aehv(euq euqVar) {
        this.a = euqVar;
    }

    @Override // defpackage.beg
    public final /* synthetic */ beb a(Class cls) {
        return bfa.a.a();
    }

    @Override // defpackage.beg
    public final beb b(Class cls, bet betVar) throws Exception {
        beb bebVar;
        final aehy aehyVar = new aehy();
        euq euqVar = this.a;
        euqVar.b = bds.a(betVar);
        euqVar.c = aehyVar;
        aejk.a(euqVar.b, bdl.class);
        aejk.a(euqVar.c, aehi.class);
        eus eusVar = new eus(euqVar.a, euqVar.b);
        agow agowVar = (agow) ((aehw) aehg.a(eusVar, aehw.class)).b().get(cls);
        agux aguxVar = (agux) betVar.a(aehx.a);
        Object obj = ((aehw) aehg.a(eusVar, aehw.class)).a().get(cls);
        if (obj == null) {
            if (aguxVar != null) {
                throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
            }
            if (agowVar == null) {
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            bebVar = (beb) agowVar.a();
        } else {
            if (agowVar != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (aguxVar == null) {
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
            bebVar = (beb) aguxVar.a(obj);
        }
        AutoCloseable autoCloseable = new AutoCloseable() { // from class: aehu
            @Override // java.lang.AutoCloseable
            public final void close() {
                aehyVar.a();
            }
        };
        bez bezVar = bebVar.h;
        if (bezVar.d) {
            bezVar.a(autoCloseable);
            return bebVar;
        }
        synchronized (bezVar.a) {
            bezVar.c.add(autoCloseable);
        }
        return bebVar;
    }

    @Override // defpackage.beg
    public final /* synthetic */ beb c(agxd agxdVar, bet betVar) {
        return bef.a(this, agxdVar, betVar);
    }
}
