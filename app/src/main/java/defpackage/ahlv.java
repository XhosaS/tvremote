package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahlv {
    public final agzy e;
    public final agzy f;
    public final agzy g;

    public ahlv() {
        agzz agzzVar = agzz.a;
        this.e = new agzy(this, agzzVar);
        this.f = new agzy(this, agzzVar);
        this.g = new agzy(null, agzzVar);
    }

    public boolean fq() {
        return this.e.a instanceof ahma;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.e.d(r3, ((defpackage.ahma) r5).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ahlv g() {
        /*
            r8 = this;
        L0:
            agzy r0 = r8.f
            java.lang.Object r1 = r0.a
            ahlv r1 = (defpackage.ahlv) r1
            r2 = 0
            r3 = r1
        L8:
            r4 = r2
        L9:
            agzy r5 = r3.e
            java.lang.Object r5 = r5.a
            if (r5 != r8) goto L19
            if (r1 != r3) goto L12
            goto L18
        L12:
            boolean r0 = r0.d(r1, r3)
            if (r0 == 0) goto L0
        L18:
            return r3
        L19:
            boolean r6 = r8.fq()
            if (r6 == 0) goto L20
            return r2
        L20:
            boolean r6 = r5 instanceof defpackage.ahma
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L34
            ahma r5 = (defpackage.ahma) r5
            ahlv r5 = r5.a
            agzy r6 = r4.e
            boolean r3 = r6.d(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto L8
        L34:
            agzy r3 = r3.f
            java.lang.Object r3 = r3.a
            ahlv r3 = (defpackage.ahlv) r3
            goto L9
        L3b:
            r5.getClass()
            r4 = r5
            ahlv r4 = (defpackage.ahlv) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlv.g():ahlv");
    }

    public final ahlv h() {
        Object obj = this.e.a;
        ahma ahmaVar = obj instanceof ahma ? (ahma) obj : null;
        if (ahmaVar != null) {
            return ahmaVar.a;
        }
        obj.getClass();
        return (ahlv) obj;
    }

    public final ahlv i() {
        ahlv ahlvVarG = g();
        if (ahlvVarG != null) {
            return ahlvVarG;
        }
        Object obj = this.f.a;
        while (true) {
            ahlv ahlvVar = (ahlv) obj;
            if (!ahlvVar.fq()) {
                return ahlvVar;
            }
            obj = ahlvVar.f.a;
        }
    }

    public final void j(int i) {
        l(new ahls(i), i);
    }

    public final void k(ahlv ahlvVar) {
        agzy agzyVar;
        ahlv ahlvVar2;
        do {
            agzyVar = ahlvVar.f;
            ahlvVar2 = (ahlv) agzyVar.a;
            if (this.e.a != ahlvVar) {
                return;
            }
        } while (!agzyVar.d(ahlvVar2, this));
        if (fq()) {
            ahlvVar.g();
        }
    }

    public final boolean l(ahlv ahlvVar, int i) {
        ahlv ahlvVarI;
        do {
            ahlvVarI = i();
            if (ahlvVarI instanceof ahls) {
                return (((ahls) ahlvVarI).a & i) == 0 && ahlvVarI.l(ahlvVar, i);
            }
            ahlvVar.f.b(ahlvVarI);
            ahlvVar.e.b(this);
        } while (!ahlvVarI.e.d(this, ahlvVar));
        ahlvVar.k(this);
        return true;
    }

    public String toString() {
        return new agwc(this) { // from class: ahlu
            @Override // defpackage.agwc, defpackage.agxh
            public final Object g() {
                return this.c.getClass().getSimpleName();
            }
        } + "@" + Integer.toHexString(System.identityHashCode(this));
    }
}
