package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdl {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bdl(Context context, byg bygVar, azx azxVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.c = context;
        this.d = bit.k(new asf(context, 12));
        this.a = ((Boolean) bygVar.d(false)).booleanValue();
        this.b = azxVar;
        this.e = clearcutMetricSnapshotTransmitter;
    }

    public final cja a(String str) {
        bav bavVar = (bav) this.b;
        asv asvVarD = bavVar.d();
        Object obj = this.d;
        obj.getClass();
        str.getClass();
        Object obj2 = asvVarD.a;
        ahq ahqVar = new ahq();
        ahqVar.a = new alc((String) obj, str, 0);
        ami amiVarC = ((agb) obj2).c(ahqVar.a());
        chz chzVar = chz.a;
        alx alxVar = new alx() { // from class: bbi
            @Override // defpackage.alx
            public final Object a(ami amiVar) {
                int i;
                bbg bbgVar;
                int i2;
                akp akpVar = (akp) amiVar.c();
                clo cloVarO = bbf.a.o();
                String str2 = akpVar.a;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                clt cltVar = cloVarO.b;
                bbf bbfVar = (bbf) cltVar;
                str2.getClass();
                int i3 = 1;
                bbfVar.b |= 1;
                bbfVar.c = str2;
                String str3 = akpVar.c;
                if (!cltVar.A()) {
                    cloVarO.l();
                }
                clt cltVar2 = cloVarO.b;
                bbf bbfVar2 = (bbf) cltVar2;
                str3.getClass();
                int i4 = 4;
                bbfVar2.b |= 4;
                bbfVar2.e = str3;
                boolean z = akpVar.f;
                if (!cltVar2.A()) {
                    cloVarO.l();
                }
                clt cltVar3 = cloVarO.b;
                bbf bbfVar3 = (bbf) cltVar3;
                bbfVar3.b |= 8;
                bbfVar3.h = z;
                long j = akpVar.g;
                if (!cltVar3.A()) {
                    cloVarO.l();
                }
                bbf bbfVar4 = (bbf) cloVarO.b;
                bbfVar4.b |= 16;
                bbfVar4.i = j;
                byte[] bArr = akpVar.b;
                int i5 = 2;
                if (bArr != null) {
                    ckv ckvVarP = ckv.p(bArr);
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bbf bbfVar5 = (bbf) cloVarO.b;
                    bbfVar5.b |= 2;
                    bbfVar5.d = ckvVarP;
                }
                ako[] akoVarArr = akpVar.d;
                int length = akoVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    ako akoVar = akoVarArr[i6];
                    akv[] akvVarArr = akoVar.b;
                    int length2 = akvVarArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        akv akvVar = akvVarArr[i7];
                        int i8 = akvVar.g;
                        if (i8 == i3) {
                            i = i5;
                            int i9 = i3;
                            clo cloVarO2 = bbg.a.o();
                            String str4 = akvVar.a;
                            if (!cloVarO2.b.A()) {
                                cloVarO2.l();
                            }
                            clt cltVar4 = cloVarO2.b;
                            bbg bbgVar2 = (bbg) cltVar4;
                            str4.getClass();
                            bbgVar2.b |= 1;
                            bbgVar2.e = str4;
                            i3 = i9;
                            if (i8 != i3) {
                                throw new IllegalArgumentException("Not a long type");
                            }
                            long j2 = akvVar.b;
                            if (!cltVar4.A()) {
                                cloVarO2.l();
                            }
                            bbg bbgVar3 = (bbg) cloVarO2.b;
                            bbgVar3.c = i3;
                            bbgVar3.d = Long.valueOf(j2);
                            bbgVar = (bbg) cloVarO2.i();
                        } else if (i8 != i5) {
                            if (i8 == 3) {
                                i2 = i3;
                                clo cloVarO3 = bbg.a.o();
                                String str5 = akvVar.a;
                                if (!cloVarO3.b.A()) {
                                    cloVarO3.l();
                                }
                                clt cltVar5 = cloVarO3.b;
                                bbg bbgVar4 = (bbg) cltVar5;
                                str5.getClass();
                                bbgVar4.b |= 1;
                                bbgVar4.e = str5;
                                if (i8 != 3) {
                                    throw new IllegalArgumentException("Not a double type");
                                }
                                double d = akvVar.d;
                                if (!cltVar5.A()) {
                                    cloVarO3.l();
                                }
                                bbg bbgVar5 = (bbg) cloVarO3.b;
                                bbgVar5.c = 3;
                                bbgVar5.d = Double.valueOf(d);
                                bbgVar = (bbg) cloVarO3.i();
                            } else if (i8 == i4) {
                                i2 = i3;
                                clo cloVarO4 = bbg.a.o();
                                String str6 = akvVar.a;
                                if (!cloVarO4.b.A()) {
                                    cloVarO4.l();
                                }
                                bbg bbgVar6 = (bbg) cloVarO4.b;
                                str6.getClass();
                                bbgVar6.b |= 1;
                                bbgVar6.e = str6;
                                if (i8 != i4) {
                                    throw new IllegalArgumentException("Not a String type");
                                }
                                String str7 = akvVar.e;
                                qp.p(str7);
                                if (!cloVarO4.b.A()) {
                                    cloVarO4.l();
                                }
                                bbg bbgVar7 = (bbg) cloVarO4.b;
                                bbgVar7.c = i4;
                                bbgVar7.d = str7;
                                bbgVar = (bbg) cloVarO4.i();
                            } else {
                                if (i8 != 5) {
                                    throw new IllegalArgumentException(b.e(i8, "Unrecognized flag type: "));
                                }
                                clo cloVarO5 = bbg.a.o();
                                String str8 = akvVar.a;
                                i2 = i3;
                                if (!cloVarO5.b.A()) {
                                    cloVarO5.l();
                                }
                                bbg bbgVar8 = (bbg) cloVarO5.b;
                                str8.getClass();
                                bbgVar8.b |= 1;
                                bbgVar8.e = str8;
                                if (i8 != 5) {
                                    throw new IllegalArgumentException("Not a bytes type");
                                }
                                byte[] bArr2 = akvVar.f;
                                qp.p(bArr2);
                                ckv ckvVarP2 = ckv.p(bArr2);
                                if (!cloVarO5.b.A()) {
                                    cloVarO5.l();
                                }
                                bbg bbgVar9 = (bbg) cloVarO5.b;
                                bbgVar9.c = 5;
                                bbgVar9.d = ckvVarP2;
                                bbgVar = (bbg) cloVarO5.i();
                            }
                            i3 = i2;
                            i = 2;
                        } else {
                            int i10 = i3;
                            clo cloVarO6 = bbg.a.o();
                            String str9 = akvVar.a;
                            if (!cloVarO6.b.A()) {
                                cloVarO6.l();
                            }
                            clt cltVar6 = cloVarO6.b;
                            bbg bbgVar10 = (bbg) cltVar6;
                            str9.getClass();
                            bbgVar10.b |= 1;
                            bbgVar10.e = str9;
                            i = 2;
                            if (i8 != 2) {
                                throw new IllegalArgumentException("Not a boolean type");
                            }
                            boolean z2 = akvVar.c;
                            if (!cltVar6.A()) {
                                cloVarO6.l();
                            }
                            bbg bbgVar11 = (bbg) cloVarO6.b;
                            bbgVar11.c = 2;
                            bbgVar11.d = Boolean.valueOf(z2);
                            bbgVar = (bbg) cloVarO6.i();
                            i3 = i10;
                        }
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        bbf bbfVar6 = (bbf) cloVarO.b;
                        bbgVar.getClass();
                        cme cmeVar = bbfVar6.f;
                        if (!cmeVar.c()) {
                            bbfVar6.f = clt.t(cmeVar);
                        }
                        bbfVar6.f.add(bbgVar);
                        i7++;
                        i5 = i;
                        i4 = 4;
                    }
                    int i11 = i5;
                    String[] strArr = akoVar.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (!cloVarO.b.A()) {
                                cloVarO.l();
                            }
                            bbf bbfVar7 = (bbf) cloVarO.b;
                            str10.getClass();
                            cme cmeVar2 = bbfVar7.g;
                            if (!cmeVar2.c()) {
                                bbfVar7.g = clt.t(cmeVar2);
                            }
                            bbfVar7.g.add(str10);
                        }
                    }
                    i6++;
                    i5 = i11;
                    i4 = 4;
                }
                return (bbf) cloVarO.i();
            }
        };
        amn amnVar = new amn();
        amn amnVar2 = (amn) amiVarC;
        amnVar2.e.g(new amb(chzVar, alxVar, amnVar, 1));
        amnVar2.j();
        return chk.h(asv.e(amnVar), new byb() { // from class: bdi
            @Override // defpackage.byb
            public final Object a(Object obj3) {
                bbf bbfVar = (bbf) obj3;
                clo cloVarO = bdm.a.o();
                if (bbfVar == null) {
                    return (bdm) cloVarO.i();
                }
                for (bbg bbgVar : bbfVar.f) {
                    clo cloVarO2 = bdn.a.o();
                    String str2 = bbgVar.e;
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    clt cltVar = cloVarO2.b;
                    bdn bdnVar = (bdn) cltVar;
                    str2.getClass();
                    bdnVar.b |= 1;
                    bdnVar.e = str2;
                    int i = bbgVar.c;
                    int iA = awo.a(i);
                    if (iA == 0) {
                        throw null;
                    }
                    int i2 = iA - 1;
                    if (i2 == 0) {
                        long jLongValue = i == 1 ? ((Long) bbgVar.d).longValue() : 0L;
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bdn bdnVar2 = (bdn) cloVarO2.b;
                        bdnVar2.c = 2;
                        bdnVar2.d = Long.valueOf(jLongValue);
                    } else if (i2 == 1) {
                        boolean zBooleanValue = i == 2 ? ((Boolean) bbgVar.d).booleanValue() : false;
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bdn bdnVar3 = (bdn) cloVarO2.b;
                        bdnVar3.c = 3;
                        bdnVar3.d = Boolean.valueOf(zBooleanValue);
                    } else if (i2 == 2) {
                        double dDoubleValue = i == 3 ? ((Double) bbgVar.d).doubleValue() : 0.0d;
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bdn bdnVar4 = (bdn) cloVarO2.b;
                        bdnVar4.c = 4;
                        bdnVar4.d = Double.valueOf(dDoubleValue);
                    } else if (i2 == 3) {
                        String str3 = i == 4 ? (String) bbgVar.d : "";
                        if (!cltVar.A()) {
                            cloVarO2.l();
                        }
                        bdn bdnVar5 = (bdn) cloVarO2.b;
                        str3.getClass();
                        bdnVar5.c = 5;
                        bdnVar5.d = str3;
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        ckv ckvVar = i == 5 ? (ckv) bbgVar.d : ckv.b;
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bdn bdnVar6 = (bdn) cloVarO2.b;
                        ckvVar.getClass();
                        bdnVar6.c = 6;
                        bdnVar6.d = ckvVar;
                    }
                    bdn bdnVar7 = (bdn) cloVarO2.i();
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bdm bdmVar = (bdm) cloVarO.b;
                    bdnVar7.getClass();
                    cme cmeVar = bdmVar.g;
                    if (!cmeVar.c()) {
                        bdmVar.g = clt.t(cmeVar);
                    }
                    bdmVar.g.add(bdnVar7);
                }
                String str4 = bbfVar.e;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                clt cltVar2 = cloVarO.b;
                bdm bdmVar2 = (bdm) cltVar2;
                str4.getClass();
                bdmVar2.b = 4 | bdmVar2.b;
                bdmVar2.e = str4;
                String str5 = bbfVar.c;
                if (!cltVar2.A()) {
                    cloVarO.l();
                }
                clt cltVar3 = cloVarO.b;
                bdm bdmVar3 = (bdm) cltVar3;
                str5.getClass();
                bdmVar3.b = 1 | bdmVar3.b;
                bdmVar3.c = str5;
                long j = bbfVar.i;
                if (!cltVar3.A()) {
                    cloVarO.l();
                }
                clt cltVar4 = cloVarO.b;
                bdm bdmVar4 = (bdm) cltVar4;
                bdmVar4.b |= 8;
                bdmVar4.f = j;
                if ((bbfVar.b & 2) != 0) {
                    ckv ckvVar2 = bbfVar.d;
                    if (!cltVar4.A()) {
                        cloVarO.l();
                    }
                    bdm bdmVar5 = (bdm) cloVarO.b;
                    ckvVar2.getClass();
                    bdmVar5.b |= 2;
                    bdmVar5.d = ckvVar2;
                }
                return (bdm) cloVarO.i();
            }
        }, bavVar.b());
    }

    public final cja b(bdm bdmVar) {
        return qm.N(new awe(this, bdmVar, 2), ((bav) this.b).b());
    }

    public final boolean c() {
        Object obj = this.b;
        cjv cjvVar = cjv.FILE;
        bdp bdpVar = ((bav) obj).f;
        if (this.a) {
            bbt bbtVarB = bdpVar.b();
            return bbtVarB.e && new cmc(bbtVarB.i, bbt.a).contains(cjvVar);
        }
        bbr bbrVarA = bdpVar.a();
        return bbrVarA.e && new cmc(bbrVarA.j, bbr.a).contains(cjvVar);
    }

    public bdl(bav bavVar, String str, String str2, boolean z) {
        this.b = bavVar;
        this.d = str;
        this.e = str2;
        this.a = z;
        Context context = bavVar.d;
        Pattern pattern = beq.a;
        bep bepVar = new bep(context);
        bepVar.c("phenotype");
        bepVar.d(str2 + "/" + str + ".pb");
        if (z) {
            int i = apr.a;
            bepVar.b();
        }
        this.c = bepVar.a();
    }
}
