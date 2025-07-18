package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class imt extends xqv {
    final /* synthetic */ imu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imt(imu imuVar, xqb xqbVar) {
        super(xqbVar);
        this.a = imuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.xqw, defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        wbbVar.getClass();
        xsmVar.getClass();
        vtw vtwVarM = wkq.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = wky.b.m();
        vtwVarM2.getClass();
        new vul(((wky) vtwVarM2.b).c, wky.a);
        imu imuVar = this.a;
        Set setAp = yfm.ap(imuVar.s.c);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wky wkyVar = (wky) vtwVarM2.b;
        vuj vujVar = wkyVar.c;
        if (!vujVar.c()) {
            wkyVar.c = vuc.q(vujVar);
        }
        Iterator it = setAp.iterator();
        while (it.hasNext()) {
            wkyVar.c.g(((wkw) it.next()).az);
        }
        vuc vucVarR = vtwVarM2.r();
        vucVarR.getClass();
        wky wkyVar2 = (wky) vucVarR;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkq wkqVar = (wkq) vtwVarM.b;
        wkqVar.c = wkyVar2;
        wkqVar.b |= 1;
        vtw vtwVarM3 = wkh.b.m();
        vtwVarM3.getClass();
        new vul(((wkh) vtwVarM3.b).c, wkh.a);
        Set setAp2 = yfm.ap(imuVar.t.d());
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wkh wkhVar = (wkh) vtwVarM3.b;
        vuj vujVar2 = wkhVar.c;
        if (!vujVar2.c()) {
            wkhVar.c = vuc.q(vujVar2);
        }
        Iterator it2 = setAp2.iterator();
        while (it2.hasNext()) {
            wkhVar.c.g(((wkf) it2.next()).u);
        }
        vuc vucVarR2 = vtwVarM3.r();
        vucVarR2.getClass();
        wkh wkhVar2 = (wkh) vucVarR2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkq wkqVar2 = (wkq) vtwVarM.b;
        wkqVar2.d = wkhVar2;
        wkqVar2.b |= 2;
        vtw vtwVarM4 = wpo.a.m();
        vtwVarM4.getClass();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        wpo wpoVar = (wpo) vtwVarM4.b;
        wpoVar.b |= 1;
        wpoVar.c = true;
        vuc vucVarR3 = vtwVarM4.r();
        vucVarR3.getClass();
        wpo wpoVar2 = (wpo) vucVarR3;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkq wkqVar3 = (wkq) vtwVarM.b;
        wkqVar3.e = wpoVar2;
        wkqVar3.b |= 4;
        vtw vtwVarM5 = wkm.a.m();
        vtwVarM5.getClass();
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        wkm wkmVar = (wkm) vtwVarM5.b;
        wkmVar.b |= 1;
        wkmVar.c = true;
        vuc vucVarR4 = vtwVarM5.r();
        vucVarR4.getClass();
        wkm wkmVar2 = (wkm) vucVarR4;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkq wkqVar4 = (wkq) vtwVarM.b;
        wkqVar4.f = wkmVar2;
        wkqVar4.b |= 8;
        vtw vtwVarM6 = wpj.a.m();
        vtwVarM6.getClass();
        boolean z = false;
        if (imuVar.r.i.u && imuVar.l.d()) {
            z = true;
        }
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        wpj wpjVar = (wpj) vtwVarM6.b;
        wpjVar.b |= 1;
        wpjVar.c = z;
        vuc vucVarR5 = vtwVarM6.r();
        vucVarR5.getClass();
        wpj wpjVar2 = (wpj) vucVarR5;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkq wkqVar5 = (wkq) vtwVarM.b;
        wkqVar5.g = wpjVar2;
        wkqVar5.b |= 16;
        vuc vucVarR6 = vtwVarM.r();
        vucVarR6.getClass();
        wkq wkqVar6 = (wkq) vucVarR6;
        vtw vtwVarM7 = wkb.a.m();
        vtwVarM7.getClass();
        lys lysVar = imuVar.q;
        String strC = lysVar.c(lysVar.h.a());
        strC.getClass();
        if (!vtwVarM7.b.A()) {
            vtwVarM7.u();
        }
        wkb wkbVar = (wkb) vtwVarM7.b;
        wkbVar.b |= 1;
        wkbVar.c = strC;
        vuc vucVarR7 = vtwVarM7.r();
        vucVarR7.getClass();
        wkb wkbVar2 = (wkb) vucVarR7;
        xsmVar.h(imu.a, imuVar.i);
        xsmVar.h(imu.b, wkqVar6);
        xkk xkkVar = imuVar.m;
        if (xkkVar.a() || imuVar.n.a()) {
            xsj xsjVar = imu.c;
            vtw vtwVarM8 = wju.a.m();
            vtwVarM8.getClass();
            if (xkkVar.a()) {
                vtw vtwVarM9 = wjy.a.m();
                vtwVarM9.getClass();
                boolean zA = xkkVar.a();
                if (!vtwVarM9.b.A()) {
                    vtwVarM9.u();
                }
                wjy wjyVar = (wjy) vtwVarM9.b;
                wjyVar.b |= 128;
                wjyVar.c = zA;
                vuc vucVarR8 = vtwVarM9.r();
                vucVarR8.getClass();
                wjy wjyVar2 = (wjy) vucVarR8;
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                wju wjuVar = (wju) vtwVarM8.b;
                wjuVar.d = wjyVar2;
                wjuVar.b |= 8;
            }
            xjf xjfVar = imuVar.n;
            if (xjfVar.a()) {
                vtw vtwVarM10 = wjw.a.m();
                vtwVarM10.getClass();
                boolean zA2 = xjfVar.a();
                if (!vtwVarM10.b.A()) {
                    vtwVarM10.u();
                }
                wjw wjwVar = (wjw) vtwVarM10.b;
                wjwVar.b |= 8192;
                wjwVar.c = zA2;
                vuc vucVarR9 = vtwVarM10.r();
                vucVarR9.getClass();
                wjw wjwVar2 = (wjw) vucVarR9;
                if (!vtwVarM8.b.A()) {
                    vtwVarM8.u();
                }
                wju wjuVar2 = (wju) vtwVarM8.b;
                wjuVar2.c = wjwVar2;
                wjuVar2.b |= 2;
            }
            vuc vucVarR10 = vtwVarM8.r();
            vucVarR10.getClass();
            xsmVar.h(xsjVar, (wju) vucVarR10);
        }
        Context context = imuVar.p;
        xsj xsjVar2 = imu.e;
        String languageTags = context.getResources().getConfiguration().getLocales().toLanguageTags();
        languageTags.getClass();
        xsmVar.h(xsjVar2, languageTags);
        if (!imuVar.j.b()) {
            xsmVar.h(imu.d, wkbVar2);
        }
        xsmVar.h(imu.f, imuVar.u.i());
        List listSingletonList = Collections.singletonList(((ldb) imuVar.o).a());
        xsm xsmVar2 = new xsm();
        String strAb = sij.ab(202964622);
        xsg xsgVar = xsm.b;
        int i = xsj.c;
        xsf xsfVar = new xsf(strAb, xsgVar);
        ImmutableList immutableListImmutableSortedCopy = Ordering.natural().immutableSortedCopy(listSingletonList);
        vtw vtwVarM11 = uiu.a.m();
        UnmodifiableIterator it3 = immutableListImmutableSortedCopy.iterator();
        while (it3.hasNext()) {
            vsz vszVarQ = vsz.q(Base64.decode((String) it3.next(), 8));
            if (!vtwVarM11.b.A()) {
                vtwVarM11.u();
            }
            uiu uiuVar = (uiu) vtwVarM11.b;
            vun vunVar = uiuVar.b;
            if (!vunVar.c()) {
                uiuVar.b = vuc.s(vunVar);
            }
            uiuVar.b.add(vszVarQ);
        }
        xsmVar2.h(xsfVar, ((uiu) vtwVarM11.r()).h());
        xsmVar.g(xsmVar2);
        obl oblVar = imuVar.v;
        if (!ylh.L(oblVar.b)) {
            xsj xsjVar3 = imu.g;
            vtw vtwVarM12 = uvi.a.m();
            vtwVarM12.getClass();
            Object obj = oblVar.b;
            obj.getClass();
            if (!vtwVarM12.b.A()) {
                vtwVarM12.u();
            }
            uvi uviVar = (uvi) vtwVarM12.b;
            uviVar.b |= 1;
            uviVar.c = (String) obj;
            vuc vucVarR11 = vtwVarM12.r();
            vucVarR11.getClass();
            xsmVar.h(xsjVar3, (uvi) vucVarR11);
        }
        if (((Boolean) xlm.a.et(((xlm) imuVar.k).b)).booleanValue()) {
            vtw vtwVarM13 = uqf.a.m();
            vtw vtwVarM14 = vgm.a.m();
            if (!vtwVarM14.b.A()) {
                vtwVarM14.u();
            }
            vgm vgmVar = (vgm) vtwVarM14.b;
            vgmVar.c = 2;
            vgmVar.b |= 1;
            vgm vgmVar2 = (vgm) vtwVarM14.r();
            if (!vtwVarM13.b.A()) {
                vtwVarM13.u();
            }
            uqf uqfVar = (uqf) vtwVarM13.b;
            vgmVar2.getClass();
            uqfVar.c = vgmVar2;
            uqfVar.b |= 1;
            vuc vucVarR12 = vtwVarM13.r();
            vucVarR12.getClass();
            xsmVar.h(imu.h, ((uqf) vucVarR12).h());
        }
        this.b.a(wbbVar, xsmVar);
    }
}
