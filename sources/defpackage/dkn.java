package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkn extends dla {
    @Override // defpackage.dla
    public final deu a(ddp ddpVar) {
        dhu dhuVarZ = dle.z(ddpVar.a.a);
        try {
            dab dabVarA = ddpVar.a();
            dgo dgoVar = dabVarA != null ? new dgo(dag.j(dabVarA)) : null;
            return new dhw(dhuVarZ, dos.p(dgoVar.a), dos.p(dgoVar.b));
        } catch (Exception unused) {
            return new dhw(dhuVarZ, ddpVar.b.n());
        }
    }
}
