package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class quf extends AnimatorListenerAdapter {
    final /* synthetic */ qtz a;
    final /* synthetic */ quj b;

    public quf(quj qujVar, qtz qtzVar) {
        this.a = qtzVar;
        this.b = qujVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        quj qujVar = this.b;
        pjs pjsVar = null;
        qujVar.d = null;
        if (this.a != null) {
            switch (r1.c - 1) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 9;
                    break;
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 11;
                    break;
                case 6:
                    i = 12;
                    break;
                default:
                    i = 7;
                    break;
            }
            vvd vvdVar = rjd.a;
            vtw vtwVarM = rjf.a.m();
            vtw vtwVarM2 = ucf.a.m();
            vtw vtwVarM3 = ucd.a.m();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            ucd ucdVar = (ucd) vtwVarM3.b;
            ucdVar.c = i - 1;
            ucdVar.b |= 1;
            ucd ucdVar2 = (ucd) vtwVarM3.r();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucf ucfVar = (ucf) vtwVarM2.b;
            ucdVar2.getClass();
            ucfVar.c = ucdVar2;
            ucfVar.b |= 2;
            ucf ucfVar2 = (ucf) vtwVarM2.r();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            rjf rjfVar = (rjf) vtwVarM.b;
            ucfVar2.getClass();
            rjfVar.c = ucfVar2;
            rjfVar.b |= 1;
            pjsVar = new pjs(vvdVar, (rjf) vtwVarM.r());
        }
        qujVar.e = pjsVar;
        rjg rjgVar = qujVar.c;
        if (rjgVar == null) {
            return;
        }
        BadgeFrameLayout badgeFrameLayout = qujVar.a;
        badgeFrameLayout.e(rjgVar);
        pjs pjsVar2 = qujVar.e;
        if (pjsVar2 != null) {
            badgeFrameLayout.c(qujVar.c, pjsVar2);
        } else {
            badgeFrameLayout.b(qujVar.c);
        }
    }
}
