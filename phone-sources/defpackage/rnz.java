package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import j$.time.Instant;
import j$.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnz implements rnr {
    final /* synthetic */ unc a;

    public rnz(unc uncVar) {
        this.a = uncVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, yfo] */
    @Override // defpackage.rnr
    public final boolean a(vtw vtwVar) {
        unc uncVar = this.a;
        int i = 0;
        if (((Boolean) uncVar.b.b()).booleanValue()) {
            tst tstVar = (tst) uncVar.a;
            if (tstVar.g()) {
                while (true) {
                    if (i >= ((rnn) vtwVar.b).e.size()) {
                        i = -1;
                        break;
                    }
                    if (((rnj) ((rnn) vtwVar.b).e.get(i)).b == 3) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    if (!vtwVar.b.A()) {
                        vtwVar.u();
                    }
                    rnn rnnVar = (rnn) vtwVar.b;
                    rnnVar.b();
                    rnnVar.e.remove(i);
                }
                vtw vtwVarM = rnl.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rnl rnlVar = (rnl) vtwVarM.b;
                rnlVar.e = 1;
                rnlVar.b |= 2;
                vwe vweVarB = vxr.b(Instant.now());
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                rnl rnlVar2 = (rnl) vtwVarM.b;
                vweVarB.getClass();
                rnlVar2.d = vweVarB;
                rnlVar2.b |= 1;
                if (((Boolean) uncVar.f.b()).booleanValue()) {
                    UnmodifiableIterator it = rod.a((List) Collection.EL.stream(((ruq) tstVar.c()).a()).map(new nrc(6)).collect(ImmutableList.toImmutableList()), ((Long) uncVar.d.b()).longValue(), ((Long) uncVar.c.b()).longValue()).iterator();
                    while (it.hasNext()) {
                        zbh zbhVar = (zbh) it.next();
                        vtw vtwVarM2 = zbe.a.m();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        zbe zbeVar = (zbe) vtwVarM2.b;
                        zbhVar.getClass();
                        zbeVar.d = zbhVar;
                        zbeVar.c = 3;
                        vtw vtwVarM3 = zbd.a.m();
                        if (!vtwVarM3.b.A()) {
                            vtwVarM3.u();
                        }
                        zbd.c((zbd) vtwVarM3.b);
                        zbd zbdVar = (zbd) vtwVarM3.r();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        zbe zbeVar2 = (zbe) vtwVarM2.b;
                        zbdVar.getClass();
                        zbeVar2.e = zbdVar;
                        zbeVar2.b |= 1;
                        vtwVarM.bv(vtwVarM2);
                    }
                } else {
                    UnmodifiableIterator it2 = rod.a((List) Collection.EL.stream(((ruq) tstVar.c()).b()).map(new nrc(5)).collect(ImmutableList.toImmutableList()), ((Long) uncVar.d.b()).longValue(), ((Long) uncVar.c.b()).longValue()).iterator();
                    while (it2.hasNext()) {
                        zaa zaaVar = (zaa) it2.next();
                        vtw vtwVarM4 = zbe.a.m();
                        if (!vtwVarM4.b.A()) {
                            vtwVarM4.u();
                        }
                        zbe zbeVar3 = (zbe) vtwVarM4.b;
                        zaaVar.getClass();
                        zbeVar3.d = zaaVar;
                        zbeVar3.c = 1;
                        vtw vtwVarM5 = zbd.a.m();
                        if (!vtwVarM5.b.A()) {
                            vtwVarM5.u();
                        }
                        zbd.c((zbd) vtwVarM5.b);
                        zbd zbdVar2 = (zbd) vtwVarM5.r();
                        if (!vtwVarM4.b.A()) {
                            vtwVarM4.u();
                        }
                        zbe zbeVar4 = (zbe) vtwVarM4.b;
                        zbdVar2.getClass();
                        zbeVar4.e = zbdVar2;
                        zbeVar4.b |= 1;
                        vtwVarM.bv(vtwVarM4);
                    }
                }
                vtw vtwVarM6 = rnj.a.m();
                rnl rnlVar3 = (rnl) vtwVarM.r();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                rnj rnjVar = (rnj) vtwVarM6.b;
                rnlVar3.getClass();
                rnjVar.c = rnlVar3;
                rnjVar.b = 3;
                vtwVar.bu(vtwVarM6);
                return true;
            }
        }
        return false;
    }
}
