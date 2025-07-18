package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ld implements bvt {
    public final lj a;

    public ld(lj ljVar) {
        this.a = ljVar;
    }

    @Override // defpackage.bvt
    public final int a(buz buzVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((buy) list.get(0)).c(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.bvt
    public final int b(buz buzVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((buy) list.get(0)).d(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.bvt
    public final int c(buz buzVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((buy) list.get(0)).e(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).e(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.bvt
    public final int d(buz buzVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((buy) list.get(0)).f(i));
            int iQ = yfm.q(list);
            if (iQ > 0) {
                int i2 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((buy) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iQ) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.bvt
    public final bvu e(bvv bvvVar, List list, long j) {
        bwj bwjVar;
        int i;
        bwj bwjVar2;
        int i2;
        int i3;
        int size = list.size();
        bwj[] bwjVarArr = new bwj[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            bwjVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            bvs bvsVar = (bvs) list.get(i4);
            Object objG = bvsVar.g();
            lf lfVar = objG instanceof lf ? (lf) objG : null;
            if (lfVar != null && ((Boolean) lfVar.a.a()).booleanValue()) {
                long j3 = r7.b & 4294967295L;
                bwjVarArr[i4] = bvsVar.u(j);
                j2 = j3 | (r7.a << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            bvs bvsVar2 = (bvs) list.get(i5);
            if (bwjVarArr[i5] == null) {
                bwjVarArr[i5] = bvsVar2.u(j);
            }
        }
        if (bvvVar.cA()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                bwjVar2 = null;
            } else {
                bwjVar2 = bwjVarArr[0];
                int iAM = yfm.aM(bwjVarArr);
                if (iAM != 0) {
                    int i6 = bwjVar2 != null ? bwjVar2.a : 0;
                    if (iAM > 0) {
                        int i7 = 1;
                        while (true) {
                            bwj bwjVar3 = bwjVarArr[i7];
                            int i8 = bwjVar3 != null ? bwjVar3.a : 0;
                            int i9 = i6 < i8 ? i8 : i6;
                            if (i6 < i8) {
                                bwjVar2 = bwjVar3;
                            }
                            if (i7 == iAM) {
                                break;
                            }
                            i7++;
                            i6 = i9;
                        }
                    }
                }
            }
            i2 = bwjVar2 != null ? bwjVar2.a : 0;
        }
        if (bvvVar.cA()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                bwjVar = bwjVarArr[0];
                int iAM2 = yfm.aM(bwjVarArr);
                if (iAM2 != 0) {
                    int i10 = bwjVar != null ? bwjVar.b : 0;
                    if (iAM2 > 0) {
                        while (true) {
                            bwj bwjVar4 = bwjVarArr[i];
                            int i11 = bwjVar4 != null ? bwjVar4.b : 0;
                            int i12 = i10 < i11 ? i11 : i10;
                            if (i10 < i11) {
                                bwjVar = bwjVar4;
                            }
                            if (i == iAM2) {
                                break;
                            }
                            i++;
                            i10 = i12;
                        }
                    }
                }
            }
            i3 = bwjVar != null ? bwjVar.b : 0;
        }
        if (!bvvVar.cA()) {
            this.a.c.b(new cmh((i2 << 32) | (i3 & 4294967295L)));
        }
        return bvvVar.cz(i2, i3, yhc.a, new lc(bwjVarArr, this, i2, i3));
    }
}
