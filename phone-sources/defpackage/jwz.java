package defpackage;

import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jwz implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jwz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v84, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v86, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjk
    public final Object a() {
        Object obj = null;
        int i = 0;
        switch (this.b) {
            case 0:
                wql wqlVar = wql.a;
                wqlVar.getClass();
                vvj vvjVarAn = jbr.an((dwi) this.a, "ai_overview_component", wqlVar);
                vvjVarAn.getClass();
                return (wql) vvjVarAn;
            case 1:
                bdn bdnVar = (bdn) this.a;
                if (bdnVar.e() > 0) {
                    bdnVar.h(bdnVar.e() - 1);
                }
                return ygi.a;
            case 2:
                wom womVar = ((jxa) this.a).e().b;
                if (womVar == null) {
                    womVar = wom.a;
                }
                vun vunVar = womVar.c;
                vunVar.getClass();
                ArrayList<wkx> arrayList = new ArrayList();
                for (Object obj2 : vunVar) {
                    wkw wkwVarB = wkw.b(((wkx) obj2).d);
                    if (wkwVarB == null) {
                        wkwVarB = wkw.TYPE_UNSPECIFIED;
                    }
                    if (wkwVarB == wkw.AI_STORY_COMPONENT) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
                for (wkx wkxVar : arrayList) {
                    vvd vvdVar = wqo.i;
                    wkxVar.i(vvdVar);
                    Object objK = wkxVar.l.k((vub) vvdVar.c);
                    if (objK == null) {
                        objK = vvdVar.b;
                    } else {
                        vvdVar.c(objK);
                    }
                    objK.getClass();
                    arrayList2.add((wqo) objK);
                }
                return arrayList2;
            case 3:
                wom womVar2 = ((jxa) this.a).e().b;
                if (womVar2 == null) {
                    womVar2 = wom.a;
                }
                vun vunVar2 = womVar2.c;
                vunVar2.getClass();
                Iterator<E> it = vunVar2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        wkw wkwVarB2 = wkw.b(((wkx) next).d);
                        if (wkwVarB2 == null) {
                            wkwVarB2 = wkw.TYPE_UNSPECIFIED;
                        }
                        if (wkwVarB2 == wkw.AI_STORY_HEADER) {
                            obj = next;
                        }
                    }
                }
                wkx wkxVar2 = (wkx) obj;
                if (wkxVar2 != null) {
                    vvd vvdVar2 = wqq.f;
                    wkxVar2.i(vvdVar2);
                    Object objK2 = wkxVar2.l.k((vub) vvdVar2.c);
                    if (objK2 == null) {
                        objK2 = vvdVar2.b;
                    } else {
                        vvdVar2.c(objK2);
                    }
                    wqq wqqVar = (wqq) objK2;
                    if (wqqVar != null) {
                        return wqqVar;
                    }
                }
                wqq wqqVar2 = wqq.a;
                wqqVar2.getClass();
                return wqqVar2;
            case 4:
                wom womVar3 = ((jxa) this.a).e().b;
                if (womVar3 == null) {
                    womVar3 = wom.a;
                }
                vun vunVar3 = womVar3.c;
                vunVar3.getClass();
                Iterator<E> it2 = vunVar3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        wkw wkwVarB3 = wkw.b(((wkx) next2).d);
                        if (wkwVarB3 == null) {
                            wkwVarB3 = wkw.TYPE_UNSPECIFIED;
                        }
                        if (wkwVarB3 == wkw.AI_STORY_FOOTER) {
                            obj = next2;
                        }
                    }
                }
                wkx wkxVar3 = (wkx) obj;
                if (wkxVar3 != null) {
                    vvd vvdVar3 = wqp.d;
                    wkxVar3.i(vvdVar3);
                    Object objK3 = wkxVar3.l.k((vub) vvdVar3.c);
                    if (objK3 == null) {
                        objK3 = vvdVar3.b;
                    } else {
                        vvdVar3.c(objK3);
                    }
                    wqp wqpVar = (wqp) objK3;
                    if (wqpVar != null) {
                        return wqpVar;
                    }
                }
                wqp wqpVar2 = wqp.a;
                wqpVar2.getClass();
                return wqpVar2;
            case 5:
                wqn wqnVar = ((jxa) this.a).f().c;
                if (wqnVar == null) {
                    wqnVar = wqn.a;
                }
                vun vunVar4 = wqnVar.b;
                vunVar4.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : vunVar4) {
                    wkw wkwVarB4 = wkw.b(((wkx) obj3).d);
                    if (wkwVarB4 == null) {
                        wkwVarB4 = wkw.TYPE_UNSPECIFIED;
                    }
                    if (wkwVarB4 == wkw.TVM_ENTITY_WATCHLIST) {
                        arrayList3.add(obj3);
                    }
                }
                wkx wkxVar4 = (wkx) arrayList3.get(0);
                vvd vvdVar4 = wvg.g;
                wkxVar4.i(vvdVar4);
                Object objK4 = wkxVar4.l.k((vub) vvdVar4.c);
                if (objK4 == null) {
                    objK4 = vvdVar4.b;
                } else {
                    vvdVar4.c(objK4);
                }
                return (wvg) objK4;
            case 6:
                jxa jxaVar = (jxa) this.a;
                isy isyVarJ = jxaVar.j();
                wvg wvgVarG = jxaVar.g();
                wvgVarG.getClass();
                return new bci(Boolean.valueOf(((isw) isyVarJ.d).t(isyVarJ.b(wvgVarG))), bcz.c);
            case 7:
                Long l = (Long) ((dwi) this.a).b("dynamic_seed_color");
                return Long.valueOf(l != null ? l.longValue() : 4279899936L);
            case 8:
                ((jxc) this.a).d();
                return ygi.a;
            case 9:
                this.a.b(Boolean.valueOf(true));
                return ygi.a;
            case 10:
                this.a.b(Boolean.valueOf(false));
                return ygi.a;
            case 11:
                return (String) ((ldy) ((isy) this.a).c).a().e(new jxt(new jxd(5), i)).h("");
            case 12:
                return a.w(this.a);
            case 13:
                return a.w(this.a);
            case 14:
                this.a.b(false);
                return ygi.a;
            case 15:
                this.a.b(false);
                return ygi.a;
            case 16:
                return a.w(this.a);
            case 17:
                return a.w(this.a);
            case 18:
                return a.w(this.a);
            case 19:
                return DeviceNotificationActivity.m111$r8$lambda$EbeTyYfS8rN1oNtoplLAhyi96I((DeviceNotificationActivity) this.a);
            default:
                return DeviceNotificationActivity.$r8$lambda$0QASWaop7K3vMQ2bFoFBPrEaEQU((DeviceNotificationActivity) this.a);
        }
    }
}
