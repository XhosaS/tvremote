package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aul implements bvt {
    final /* synthetic */ mr a;
    final /* synthetic */ ayy b;
    final /* synthetic */ bcb c;
    final /* synthetic */ bcb d;
    final /* synthetic */ bdl e;

    public aul(mr mrVar, ayy ayyVar, bcb bcbVar, bdl bdlVar, bcb bcbVar2) {
        this.a = mrVar;
        this.b = ayyVar;
        this.c = bcbVar;
        this.e = bdlVar;
        this.d = bcbVar2;
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int a(buz buzVar, List list, int i) {
        return fh.W(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int b(buz buzVar, List list, int i) {
        return fh.X(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int c(buz buzVar, List list, int i) {
        return fh.Y(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final /* synthetic */ int d(buz buzVar, List list, int i) {
        return fh.Z(this, buzVar, list, i);
    }

    @Override // defpackage.bvt
    public final bvu e(final bvv bvvVar, List list, final long j) {
        Object obj;
        final bwj bwjVarU;
        int i;
        int iA;
        aul aulVar = this;
        bvv bvvVar2 = bvvVar;
        long j2 = j;
        final float fFloatValue = ((Number) aulVar.a.d()).floatValue();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            bvs bvsVar = (bvs) list.get(i2);
            if (yks.e(bty.o(bvsVar), "InputField")) {
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    bvs bvsVar2 = (bvs) list.get(i3);
                    if (yks.e(bty.o(bvsVar2), "Surface")) {
                        int size3 = list.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i4);
                            if (yks.e(bty.o((bvs) obj), "Content")) {
                                break;
                            }
                            i4++;
                        }
                        bvs bvsVar3 = (bvs) obj;
                        int iD = aulVar.b.d(bvvVar2);
                        float f = aun.d;
                        final int iCu = iD + bvvVar2.cu(f);
                        int iCu2 = bvvVar2.cu(f);
                        int iC = clw.c(j2, bvsVar.d(clv.a(j2)));
                        int iB = clw.b(j2, bvsVar.e(clv.b(j2)));
                        int iB2 = clv.b(j2);
                        int iA2 = clv.a(j2);
                        final bcb bcbVar = aulVar.c;
                        int iV = yln.v(iB2 * 0.9f);
                        int iV2 = yln.v(iA2 * 0.9f);
                        fd fdVar = (fd) bcbVar.a();
                        float fE = aulVar.e.e();
                        float f2 = 0.0f;
                        if (fdVar != null) {
                            if (Float.isNaN(fE)) {
                                f2 = 1.0f;
                            } else if (fE > 0.0f) {
                                f2 = fFloatValue / fE;
                            }
                        }
                        final float f3 = f2;
                        int iG = cmq.g(iC, iV, f3);
                        int i5 = iCu + iB;
                        int iG2 = cmq.g(i5, iV2, f3);
                        int iB3 = clv.b(j2);
                        int iA3 = clv.a(j);
                        int iG3 = cmq.g(iG, iB3, fFloatValue);
                        final int iG4 = cmq.g(iG2, iA3, fFloatValue);
                        final int iG5 = cmq.g(iCu, 0, fFloatValue);
                        final int iG6 = cmq.g(0, iCu2, fFloatValue);
                        final bwj bwjVarU2 = bvsVar.u(clw.d(iG3, iB3, iB, iB));
                        int i6 = bwjVarU2.a;
                        final bwj bwjVarU3 = bvsVar2.u(clw.o(i6, iG4 - iG5));
                        if (bvsVar3 != null) {
                            if (clv.g(j)) {
                                i = 0;
                                iA = ykn.j(clv.a(j) - (i5 + iCu2), 0);
                            } else {
                                i = 0;
                                iA = clv.a(j);
                            }
                            bwjVarU = bvsVar3.u(clw.d(i6, i6, i, iA));
                        } else {
                            bwjVarU = null;
                        }
                        final bcb bcbVar2 = aulVar.d;
                        return bvvVar.cz(i6, iG4, yhc.a, new yjv() { // from class: auk
                            @Override // defpackage.yjv
                            public final Object a(Object obj2) {
                                int iV3;
                                bvv bvvVar3 = bvvVar;
                                bwi bwiVar = (bwi) obj2;
                                int iCu3 = bvvVar3.cu(aun.f);
                                bcb bcbVar3 = bcbVar;
                                fd fdVar2 = (fd) bcbVar3.a();
                                float f4 = f3;
                                long j3 = j;
                                cmi cmiVarN = bvvVar3.n();
                                int iV4 = 0;
                                if (fdVar2 == null || f4 == 0.0f) {
                                    iV3 = 0;
                                } else {
                                    iV3 = yln.v(((clv.b(j3) * 0.05f) - iCu3) * (1.0f - fFloatValue) * f4 * (fdVar2.c == 0 ? 1 : -1) * (cmiVarN != cmi.a ? -1 : 1));
                                }
                                bcb bcbVar4 = bcbVar2;
                                fd fdVar3 = (fd) bcbVar3.a();
                                fd fdVar4 = (fd) bcbVar4.a();
                                int iCu4 = bvvVar3.cu(aun.g);
                                if (fdVar4 != null && fdVar3 != null && f4 != 0.0f) {
                                    int iMin = Math.min(Math.max(0, ((clv.a(j3) - iG4) / 2) - iCu3), iCu4);
                                    int iA4 = clv.a(j3);
                                    iV4 = yln.v(cmq.g(0, iMin, Math.abs(r2) / iA4) * f4 * Math.signum(fdVar3.a - fdVar4.a));
                                }
                                bwj bwjVar = bwjVarU;
                                int i7 = iCu;
                                bwj bwjVar2 = bwjVarU2;
                                bwi.y(bwiVar, bwjVarU3, iV3, iG5 + iV4);
                                int i8 = iV4 + i7;
                                bwi.y(bwiVar, bwjVar2, iV3, i8);
                                if (bwjVar != null) {
                                    bwi.y(bwiVar, bwjVar, iV3, i8 + bwjVar2.b + iG6);
                                }
                                return ygi.a;
                            }
                        });
                    }
                    i3++;
                    aulVar = this;
                    bvvVar2 = bvvVar2;
                    j2 = j;
                }
                cmq.a("Collection contains no element matching the predicate.");
                throw new yfs();
            }
            i2++;
            aulVar = this;
            bvvVar2 = bvvVar2;
            j2 = j;
        }
        cmq.a("Collection contains no element matching the predicate.");
        throw new yfs();
    }
}
