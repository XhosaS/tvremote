package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bad implements bae {
    private final /* synthetic */ int a;

    public bad(int i) {
        this.a = i;
    }

    @Override // defpackage.bae
    public final /* synthetic */ String a(cmy cmyVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((cxi) ((clq) cmyVar).b).c : ((cym) ((clo) cmyVar).b).e : ((cwk) ((clo) cmyVar).b).f;
    }

    @Override // defpackage.bae
    public final /* synthetic */ String b(cmy cmyVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? ((cxi) ((clq) cmyVar).b).f : ((cym) ((clo) cmyVar).b).d : ((cwk) ((clo) cmyVar).b).e;
    }

    @Override // defpackage.bae
    public final /* synthetic */ void c(cmy cmyVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                clo cloVar = (clo) cmyVar;
                if (!cloVar.b.A()) {
                    cloVar.l();
                }
                cwk cwkVar = (cwk) cloVar.b;
                cwk cwkVar2 = cwk.a;
                cwkVar.b &= -3;
                cwkVar.d = 0L;
                return;
            }
            long jLongValue = l.longValue();
            clo cloVar2 = (clo) cmyVar;
            if (!cloVar2.b.A()) {
                cloVar2.l();
            }
            cwk cwkVar3 = (cwk) cloVar2.b;
            cwk cwkVar4 = cwk.a;
            cwkVar3.b |= 2;
            cwkVar3.d = jLongValue;
            return;
        }
        if (i != 1) {
            clq clqVar = (clq) cmyVar;
            if (l == null) {
                if (!clqVar.b.A()) {
                    clqVar.l();
                }
                cxi cxiVar = (cxi) clqVar.b;
                cxi cxiVar2 = cxi.a;
                cxiVar.b &= -3;
                cxiVar.e = 0L;
                return;
            }
            long jLongValue2 = l.longValue();
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            cxi cxiVar3 = (cxi) clqVar.b;
            cxi cxiVar4 = cxi.a;
            cxiVar3.b |= 2;
            cxiVar3.e = jLongValue2;
            return;
        }
        if (l == null) {
            clo cloVar3 = (clo) cmyVar;
            if (!cloVar3.b.A()) {
                cloVar3.l();
            }
            cym cymVar = (cym) cloVar3.b;
            cym cymVar2 = cym.a;
            cymVar.b &= -2;
            cymVar.c = 0L;
            return;
        }
        long jLongValue3 = l.longValue();
        clo cloVar4 = (clo) cmyVar;
        if (!cloVar4.b.A()) {
            cloVar4.l();
        }
        cym cymVar3 = (cym) cloVar4.b;
        cym cymVar4 = cym.a;
        cymVar3.b |= 1;
        cymVar3.c = jLongValue3;
    }

    @Override // defpackage.bae
    public final /* synthetic */ void d(cmy cmyVar) {
        int i = this.a;
        if (i == 0) {
            clo cloVar = (clo) cmyVar;
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            cwk cwkVar = (cwk) cloVar.b;
            cwk cwkVar2 = cwk.a;
            cwkVar.b &= -5;
            cwkVar.e = cwk.a.e;
            return;
        }
        if (i != 1) {
            clq clqVar = (clq) cmyVar;
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            cxi cxiVar = (cxi) clqVar.b;
            cxi cxiVar2 = cxi.a;
            cxiVar.b &= -5;
            cxiVar.f = cxi.a.f;
            return;
        }
        clo cloVar2 = (clo) cmyVar;
        if (!cloVar2.b.A()) {
            cloVar2.l();
        }
        cym cymVar = (cym) cloVar2.b;
        cym cymVar2 = cym.a;
        cymVar.b &= -3;
        cymVar.d = cym.a.d;
    }
}
