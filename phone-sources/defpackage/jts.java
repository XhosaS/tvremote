package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jts extends ixi {
    public wkn d;

    /* JADX WARN: Illegal instructions before constructor call */
    public jts(wkx wkxVar) {
        wkn wknVarB;
        vvd vvdVar = wtx.e;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        wkp wkpVar = ((wtx) this.b).d;
        wkn wknVarB2 = wkn.b((wkpVar == null ? wkp.a : wkpVar).e);
        if ((wknVarB2 == null ? wkn.UNRECOGNIZED : wknVarB2) != wkn.UNSPECIFIED) {
            wkp wkpVar2 = ((wtx) this.b).d;
            wknVarB = wkn.b((wkpVar2 == null ? wkp.a : wkpVar2).e);
            wknVarB = wknVarB == null ? wkn.UNRECOGNIZED : wknVarB;
            wknVarB.getClass();
        } else {
            wkp wkpVar3 = ((wtx) this.b).d;
            wknVarB = (wkpVar3 == null ? wkp.a : wkpVar3).b ? wkn.CHECKED : wkn.UNCHECKED;
        }
        this.d = wknVarB;
    }
}
