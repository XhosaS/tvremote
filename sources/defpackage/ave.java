package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ave implements chs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ave(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v40, types: [cja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [byo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byo, java.lang.Object] */
    @Override // defpackage.chs
    public final cja a() {
        int i = 7;
        int i2 = 1;
        switch (this.b) {
            case 0:
                avg avgVar = (avg) this.a;
                return (!avgVar.m() || avgVar.c.getAndSet(true)) ? ciw.a : avgVar.o(6, (aut) avgVar.b.a(), ((auw) avgVar.e.a()).f);
            case 1:
                auv auvVar = (auv) this.a;
                byg bygVar = (byg) auvVar.b.aL();
                boolean zF = bygVar.f();
                Object objAL = auvVar.c.aL();
                if (zF) {
                    byg bygVar2 = (byg) objAL;
                    if (bygVar2.f()) {
                        auu auuVar = new auu((File) bygVar.b(), (String) bygVar2.b());
                        int iA = auuVar.a();
                        auuVar.b().delete();
                        auuVar.b = 0;
                        auuVar.c = true;
                        if (iA < ((auw) auvVar.f.a()).c) {
                            return ciw.a;
                        }
                        Object obj = auvVar.e;
                        aua auaVarA = aub.a();
                        clo cloVarO = cym.a.o();
                        clo cloVarO2 = cyl.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        cyl cylVar = (cyl) cloVarO2.b;
                        cylVar.c = 6;
                        cylVar.b |= 1;
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        cym cymVar = (cym) cloVarO.b;
                        cyl cylVar2 = (cyl) cloVarO2.i();
                        cylVar2.getClass();
                        cymVar.y = cylVar2;
                        cymVar.b |= 16777216;
                        auaVarA.f((cym) cloVarO.i());
                        return ((aue) obj).a(auaVarA.a());
                    }
                }
                return ciw.a;
            case 2:
                avg avgVar2 = (avg) this.a;
                if (avgVar2.m()) {
                    auv auvVar2 = avgVar2.f;
                    if (((AtomicBoolean) auvVar2.g).getAndSet(false)) {
                        qm.O(new ave(auvVar2, i2), auvVar2.d);
                    } else {
                        cja cjaVar = ciw.a;
                    }
                }
                return ciw.a;
            case 3:
                Object obj2 = this.a;
                return apr.c(((avu) obj2).b, new ama(obj2, i, null));
            case 4:
                return ciw.a;
            case 5:
                return ((axv) this.a).e();
            case 6:
                Object obj3 = this.a;
                cht chtVarB = bxr.b(new avs(obj3, 9));
                bfz bfzVar = (bfz) obj3;
                return qm.L(chk.i(bfzVar.b, chtVarB, bfzVar.c));
            case 7:
                Object obj4 = this.a;
                bfz bfzVar2 = (bfz) obj4;
                try {
                    return qm.K(((bfz) obj4).b((Uri) qm.P(bfzVar2.b)));
                } catch (IOException e) {
                    byg bygVar3 = bfzVar2.d;
                    if (!bygVar3.f()) {
                        return new civ(e);
                    }
                    if ((e instanceof bet) || (e.getCause() instanceof bet)) {
                        return new civ(e);
                    }
                    return chk.i(!(e.getCause() instanceof cmh) ? new civ(e) : cgp.i(chk.i(qm.K(((att) bygVar3.b()).a), bxr.b(new avs(obj4, i)), bfzVar2.c), IOException.class, new avs(e, 14), chz.a), bxr.b(new avs(obj4, 8)), bfzVar2.c);
                }
            default:
                return this.a;
        }
    }
}
