package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csq implements csy {
    private final csz key;

    public csq(csz cszVar) {
        cszVar.getClass();
        this.key = cszVar;
    }

    @Override // defpackage.cta
    public Object fold(Object obj, cty ctyVar) {
        ctyVar.getClass();
        return ctyVar.a(obj, this);
    }

    @Override // defpackage.csy, defpackage.cta
    public csy get(csz cszVar) {
        cszVar.getClass();
        if (dnx.aB(getKey(), cszVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.csy
    public csz getKey() {
        return this.key;
    }

    @Override // defpackage.cta
    public cta minusKey(csz cszVar) {
        cszVar.getClass();
        return dnx.aB(getKey(), cszVar) ? ctb.a : this;
    }

    @Override // defpackage.cta
    public cta plus(cta ctaVar) {
        ctaVar.getClass();
        return dnx.aE(this, ctaVar);
    }
}
