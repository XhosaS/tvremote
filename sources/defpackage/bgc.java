package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgc {
    public final String a;
    public final bwk b;
    public final Object c;
    public List d;
    public final bfz e;
    private final cja f;
    private final cih g;
    private final bwk h;

    public bgc(bfz bfzVar, cja cjaVar) {
        bgb bgbVar = new bgb(this);
        chz chzVar = chz.a;
        this.h = new bwk(bgbVar, chzVar);
        this.c = new Object();
        this.d = new ArrayList();
        this.e = bfzVar;
        this.f = cjaVar;
        this.a = bfzVar.a;
        this.b = new bwk(new ave(bfzVar, 6), chzVar);
        this.g = new cih();
        c(new avs(this, 12));
    }

    public final cja a() {
        cja cjaVarI;
        byn.c(bxv.a);
        bwk bwkVar = this.h;
        if (bwkVar.c.isDone()) {
            cjaVarI = this.e.a();
        } else {
            bxb bxbVarL = awn.l("Get ".concat(String.valueOf(this.a)));
            try {
                cjaVarI = chk.i(bwkVar.c(), bxr.b(new avs(this, 13)), chz.a);
                bxbVarL.a(cjaVarI);
                bxbVarL.close();
            } catch (Throwable th) {
                try {
                    bxbVarL.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        qm.L(this.f);
        return qm.L(cjaVarI);
    }

    public final cja b(byb bybVar, Executor executor) {
        cja cjaVarC;
        cih cihVar;
        chz chzVar;
        cht chtVarB = bxr.b(new avs(bybVar, 11));
        byn.c(bxv.a);
        bxb bxbVarL = awn.l("Update ".concat(String.valueOf(this.a)));
        try {
            cjaVarC = this.h.c();
            cihVar = this.g;
            ave aveVar = new ave(cjaVarC, 8);
            chzVar = chz.a;
            cihVar.a(aveVar, chzVar);
        } catch (Throwable th) {
            th = th;
        }
        try {
            cja cjaVarA = cihVar.a(bxr.a(new bga(this, cjaVarC, chtVarB, executor, 0)), chzVar);
            cjaVarA.getClass();
            if (!cjaVarC.isDone()) {
                if (cjaVarA.isDone()) {
                    qm.R(cjaVarA, cjaVarC);
                } else {
                    cio cioVar = new cio(cjaVarA, cjaVarC, 0);
                    cjaVarA.m(cioVar, chzVar);
                    cjaVarC.m(cioVar, chzVar);
                }
            }
            qm.L(this.f);
            cja cjaVarD = wz.d(cjaVarA);
            bxbVarL.a(cjaVarD);
            bxbVarL.close();
            return cjaVarD;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                bxbVarL.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void c(cht chtVar) {
        synchronized (this.c) {
            this.d.add(chtVar);
        }
    }
}
