package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arn implements arc {
    final /* synthetic */ bfv a;

    public arn(bfv bfvVar) {
        this.a = bfvVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28, types: [crv, java.lang.Object] */
    @Override // defpackage.arc
    public final boolean a(clo cloVar) {
        bfv bfvVar = this.a;
        int i = 0;
        if (((Boolean) bfvVar.b.a()).booleanValue()) {
            byg bygVar = (byg) bfvVar.e;
            if (bygVar.f()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= ((aqy) cloVar.b).e.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((aqu) ((aqy) cloVar.b).e.get(i2)).b == 3) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (!cloVar.b.A()) {
                        cloVar.l();
                    }
                    aqy aqyVar = (aqy) cloVar.b;
                    aqyVar.b();
                    aqyVar.e.remove(i2);
                }
                clo cloVarO = aqw.a.o();
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                aqw aqwVar = (aqw) cloVarO.b;
                aqwVar.e = 1;
                aqwVar.b |= 2;
                Instant instantNow = Instant.now();
                cnv cnvVarB = con.b(instantNow.getEpochSecond(), instantNow.getNano());
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                aqw aqwVar2 = (aqw) cloVarO.b;
                cnvVarB.getClass();
                aqwVar2.d = cnvVarB;
                aqwVar2.b |= 1;
                if (((Boolean) bfvVar.a.a()).booleanValue()) {
                    bzs bzsVarA = ((ayl) bygVar.b()).a();
                    long jLongValue = ((Long) bfvVar.c.a()).longValue();
                    long jLongValue2 = ((Long) bfvVar.f.a()).longValue();
                    Stream map = Collection.EL.stream(bzsVarA).map(new aro(2));
                    int i3 = bzs.d;
                    bzs bzsVarA2 = ars.a((List) map.collect(bza.a), jLongValue, jLongValue2);
                    int size = bzsVarA2.size();
                    while (i < size) {
                        cyt cytVar = (cyt) bzsVarA2.get(i);
                        clo cloVarO2 = cyq.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        cyq cyqVar = (cyq) cloVarO2.b;
                        cytVar.getClass();
                        cyqVar.d = cytVar;
                        cyqVar.c = 3;
                        clo cloVarO3 = cyp.a.o();
                        if (!cloVarO3.b.A()) {
                            cloVarO3.l();
                        }
                        cyp.h((cyp) cloVarO3.b);
                        cyp cypVar = (cyp) cloVarO3.i();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        cyq cyqVar2 = (cyq) cloVarO2.b;
                        cypVar.getClass();
                        cyqVar2.e = cypVar;
                        cyqVar2.b |= 1;
                        cloVarO.U(cloVarO2);
                        i++;
                    }
                } else {
                    bzs bzsVarB = ((ayl) bygVar.b()).b();
                    long jLongValue3 = ((Long) bfvVar.c.a()).longValue();
                    long jLongValue4 = ((Long) bfvVar.f.a()).longValue();
                    Stream map2 = Collection.EL.stream(bzsVarB).map(new aro(0));
                    int i4 = bzs.d;
                    bzs bzsVarA3 = ars.a((List) map2.collect(bza.a), jLongValue3, jLongValue4);
                    int size2 = bzsVarA3.size();
                    while (i < size2) {
                        cxl cxlVar = (cxl) bzsVarA3.get(i);
                        clo cloVarO4 = cyq.a.o();
                        if (!cloVarO4.b.A()) {
                            cloVarO4.l();
                        }
                        cyq cyqVar3 = (cyq) cloVarO4.b;
                        cxlVar.getClass();
                        cyqVar3.d = cxlVar;
                        cyqVar3.c = 1;
                        clo cloVarO5 = cyp.a.o();
                        if (!cloVarO5.b.A()) {
                            cloVarO5.l();
                        }
                        cyp.h((cyp) cloVarO5.b);
                        cyp cypVar2 = (cyp) cloVarO5.i();
                        if (!cloVarO4.b.A()) {
                            cloVarO4.l();
                        }
                        cyq cyqVar4 = (cyq) cloVarO4.b;
                        cypVar2.getClass();
                        cyqVar4.e = cypVar2;
                        cyqVar4.b |= 1;
                        cloVarO.U(cloVarO4);
                        i++;
                    }
                }
                clo cloVarO6 = aqu.a.o();
                aqw aqwVar3 = (aqw) cloVarO.i();
                if (!cloVarO6.b.A()) {
                    cloVarO6.l();
                }
                aqu aquVar = (aqu) cloVarO6.b;
                aqwVar3.getClass();
                aquVar.c = aqwVar3;
                aquVar.b = 3;
                cloVar.T(cloVarO6);
                return true;
            }
        }
        return false;
    }
}
