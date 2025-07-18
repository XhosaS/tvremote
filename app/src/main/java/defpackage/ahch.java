package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahch extends ahmc {
    public final agzw b;

    public ahch(agte agteVar, agsw agswVar) {
        super(agteVar, agswVar);
        this.b = new agzw(0, agzz.a);
    }

    @Override // defpackage.ahmc, defpackage.ahdv
    protected final void f(Object obj) {
        fw(obj);
    }

    @Override // defpackage.ahmc, defpackage.ahab
    protected final void fw(Object obj) {
        agzw agzwVar;
        do {
            agzwVar = this.b;
            int i = agzwVar.c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                agsw agswVar = this.e;
                ahle.a(agth.c(agswVar), ahbe.a(obj, agswVar));
                return;
            }
        } while (!agzwVar.a(0, 2));
    }
}
