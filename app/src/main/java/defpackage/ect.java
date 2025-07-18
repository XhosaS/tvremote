package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ect implements dtq, dty {
    public static void o(ecr ecrVar, int i) {
        dtu dtuVar;
        ecq ecqVarP = ecrVar.p();
        if (ecqVarP == null) {
            dtuVar = null;
        } else {
            while (true) {
                ecq ecqVar = ecqVarP.a;
                if (ecqVar == null) {
                    break;
                }
                dtu dtuVar2 = ecqVarP.d;
                ecqVarP = ecqVar;
            }
            dtuVar = ecrVar.n;
        }
        if (dtuVar != null) {
            ecn ecnVar = new ecn();
            ecnVar.a = false;
            ecnVar.b = i;
            ((edg) dtuVar).cC(ecnVar);
        }
    }

    protected static dtu q(Class cls, ecr ecrVar, int i, Object[] objArr) {
        if (ecrVar == null || ecrVar.p() == null) {
            dsr.b(3, "Creating event handler without scope.");
            return dws.a;
        }
        if (ecrVar.p().getClass() != cls) {
            String str = ecrVar.p().f;
            dsr.b(2, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", "DataDrivenCollectionSection", ecrVar.p().f));
        }
        ecq ecqVar = (ecq) ecrVar.m.get();
        if (ecqVar == null) {
            throw new IllegalStateException("Called newEventHandler on a released Section");
        }
        dtu dtuVar = new dtu(ecqVar, i, objArr);
        edf edfVar = ecrVar.l;
        if (edfVar != null) {
            edfVar.l.c(ecrVar.p().k, dtuVar);
        }
        return dtuVar;
    }

    @Override // defpackage.dty
    public final void at(dtx dtxVar, Object obj) {
        throw null;
    }

    protected ecj g(ecr ecrVar) {
        return null;
    }

    protected Object h(dtu dtuVar, Object obj) {
        return null;
    }

    protected String i(ecr ecrVar) {
        return null;
    }

    public boolean l() {
        return false;
    }

    final boolean m(ecq ecqVar, ecq ecqVar2) {
        if (ecqVar2 != null && ecqVar2.b) {
            return true;
        }
        if (ecqVar == ecqVar2) {
            return false;
        }
        if (ecqVar != null) {
            return (ecqVar.a(ecqVar2) && dsq.h(ecqVar.g, ecqVar2 == null ? null : ecqVar2.g)) ? false : true;
        }
        return true;
    }

    @Override // defpackage.dtq
    public final Object x(dtu dtuVar, Object obj) throws Exception {
        try {
            return h(dtuVar, obj);
        } catch (Exception e) {
            Object[] objArr = dtuVar.d;
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 instanceof dru) {
                    throw dsq.a((dru) obj2, e);
                }
            }
            throw e;
        }
    }

    protected void r() {
    }

    protected void j(ecr ecrVar) {
    }

    protected void k(dxx dxxVar, dxx dxxVar2) {
    }

    protected void s(int i, int i2) {
    }

    protected void p(ecr ecrVar, ecf ecfVar, ecq ecqVar, ecq ecqVar2) {
    }
}
