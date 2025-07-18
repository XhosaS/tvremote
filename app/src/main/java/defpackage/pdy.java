package defpackage;

import android.util.SparseIntArray;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdy implements pbc {
    public final pdk a;
    public final pbk b;
    private final pey c;

    public pdy(pdk pdkVar, pbk pbkVar, pey peyVar) {
        this.a = pdkVar;
        this.b = pbkVar;
        this.c = peyVar;
    }

    @Override // defpackage.pbc
    public final zyd a(final pbe pbeVar) {
        String strG;
        yqt yqtVarB;
        zyd zydVarB;
        int i = 1;
        wvx wvxVarF = wzg.f("GIL:NVLGraftHandler", wwb.a, true);
        try {
            final pdi pdiVar = (pdi) pbeVar.a;
            pcc pccVarA = pde.a(pdiVar);
            abxc abxcVar = pej.a;
            MessageLite messageLite = abxcVar.a;
            pcc pccVar = pcc.a;
            if (messageLite != pccVar) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
            abwr abwrVar = pccVarA.n;
            abxb abxbVar = abxcVar.d;
            if (abwrVar.n(abxbVar)) {
                pcc pccVarA2 = pde.a(pdiVar);
                if (messageLite != pccVar) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                Object objK = pccVarA2.n.k(abxbVar);
                strG = ((pei) (objK == null ? abxcVar.b : abxcVar.b(objK))).b;
            } else {
                strG = this.a.g(pdiVar);
            }
            final String str = strG;
            if (str.isEmpty()) {
                zydVarB = zxy.a;
            } else {
                pdk pdkVar = this.a;
                pdkVar.c(pdiVar);
                final HashSet hashSet = new HashSet();
                List<pcc> list = pdiVar.c;
                for (pcc pccVar2 : list) {
                    abxc abxcVar2 = pfx.a;
                    MessageLite messageLite2 = abxcVar2.a;
                    if (messageLite2 != pccVar) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    abwr abwrVar2 = pccVar2.n;
                    int i2 = i;
                    abxb abxbVar2 = abxcVar2.d;
                    if (abwrVar2.n(abxbVar2)) {
                        if (messageLite2 != pccVar) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        Object objK2 = pccVar2.n.k(abxbVar2);
                        hashSet.addAll(((pfw) (objK2 == null ? abxcVar2.b : abxcVar2.b(objK2))).b);
                    }
                    i = i2;
                }
                int i3 = i;
                zyd zydVar = pbeVar.b;
                final zyd zydVarD = pdkVar.d(pdiVar, zydVar);
                final zyd zydVarH = pdkVar.h();
                zyd zydVarE = pdkVar.e(pdiVar, zydVar);
                pcc pccVarA3 = pde.a(pdiVar);
                abxc abxcVar3 = pdu.a;
                MessageLite messageLite3 = abxcVar3.a;
                if (messageLite3 != pccVar) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                abwr abwrVar3 = pccVarA3.n;
                abxb abxbVar3 = abxcVar3.d;
                if (abwrVar3.n(abxbVar3)) {
                    pcc pccVarA4 = pde.a(pdiVar);
                    if (messageLite3 != pccVar) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK3 = pccVarA4.n.k(abxbVar3);
                    yqtVarB = yqt.i(Integer.valueOf(((pdt) (objK3 == null ? abxcVar3.b : abxcVar3.b(objK3))).b));
                } else {
                    yqtVarB = pdkVar.a(pdiVar).b(new yqi() { // from class: pdw
                        @Override // defpackage.yqi
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((abxf) obj).a());
                        }
                    });
                }
                pdp pdpVar = this.c.a;
                int size = list.size();
                final zoq[] zoqVarArr = new zoq[size];
                final ArrayList arrayList = new ArrayList();
                int i4 = size - 1;
                while (i4 >= 0) {
                    pcc pccVar3 = (pcc) list.get(i4);
                    zot zotVar = zot.a;
                    zoq zoqVar = new zoq();
                    yqt yqtVar = yqtVarB;
                    zpk zpkVar = pccVar3.d;
                    if (zpkVar == null) {
                        zpkVar = zpk.a;
                    }
                    int i5 = zpkVar.d;
                    if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zoqVar.y();
                    }
                    zot zotVar2 = (zot) zoqVar.b;
                    zyd zydVar2 = zydVarE;
                    zotVar2.b |= 1;
                    zotVar2.c = i5;
                    zoqVarArr[i4] = zoqVar;
                    int i6 = pccVar3.e;
                    int iB = zos.b(i6);
                    if (iB != 0 && iB != i3) {
                        int iB2 = zos.b(i6);
                        if (iB2 == 0) {
                            iB2 = 1;
                        }
                        if ((zoqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zoqVar.y();
                        }
                        zot zotVar3 = (zot) zoqVar.b;
                        zotVar3.i = iB2 - 1;
                        zotVar3.b |= 32;
                    }
                    if (pccVar3.c.size() > 0) {
                        pdpVar.a(pccVar3, pccVar3.c, zoqVarArr[i4], arrayList);
                    }
                    i4--;
                    yqtVarB = yqtVar;
                    zydVarE = zydVar2;
                    i3 = 1;
                }
                final yqt yqtVar2 = yqtVarB;
                final zyd zydVar3 = zydVarE;
                final zyd zydVarH2 = arrayList.isEmpty() ? zxn.h(zoqVarArr) : zxn.c(arrayList).a(new Callable() { // from class: pfb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((pdn) zxn.o((zyd) it.next())).a(null);
                        }
                        return zoqVarArr;
                    }
                }, zwk.a);
                final SparseIntArray sparseIntArray = pdiVar.d;
                zxj zxjVarD = zxn.d(zydVarH2);
                Callable callable = new Callable() { // from class: pex
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zoq[] zoqVarArr2 = (zoq[]) zxn.o(zydVarH2);
                        int length = zoqVarArr2.length;
                        for (int i7 = 0; i7 < length; i7++) {
                            int iValueAt = sparseIntArray.valueAt(i7);
                            if (iValueAt != -1) {
                                zoqVarArr2[iValueAt].a(i7);
                            }
                        }
                        return zoqVarArr2;
                    }
                };
                zwk zwkVar = zwk.a;
                final zyd zydVarA = zxjVarD.a(callable, zwkVar);
                final zyd zydVarH3 = zxn.h(new HashMap());
                final zyd zydVarA2 = zxn.d(zydVarA, zydVarH3).a(new Callable() { // from class: pew
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zoq[] zoqVarArr2;
                        int i7;
                        int i8;
                        int i9;
                        int i10;
                        zoq[] zoqVarArr3 = (zoq[]) zxn.o(zydVarA);
                        Map map = (Map) zxn.o(zydVarH3);
                        zlv zlvVar = zlv.a;
                        zlu zluVar = new zlu();
                        pdi pdiVar2 = pdiVar;
                        zpn zpnVar = pdiVar2.a;
                        int i11 = Integer.MIN_VALUE;
                        if ((zluVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zluVar.y();
                        }
                        zlv zlvVar2 = (zlv) zluVar.b;
                        zpnVar.getClass();
                        zlvVar2.c = zpnVar;
                        boolean z = true;
                        zlvVar2.b |= 1;
                        zmr zmrVar = zmr.a;
                        zmq zmqVar = new zmq();
                        List<pdh> list2 = pdiVar2.b;
                        for (pdh pdhVar : list2) {
                            int i12 = pdhVar.b - 1;
                            int i13 = i11;
                            if (i12 != 0) {
                                zpn zpnVarA = pdz.a(pdhVar, z);
                                zpnVarA.getClass();
                                pdv.b(zpnVarA, pdhVar, pdiVar2, zluVar);
                                pcc pccVarB = pde.b(pdhVar);
                                zmt zmtVar = zmt.a;
                                zms zmsVar = new zms();
                                zpk zpkVar2 = pccVarB.d;
                                if (zpkVar2 == null) {
                                    zpkVar2 = zpk.a;
                                }
                                if ((zmsVar.b.memoizedSerializedSize & i13) == 0) {
                                    zmsVar.y();
                                }
                                zmt zmtVar2 = (zmt) zmsVar.b;
                                zpkVar2.getClass();
                                zmtVar2.e = zpkVar2;
                                zmtVar2.d = 2;
                                if ((zpnVarA.b & 2) != 0) {
                                    if ((zmsVar.b.memoizedSerializedSize & i13) == 0) {
                                        zmsVar.y();
                                    }
                                    zmt zmtVar3 = (zmt) zmsVar.b;
                                    zmtVar3.c = zpnVarA;
                                    zmtVar3.b = 3;
                                    i10 = 1;
                                } else {
                                    zpp zppVar = zpnVarA.c;
                                    if (zppVar == null) {
                                        zppVar = zpp.a;
                                    }
                                    if ((zmsVar.b.memoizedSerializedSize & i13) == 0) {
                                        zmsVar.y();
                                    }
                                    zmt zmtVar4 = (zmt) zmsVar.b;
                                    zppVar.getClass();
                                    zmtVar4.c = zppVar;
                                    i10 = 1;
                                    zmtVar4.b = 1;
                                }
                                zmp zmpVar = zmp.a;
                                zmm zmmVar = new zmm();
                                int i14 = i12 != 0 ? i12 != i10 ? 3 : 2 : 4;
                                if ((zmmVar.b.memoizedSerializedSize & i13) == 0) {
                                    zmmVar.y();
                                }
                                zmp zmpVar2 = (zmp) zmmVar.b;
                                zmpVar2.d = i14 - 1;
                                zmpVar2.b |= 2;
                                zmt zmtVar5 = (zmt) zmsVar.v();
                                if ((zmmVar.b.memoizedSerializedSize & i13) == 0) {
                                    zmmVar.y();
                                }
                                zmp zmpVar3 = (zmp) zmmVar.b;
                                zmtVar5.getClass();
                                zmpVar3.c = zmtVar5;
                                zmpVar3.b |= 1;
                                if ((pccVarB.b & 4) != 0) {
                                    long j = pccVarB.f;
                                    if ((zmmVar.b.memoizedSerializedSize & i13) == 0) {
                                        zmmVar.y();
                                    }
                                    zmp zmpVar4 = (zmp) zmmVar.b;
                                    zmpVar4.b |= 16;
                                    zmpVar4.f = j;
                                }
                                pdv.c(zmmVar, (zoq[]) map.get(pdhVar));
                                zmqVar.a((zmp) zmmVar.v());
                            } else {
                                pcc pccVarB2 = pde.b(pdhVar);
                                if ((pccVarB2.b & 4) != 0) {
                                    zpk zpkVar3 = pccVarB2.d;
                                    if (zpkVar3 == null) {
                                        zpkVar3 = zpk.a;
                                    }
                                    zoq zoqVar2 = zoqVarArr3[zpkVar3.c];
                                    abxc abxcVar4 = zmf.a;
                                    zmc zmcVar = zmc.a;
                                    zmb zmbVar = new zmb();
                                    zme zmeVar = zme.a;
                                    i7 = 2;
                                    zmd zmdVar = new zmd();
                                    zoqVarArr2 = zoqVarArr3;
                                    long j2 = pccVarB2.f / 1000;
                                    if ((zmdVar.b.memoizedSerializedSize & i13) == 0) {
                                        zmdVar.y();
                                    }
                                    zme zmeVar2 = (zme) zmdVar.b;
                                    zmeVar2.b |= 1;
                                    zmeVar2.c = j2;
                                    zme zmeVar3 = (zme) zmdVar.v();
                                    if ((zmbVar.b.memoizedSerializedSize & i13) == 0) {
                                        zmbVar.y();
                                    }
                                    zmc zmcVar2 = (zmc) zmbVar.b;
                                    zmeVar3.getClass();
                                    zmcVar2.c = zmeVar3;
                                    i8 = 1;
                                    zmcVar2.b |= 1;
                                    zoqVar2.f(abxcVar4, (zmc) zmbVar.v());
                                } else {
                                    zoqVarArr2 = zoqVarArr3;
                                    i7 = 2;
                                    i8 = 1;
                                }
                                zpn zpnVarA2 = pdz.a(pdhVar, false);
                                if (zpnVarA2 == null) {
                                    yqw.M(list2.size() == i8, "Impressions must be in their own event.");
                                    pcc pccVarA5 = pde.a(pdiVar2);
                                    abxc abxcVar5 = pfd.a;
                                    MessageLite messageLite4 = abxcVar5.a;
                                    pcc pccVar4 = pcc.a;
                                    if (messageLite4 != pccVar4) {
                                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                    }
                                    abwr abwrVar4 = pccVarA5.n;
                                    abxb abxbVar4 = abxcVar5.d;
                                    if (abwrVar4.n(abxbVar4)) {
                                        if (messageLite4 != pccVar4) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        Object objK4 = pccVarA5.n.k(abxbVar4);
                                        Object objB = objK4 == null ? abxcVar5.b : abxcVar5.b(objK4);
                                        zon zonVar = zon.a;
                                        zom zomVar = new zom();
                                        int i15 = ((peb) objB).b;
                                        if ((zomVar.b.memoizedSerializedSize & i13) == 0) {
                                            zomVar.y();
                                        }
                                        zon zonVar2 = (zon) zomVar.b;
                                        zonVar2.b |= 4;
                                        zonVar2.d = i15;
                                        zon zonVar3 = (zon) zomVar.v();
                                        if ((zluVar.b.memoizedSerializedSize & i13) == 0) {
                                            zluVar.y();
                                        }
                                        zlv zlvVar3 = (zlv) zluVar.b;
                                        zonVar3.getClass();
                                        zlvVar3.f = zonVar3;
                                        zlvVar3.b |= 16;
                                    }
                                    abxc abxcVar6 = pfd.b;
                                    MessageLite messageLite5 = abxcVar6.a;
                                    if (messageLite5 != pccVar4) {
                                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                    }
                                    abwr abwrVar5 = pccVarA5.n;
                                    abxb abxbVar5 = abxcVar6.d;
                                    if (abwrVar5.n(abxbVar5)) {
                                        if (messageLite5 != pccVar4) {
                                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                        }
                                        Object objK5 = pccVarA5.n.k(abxbVar5);
                                        zpn zpnVar2 = (zpn) (objK5 == null ? abxcVar6.b : abxcVar6.b(objK5));
                                        if ((zluVar.b.memoizedSerializedSize & i13) == 0) {
                                            zluVar.y();
                                        }
                                        zlv zlvVar4 = (zlv) zluVar.b;
                                        zpnVar2.getClass();
                                        zlvVar4.e = zpnVar2;
                                        zlvVar4.b |= 2;
                                    }
                                    zoqVarArr3 = zoqVarArr2;
                                    pdv.a(pdhVar.c(), false, zoqVarArr3, pdiVar2, map, zluVar, zmqVar);
                                } else {
                                    zoqVarArr3 = zoqVarArr2;
                                    zpk zpkVar4 = ((pcc) pdhVar.a.get(1)).d;
                                    if (zpkVar4 == null) {
                                        zpkVar4 = zpk.a;
                                    }
                                    yqw.L((zpkVar4.b & 2048) != 0);
                                    zmp zmpVar5 = zmp.a;
                                    zmm zmmVar2 = new zmm();
                                    if ((zmmVar2.b.memoizedSerializedSize & i13) == 0) {
                                        zmmVar2.y();
                                    }
                                    zmp zmpVar6 = (zmp) zmmVar2.b;
                                    zmpVar6.d = 3;
                                    zmpVar6.b |= 2;
                                    zmt zmtVar6 = zmt.a;
                                    zms zmsVar2 = new zms();
                                    if ((zmsVar2.b.memoizedSerializedSize & i13) == 0) {
                                        zmsVar2.y();
                                    }
                                    zmt zmtVar7 = (zmt) zmsVar2.b;
                                    zmtVar7.c = zpnVarA2;
                                    zmtVar7.b = 3;
                                    if ((zmsVar2.b.memoizedSerializedSize & i13) == 0) {
                                        zmsVar2.y();
                                    }
                                    zmt zmtVar8 = (zmt) zmsVar2.b;
                                    zpkVar4.getClass();
                                    zmtVar8.e = zpkVar4;
                                    zmtVar8.d = i7;
                                    zmt zmtVar9 = (zmt) zmsVar2.v();
                                    if ((zmmVar2.b.memoizedSerializedSize & i13) == 0) {
                                        zmmVar2.y();
                                    }
                                    zmp zmpVar7 = (zmp) zmmVar2.b;
                                    zmtVar9.getClass();
                                    zmpVar7.c = zmtVar9;
                                    zmpVar7.b |= 1;
                                    pdv.c(zmmVar2, (zoq[]) map.get(pdhVar));
                                    pcc pccVarB3 = pde.b(pdhVar);
                                    abxc abxcVar7 = pfc.b;
                                    if (abxcVar7.a != pcc.a) {
                                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                                    }
                                    boolean zN = pccVarB3.n.n(abxcVar7.d);
                                    if (zN) {
                                        if ((zmmVar2.b.memoizedSerializedSize & i13) == 0) {
                                            zmmVar2.y();
                                        }
                                        zmp zmpVar8 = (zmp) zmmVar2.b;
                                        zmpVar8.b |= 32;
                                        i9 = 1;
                                        zmpVar8.g = true;
                                    } else {
                                        i9 = 1;
                                    }
                                    pdv.a(pdhVar.c(), zN, zoqVarArr3, pdiVar2, map, zluVar, zmqVar);
                                    if (list2.size() == i9) {
                                        zmqVar.a((zmp) zmmVar2.v());
                                    } else {
                                        zms zmsVar3 = new zms();
                                        zpk zpkVar5 = pde.b(pdhVar).d;
                                        if (zpkVar5 == null) {
                                            zpkVar5 = zpk.a;
                                        }
                                        if ((zmsVar3.b.memoizedSerializedSize & i13) == 0) {
                                            zmsVar3.y();
                                        }
                                        zmt zmtVar10 = (zmt) zmsVar3.b;
                                        zpkVar5.getClass();
                                        zmtVar10.e = zpkVar5;
                                        zmtVar10.d = 2;
                                        zmt zmtVar11 = (zmt) zmsVar3.v();
                                        if ((zmmVar2.b.memoizedSerializedSize & i13) == 0) {
                                            zmmVar2.y();
                                        }
                                        zmp zmpVar9 = (zmp) zmmVar2.b;
                                        zmtVar11.getClass();
                                        zmpVar9.e = zmtVar11;
                                        zmpVar9.b |= 4;
                                        if ((zmqVar.b.memoizedSerializedSize & i13) == 0) {
                                            zmqVar.y();
                                        }
                                        zmr zmrVar2 = (zmr) zmqVar.b;
                                        zmp zmpVar10 = (zmp) zmmVar2.v();
                                        zmpVar10.getClass();
                                        abxs abxsVar = zmrVar2.b;
                                        if (!abxsVar.c()) {
                                            int size2 = abxsVar.size();
                                            zmrVar2.b = abxsVar.d(size2 + size2);
                                        }
                                        zmrVar2.b.add(zmpVar10);
                                    }
                                    pdv.b(zpnVarA2, pdhVar, pdiVar2, zluVar);
                                }
                            }
                            i11 = i13;
                            z = true;
                        }
                        int i16 = i11;
                        pcc pccVarA6 = pde.a(pdiVar2);
                        abxc abxcVar8 = pfg.a;
                        if (abxcVar8.a != pcc.a) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        if (pccVarA6.n.n(abxcVar8.d)) {
                            zlx zlxVar = zlx.a;
                            zlw zlwVar = new zlw();
                            zpk zpkVar6 = pccVarA6.d;
                            if (zpkVar6 == null) {
                                zpkVar6 = zpk.a;
                            }
                            zpn zpnVar3 = zpkVar6.f;
                            if (zpnVar3 == null) {
                                zpnVar3 = zpn.a;
                            }
                            if ((zlwVar.b.memoizedSerializedSize & i16) == 0) {
                                zlwVar.y();
                            }
                            zlx zlxVar2 = (zlx) zlwVar.b;
                            zpnVar3.getClass();
                            zlxVar2.c = zpnVar3;
                            zlxVar2.b |= 1;
                            zlx zlxVar3 = (zlx) zlwVar.v();
                            if ((zluVar.b.memoizedSerializedSize & i16) == 0) {
                                zluVar.y();
                            }
                            zlv zlvVar5 = (zlv) zluVar.b;
                            zlxVar3.getClass();
                            zlvVar5.i = zlxVar3;
                            zlvVar5.b |= 128;
                        }
                        if (((zmr) zmqVar.b).b.size() > 0) {
                            zmr zmrVar3 = (zmr) zmqVar.v();
                            if ((zluVar.b.memoizedSerializedSize & i16) == 0) {
                                zluVar.y();
                            }
                            zlv zlvVar6 = (zlv) zluVar.b;
                            zmrVar3.getClass();
                            zlvVar6.h = zmrVar3;
                            zlvVar6.b |= 64;
                        }
                        for (zoq zoqVar3 : zoqVarArr3) {
                            if ((zluVar.b.memoizedSerializedSize & i16) == 0) {
                                zluVar.y();
                            }
                            zlv zlvVar7 = (zlv) zluVar.b;
                            zot zotVar4 = (zot) zoqVar3.v();
                            zotVar4.getClass();
                            abxs abxsVar2 = zlvVar7.d;
                            if (!abxsVar2.c()) {
                                int size3 = abxsVar2.size();
                                zlvVar7.d = abxsVar2.d(size3 + size3);
                            }
                            zlvVar7.d.add(zotVar4);
                        }
                        return (zlv) zluVar.v();
                    }
                }, zwkVar);
                zydVarB = zxn.d(zydVarD, zydVarH, zydVar3, zydVarA2).b(wyo.b(new zvh() { // from class: pdx
                    @Override // defpackage.zvh
                    public final zyd a() {
                        int[] iArr = (int[]) zxn.o(zydVar3);
                        Set set = hashSet;
                        pbe pbeVar2 = pbeVar;
                        if (iArr != null) {
                            set.addAll(ztm.e(iArr));
                        }
                        pdi pdiVar2 = pdiVar;
                        zyd zydVar4 = zydVarH;
                        yqt yqtVar3 = yqtVar2;
                        zyd zydVar5 = zydVarA2;
                        zyd zydVar6 = zydVarD;
                        String str2 = str;
                        pdy pdyVar = this.a;
                        pbi pbiVarL = pbj.l();
                        pbiVarL.b(str2);
                        pbiVarL.c((MessageLite) zxn.o(zydVar6));
                        pbg pbgVar = (pbg) pbiVarL;
                        pbgVar.a = (zlv) zxn.o(zydVar5);
                        pbgVar.b = (Integer) yqtVar3.f();
                        pbgVar.c = (int[]) zxn.o(zydVar4);
                        pdk pdkVar2 = pdyVar.a;
                        pbiVarL.d(pdkVar2.f(pdiVar2));
                        pdkVar2.b(pdiVar2);
                        if (!set.isEmpty()) {
                            pbgVar.d = ztm.f(set);
                        }
                        wvx wvxVarF2 = wzg.f("GIL:ClearcutTransmitter", wwb.a, true);
                        try {
                            zyd zydVarA3 = pdyVar.b.a(pbiVarL.a(), pbeVar2.b);
                            wvxVarF2.a(zydVarA3);
                            wvxVarF2.close();
                            return zydVarA3;
                        } catch (Throwable th) {
                            try {
                                wvxVarF2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), zwkVar);
                wvxVarF.a(zydVarB);
            }
            wvxVarF.close();
            return zydVarB;
        } catch (Throwable th) {
            try {
                wvxVarF.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.pbc
    public final Set b() {
        return new zdd(pdi.class);
    }
}
