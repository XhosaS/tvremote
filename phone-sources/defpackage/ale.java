package defpackage;

import androidx.glance.session.SessionWorker;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ale extends yiz implements yjz {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(alg algVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = algVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((ale) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((ale) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((ale) create((dcq) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((ale) create((dnv) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((ale) create((dss) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((ale) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((ale) create(obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((ale) create((List) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((ale) create((ixv) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((ale) create((wnf) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((ale) create((jlh) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((ale) create((jlt) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((ale) create((ixv) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((ale) create((iya) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((ale) create((wfo) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((ale) create((mpi) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((ale) create((mpu) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((ale) create((mpi) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((ale) create((mpu) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((ale) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.c) {
            case 0:
                ale aleVar = new ale((alg) this.a, yihVar, 0);
                aleVar.b = obj;
                return aleVar;
            case 1:
                ale aleVar2 = new ale((uof) this.a, yihVar, 1);
                aleVar2.b = obj;
                return aleVar2;
            case 2:
                ale aleVar3 = new ale((dcq) this.a, yihVar, 2);
                aleVar3.b = obj;
                return aleVar3;
            case 3:
                ale aleVar4 = new ale((dmc) this.a, yihVar, 3);
                aleVar4.b = obj;
                return aleVar4;
            case 4:
                ale aleVar5 = new ale((SessionWorker) this.a, yihVar, 4);
                aleVar5.b = obj;
                return aleVar5;
            case 5:
                ale aleVar6 = new ale((dvf) this.a, yihVar, 5);
                aleVar6.b = obj;
                return aleVar6;
            case 6:
                ale aleVar7 = new ale((ity) this.a, yihVar, 6);
                aleVar7.b = obj;
                return aleVar7;
            case 7:
                ale aleVar8 = new ale((isw) this.a, yihVar, 7);
                aleVar8.b = obj;
                return aleVar8;
            case 8:
                ale aleVar9 = new ale((iym) this.a, yihVar, 8);
                aleVar9.b = obj;
                return aleVar9;
            case 9:
                ale aleVar10 = new ale((jah) this.a, yihVar, 9);
                aleVar10.b = obj;
                return aleVar10;
            case 10:
                ale aleVar11 = new ale((jli) this.a, yihVar, 10);
                aleVar11.b = obj;
                return aleVar11;
            case 11:
                ale aleVar12 = new ale((jlu) this.a, yihVar, 11);
                aleVar12.b = obj;
                return aleVar12;
            case 12:
                ale aleVar13 = new ale((jok) this.a, yihVar, 12);
                aleVar13.b = obj;
                return aleVar13;
            case 13:
                ale aleVar14 = new ale((jra) this.a, yihVar, 13);
                aleVar14.b = obj;
                return aleVar14;
            case 14:
                ale aleVar15 = new ale((EntityPageActivity) this.a, yihVar, 14);
                aleVar15.b = obj;
                return aleVar15;
            case 15:
                ale aleVar16 = new ale((mok) this.a, yihVar, 15);
                aleVar16.b = obj;
                return aleVar16;
            case 16:
                ale aleVar17 = new ale((mok) this.a, yihVar, 16, (byte[]) null);
                aleVar17.b = obj;
                return aleVar17;
            case 17:
                ale aleVar18 = new ale((mpb) this.a, yihVar, 17);
                aleVar18.b = obj;
                return aleVar18;
            case 18:
                ale aleVar19 = new ale((mpb) this.a, yihVar, 18, (byte[]) null);
                aleVar19.b = obj;
                return aleVar19;
            default:
                ale aleVar20 = new ale((qxh) this.a, yihVar, 19);
                aleVar20.b = obj;
                return aleVar20;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [dvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        switch (this.c) {
            case 0:
                ybn.f(obj);
                yow yowVar = (yow) this.b;
                alg algVar = (alg) this.a;
                ykr.q(yowVar, null, 0, new ajn(algVar, (yih) null, 4, (byte[]) null), 3);
                break;
            case 1:
                ybn.f(obj);
                yow yowVar2 = (yow) this.b;
                uof uofVar = (uof) this.a;
                AtomicReference atomicReference = (AtomicReference) uofVar.c;
                break;
            case 2:
                ybn.f(obj);
                dcq dcqVar = (dcq) this.b;
                break;
            case 3:
                ybn.f(obj);
                dnv dnvVar = (dnv) this.b;
                dpc dpcVar = (dpc) dnvVar.a(5);
                if (!dpcVar.a.equals(dnvVar)) {
                    dpcVar.f();
                    dpc.g(dpcVar.b, dnvVar);
                }
                int i = ((dnv) dpcVar.b).nextIndex_;
                dpcVar.f();
                ((dnv) dpcVar.b).nextIndex_ = i;
                dpcVar.f();
                ((dnv) dpcVar.b).layout_ = dqi.a;
                dmc dmcVar = (dmc) this.a;
                for (Map.Entry entry : dmcVar.a.entrySet()) {
                    dnx dnxVar = (dnx) entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    if (dmcVar.b.contains(new Integer(iIntValue))) {
                        dpc dpcVarH = dnw.DEFAULT_INSTANCE.h();
                        dpcVarH.f();
                        dnw dnwVar = (dnw) dpcVarH.b;
                        dnxVar.getClass();
                        dnwVar.layout_ = dnxVar;
                        dnwVar.bitField0_ |= 1;
                        dpcVarH.f();
                        ((dnw) dpcVarH.b).layoutIndex_ = iIntValue;
                        dpcVar.f();
                        dnv dnvVar2 = (dnv) dpcVar.b;
                        dnw dnwVar2 = (dnw) dpcVarH.c();
                        dnwVar2.getClass();
                        dpj<dnw> dpjVar = dnvVar2.layout_;
                        if (!dpjVar.c()) {
                            dnvVar2.layout_ = dpf.l(dpjVar);
                        }
                        dnvVar2.layout_.add(dnwVar2);
                    }
                }
                break;
            case 4:
                ybn.f(obj);
                break;
            case 5:
                ybn.f(obj);
                yow yowVar3 = (yow) this.b;
                ?? r0 = this.a;
                dve dveVar = ((dvf) r0).a;
                if (dveVar.a().compareTo(dvd.b) >= 0) {
                    dveVar.c(r0);
                } else {
                    yoz.x(yowVar3.c(), null);
                }
                break;
            case 6:
                ybn.f(obj);
                Object obj2 = this.b;
                ity ityVar = (ity) this.a;
                break;
            case 7:
                ybn.f(obj);
                List list = (List) this.b;
                ArrayList arrayList = new ArrayList(yfm.z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new iog((wll) it.next(), ((isw) this.a).r()));
                }
                break;
            case 8:
                ybn.f(obj);
                ((iym) this.a).a.c(((ixv) this.b).a);
                break;
            case 9:
                ybn.f(obj);
                ((jah) this.a).b((wnf) this.b);
                break;
            case 10:
                ybn.f(obj);
                boolean z = ((jlh) this.b).a;
                Object obj3 = this.a;
                ((jli) obj3).d = z;
                ((sbt) obj3).z();
                break;
            case 11:
                ybn.f(obj);
                boolean z2 = ((jlt) this.b).a;
                Object obj4 = this.a;
                ((jlu) obj4).e = z2;
                ((sbt) obj4).z();
                break;
            case 12:
                ybn.f(obj);
                ((jok) this.a).d.c(((ixv) this.b).a);
                break;
            case 13:
                ybn.f(obj);
                iya iyaVar = (iya) this.b;
                iyd iydVar = ((iym) this.a).a.a;
                iydVar.getClass();
                jrk jrkVar = (jrk) iydVar;
                jrkVar.n = iyaVar.a;
                jrkVar.k(false);
                break;
            case 14:
                ybn.f(obj);
                ((EntityPageActivity) this.a).j().setBackgroundColor(((wfo) this.b).s());
                break;
            case 15:
                ybn.f(obj);
                String str = ((mpi) this.b).a;
                mok mokVar = (mok) this.a;
                mokVar.a.edit().putString("MOVIES_SORT_OPTIONS", str).apply();
                mokVar.a();
                break;
            case 16:
                ybn.f(obj);
                String str2 = ((mpu) this.b).a;
                Object obj5 = this.a;
                ((mok) obj5).a.edit().putString("MOVIES_VIEW_OPTIONS", str2).apply();
                ((sbt) obj5).z();
                break;
            case 17:
                ybn.f(obj);
                String str3 = ((mpi) this.b).a;
                mpb mpbVar = (mpb) this.a;
                mpbVar.a.edit().putString("SHOWS_SORT_OPTIONS", str3).apply();
                mpbVar.a();
                break;
            case 18:
                ybn.f(obj);
                String str4 = ((mpu) this.b).a;
                Object obj6 = this.a;
                ((mpb) obj6).a.edit().putString("SHOWS_VIEW_OPTIONS", str4).apply();
                ((sbt) obj6).z();
                break;
            default:
                ybn.f(obj);
                yow yowVar4 = (yow) this.b;
                qxh qxhVar = (qxh) this.a;
                yvc yvcVar = qxhVar.i;
                yvcVar.e(vqp.a((vqp) yvcVar.d(), false, null, false, 6));
                ykr.q(yowVar4, null, 0, new kim(qxhVar, (yih) null, 3), 3);
                ykr.q(yowVar4, null, 0, new oza(qxhVar, (yih) null, 16, (byte[]) null), 3);
                ykr.q(yowVar4, null, 0, new oza(qxhVar, (yih) null, 17, (char[]) null), 3);
                ykr.q(yowVar4, null, 0, new oza(qxhVar, (yih) null, 18, (short[]) null), 3);
                ykr.q(yowVar4, null, 0, new oza(qxhVar, (yih) null, 19, (int[]) null), 3);
                ykr.q(yowVar4, null, 0, new oza(qxhVar, (yih) null, 20, (boolean[]) null), 3);
                break;
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(SessionWorker sessionWorker, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = sessionWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(EntityPageActivity entityPageActivity, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = entityPageActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(dcq dcqVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = dcqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(dmc dmcVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = dmcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(dvf dvfVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = dvfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(isw iswVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = iswVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(ity ityVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = ityVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(iym iymVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = iymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(jah jahVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = jahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(jli jliVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = jliVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(jlu jluVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = jluVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(jok jokVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = jokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(jra jraVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = jraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(mok mokVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = mokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(mok mokVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.a = mokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(mpb mpbVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = mpbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(mpb mpbVar, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.c = i;
        this.a = mpbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(qxh qxhVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = qxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ale(uof uofVar, yih yihVar, int i) {
        super(2, yihVar);
        this.c = i;
        this.a = uofVar;
    }
}
