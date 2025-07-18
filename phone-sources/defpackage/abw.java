package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abw implements vs {
    public static final bii a = a.bK(new xb(4), new pl(20));
    public boolean b;
    public abj c;
    public final abp d;
    public final bcb e;
    public float f;
    public final bwn g;
    public final ace h;
    public final act i;
    public final adm j;
    public final adk k;
    public final bcb l;
    public final bcb m;
    public final aap n;
    public bys o;
    public final baf p;
    public final kw q;
    public final kw r;
    private final vs s;
    private int t;
    private boolean u;
    private final bcb v;
    private final bcb w;
    private final pku x;

    public abw() {
        this(0, 0, new aap(null));
    }

    @Override // defpackage.vs
    public final float a(float f) {
        return this.s.a(f);
    }

    public final int b() {
        return this.d.a();
    }

    public final int c() {
        return this.d.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8.d(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.rv r6, defpackage.yjz r7, defpackage.yih r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.abu
            if (r0 == 0) goto L13
            r0 = r8
            abu r0 = (defpackage.abu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            abu r0 = new abu
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r7 = r0.a
            rv r6 = r0.e
            defpackage.ybn.f(r8)
            goto L4b
        L3a:
            defpackage.ybn.f(r8)
            ace r8 = r5.h
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L5e
        L4b:
            vs r8 = r5.s
            r2 = 0
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.d(r6, r7, r0)
            if (r6 != r1) goto L5b
            goto L5e
        L5b:
            ygi r6 = defpackage.ygi.a
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.d(rv, yjz, yih):java.lang.Object");
    }

    public final void e(abj abjVar, boolean z, boolean z2) {
        Object objAU;
        Object objAU2;
        adm admVar = this.j;
        List list = abjVar.i;
        admVar.c = list.size();
        if (!z && this.b) {
            this.c = abjVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.f -= abjVar.d;
        this.e.b(abjVar);
        abm abmVar = abjVar.a;
        this.w.b(Boolean.valueOf(((abmVar == null || abmVar.a == 0) && abjVar.b == 0) ? false : true));
        this.v.b(Boolean.valueOf(abjVar.c));
        if (z2) {
            abp abpVar = this.d;
            int i = abjVar.b;
            if (i < 0.0f) {
                wv.d("scrollOffset should be non-negative");
            }
            abpVar.d(i);
        } else {
            abp abpVar2 = this.d;
            Object obj = null;
            if (abmVar != null && (objAU2 = yfm.aU(abmVar.b)) != null) {
                obj = ((abk) objAU2).b;
            }
            abpVar2.b = obj;
            if (abpVar2.a || abjVar.l > 0) {
                abpVar2.a = true;
                int i2 = abjVar.b;
                if (i2 < 0.0f) {
                    wv.d("scrollOffset should be non-negative (" + i2 + ')');
                }
                abpVar2.e((abmVar == null || (objAU = yfm.aU(abmVar.b)) == null) ? 0 : ((abk) objAU).a, i2);
            }
            if (this.u) {
                aap aapVar = this.n;
                pku pkuVar = this.x;
                int i3 = aapVar.a;
                boolean z3 = aapVar.c;
                if (i3 != -1 && !list.isEmpty() && i3 != aap.b(abjVar, z3)) {
                    aapVar.a = -1;
                    bfz bfzVar = aapVar.b;
                    Object[] objArr = bfzVar.a;
                    int i4 = bfzVar.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((adl) objArr[i5]).a();
                    }
                    bfzVar.h();
                }
                int i6 = abjVar.l;
                int i7 = aapVar.d;
                if (i7 != 0 && aapVar.e != 0.0f && i7 != i6 && !list.isEmpty()) {
                    int iB = aap.b(abjVar, aapVar.e < 0.0f);
                    int iA = aap.a(abjVar, aapVar.e < 0.0f);
                    if (iA >= 0 && iA < i6 && iB != aapVar.a && iB >= 0) {
                        aapVar.a = iB;
                        bfz bfzVar2 = aapVar.b;
                        bfzVar2.h();
                        bfzVar2.q(bfzVar2.b, pkuVar.C(iB));
                    }
                }
                aapVar.d = i6;
            }
        }
        if (z) {
            this.p.b(abjVar.e, abjVar.g, abjVar.f);
        }
        this.t++;
    }

    public final abj f() {
        return (abj) this.e.a();
    }

    public final void g(float f, abj abjVar) {
        if (this.u) {
            aap aapVar = this.n;
            pku pkuVar = this.x;
            List list = abjVar.i;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = aap.b(abjVar, z);
                int iA = aap.a(abjVar, z);
                if (iA >= 0 && iA < abjVar.l) {
                    if (iB != aapVar.a && iB >= 0) {
                        if (aapVar.c != z) {
                            bfz bfzVar = aapVar.b;
                            Object[] objArr = bfzVar.a;
                            int i2 = bfzVar.b;
                            for (int i3 = 0; i3 < i2; i3++) {
                                ((adl) objArr[i3]).a();
                            }
                        }
                        aapVar.c = z;
                        aapVar.a = iB;
                        bfz bfzVar2 = aapVar.b;
                        bfzVar2.h();
                        bfzVar2.q(bfzVar2.b, pkuVar.C(iB));
                    }
                    if (z) {
                        abk abkVar = (abk) yfm.W(list);
                        if (((og.m(abkVar, r2) + ((int) (abjVar.m == uv.a ? abkVar.j & 4294967295L : abkVar.j >> 32))) + abjVar.o) - abjVar.k < (-f)) {
                            bfz bfzVar3 = aapVar.b;
                            Object[] objArr2 = bfzVar3.a;
                            int i4 = bfzVar3.b;
                            while (i < i4) {
                                ((adl) objArr2[i]).b();
                                i++;
                            }
                        }
                    } else if (abjVar.j - og.m((abk) yfm.S(list), abjVar.m) < f) {
                        bfz bfzVar4 = aapVar.b;
                        Object[] objArr3 = bfzVar4.a;
                        int i5 = bfzVar4.b;
                        while (i < i5) {
                            ((adl) objArr3[i]).b();
                            i++;
                        }
                    }
                }
            }
            aapVar.e = f;
        }
    }

    @Override // defpackage.vs
    public final boolean h() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean i() {
        return ((Boolean) this.v.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean j() {
        return this.s.j();
    }

    public abw(int i, int i2) {
        this(i, i2, new aap(null));
    }

    public abw(int i, int i2, aap aapVar) {
        this.n = aapVar;
        this.d = new abp(i, i2);
        abj abjVar = aby.a;
        bcz bczVar = bcz.b;
        this.e = new bci(abjVar, bczVar);
        this.r = new kw((byte[]) null, (byte[]) null);
        this.s = new tj(new zn(this, 4));
        this.u = true;
        this.g = new abt(this, 0);
        this.h = new ace();
        this.i = new act();
        this.q = new kw((byte[]) null);
        this.j = new adm(new abs(i, 0));
        this.x = new pku(this);
        this.k = new adk();
        ygi ygiVar = ygi.a;
        this.l = new bci(ygiVar, bczVar);
        this.m = new bci(ygiVar, bczVar);
        bcz bczVar2 = bcz.c;
        this.v = new bci(false, bczVar2);
        this.w = new bci(false, bczVar2);
        this.p = new baf();
    }
}
