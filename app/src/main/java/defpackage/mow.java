package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mow implements och {
    private final oea b;
    private final mot c;
    private final mou d;
    private final mii e;
    private final boolean f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;

    public mow(Optional optional, Optional optional2, oea oeaVar, mot motVar, mou mouVar, mii miiVar, Optional optional3, boolean z, Optional optional4, Optional optional5) {
        if (motVar == null && mouVar == null) {
            throw new ocp("No input function object provided to ElementTypeConverterFlat");
        }
        this.b = oeaVar;
        this.c = motVar;
        this.d = mouVar;
        this.e = miiVar;
        this.f = z;
        this.g = optional;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
    }

    @Override // defpackage.och
    public final mii a() {
        return this.e;
    }

    @Override // defpackage.och
    public final boolean b() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.och
    public final drq c(dru druVar, oal oalVar, nid nidVar, List list, obk obkVar) {
        mlm mlmVar;
        oal oalVarG;
        obj objVar;
        dru druVar2;
        drn drnVarA;
        obj objVar2;
        if (!nidVar.n()) {
            throw new ocp("Element missing type");
        }
        nnf nnfVarJ = nidVar.j();
        mii miiVar = this.e;
        if (!nnfVarJ.b(miiVar)) {
            throw new ocp("Element missing correct type extension");
        }
        mil milVarA = nidVar.j().a(miiVar);
        nlr nlrVarI = nidVar.m() ? nidVar.i() : a;
        String strK = nidVar.k();
        if (nlrVarI.b(ngv.H)) {
            int i = yyk.e;
            mlmVar = new mlm(zcg.b);
        } else {
            mlmVar = null;
        }
        boolean z = true;
        if (miiVar != nhf.J && miiVar != nhb.I) {
            z = false;
        }
        boolean z2 = z;
        mod modVar = new mod(oalVar.Q(), oalVar.P(), z2, this.g, this.h, this.i, this.j, this.k);
        if (obkVar != null) {
            nyw nywVar = new nyw(oalVar);
            obj objVarA = obkVar.a();
            nywVar.l = objVarA;
            objVar = objVarA;
            oalVarG = nywVar.g();
        } else {
            oalVarG = oalVar;
            objVar = modVar;
        }
        nlr nlrVar = nlrVarI;
        mot motVar = this.c;
        if (motVar != null) {
            druVar2 = druVar;
            drnVarA = motVar.a(druVar2, oalVarG, milVarA, strK, nlrVar, mlmVar, list);
        } else {
            druVar2 = druVar;
            mou mouVar = this.d;
            if (mouVar == null) {
                throw new ocp("No input function object provided to ElementTypeConverterFlat");
            }
            drnVarA = mouVar.a(druVar2, oalVarG, nidVar);
        }
        if (strK != null) {
            drnVarA.y(strK);
        }
        modVar.a = drnVarA;
        if (z2) {
            objVar2 = objVar;
        } else {
            obj objVar3 = objVar;
            this.b.a(druVar2, oalVarG, strK, nlrVar, objVar3, mlmVar);
            objVar2 = objVar3;
            nlrVar = nlrVar;
        }
        mii miiVar2 = ncx.z;
        if (nlrVar.b(miiVar2)) {
            msr.d((ncx) nlrVar.a(miiVar2), objVar2);
        }
        drq drqVarB = objVar2.b(druVar2);
        modVar.a = null;
        return drqVarB;
    }
}
