package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lh extends ykt implements yjv {
    final /* synthetic */ long a;
    final /* synthetic */ ml b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(ml mlVar, long j, int i) {
        super(1);
        this.c = i;
        this.b = mlVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        long jA;
        int iOrdinal;
        int i = this.c;
        if (i == 0) {
            li liVar = (li) this.b;
            if (yks.e(obj, liVar.b.a())) {
                jA = liVar.a(this.a);
            } else {
                bdy bdyVar = (bdy) liVar.b.d.a(obj);
                if (bdyVar != null) {
                    jA = ((cmh) bdyVar.a()).a;
                }
            }
            return new cmh(jA);
        }
        if (i == 1) {
            pb pbVar = (pb) obj;
            Object objA = pbVar.a();
            li liVar2 = (li) this.b;
            if (yks.e(objA, liVar2.b.a())) {
                jA = liVar2.a(this.a);
            } else {
                bdy bdyVar2 = (bdy) liVar2.b.d.a(pbVar.a());
                jA = bdyVar2 != null ? ((cmh) bdyVar2.a()).a : 0L;
            }
            bdy bdyVar3 = (bdy) liVar2.b.d.a(pbVar.b());
            jA = bdyVar3 != null ? ((cmh) bdyVar3.a()).a : 0L;
            kw kwVar = (kw) liVar2.a.a();
            return kwVar != null ? kwVar.a.a(new cmh(jA), new cmh(jA)) : fh.g(0.0f, 400.0f, null, 5);
        }
        if (i == 2) {
            int iOrdinal2 = ((lx) obj).ordinal();
            long j = this.a;
            ml mlVar = this.b;
            if (iOrdinal2 == 0) {
                lv lvVar = ((me) mlVar).b.b.c;
                if (lvVar != null) {
                    j = ((cmh) lvVar.b.a(new cmh(j))).a;
                }
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    throw new yfu();
                }
                lv lvVar2 = ((me) mlVar).c.b.c;
                if (lvVar2 != null) {
                    j = ((cmh) lvVar2.b.a(new cmh(j))).a;
                }
            }
            return new cmh(j);
        }
        if (i != 3) {
            lx lxVar = (lx) obj;
            me meVar = (me) this.b;
            mn mnVar = meVar.b.b.b;
            long j2 = this.a;
            long j3 = mnVar != null ? ((cmf) mnVar.a.a(new cmh(j2))).a : 0L;
            mn mnVar2 = meVar.c.b.b;
            long j4 = mnVar2 != null ? ((cmf) mnVar2.a.a(new cmh(j2))).a : 0L;
            int iOrdinal3 = lxVar.ordinal();
            if (iOrdinal3 == 0) {
                jA = j3;
            } else if (iOrdinal3 != 1) {
                if (iOrdinal3 != 2) {
                    throw new yfu();
                }
                jA = j4;
            }
            return new cmf(jA);
        }
        lx lxVar2 = (lx) obj;
        me meVar2 = (me) this.b;
        if (meVar2.e != null && meVar2.a() != null && !yks.e(meVar2.e, meVar2.a()) && (iOrdinal = lxVar2.ordinal()) != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new yfu();
            }
            lv lvVar3 = meVar2.c.b.c;
            if (lvVar3 != null) {
                long j5 = this.a;
                long j6 = ((cmh) lvVar3.b.a(new cmh(j5))).a;
                bkd bkdVarA = meVar2.a();
                bkdVarA.getClass();
                cmi cmiVar = cmi.a;
                long jA2 = bkdVarA.a(j5, j6, cmiVar);
                bkd bkdVar = meVar2.e;
                bkdVar.getClass();
                jA = cmf.c(jA2, bkdVar.a(j5, j6, cmiVar));
            }
        }
        return new cmf(jA);
    }
}
