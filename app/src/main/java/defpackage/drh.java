package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drh extends drq {

    @eau
    public List a;

    @eau
    public boolean b;

    @eau
    public int c;

    @eau
    public int d;

    @eau
    public int e;

    @eau
    public int f;
    private final String r = "Column";

    public static drg b(dru druVar) {
        return new drg(druVar, new drh());
    }

    @Override // defpackage.drq
    protected final dvs c(dve dveVar, dru druVar) {
        dvs dvsVar = new dvs(druVar);
        dvsVar.O = true == this.b ? 2 : 1;
        int i = this.d;
        if (i != 0) {
            dvsVar.L = i;
        }
        int i2 = this.c;
        if (i2 != 0) {
            dvsVar.K = i2;
        }
        int i3 = this.e;
        if (i3 != 0) {
            dvsVar.J = i3;
        }
        int i4 = this.f;
        if (i4 != 0) {
            dvsVar.M = i4;
        }
        List<drq> list = this.a;
        if (list != null) {
            for (drq drqVar : list) {
                if (dveVar.c()) {
                    return null;
                }
                if (dveVar.b()) {
                    dvsVar.r(drqVar);
                } else {
                    dvsVar.v(dveVar, druVar, drqVar);
                }
            }
        }
        return dvsVar;
    }

    @Override // defpackage.drq
    public final String d() {
        return this.r;
    }

    @Override // defpackage.drq
    public final boolean e() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean f() {
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
        drh drhVar = (drh) drqVar;
        if (this.j == drhVar.j) {
            return true;
        }
        List list = this.a;
        if (list != null) {
            if (drhVar.a == null || list.size() != drhVar.a.size()) {
                return false;
            }
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                if (!((drq) this.a.get(i)).g((drq) drhVar.a.get(i))) {
                    return false;
                }
            }
        } else if (drhVar.a != null) {
            return false;
        }
        int i2 = this.d;
        if (i2 == 0 ? drhVar.d != 0 : i2 != drhVar.d) {
            return false;
        }
        int i3 = this.c;
        if (i3 == 0 ? drhVar.c != 0 : i3 != drhVar.c) {
            return false;
        }
        int i4 = this.e;
        if (i4 == 0 ? drhVar.e == 0 : i4 == drhVar.e) {
            return this.b == drhVar.b;
        }
        return false;
    }
}
