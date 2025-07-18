package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import com.google.common.collect.FluentIterable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqv implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public lqv(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.c) {
            case 0:
                return new lqs((lql) this.a.b(), (moz) this.b.b(), 2);
            case 1:
                return new lqs((lql) this.a.b(), (moz) this.b.b(), 0);
            case 2:
                return new ltp((lql) this.a.b(), this.b, 1);
            case 3:
                final lql lqlVar = (lql) this.b.b();
                final lrs lrsVarB = ((lrt) this.a).b();
                return new idf() { // from class: lrq
                    @Override // defpackage.idf
                    public final Object b(Object obj) {
                        lrr lrrVar = (lrr) obj;
                        ksn ksnVar = lrrVar.b;
                        lrs lrsVar = lrsVarB;
                        vdn vdnVarC = lrsVar.c.c(ksnVar);
                        vtw vtwVarM = vyz.a.m();
                        val valVarO = kgu.o(lrrVar.f);
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        vyz vyzVar = (vyz) vtwVarM.b;
                        valVarO.getClass();
                        vyzVar.e = valVarO;
                        vyzVar.b |= 1;
                        int i = lrrVar.a;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    krd.c("Unsupported key request type");
                                } else {
                                    vtw vtwVarM2 = vyx.a.m();
                                    vtl vtlVarD = vxd.d(lrrVar.e);
                                    if (!vtwVarM2.b.A()) {
                                        vtwVarM2.u();
                                    }
                                    vyx vyxVar = (vyx) vtwVarM2.b;
                                    vtlVarD.getClass();
                                    vyxVar.c = vtlVarD;
                                    vyxVar.b |= 1;
                                    if (!vtwVarM.b.A()) {
                                        vtwVarM.u();
                                    }
                                    vyz vyzVar2 = (vyz) vtwVarM.b;
                                    vyx vyxVar2 = (vyx) vtwVarM2.r();
                                    vyxVar2.getClass();
                                    vyzVar2.d = vyxVar2;
                                    vyzVar2.c = 5;
                                }
                            } else if (lrrVar.d) {
                                vtw vtwVarM3 = vyy.a.m();
                                vtl vtlVarD2 = vxd.d(lrrVar.e);
                                if (!vtwVarM3.b.A()) {
                                    vtwVarM3.u();
                                }
                                vyy vyyVar = (vyy) vtwVarM3.b;
                                vtlVarD2.getClass();
                                vyyVar.c = vtlVarD2;
                                vyyVar.b |= 1;
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                vyz vyzVar3 = (vyz) vtwVarM.b;
                                vyy vyyVar2 = (vyy) vtwVarM3.r();
                                vyyVar2.getClass();
                                vyzVar3.d = vyyVar2;
                                vyzVar3.c = 4;
                            } else {
                                vtw vtwVarM4 = vyv.a.m();
                                vtl vtlVarD3 = vxd.d(lrrVar.e);
                                if (!vtwVarM4.b.A()) {
                                    vtwVarM4.u();
                                }
                                vyv vyvVar = (vyv) vtwVarM4.b;
                                vtlVarD3.getClass();
                                vyvVar.c = vtlVarD3;
                                vyvVar.b |= 1;
                                if (lrsVar.b.cp()) {
                                    vtl vtlVar = lrs.a;
                                    if (!vtwVarM4.b.A()) {
                                        vtwVarM4.u();
                                    }
                                    vyv vyvVar2 = (vyv) vtwVarM4.b;
                                    vtlVar.getClass();
                                    vyvVar2.d = vtlVar;
                                    vyvVar2.b |= 2;
                                }
                                if (!vtwVarM.b.A()) {
                                    vtwVarM.u();
                                }
                                vyz vyzVar4 = (vyz) vtwVarM.b;
                                vyv vyvVar3 = (vyv) vtwVarM4.r();
                                vyvVar3.getClass();
                                vyzVar4.d = vyvVar3;
                                vyzVar4.c = 3;
                            }
                        } else if (lrrVar.g) {
                            vyu vyuVar = vyu.a;
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            vyz vyzVar5 = (vyz) vtwVarM.b;
                            vyuVar.getClass();
                            vyzVar5.d = vyuVar;
                            vyzVar5.c = 2;
                        } else {
                            vyw vywVar = vyw.a;
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            vyz vyzVar6 = (vyz) vtwVarM.b;
                            vywVar.getClass();
                            vyzVar6.d = vywVar;
                            vyzVar6.c = 1;
                        }
                        vyz vyzVar7 = (vyz) vtwVarM.r();
                        vtw vtwVarM5 = vzc.a.m();
                        vsz vszVarQ = vsz.q(lrrVar.c.b);
                        if (!vtwVarM5.b.A()) {
                            vtwVarM5.u();
                        }
                        ((vzc) vtwVarM5.b).b = vszVarQ;
                        vzc vzcVar = (vzc) vtwVarM5.r();
                        vtw vtwVarM6 = vzd.a.m();
                        if (!vtwVarM6.b.A()) {
                            vtwVarM6.u();
                        }
                        vuc vucVar = vtwVarM6.b;
                        vzd vzdVar = (vzd) vucVar;
                        vdnVarC.getClass();
                        vzdVar.c = vdnVarC;
                        vzdVar.b |= 1;
                        if (!vucVar.A()) {
                            vtwVarM6.u();
                        }
                        vuc vucVar2 = vtwVarM6.b;
                        vzd vzdVar2 = (vzd) vucVar2;
                        vyzVar7.getClass();
                        vzdVar2.d = vyzVar7;
                        vzdVar2.b |= 2;
                        if (!vucVar2.A()) {
                            vtwVarM6.u();
                        }
                        lql lqlVar2 = lqlVar;
                        vzd vzdVar3 = (vzd) vtwVarM6.b;
                        vzcVar.getClass();
                        vzdVar3.e = vzcVar;
                        vzdVar3.b |= 4;
                        vzd vzdVar4 = (vzd) vtwVarM6.r();
                        ieg iegVarB = lqlVar2.b(ksnVar, vzdVar4, ves.a(), new lqp(14));
                        if (iegVarB.m() && ((vzf) iegVarB.g()).b == 2) {
                            krd.c(String.format("License request %s to %s on %s failed", vzdVar4, ves.a().b, lqlVar2.a.bn()));
                        }
                        return iegVarB.e(new idf() { // from class: lrp
                            @Override // defpackage.idf
                            public final Object b(Object obj2) {
                                int iBb;
                                lzk lzkVar;
                                int iBb2;
                                vzf vzfVar = (vzf) obj2;
                                int i2 = vzfVar.b;
                                if (i2 == 3) {
                                    nwo nwoVarA = lru.a();
                                    nwoVarA.l(ieg.f((vzfVar.b == 3 ? (vze) vzfVar.c : vze.a).c.w()));
                                    nwoVarA.m(FluentIterable.from((vzfVar.b == 3 ? (vze) vzfVar.c : vze.a).b).transform(new lpn(10)).filter(new efc(19)).transform(new lpn(11)).toList());
                                    return nwoVarA.k();
                                }
                                int iAO = 2;
                                if (i2 != 2) {
                                    nwo nwoVarA2 = lru.a();
                                    nwoVarA2.l(ieg.a);
                                    return nwoVarA2.k();
                                }
                                vzb vzbVar = (vzb) vzfVar.c;
                                int i3 = vzbVar.b;
                                int iAM = a.aM(i3);
                                if (iAM == 0) {
                                    throw null;
                                }
                                int i4 = iAM - 1;
                                if (i4 == 0) {
                                    if (i3 == 2) {
                                        iBb = a.bb(((Integer) vzbVar.c).intValue());
                                        if (iBb == 0) {
                                            iBb = 1;
                                        }
                                    } else {
                                        iBb = 2;
                                    }
                                    int i5 = iBb - 2;
                                    lzkVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 5 ? i5 != 6 ? new lzk(-1) : new lzk(502) : new lzk(501) : new lzk(403) : new lzk(400) : new lzk(500);
                                } else if (i4 == 1) {
                                    if (i3 == 3 && (iAO = a.aO(((Integer) vzbVar.c).intValue())) == 0) {
                                        iAO = 1;
                                    }
                                    switch (iAO - 2) {
                                        case 1:
                                            lzkVar = new lzk(kwx.JSON3);
                                            break;
                                        case 2:
                                            lzkVar = new lzk(301);
                                            break;
                                        case 3:
                                            lzkVar = new lzk(303);
                                            break;
                                        case 4:
                                            lzkVar = new lzk(304);
                                            break;
                                        case 5:
                                            lzkVar = new lzk(307);
                                            break;
                                        case 6:
                                            lzkVar = new lzk(308);
                                            break;
                                        default:
                                            lzkVar = new lzk(-1);
                                            break;
                                    }
                                } else if (i4 == 2) {
                                    if (i3 == 4) {
                                        iBb2 = a.bb(((Integer) vzbVar.c).intValue());
                                        if (iBb2 == 0) {
                                            iBb2 = 1;
                                        }
                                    } else {
                                        iBb2 = 2;
                                    }
                                    int i6 = iBb2 - 2;
                                    lzkVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? new lzk(-1) : new lzk(108) : new lzk(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu) : new lzk(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle) : new lzk(101) : new lzk(100);
                                } else if (i4 == 3) {
                                    if (i3 == 5 && (iAO = wae.b(((Integer) vzbVar.c).intValue())) == 0) {
                                        iAO = 1;
                                    }
                                    switch (iAO - 2) {
                                        case 1:
                                            lzkVar = new lzk(6100);
                                            break;
                                        case 2:
                                            lzkVar = new lzk(6101);
                                            break;
                                        case 3:
                                            lzkVar = new lzk(6102);
                                            break;
                                        case 4:
                                            lzkVar = new lzk(6103);
                                            break;
                                        case 5:
                                            lzkVar = new lzk(6104);
                                            break;
                                        case 6:
                                            lzkVar = new lzk(7000);
                                            break;
                                        case 7:
                                            lzkVar = new lzk(6105);
                                            break;
                                        case 8:
                                            lzkVar = new lzk(5000);
                                            break;
                                        case 9:
                                            lzkVar = new lzk(6106);
                                            break;
                                        case 10:
                                            lzkVar = new lzk(6107);
                                            break;
                                        case 11:
                                            lzkVar = new lzk(6000);
                                            break;
                                        default:
                                            lzkVar = new lzk(-1);
                                            break;
                                    }
                                } else {
                                    krd.e("Unknown license error");
                                    lzkVar = new lzk(-1);
                                }
                                nwo nwoVarA3 = lru.a();
                                nwoVarA3.l(ieg.b(lzkVar));
                                return nwoVarA3.k();
                            }
                        });
                    }
                };
            case 4:
                return new ltp((lql) this.a.b(), (moz) this.b.b(), 0);
            case 5:
                return new ltp((lql) this.a.b(), (moz) this.b.b(), 2);
            case 6:
                return new lqs((lql) this.a.b(), (moz) this.b.b(), 3);
            case 7:
                return new ltp((lql) this.a.b(), (moz) this.b.b(), 3);
            case 8:
                return new ltp((lql) this.a.b(), (moz) this.b.b(), 4);
            case 9:
                return new ltv((lql) this.a.b(), (moz) this.b.b());
            case 10:
                return new ltw((lql) this.a.b(), (moz) this.b.b());
            case 11:
                return new ltp((lql) this.a.b(), (moz) this.b.b(), 5);
            case 12:
                lxe lxeVar = (lxe) this.b.b();
                kmk kmkVarB = ((kml) this.a).b();
                gpa gpaVar = new gpa();
                gpaVar.b(lxeVar);
                gpaVar.b(kmkVarB);
                nxb nxbVar = new nxb();
                nxbVar.a = gpaVar;
                return new tae(nxbVar);
            case 13:
                Context contextA = ((rgq) this.a).a();
                gpz.e(contextA, (tae) this.b.b());
                return fki.aV(contextA);
            case 14:
                return lfb.b((String) this.b.b(), ".al", (Executor) this.a.b());
            case 15:
                idf idfVar = (idf) this.b.b();
                String str = (String) this.a.b();
                idh idhVarD = idh.d();
                idhVarD.e(new lbj(str, 6));
                idhVarD.e(idfVar);
                return idhVarD.b(new jxt(new lbj((vvq) xag.a.a(7, null), 13), 8));
            case 16:
                return lfb.b((String) this.b.b(), ".promo", (Executor) this.a.b());
            case 17:
                return lfb.b((String) this.b.b(), ".sr", (Executor) this.a.b());
            case 18:
                return lfb.b((String) this.b.b(), ".vc", (Executor) this.a.b());
            case 19:
                return new lxm((lxp) this.b.b(), this.a);
            default:
                return new kdh((lxk) this.a.b(), (kta) this.b.b());
        }
    }

    public lqv(xcq xcqVar, xcq xcqVar2, int i, short[] sArr) {
        this.c = i;
        this.b = xcqVar;
        this.a = xcqVar2;
    }
}
