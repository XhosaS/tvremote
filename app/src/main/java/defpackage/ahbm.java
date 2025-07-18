package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahbm extends agsq implements agsy {
    public static final ahbl c = new ahbl();

    public ahbm() {
        super(agsy.b);
    }

    public abstract void a(agte agteVar, Runnable runnable);

    public boolean b(agte agteVar) {
        return true;
    }

    @Override // defpackage.agsy
    public final void d(agsw agswVar) {
        agzy agzyVar = ((ahld) agswVar).f;
        while (agzyVar.a == ahle.b) {
        }
        Object obj = agzyVar.a;
        ahar aharVar = obj instanceof ahar ? (ahar) obj : null;
        if (aharVar != null) {
            aharVar.w();
        }
    }

    public void f(agte agteVar, Runnable runnable) {
        ahle.b(this, agteVar, runnable);
    }

    @Override // defpackage.agsy
    public final agsw fp(agsw agswVar) {
        return new ahld(this, agswVar);
    }

    @Override // defpackage.agsq, defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        agtdVar.getClass();
        if (!(agtdVar instanceof agsr)) {
            if (agsy.b == agtdVar) {
                return this;
            }
            return null;
        }
        agsr agsrVar = (agsr) agtdVar;
        if (!agsrVar.b(getKey())) {
            return null;
        }
        agtc agtcVarA = agsrVar.a(this);
        if (agtcVarA instanceof agtc) {
            return agtcVarA;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (defpackage.agsy.b == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return defpackage.agtf.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    @Override // defpackage.agsq, defpackage.agte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.agte minusKey(defpackage.agtd r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.agsr
            if (r0 == 0) goto L1a
            agsr r2 = (defpackage.agsr) r2
            agtd r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            agtc r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            agsx r0 = defpackage.agsy.b
            if (r0 != r2) goto L21
        L1e:
            agtf r2 = defpackage.agtf.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahbm.minusKey(agtd):agte");
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(this));
    }
}
