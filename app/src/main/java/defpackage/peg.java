package defpackage;

import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peg implements pbc {
    public final pdk a;
    public final pbk b;
    private final pfa c;

    public peg(pdk pdkVar, pbk pbkVar, pfa pfaVar) {
        this.a = pdkVar;
        this.b = pbkVar;
        this.c = pfaVar;
    }

    @Override // defpackage.pbc
    public final zyd a(final pbe pbeVar) {
        String strG;
        yqt yqtVarB;
        final pdj pdjVar = (pdj) pbeVar.a;
        pcc pccVarA = pde.a(pdjVar);
        abxc abxcVar = pej.a;
        MessageLite messageLite = abxcVar.a;
        pcc pccVar = pcc.a;
        if (messageLite != pccVar) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar = pccVarA.n;
        abxb abxbVar = abxcVar.d;
        if (abwrVar.n(abxbVar)) {
            pcc pccVarA2 = pde.a(pdjVar);
            if (messageLite != pccVar) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK = pccVarA2.n.k(abxbVar);
            strG = ((pei) (objK == null ? abxcVar.b : abxcVar.b(objK))).b;
        } else {
            strG = this.a.g(pdjVar);
        }
        if (strG.isEmpty()) {
            return zxy.a;
        }
        pdk pdkVar = this.a;
        pdkVar.c(pdjVar);
        zyd zydVar = pbeVar.b;
        final zyd zydVarD = pdkVar.d(pdjVar, zydVar);
        final zyd zydVarH = pdkVar.h();
        final zyd zydVarE = pdkVar.e(pdjVar, zydVar);
        pfa pfaVar = this.c;
        final pca pcaVar = pdjVar.c.a;
        final zyd zydVar2 = zxy.a;
        final ArrayList arrayList = new ArrayList();
        final String str = strG;
        pfaVar.a.a(pcaVar, pcaVar.d, null, arrayList);
        final ArrayList arrayList2 = new ArrayList();
        pfaVar.b.a(pcaVar, pcaVar.d, null, arrayList2);
        zxj zxjVarC = zxn.c(yxo.a(arrayList, arrayList2));
        Callable callable = new Callable() { // from class: pez
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zlv zlvVar = zlv.a;
                zlu zluVar = new zlu();
                if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zluVar.y();
                }
                pdj pdjVar2 = pdjVar;
                zlv zlvVar2 = (zlv) zluVar.b;
                zpn zpnVar = pdjVar2.a;
                zpnVar.getClass();
                zlvVar2.c = zpnVar;
                zlvVar2.b |= 1;
                zpn zpnVarA = pdz.a(pdjVar2, true);
                yqw.M(zpnVarA != null, "No Parent Event");
                if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zluVar.y();
                }
                zlv zlvVar3 = (zlv) zluVar.b;
                zpnVarA.getClass();
                zlvVar3.e = zpnVarA;
                zlvVar3.b |= 2;
                pcc pccVarA3 = pde.a(pdjVar2);
                abxc abxcVar2 = pfg.a;
                if (abxcVar2.a != pcc.a) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                if (pccVarA3.n.n(abxcVar2.d)) {
                    zlx zlxVar = zlx.a;
                    zlw zlwVar = new zlw();
                    zpk zpkVar = pccVarA3.d;
                    if (zpkVar == null) {
                        zpkVar = zpk.a;
                    }
                    zpn zpnVar2 = zpkVar.f;
                    if (zpnVar2 == null) {
                        zpnVar2 = zpn.a;
                    }
                    if ((zlwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zlwVar.y();
                    }
                    zlx zlxVar2 = (zlx) zlwVar.b;
                    zpnVar2.getClass();
                    zlxVar2.c = zpnVar2;
                    zlxVar2.b |= 1;
                    if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zluVar.y();
                    }
                    zlv zlvVar4 = (zlv) zluVar.b;
                    zlx zlxVar3 = (zlx) zlwVar.v();
                    zlxVar3.getClass();
                    zlvVar4.i = zlxVar3;
                    zlvVar4.b |= 128;
                }
                zpk zpkVar2 = pde.b(pdjVar2).d;
                if (zpkVar2 == null) {
                    zpkVar2 = zpk.a;
                }
                zon zonVar = zon.a;
                zom zomVar = new zom();
                if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zomVar.y();
                }
                pca pcaVar2 = pcaVar;
                zon zonVar2 = (zon) zomVar.b;
                zpkVar2.getClass();
                zonVar2.c = zpkVar2;
                zonVar2.b |= 1;
                int iA = zsu.a(pcaVar2.c);
                if (iA == 0) {
                    iA = 1;
                }
                if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zomVar.y();
                }
                zon zonVar3 = (zon) zomVar.b;
                zonVar3.b |= 16;
                zonVar3.f = iA - 1;
                int iA2 = zsu.a(pcaVar2.c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zomVar.y();
                }
                zon zonVar4 = (zon) zomVar.b;
                zonVar4.b |= 16;
                zonVar4.f = iA2 - 1;
                Iterator it = pcaVar2.d.iterator();
                while (it.hasNext()) {
                    switch (((Integer) it.next()).intValue()) {
                        case 100000001:
                            abxc abxcVar3 = pcz.b;
                            if (abxcVar3.a != pca.a) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK2 = pcaVar2.n.k(abxcVar3.d);
                            int iA3 = zss.a(((pdb) (objK2 == null ? abxcVar3.b : abxcVar3.b(objK2))).b);
                            if (iA3 == 0) {
                                iA3 = 1;
                            }
                            if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zomVar.y();
                            }
                            zon zonVar5 = (zon) zomVar.b;
                            zonVar5.b |= 32;
                            zonVar5.g = iA3 - 1;
                            break;
                        case 100000002:
                            abxc abxcVar4 = pcz.c;
                            if (abxcVar4.a != pca.a) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK3 = pcaVar2.n.k(abxcVar4.d);
                            int iA4 = zsp.a(((zsq) (objK3 == null ? abxcVar4.b : abxcVar4.b(objK3))).b);
                            if (iA4 == 0) {
                                iA4 = 1;
                            }
                            if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zomVar.y();
                            }
                            zon zonVar6 = (zon) zomVar.b;
                            zonVar6.b |= 64;
                            zonVar6.h = iA4 - 1;
                            break;
                        case 100000003:
                            abxc abxcVar5 = pfc.d;
                            if (abxcVar5.a != pca.a) {
                                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                            }
                            Object objK4 = pcaVar2.n.k(abxcVar5.d);
                            int i = ((ped) (objK4 == null ? abxcVar5.b : abxcVar5.b(objK4))).c;
                            if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zomVar.y();
                            }
                            zon zonVar7 = (zon) zomVar.b;
                            zonVar7.b |= 128;
                            zonVar7.i = i;
                            break;
                    }
                }
                zlt zltVar = zlt.a;
                zls zlsVar = new zls();
                long j = pdjVar2.d;
                if (j != -1) {
                    abxc abxcVar6 = zmf.b;
                    zmc zmcVar = zmc.a;
                    zmb zmbVar = new zmb();
                    zme zmeVar = zme.a;
                    zmd zmdVar = new zmd();
                    if ((zmdVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zmdVar.y();
                    }
                    zme zmeVar2 = (zme) zmdVar.b;
                    zmeVar2.b |= 1;
                    zmeVar2.c = j;
                    zme zmeVar3 = (zme) zmdVar.v();
                    if ((zmbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zmbVar.y();
                    }
                    zmc zmcVar2 = (zmc) zmbVar.b;
                    zmeVar3.getClass();
                    zmcVar2.c = zmeVar3;
                    zmcVar2.b = 1 | zmcVar2.b;
                    zlsVar.f(abxcVar6, (zmc) zmbVar.v());
                }
                List list = arrayList;
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((pdn) zxn.o((zyd) it2.next())).a(zlsVar);
                    }
                }
                if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    zomVar.y();
                }
                List list2 = arrayList2;
                zon zonVar8 = (zon) zomVar.b;
                zlt zltVar2 = (zlt) zlsVar.v();
                zltVar2.getClass();
                zonVar8.k = zltVar2;
                zonVar8.b |= 16384;
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((pdn) zxn.o((zyd) it3.next())).a(zomVar);
                    }
                }
                zoq[] zoqVarArr = (zoq[]) zxn.o(zydVar2);
                if (zoqVarArr != null) {
                    for (zoq zoqVar : zoqVarArr) {
                        if ((zomVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zomVar.y();
                        }
                        zon zonVar9 = (zon) zomVar.b;
                        zot zotVar = (zot) zoqVar.v();
                        zotVar.getClass();
                        abxs abxsVar = zonVar9.j;
                        if (!abxsVar.c()) {
                            int size = abxsVar.size();
                            zonVar9.j = abxsVar.d(size + size);
                        }
                        zonVar9.j.add(zotVar);
                    }
                }
                zon zonVar10 = (zon) zomVar.v();
                if ((Integer.MIN_VALUE & zluVar.b.memoizedSerializedSize) == 0) {
                    zluVar.y();
                }
                zlv zlvVar5 = (zlv) zluVar.b;
                zonVar10.getClass();
                zlvVar5.f = zonVar10;
                zlvVar5.b |= 16;
                return (zlv) zluVar.v();
            }
        };
        zwk zwkVar = zwk.a;
        final zyd zydVarA = zxjVarC.a(callable, zwkVar);
        pcc pccVarA3 = pde.a(pdjVar);
        abxc abxcVar2 = pdu.a;
        MessageLite messageLite2 = abxcVar2.a;
        if (messageLite2 != pccVar) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        abwr abwrVar2 = pccVarA3.n;
        abxb abxbVar2 = abxcVar2.d;
        if (!abwrVar2.n(abxbVar2)) {
            yqtVarB = pdkVar.a(pdjVar).b(new yqi() { // from class: pee
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return Integer.valueOf(((abxf) obj).a());
                }
            });
        } else {
            if (messageLite2 != pccVar) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            Object objK2 = pccVarA3.n.k(abxbVar2);
            yqtVarB = yqt.i(Integer.valueOf(((pdt) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2))).b));
        }
        final yqt yqtVar = yqtVarB;
        return zxn.d(zydVarD, zydVarA, zydVarH, zydVarE).b(wyo.b(new zvh() { // from class: pef
            @Override // defpackage.zvh
            public final zyd a() {
                pbi pbiVarL = pbj.l();
                pbiVarL.b(str);
                pbiVarL.c((MessageLite) zxn.o(zydVarD));
                pbg pbgVar = (pbg) pbiVarL;
                pbgVar.a = (zlv) zxn.o(zydVarA);
                pbgVar.b = (Integer) yqtVar.f();
                pbgVar.c = (int[]) zxn.o(zydVarH);
                peg pegVar = this.a;
                pdk pdkVar2 = pegVar.a;
                pdj pdjVar2 = pdjVar;
                pbiVarL.d(pdkVar2.f(pdjVar2));
                pdkVar2.b(pdjVar2);
                int[] iArr = (int[]) zxn.o(zydVarE);
                pcc pccVarB = pde.b(pdjVar2);
                abxc abxcVar3 = pfx.a;
                MessageLite messageLite3 = abxcVar3.a;
                pcc pccVar2 = pcc.a;
                if (messageLite3 != pccVar2) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                abwr abwrVar3 = pccVarB.n;
                abxb abxbVar3 = abxcVar3.d;
                if (abwrVar3.n(abxbVar3) || iArr != null) {
                    pcc pccVarB2 = pde.b(pdjVar2);
                    if (messageLite3 != pccVar2) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK3 = pccVarB2.n.k(abxbVar3);
                    HashSet hashSet = new HashSet(((pfw) (objK3 == null ? abxcVar3.b : abxcVar3.b(objK3))).b);
                    if (iArr != null) {
                        hashSet.addAll(ztm.e(iArr));
                    }
                    pbgVar.d = ztm.f(hashSet);
                }
                return pegVar.b.a(pbiVarL.a(), pbeVar.b);
            }
        }), zwkVar);
    }

    @Override // defpackage.pbc
    public final Set b() {
        return new zdd(pdj.class);
    }
}
