package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cvi extends csq implements csw {
    public static final csr b = new csr(csw.a, new kw(2));

    public cvi() {
        super(csw.a);
    }

    @Override // defpackage.csq, defpackage.csy, defpackage.cta
    public final csy get(csz cszVar) {
        cszVar.getClass();
        if (!(cszVar instanceof csr)) {
            if (csw.a == cszVar) {
                return this;
            }
            return null;
        }
        csr csrVar = (csr) cszVar;
        if (!csrVar.b(getKey())) {
            return null;
        }
        csy csyVarA = csrVar.a(this);
        if (csyVarA instanceof csy) {
            return csyVarA;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (defpackage.csw.a == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return defpackage.ctb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    @Override // defpackage.csq, defpackage.cta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cta minusKey(defpackage.csz r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.csr
            if (r0 == 0) goto L1a
            csr r2 = (defpackage.csr) r2
            csz r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            csy r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            cvj r0 = defpackage.csw.a
            if (r0 != r2) goto L21
        L1e:
            ctb r2 = defpackage.ctb.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvi.minusKey(csz):cta");
    }

    public String toString() {
        return dnx.aw(this) + "@" + dnx.ax(this);
    }
}
