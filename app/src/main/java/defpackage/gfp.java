package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfp implements gfn {
    private final mcw a;
    private final eun b;
    private final ets c;

    public gfp(mcw mcwVar, eun eunVar, ets etsVar) {
        mcwVar.getClass();
        eunVar.getClass();
        etsVar.getClass();
        this.a = mcwVar;
        this.b = eunVar;
        this.c = etsVar;
    }

    @Override // defpackage.gfn
    public final gfi a(rqs rqsVar) {
        ggi ggiVar = ggi.a;
        ggf ggfVar = new ggf();
        ggg gggVar = ggg.EVENT_TYPE_MILESTONE;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar2 = (ggi) ggfVar.b;
        ggiVar2.g = gggVar.a();
        ggiVar2.b |= 1;
        rpz rpzVar = ((rqt) rqsVar).a;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        String str = rpzVar.b;
        ggi ggiVar3 = (ggi) ggfVar.b;
        ggiVar3.b |= 2;
        ggiVar3.h = str;
        abwf abwfVarC = acbg.c(this.a.a());
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        eun eunVar = this.b;
        ggi ggiVar4 = (ggi) ggfVar.b;
        abwfVarC.getClass();
        ggiVar4.i = abwfVarC;
        ggiVar4.b |= 4;
        return eunVar.a(ggfVar);
    }

    @Override // defpackage.gfn
    public final gfi b(rqs rqsVar) {
        ggi ggiVar = ggi.a;
        ggf ggfVar = new ggf();
        ggg gggVar = ggg.EVENT_TYPE_START;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar2 = (ggi) ggfVar.b;
        ggiVar2.g = gggVar.a();
        ggiVar2.b |= 1;
        rpz rpzVar = ((rqt) rqsVar).a;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        String str = rpzVar.b;
        ggi ggiVar3 = (ggi) ggfVar.b;
        ggiVar3.b |= 2;
        ggiVar3.h = str;
        abwf abwfVarC = acbg.c(this.a.a());
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        eun eunVar = this.b;
        ggi ggiVar4 = (ggi) ggfVar.b;
        abwfVarC.getClass();
        ggiVar4.i = abwfVarC;
        ggiVar4.b |= 4;
        return eunVar.a(ggfVar);
    }

    @Override // defpackage.gfn
    public final gfd c(rqw rqwVar) {
        ggi ggiVar = ggi.a;
        ggf ggfVar = new ggf();
        ggg gggVar = ggg.EVENT_TYPE_END;
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar2 = (ggi) ggfVar.b;
        ggiVar2.g = gggVar.a();
        ggiVar2.b |= 1;
        String string = rqwVar.toString();
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ggi ggiVar3 = (ggi) ggfVar.b;
        string.getClass();
        ggiVar3.b |= 2;
        ggiVar3.h = string;
        abwf abwfVarC = acbg.c(this.a.a());
        if ((ggfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ggfVar.y();
        }
        ets etsVar = this.c;
        ggi ggiVar4 = (ggi) ggfVar.b;
        abwfVarC.getClass();
        ggiVar4.i = abwfVarC;
        ggiVar4.b |= 4;
        return new gff((geu) etsVar.a.a.fE.a(), ggfVar);
    }
}
