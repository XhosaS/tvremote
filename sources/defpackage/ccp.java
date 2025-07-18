package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ccp {
    public static final ccp c = new ccl();
    public static final ccp d = new ccl();

    protected ccp() {
    }

    static ccp b(ccp ccpVar, ccp ccpVar2) {
        ccp ccpVar3;
        ccp ccpVar4;
        if (ccpVar != null) {
            if (ccpVar2 == null || ccpVar == (ccpVar3 = c) || ccpVar2 == (ccpVar4 = d)) {
                return ccpVar;
            }
            if (ccpVar2 != ccpVar3 && ccpVar != ccpVar4) {
                return new ccm(ccpVar, ccpVar2);
            }
        }
        return ccpVar2;
    }

    protected abstract void a();
}
