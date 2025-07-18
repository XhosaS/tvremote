package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class moy implements ocg {
    private final oea a;
    private final mox b;
    private final abwk c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final Optional h;

    public moy(Optional optional, Optional optional2, Optional optional3, oea oeaVar, mox moxVar, abwk abwkVar, Optional optional4, Optional optional5) {
        this.a = oeaVar;
        this.b = moxVar;
        this.c = abwkVar;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
    }

    @Override // defpackage.ocg
    public final abwk a() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ocg
    public final drq b(dru druVar, oal oalVar, MessageLite messageLite, String str, nlr nlrVar, List list, obk obkVar) {
        mlm mlmVar;
        oal oalVarG;
        obj objVar;
        if (nlrVar.b(ngv.H)) {
            int i = yyk.e;
            mlmVar = new mlm(zcg.b);
        } else {
            mlmVar = null;
        }
        mod modVar = new mod(oalVar.Q(), oalVar.P(), false, this.d, this.e, this.f, this.g, this.h);
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
        drn drnVarA = this.b.a(druVar, oalVarG, messageLite, list);
        modVar.a = drnVarA;
        if (str != null) {
            drnVarA.y(str);
        }
        this.a.a(druVar, oalVarG, str, nlrVar, objVar, mlmVar);
        mii miiVar = ncx.z;
        if (nlrVar.b(miiVar)) {
            msr.d((ncx) nlrVar.a(miiVar), objVar);
        }
        drq drqVarB = objVar.b(druVar);
        modVar.a = null;
        return drqVarB;
    }
}
