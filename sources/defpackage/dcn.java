package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcn extends czr {
    public final czv a;
    public final czb b;

    public dcn(czv czvVar, czb czbVar) {
        this.a = czvVar;
        this.b = czbVar;
    }

    public static dcn a(Object obj) {
        if (obj instanceof dcn) {
            return (dcn) obj;
        }
        if (obj != null) {
            return new dcn(dag.j(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(2);
        czcVar.b(this.a);
        czcVar.b(this.b);
        return new dbk(czcVar);
    }

    private dcn(dag dagVar) {
        this.a = (czv) dagVar.h(0);
        this.b = dagVar.h(1);
    }
}
