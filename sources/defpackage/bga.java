package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bga implements chs {
    public final /* synthetic */ cja a;
    public final /* synthetic */ cht b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bga(Object obj, cja cjaVar, cht chtVar, Executor executor, int i) {
        this.e = i;
        this.d = obj;
        this.a = cjaVar;
        this.b = chtVar;
        this.c = executor;
    }

    @Override // defpackage.chs
    public final cja a() {
        if (this.e == 0) {
            Executor executor = this.c;
            return chk.i(this.a, bxr.b(new bfx(this.d, this.b, executor, 2)), chz.a);
        }
        Object obj = this.d;
        avs avsVar = new avs(obj, 10);
        Executor executor2 = this.c;
        cht chtVar = this.b;
        cja cjaVar = this.a;
        chz chzVar = chz.a;
        cja cjaVarI = chk.i(cjaVar, avsVar, chzVar);
        cja cjaVarI2 = chk.i(cjaVarI, chtVar, executor2);
        return chk.i(cjaVarI2, bxr.b(new bfx(obj, cjaVarI, cjaVarI2, 0)), chzVar);
    }
}
