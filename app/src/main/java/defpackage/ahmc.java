package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahmc extends ahab implements agtr {
    public final agsw e;

    public ahmc(agte agteVar, agsw agswVar) {
        super(agteVar, true);
        this.e = agswVar;
    }

    @Override // defpackage.ahdv
    protected void f(Object obj) {
        agsw agswVar = this.e;
        ahle.a(agth.c(agswVar), ahbe.a(obj, agswVar));
    }

    @Override // defpackage.ahdv
    protected final boolean fC() {
        return true;
    }

    @Override // defpackage.agtr
    public final agtr ft() {
        agsw agswVar = this.e;
        if (agswVar instanceof agtr) {
            return (agtr) agswVar;
        }
        return null;
    }

    @Override // defpackage.ahab
    protected void fw(Object obj) {
        agsw agswVar = this.e;
        agswVar.e(ahbe.a(obj, agswVar));
    }

    public void P() {
    }

    @Override // defpackage.agtr
    public final void fu() {
    }
}
