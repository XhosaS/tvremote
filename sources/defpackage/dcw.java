package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcw extends czr {
    public czv a;
    public czb b;

    public dcw(czv czvVar) {
        this.a = czvVar;
    }

    public static dcw a(Object obj) {
        if (obj instanceof dcw) {
            return (dcw) obj;
        }
        if (obj != null) {
            return new dcw(dag.j(obj));
        }
        return null;
    }

    public static dcw b(dal dalVar) {
        return a(dag.m(dalVar, true));
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(2);
        czcVar.b(this.a);
        czb czbVar = this.b;
        if (czbVar != null) {
            czcVar.b(czbVar);
        }
        return new dbk(czcVar);
    }

    public dcw(czv czvVar, czb czbVar) {
        this.a = czvVar;
        this.b = czbVar;
    }

    private dcw(dag dagVar) {
        if (dagVar.b() > 0 && dagVar.b() <= 2) {
            this.a = czv.h(dagVar.h(0));
            this.b = dagVar.b() == 2 ? dagVar.h(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + dagVar.b());
        }
    }
}
