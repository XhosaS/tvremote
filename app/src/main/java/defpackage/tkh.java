package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkh {
    final /* synthetic */ tkk a;
    private final Map b;
    private final Map c;
    private final pby d;

    public tkh(tkk tkkVar, pby pbyVar, pbv pbvVar) {
        this.a = tkkVar;
        HashMap map = new HashMap();
        this.b = map;
        this.c = new HashMap();
        this.d = pbyVar;
        map.put(0, pbvVar);
    }

    final synchronized pbv a(int i) {
        return (pbv) this.b.get(Integer.valueOf(i));
    }

    final synchronized pbv b(acxn acxnVar) {
        Integer numValueOf = Integer.valueOf(acxnVar.e);
        Map map = this.b;
        pbv pbvVar = (pbv) map.get(numValueOf);
        if (pbvVar != null) {
            return pbvVar;
        }
        pbv pbvVar2 = (pbv) map.get(this.c.get(Integer.valueOf(acxnVar.e)));
        pbvVar2.getClass();
        return pbvVar2;
    }

    public final synchronized void c() {
        this.b.clear();
        this.c.clear();
    }

    public final synchronized void d(acxn acxnVar, pbx pbxVar) {
        pbv pbvVar = (pbv) this.b.get(Integer.valueOf(acxnVar.d));
        pbvVar.getClass();
        this.d.b(pbxVar, pbvVar);
    }

    public final synchronized void e(tkn tknVar) {
        pbr pbrVarB;
        int iA;
        acxn acxnVar = tknVar.d;
        if (this.b.containsKey(Integer.valueOf(acxnVar.d))) {
            return;
        }
        addu adduVar = tknVar.a;
        tkk tkkVar = this.a;
        int i = adduVar.d;
        zpk zpkVar = zpk.a;
        zpj zpjVar = new zpj();
        if ((zpjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zpjVar.y();
        }
        zpk zpkVar2 = (zpk) zpjVar.b;
        zpkVar2.b |= 8;
        zpkVar2.d = i;
        pbq pbqVar = new pbq(new pbu(zpjVar));
        long j = acxnVar.d;
        abxc abxcVar = pfc.b;
        pdr pdrVar = pdr.a;
        pdq pdqVar = new pdq();
        if ((pdqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pdqVar.y();
        }
        pdr pdrVar2 = (pdr) pdqVar.b;
        int i2 = 1;
        pdrVar2.b |= 1;
        pdrVar2.c = j;
        pbr pbrVarB2 = pbqVar.b(new pbs(abxcVar, (pdr) pdqVar.v()));
        if ((adduVar.c & 64) != 0) {
            int i3 = adduVar.j;
            yqw.A(i3 >= 0);
            abxc abxcVar2 = pcz.a;
            pdd pddVar = pdd.a;
            pdc pdcVar = new pdc();
            if ((pdcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pdcVar.y();
            }
            pdd pddVar2 = (pdd) pdcVar.b;
            pddVar2.b |= 1;
            pddVar2.c = i3;
            pbrVarB = pbrVarB2.b(new pbs(abxcVar2, (pdd) pdcVar.v()));
        } else {
            pbrVarB = pbrVarB2;
        }
        if ((adduVar.c & 32) != 0) {
            abxc abxcVar3 = tir.a;
            tiq tiqVar = tiq.a;
            tip tipVar = new tip();
            String str = adduVar.i;
            if ((tipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                tipVar.y();
            }
            tiq tiqVar2 = (tiq) tipVar.b;
            str.getClass();
            tiqVar2.b |= 1;
            tiqVar2.c = str;
            pbrVarB = pbrVarB.b(new pbs(abxcVar3, (tiq) tipVar.v()));
        }
        if ((adduVar.c & 4) != 0) {
            acjc acjcVar = adduVar.f;
            if (acjcVar == null) {
                acjcVar = acjc.a;
            }
            pbrVarB = pbrVarB.b(new pbs(pfc.a, acjcVar));
        }
        if ((adduVar.c & 128) != 0) {
            try {
                zsw zswVar = adduVar.k;
                if (zswVar == null) {
                    zswVar = zsw.a;
                }
                try {
                    int i4 = zswVar.memoizedSerializedSize;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(zswVar.getClass()).a(zswVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i4 & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(zswVar.getClass()).a(zswVar);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            zswVar.memoizedSerializedSize = (zswVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(zswVar.getClass()).m(zswVar, abwa.a(abvwVar));
                    abvwVar.K();
                    abxd abxdVarH = abxd.h(zot.a, bArr, 0, iA, ExtensionRegistryLite.a);
                    if (abxdVarH != null) {
                        abxd abxdVar = null;
                        byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                        if (bByteValue != 1) {
                            if (bByteValue != 0) {
                                boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                if (true == zL) {
                                    abxdVar = abxdVarH;
                                }
                                abxdVarH.cM(2, abxdVar);
                                if (zL) {
                                }
                            }
                            throw new abzz().a();
                        }
                    }
                    pbrVarB.b(new pbs(pfc.c, (zot) abxdVarH));
                } catch (IOException e) {
                    throw new RuntimeException(a.C(zswVar, "byte array"), e);
                }
            } catch (abxv e2) {
                zdv zdvVar = (zdv) ((zdv) tkk.a.c()).p(e2);
                tmm tmmVar = tkkVar.g;
                zer zerVar = tmm.a;
                tml tmlVarA = tmmVar.a(Level.SEVERE);
                int i5 = adduVar.d;
                acjk acjkVar = tmlVarA.a;
                if ((Integer.MIN_VALUE & acjkVar.b.memoizedSerializedSize) == 0) {
                    acjkVar.y();
                }
                acjl acjlVar = (acjl) acjkVar.b;
                acjl acjlVar2 = acjl.a;
                acjlVar.c |= 4;
                acjlVar.f = i5;
                ((zdv) ((zdv) zdvVar.o(zerVar, tmlVarA.a())).q("com/google/android/libraries/search/rendering/xuikit/elements/logging/GilElementsInteractionLogger", "addMetadataFromVeLoggingProperties", 348, "GilElementsInteractionLogger.java")).v("Error parsing VisualElementLiteProto from VisualElementProto for veId %d.", adduVar.d);
            }
        }
        pbv pbvVarB = b(acxnVar);
        pbv pbvVarC = pbrVarB2.c(pbvVarB.b);
        pft pftVar = new pft(pbvVarC);
        pbvVarC.c = pftVar;
        pftVar.c();
        pcm pcmVar = pbvVarB.c;
        if (((pft) pcmVar).d == null) {
            ((pft) pcmVar).d = new ArrayList();
        }
        pcm pcmVar2 = pbvVarC.c;
        pbv pbvVar = ((pft) pcmVar).a;
        pbvVar.getClass();
        yqw.R(((pft) pcmVar2).c == null, "Already has a parent override: %s", ((pft) pcmVar2).a);
        ((pft) pcmVar2).c = pbvVar;
        yqw.A(((pft) pcmVar).d.add(pbvVarC));
        if (((pft) pcmVar).e) {
            pcmVar2.a();
        }
        int iA2 = addt.a(adduVar.e);
        if (iA2 != 0 && iA2 == 2) {
            i2 = 2;
        }
        pbvVarC.e(i2);
        this.b.put(Integer.valueOf(acxnVar.d), pbvVarC);
    }

    public final synchronized void f(acxn acxnVar) {
        Integer numValueOf = Integer.valueOf(acxnVar.d);
        Map map = this.b;
        yqw.L(!map.containsKey(numValueOf));
        Map map2 = this.c;
        if (map2.containsKey(numValueOf)) {
            return;
        }
        Integer numValueOf2 = Integer.valueOf(acxnVar.e);
        if (map.containsKey(numValueOf2)) {
            map2.put(numValueOf, numValueOf2);
            return;
        }
        Integer num = (Integer) map2.get(numValueOf2);
        num.getClass();
        map2.put(numValueOf, num);
    }

    public final synchronized void g(acxn acxnVar) {
        pbv pbvVar = (pbv) this.b.get(Integer.valueOf(acxnVar.d));
        pbvVar.getClass();
        pbvVar.e(1);
    }

    final synchronized boolean h(int i) {
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            if (!this.b.containsKey(numValueOf)) {
                return false;
            }
        }
        return true;
    }
}
