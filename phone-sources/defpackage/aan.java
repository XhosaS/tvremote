package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aan implements vs {
    public static final bii a = a.bK(new xb(2), new pl(17));
    public boolean b;
    public aai c;
    public boolean d;
    public final aal e;
    public final bcb f;
    public float g;
    public final bwn h;
    public final ace i;
    public final act j;
    public final adm k;
    public final adk l;
    public final bcb m;
    public final bcb n;
    public final zz o;
    public bys p;
    public final baf q;
    public final kw r;
    public final kw s;
    private final vs t;
    private int u;
    private boolean v;
    private final bcb w;
    private final bcb x;
    private final pku y;

    public aan() {
        this(0, 0, new zz(null));
    }

    @Override // defpackage.vs
    public final float a(float f) {
        return this.t.a(f);
    }

    public final int b() {
        return this.e.a();
    }

    public final int c() {
        return this.e.b();
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
            boolean r0 = r8 instanceof defpackage.aam
            if (r0 == 0) goto L13
            r0 = r8
            aam r0 = (defpackage.aam) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aam r0 = new aam
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
            ace r8 = r5.i
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.d(r0)
            if (r8 == r1) goto L5e
        L4b:
            vs r8 = r5.t
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aan.d(rv, yjz, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, yqe] */
    public final void e(aai aaiVar, boolean z, boolean z2) {
        aaj aajVar;
        adm admVar = this.k;
        List list = aaiVar.i;
        admVar.c = list.size();
        if (!z && this.b) {
            this.c = aaiVar;
            bit bitVarT = bcm.t();
            yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
            bit bitVarU = bcm.u(bitVarT);
            try {
                baf bafVar = this.q;
                if (((Number) ((mz) bafVar.a).a()).floatValue() != 0.0f && (aajVar = aaiVar.a) != null) {
                    int i = aajVar.a;
                    aal aalVar = this.e;
                    if (i == aalVar.a() && aaiVar.b == aalVar.b()) {
                        ?? r13 = bafVar.b;
                        if (r13 != 0) {
                            r13.t(null);
                        }
                        bafVar.a = new mz(pm.a, Float.valueOf(0.0f), null, 60);
                    }
                }
                return;
            } finally {
                bcm.z(bitVarT, bitVarU, yjvVarI);
            }
        }
        if (z) {
            this.b = true;
        }
        aaj aajVar2 = aaiVar.a;
        this.x.b(Boolean.valueOf(((aajVar2 == null || aajVar2.a == 0) && aaiVar.b == 0) ? false : true));
        this.w.b(Boolean.valueOf(aaiVar.c));
        this.g -= aaiVar.d;
        this.f.b(aaiVar);
        if (z2) {
            aal aalVar2 = this.e;
            int i2 = aaiVar.b;
            if (i2 < 0.0f) {
                wv.d("scrollOffset should be non-negative");
            }
            aalVar2.d(i2);
        } else {
            aaj aajVar3 = (aaj) yfm.U(list);
            aaj aajVar4 = (aaj) yfm.X(list);
            cmq.h("firstVisibleItem:index", aajVar3 != null ? aajVar3.a : -1L);
            cmq.h("lastVisibleItem:index", aajVar4 != null ? aajVar4.a : -1L);
            aal aalVar3 = this.e;
            aalVar3.b = aajVar2 != null ? aajVar2.d : null;
            if (aalVar3.a || aaiVar.l > 0) {
                aalVar3.a = true;
                int i3 = aaiVar.b;
                if (i3 < 0.0f) {
                    wv.d("scrollOffset should be non-negative");
                }
                aalVar3.e(aajVar2 != null ? aajVar2.a : 0, i3);
            }
            if (this.v) {
                zz zzVar = this.o;
                pku pkuVar = this.y;
                int i4 = zzVar.a;
                boolean z3 = zzVar.c;
                if (i4 != -1 && !list.isEmpty() && i4 != zz.b(aaiVar, z3)) {
                    zzVar.a();
                }
                int i5 = aaiVar.l;
                int i6 = zzVar.d;
                if (i6 != 0 && zzVar.e != 0.0f && i6 != i5 && !list.isEmpty()) {
                    int iB = zz.b(aaiVar, zzVar.e < 0.0f);
                    if (iB >= 0 && iB < i5) {
                        zzVar.a = iB;
                        zzVar.b = pkuVar.D(iB);
                    }
                }
                zzVar.d = i5;
            }
        }
        if (z) {
            this.q.b(aaiVar.e, aaiVar.g, aaiVar.f);
        }
        this.u++;
    }

    public final aai f() {
        return (aai) this.f.a();
    }

    public final void g(float f, aai aaiVar) {
        adl adlVar;
        adl adlVar2;
        if (this.v) {
            zz zzVar = this.o;
            pku pkuVar = this.y;
            List list = aaiVar.i;
            if (!list.isEmpty()) {
                boolean z = f < 0.0f;
                int iB = zz.b(aaiVar, z);
                if (iB >= 0 && iB < aaiVar.l) {
                    if (iB != zzVar.a) {
                        if (zzVar.c != z) {
                            zzVar.a();
                        }
                        zzVar.c = z;
                        zzVar.a = iB;
                        zzVar.b = pkuVar.D(iB);
                    }
                    if (z) {
                        aaj aajVar = (aaj) yfm.W(list);
                        if (((aajVar.f + aajVar.g) + aaiVar.o) - aaiVar.k < (-f) && (adlVar2 = zzVar.b) != null) {
                            adlVar2.b();
                        }
                    } else if (aaiVar.j - ((aaj) yfm.S(list)).f < f && (adlVar = zzVar.b) != null) {
                        adlVar.b();
                    }
                }
            }
            zzVar.e = f;
        }
    }

    @Override // defpackage.vs
    public final boolean h() {
        return ((Boolean) this.x.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean i() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean j() {
        return this.t.j();
    }

    public aan(int i, int i2) {
        this(i, i2, new zz(null));
    }

    public aan(int i, int i2, zz zzVar) {
        this.o = zzVar;
        this.e = new aal(i, i2);
        aai aaiVar = aao.a;
        bcz bczVar = bcz.b;
        this.f = new bci(aaiVar, bczVar);
        this.s = new kw((byte[]) null, (byte[]) null);
        this.t = new tj(new zn(this, 3));
        this.v = true;
        this.h = new abt(this, 1);
        this.i = new ace();
        this.j = new act();
        this.r = new kw((byte[]) null);
        this.k = new adm(new abs(i, 1));
        this.y = new pku(this);
        this.l = new adk();
        ygi ygiVar = ygi.a;
        this.m = new bci(ygiVar, bczVar);
        bcz bczVar2 = bcz.c;
        this.w = new bci(false, bczVar2);
        this.x = new bci(false, bczVar2);
        this.n = new bci(ygiVar, bczVar);
        this.q = new baf();
    }
}
