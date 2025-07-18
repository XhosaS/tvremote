package defpackage;

import android.net.Uri;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lbf extends kzt {
    public static final lbf a = new lbf();

    private static ksy j(lbe lbeVar) {
        if ((lbeVar.b & 64) != 0) {
            kzu kzuVar = lbeVar.c;
            if (kzuVar == null) {
                kzuVar = kzu.a;
            }
            Collection collection = lbk.a;
            return ksy.e(kzuVar.b);
        }
        kzu kzuVar2 = lbeVar.c;
        if (kzuVar2 == null) {
            kzuVar2 = kzu.a;
        }
        Collection collection2 = lbk.a;
        return ksy.f(kzuVar2.b);
    }

    @Override // defpackage.kzt
    public final kus a(lbe lbeVar) {
        ksy ksyVarJ = j(lbeVar);
        kus kusVar = new kus(null);
        kusVar.a = ksyVarJ;
        kusVar.g("");
        kusVar.f("");
        kusVar.b(lcc.a);
        kusVar.e(Uri.EMPTY);
        kusVar.d();
        trk trkVar = trk.a;
        kusVar.f = trkVar;
        kusVar.a("");
        kusVar.c("");
        kusVar.j = trkVar;
        return kusVar;
    }

    @Override // defpackage.kzt
    public final void c(lbe lbeVar, kus kusVar) {
        kusVar.a = j(lbeVar);
    }

    @Override // defpackage.kzt
    public final void d(lbe lbeVar, kus kusVar) {
        int i;
        tst tstVarI;
        kzh kzhVar = lbeVar.f;
        if (kzhVar == null) {
            kzhVar = kzh.a;
        }
        int i2 = kzhVar.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 3;
        switch (i2) {
            case 0:
                i = 10;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                Uri uri = Uri.parse((i2 == 1 ? (lcr) kzhVar.c : lcr.a).b);
                uri.getClass();
                tstVarI = tst.i(new kxm(uri));
                break;
            case 1:
                tstVarI = tst.i(new kxn(new kye(i2 == 2 ? (String) kzhVar.c : "")));
                break;
            case 2:
                kyx kyxVar = i2 == 3 ? (kyx) kzhVar.c : kyx.a;
                if ((kyxVar.b & 1) != 0) {
                    kzl kzlVar = kyxVar.e;
                    if (kzlVar == null) {
                        kzlVar = kzl.a;
                    }
                    int i6 = kzlVar.b;
                    if (i6 == 6) {
                        kzl kzlVar2 = kyxVar.e;
                        if (kzlVar2 == null) {
                            kzlVar2 = kzl.a;
                        }
                        tstVarI = lpq.a(kzlVar2);
                        break;
                    } else if (i6 == 18) {
                        kzl kzlVar3 = kyxVar.e;
                        if (kzlVar3 == null) {
                            kzlVar3 = kzl.a;
                        }
                        ksy ksyVarC = ksy.c(kzlVar3.b, kzlVar3.c);
                        trk trkVar = trk.a;
                        tstVarI = tst.i(new kxo(new kxy(new kyh(ksyVarC, trkVar, trkVar, trkVar))));
                        break;
                    } else {
                        tstVarI = lpq.b("asset type not supported.");
                        break;
                    }
                } else {
                    int i7 = kyxVar.c;
                    int i8 = i7 != 0 ? i7 != 2 ? i7 != 3 ? 0 : 2 : 1 : 3;
                    int i9 = i8 - 1;
                    if (i8 == 0) {
                        throw null;
                    }
                    if (i9 == 0) {
                        tstVarI = lpq.a(i7 == 2 ? (kzl) kyxVar.d : kzl.a);
                        break;
                    } else if (i9 == 1) {
                        kyw kywVar = i7 == 3 ? (kyw) kyxVar.d : kyw.a;
                        boolean z = (kywVar.b & 4) != 0;
                        kzl kzlVar4 = kywVar.e;
                        if (kzlVar4 == null) {
                            kzlVar4 = kzl.a;
                        }
                        tst tstVarC = lpq.c(z, kzlVar4);
                        boolean z2 = (kywVar.b & 2) != 0;
                        kzl kzlVar5 = kywVar.d;
                        if (kzlVar5 == null) {
                            kzlVar5 = kzl.a;
                        }
                        tst tstVarC2 = lpq.c(z2, kzlVar5);
                        int i10 = kywVar.b & 1;
                        kzl kzlVar6 = kywVar.c;
                        if (kzlVar6 == null) {
                            kzlVar6 = kzl.a;
                        }
                        tst tstVarC3 = lpq.c(1 == i10, kzlVar6);
                        if (!tstVarC.g()) {
                            tstVarI = lpq.b("show asset id not provided for opening a show details page.");
                            break;
                        } else {
                            tstVarI = tst.i(new kxo(new kxy(new kyh((ksy) tstVarC.c(), tstVarC2, tstVarC3, trk.a))));
                            break;
                        }
                    } else {
                        tstVarI = lpq.b("asset type not supported.");
                        break;
                    }
                }
            case 3:
                int i11 = (i2 == 4 ? (kza) kzhVar.c : kza.a).b;
                if (i11 == 0) {
                    i4 = 3;
                } else if (i11 == 1) {
                    i4 = 1;
                } else if (i11 == 2) {
                    i4 = 2;
                }
                int i12 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i12 == 0) {
                    tstVarI = tst.i(new kxp(new kaf()));
                    break;
                } else if (i12 == 1) {
                    tstVarI = tst.i(new kxs(new kaf()));
                    break;
                } else {
                    tstVarI = lpq.b("asset type not supported for Guide page action.");
                    break;
                }
            case 4:
                kzc kzcVar = i2 == 5 ? (kzc) kzhVar.c : kzc.b;
                int iAs = a.as(kzcVar.c);
                if (iAs == 0) {
                    iAs = 1;
                }
                int i13 = iAs - 2;
                if (i13 == 1) {
                    tstVarI = lpq.d(kzcVar, 1);
                    break;
                } else if (i13 == 2) {
                    tstVarI = lpq.d(kzcVar, 2);
                    break;
                } else {
                    tstVarI = lpq.b("tab type not supported for Library page action.");
                    break;
                }
            case 5:
                tstVarI = tst.i(new kxt(new kaf()));
                break;
            case 6:
                int iAs2 = a.as((i2 == 7 ? (kzf) kzhVar.c : kzf.a).b);
                if (iAs2 == 0) {
                    iAs2 = 1;
                }
                int i14 = iAs2 - 2;
                if (i14 == 1) {
                    i5 = 2;
                } else if (i14 != 2) {
                    i5 = 1;
                }
                tstVarI = tst.i(new kxr(new kyk(i5)));
                break;
            case 7:
                kze kzeVar = i2 == 8 ? (kze) kzhVar.c : kze.a;
                int i15 = kzeVar.b;
                if (i15 == 0) {
                    i3 = 3;
                } else if (i15 == 2) {
                    i3 = 1;
                } else if (i15 == 3) {
                    i3 = 2;
                }
                int i16 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i16 == 0) {
                    kzl kzlVar7 = i15 == 2 ? (kzl) kzeVar.c : kzl.a;
                    if (kzlVar7.b != 5001) {
                        tstVarI = tst.i(new kxu(new kyb(new kyn(ksy.i(kzlVar7.c)))));
                        break;
                    } else {
                        tstVarI = tst.i(new kxu(new kyc(new kyo(ksy.m(kzlVar7.c)))));
                        break;
                    }
                } else if (i16 == 1) {
                    kzd kzdVar = i15 == 3 ? (kzd) kzeVar.c : kzd.a;
                    int i17 = kzdVar.b;
                    if ((i17 & 1) != 0 && (i17 & 2) != 0 && (i17 & 4) != 0) {
                        kzl kzlVar8 = kzdVar.c;
                        if (kzlVar8 == null) {
                            kzlVar8 = kzl.a;
                        }
                        ksy ksyVarH = ksy.h(kzlVar8.c);
                        kzl kzlVar9 = kzdVar.d;
                        if (kzlVar9 == null) {
                            kzlVar9 = kzl.a;
                        }
                        ksy ksyVarK = ksy.k(kzlVar9.c);
                        kzl kzlVar10 = kzdVar.e;
                        if (kzlVar10 == null) {
                            kzlVar10 = kzl.a;
                        }
                        tstVarI = tst.i(new kxu(new kya(new kym(ksyVarH, ksyVarK, ksy.l(kzlVar10.c)))));
                        break;
                    } else {
                        tstVarI = lpq.b("missing proto data. Make sure Episode details contains: Episode, season and show data.");
                        break;
                    }
                } else {
                    tstVarI = lpq.b("asset type not supported.");
                    break;
                }
            case 8:
                kzl kzlVar11 = (i2 == 9 ? (kyv) kzhVar.c : kyv.a).c;
                if (kzlVar11 == null) {
                    kzlVar11 = kzl.a;
                }
                tstVarI = tst.i(new kxl(new kxk(ksy.c(1, kzlVar11.c))));
                break;
            default:
                tstVarI = lpq.b("action type not supported");
                break;
        }
        kusVar.f = tstVarI;
    }

    @Override // defpackage.kzt
    public final void e(lbe lbeVar, kus kusVar) {
        lak lakVar = lbeVar.i;
        if (lakVar == null) {
            lakVar = lak.a;
        }
        kusVar.c(lakVar.b);
    }

    @Override // defpackage.kzt
    public final void f(lbe lbeVar, kus kusVar) {
        lcr lcrVar = lbeVar.g;
        if (lcrVar == null) {
            lcrVar = lcr.a;
        }
        kusVar.e(lbk.a(lcrVar));
    }

    @Override // defpackage.kzt
    public final void g(lbe lbeVar, kus kusVar) {
        lbd lbdVar = lbeVar.k;
        if (lbdVar == null) {
            lbdVar = lbd.a;
        }
        kusVar.j = tst.i(lbdVar.c);
    }

    @Override // defpackage.kzt
    public final void h(lbe lbeVar, kus kusVar) {
        String str;
        if ((lbeVar.b & 64) != 0) {
            lbd lbdVar = lbeVar.k;
            if (lbdVar == null) {
                lbdVar = lbd.a;
            }
            str = lbdVar.b;
        } else {
            lco lcoVar = lbeVar.j;
            if (lcoVar == null) {
                lcoVar = lco.a;
            }
            str = lcoVar.b;
        }
        kusVar.f(str);
    }

    @Override // defpackage.kzt
    public final void i(kus kusVar) {
        kusVar.d();
    }
}
