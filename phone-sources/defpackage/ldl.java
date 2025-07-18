package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldl implements tsl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [idf, java.lang.Object] */
    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                kte kteVar = (kte) obj;
                String str = kteVar.a;
                kzq kzqVar = kteVar.d;
                kzp kzpVar = kteVar.c;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ksg.c(str));
                Resources resources = (Resources) this.a;
                arrayList.add(krh.z(resources, kzqVar));
                arrayList.add(krh.y(resources, kzpVar));
                return jwq.D(resources, arrayList);
            case 1:
                return this.a;
            case 2:
                return ((cvi) this.a).c;
            case 3:
                return ((cvi) this.a).c;
            case 4:
                return ((cvi) this.a).c;
            case 5:
                return ((cvi) this.a).c;
            case 6:
                return ((cvi) this.a).c;
            case 7:
                return ((cvi) this.a).c;
            case 8:
                return ((cvi) this.a).c;
            case 9:
                return lqi.a((vat) obj, this.a);
            case 10:
                vau vauVar = (vau) obj;
                ImmutableList list = FluentIterable.from(gag.t(vauVar).b).filter(new efc(13)).transform(new tsl() { // from class: lqo
                    @Override // defpackage.tsl
                    public final Object apply(Object obj2) {
                        kwa kwaVar;
                        kwc kwcVar;
                        String str2;
                        kvm kvmVar;
                        kvn kvnVar;
                        kwb kwbVar;
                        int i2;
                        kwc kwcVar2;
                        vwe vweVar;
                        vwe vweVar2;
                        vdi vdiVar = (vdi) obj2;
                        vdh vdhVar = vdiVar.e;
                        if (vdhVar == null) {
                            vdhVar = vdh.a;
                        }
                        int iAK = a.aK(vdhVar.c);
                        if (iAK == 0) {
                            iAK = 1;
                        }
                        kvm kvmVarM = kir.m(iAK);
                        kvm kvmVar2 = kvm.TYPE_PURCHASE;
                        if (kvmVarM == kvmVar2) {
                            kwaVar = new kwa(null);
                            kwaVar.a(kvmVar2);
                        } else {
                            kvm kvmVar3 = kvm.TYPE_RENTAL;
                            if (kvmVarM == kvmVar3) {
                                vdm vdmVar = vdiVar.f;
                                if (vdmVar == null) {
                                    vdmVar = vdm.a;
                                }
                                int i3 = vdmVar.b;
                                if (i3 == 1) {
                                    vdl vdlVar = (vdl) vdmVar.c;
                                    vwe vweVar3 = vdlVar.e;
                                    if (vweVar3 == null) {
                                        vweVar3 = vwe.a;
                                    }
                                    vtl vtlVar = vdlVar.d;
                                    if (vtlVar == null) {
                                        vtlVar = vtl.a;
                                    }
                                    kwa kwaVar2 = new kwa(null);
                                    kwaVar2.a(kvmVar3);
                                    kwaVar2.b(vweVar3);
                                    kwaVar2.k = tst.i(vtlVar);
                                    kwaVar = kwaVar2;
                                } else {
                                    vwe vweVar4 = i3 == 2 ? (vwe) vdmVar.c : vwe.a;
                                    kwa kwaVar3 = new kwa(null);
                                    kwaVar3.a(kvmVar3);
                                    kwaVar3.b(vweVar4);
                                    kwaVar = kwaVar3;
                                }
                            } else {
                                kwaVar = new kwa(null);
                                kwaVar.a(kvm.TYPE_SUBSCRIPTION);
                            }
                        }
                        String str3 = vdiVar.d;
                        if (str3 == null) {
                            throw new NullPointerException("Null purchaseId");
                        }
                        kwaVar.a = str3;
                        vdh vdhVar2 = vdiVar.e;
                        if (vdhVar2 == null) {
                            vdhVar2 = vdh.a;
                        }
                        int iAK2 = a.aK(vdhVar2.d);
                        if (iAK2 == 0) {
                            iAK2 = 1;
                        }
                        kvn kvnVarN = kir.n(iAK2);
                        if (kvnVarN == null) {
                            throw new NullPointerException("Null quality");
                        }
                        kwaVar.c = kvnVarN;
                        int iAs = a.as(vdiVar.c);
                        if (iAs == 0) {
                            iAs = 1;
                        }
                        kwb kwbVarV = gag.v(iAs);
                        if (kwbVarV == null) {
                            throw new NullPointerException("Null purchaseStatus");
                        }
                        kwaVar.d = kwbVarV;
                        vdh vdhVar3 = vdiVar.e;
                        if (vdhVar3 == null) {
                            vdhVar3 = vdh.a;
                        }
                        int iAQ = a.aQ(vdhVar3.h);
                        if (iAQ == 0) {
                            iAQ = 1;
                        }
                        kwaVar.o = gag.w(iAQ);
                        if ((vdiVar.b & 4) != 0) {
                            vbt vbtVar = vdiVar.g;
                            if (vbtVar == null) {
                                vbtVar = vbt.a;
                            }
                            int i4 = vbtVar.b;
                            if (i4 == 2) {
                                kwcVar = kwc.SHARED_TO_FAMILY;
                            } else if (i4 == 3) {
                                kwcVar = kwc.SHARED_BY_FAMILY;
                            } else {
                                int iAQ2 = a.aQ(vbtVar.c);
                                if (iAQ2 == 0) {
                                    iAQ2 = 1;
                                }
                                kwcVar = iAQ2 + (-2) != 2 ? kwc.SHAREABLE : kwc.NOT_SHAREABLE;
                            }
                        } else {
                            kwcVar = kwc.INAPPLICABLE;
                        }
                        if (kwcVar == null) {
                            throw new NullPointerException("Null shareType");
                        }
                        kwaVar.g = kwcVar;
                        vdh vdhVar4 = vdiVar.e;
                        if (vdhVar4 == null) {
                            vdhVar4 = vdh.a;
                        }
                        vwe vweVar5 = vdhVar4.e;
                        if (vweVar5 == null) {
                            vweVar5 = vwe.a;
                        }
                        if (vweVar5 == null) {
                            throw new NullPointerException("Null purchaseTimestamp");
                        }
                        kwaVar.h = vweVar5;
                        vdh vdhVar5 = vdiVar.e;
                        if (vdhVar5 == null) {
                            vdhVar5 = vdh.a;
                        }
                        kwaVar.e = FluentIterable.from(vdhVar5.i).anyMatch(new efc(17));
                        kwaVar.n = (byte) (kwaVar.n | 1);
                        vdh vdhVar6 = vdiVar.e;
                        if (vdhVar6 == null) {
                            vdhVar6 = vdh.a;
                        }
                        kwaVar.f = FluentIterable.from(vdhVar6.i).filter(new efc(14)).anyMatch(new efc(15));
                        kwaVar.n = (byte) (kwaVar.n | 2);
                        vdh vdhVar7 = vdiVar.e;
                        vwe vweVar6 = (vdhVar7 == null ? vdh.a : vdhVar7).f;
                        if (vweVar6 == null) {
                            vweVar6 = vwe.a;
                        }
                        if (vweVar6 == null) {
                            throw new NullPointerException("Null addedToLibraryTimestamp");
                        }
                        kwaVar.i = vweVar6;
                        if (((vdhVar7 == null ? vdh.a : vdhVar7).b & 4) != 0) {
                            if (vdhVar7 == null) {
                                vdhVar7 = vdh.a;
                            }
                            vwe vweVar7 = vdhVar7.g;
                            if (vweVar7 == null) {
                                vweVar7 = vwe.a;
                            }
                            kwaVar.c(true);
                            kwaVar.m = tst.i(vweVar7);
                        } else {
                            kwaVar.c(false);
                        }
                        if (kwaVar.n == 7 && (str2 = kwaVar.a) != null && (kvmVar = kwaVar.b) != null && (kvnVar = kwaVar.c) != null && (kwbVar = kwaVar.d) != null && (i2 = kwaVar.o) != 0 && (kwcVar2 = kwaVar.g) != null && (vweVar = kwaVar.h) != null && (vweVar2 = kwaVar.i) != null) {
                            return new kwd(str2, kvmVar, kvnVar, kwbVar, kwaVar.e, kwaVar.f, i2, kwcVar2, vweVar, vweVar2, kwaVar.j, kwaVar.k, kwaVar.l, kwaVar.m);
                        }
                        StringBuilder sb = new StringBuilder();
                        if (kwaVar.a == null) {
                            sb.append(" purchaseId");
                        }
                        if (kwaVar.b == null) {
                            sb.append(" offerType");
                        }
                        if (kwaVar.c == null) {
                            sb.append(" quality");
                        }
                        if (kwaVar.d == null) {
                            sb.append(" purchaseStatus");
                        }
                        if ((1 & kwaVar.n) == 0) {
                            sb.append(" isBonusContent");
                        }
                        if ((kwaVar.n & 2) == 0) {
                            sb.append(" isHidden");
                        }
                        if (kwaVar.o == 0) {
                            sb.append(" purchaseSource");
                        }
                        if (kwaVar.g == null) {
                            sb.append(" shareType");
                        }
                        if (kwaVar.h == null) {
                            sb.append(" purchaseTimestamp");
                        }
                        if (kwaVar.i == null) {
                            sb.append(" addedToLibraryTimestamp");
                        }
                        if ((kwaVar.n & 4) == 0) {
                            sb.append(" wasUpgraded");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }).toList();
                val valVar = vauVar.b;
                if (valVar == null) {
                    valVar = val.a;
                }
                ksy ksyVarM = kgu.m(valVar);
                val valVar2 = vauVar.b;
                if (valVar2 == null) {
                    valVar2 = val.a;
                }
                lqr lqrVar = (lqr) this.a;
                tst tstVar = ((lqq) lqrVar.get(valVar2)).b;
                val valVar3 = vauVar.b;
                if (valVar3 == null) {
                    valVar3 = val.a;
                }
                tst tstVar2 = ((lqq) lqrVar.get(valVar3)).c;
                kwd kwdVar = (kwd) Collections.max(list);
                if (kwdVar != null) {
                    return new kwe(ksyVarM, tstVar, tstVar2, kwdVar);
                }
                throw new NullPointerException("Null purchaseDetails");
            case 11:
                vxp vxpVar = (vxp) obj;
                vaq vaqVar = vxpVar.b;
                if (vaqVar == null) {
                    vaqVar = vaq.a;
                }
                String str2 = vaqVar.b;
                if (str2 == null) {
                    throw new NullPointerException("Null id");
                }
                String str3 = vxpVar.e;
                if (str3 == null) {
                    throw new NullPointerException("Null description");
                }
                String str4 = vxpVar.d;
                if (str4 == null) {
                    throw new NullPointerException("Null name");
                }
                int iAQ = a.aQ(vxpVar.c);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i2 = iAQ - 2;
                if (i2 == 1) {
                    i = 2;
                } else if (i2 != 2) {
                    i = i2 == 3 ? 4 : 1;
                } else {
                    i = 3;
                }
                Object obj2 = this.a;
                ImmutableList immutableListP = kir.p(vxpVar.f);
                int i3 = ((ksz) obj2).b;
                Uri uriA = ksz.a(immutableListP, kuu.TYPE_LOGO, i3, i3, 0.0f);
                if (uriA != null) {
                    return new kxf(str2, i, str4, str3, uriA);
                }
                throw new NullPointerException("Null image");
            case 12:
                val valVar4 = (val) obj;
                vtw vtwVarM = law.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                Object obj3 = this.a;
                vuc vucVar = vtwVarM.b;
                law lawVar = (law) vucVar;
                obj3.getClass();
                lawVar.d = (lce) obj3;
                lawVar.b |= 1;
                String str5 = valVar4.c;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                law lawVar2 = (law) vtwVarM.b;
                str5.getClass();
                lawVar2.c = str5;
                return (law) vtwVarM.r();
            case 13:
                val valVar5 = (val) obj;
                vtw vtwVarM2 = lce.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                Object obj4 = this.a;
                vuc vucVar2 = vtwVarM2.b;
                lce lceVar = (lce) vucVar2;
                obj4.getClass();
                lceVar.d = (lch) obj4;
                lceVar.b |= 1;
                String str6 = valVar5.c;
                if (!vucVar2.A()) {
                    vtwVarM2.u();
                }
                lce lceVar2 = (lce) vtwVarM2.b;
                str6.getClass();
                lceVar2.c = str6;
                return (lce) vtwVarM2.r();
            case 14:
                kvf kvfVar = (kvf) obj;
                return tha.a(kvfVar.o().b, kvfVar.E(), (ieg) ((luq) this.a).c.b(kxd.c(kvfVar.g(), kvfVar.o().b)));
            case 15:
                kwn kwnVar = (kwn) obj;
                String str7 = kwnVar.d.b;
                return tha.c(str7, kwnVar.g, (ieg) ((luq) this.a).c.b(kxd.c(kwnVar.e, str7)));
            case 16:
                gli gliVar = (gli) obj;
                if (gliVar.equals(new gpj())) {
                    krd.c("Unable to schedule work for task with tags: ".concat(((MoviesWorkerWrapper) this.a).a.c.toString()));
                }
                return gliVar;
            case 17:
                krd.c("Unable to schedule work for task with tags: ".concat(((MoviesWorkerWrapper) this.a).a.c.toString()));
                return new gpj();
            case 18:
                return ((cvi) this.a).c;
            case 19:
                return ((cvi) this.a).c;
            default:
                return ((cvi) this.a).c;
        }
    }
}
