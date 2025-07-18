package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzt extends dxv {

    @eau
    drq a;

    private dzt() {
        super("Wrapper");
    }

    public static dzs aA(dru druVar) {
        return new dzs(druVar, new dzt());
    }

    @Override // defpackage.dxv
    protected final drq b() {
        return this.a;
    }

    @Override // defpackage.drq
    protected final dvs c(dve dveVar, dru druVar) {
        drq drqVar = this.a;
        if (drqVar == null) {
            return null;
        }
        return duy.c(dveVar, druVar, drqVar, false, null);
    }

    @Override // defpackage.drq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        dzt dztVar = (dzt) drqVar;
        if (this.j == dztVar.j) {
            return true;
        }
        drq drqVar2 = this.a;
        return drqVar2 == null ? dztVar.a == null : drqVar2.g(dztVar.a);
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        return this;
    }
}
