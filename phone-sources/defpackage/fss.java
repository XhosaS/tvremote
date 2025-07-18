package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fss implements View.OnClickListener, PopupWindow.OnDismissListener, eam, ftp {
    final /* synthetic */ PlayerControlView a;

    public fss(PlayerControlView playerControlView) {
        this.a = playerControlView;
    }

    private final boolean J(eao eaoVar) {
        Class cls;
        return (eaoVar == null || (cls = this.a.e) == null || !cls.isAssignableFrom(eaoVar.getClass())) ? false : true;
    }

    private final boolean K(eao eaoVar) {
        Class cls;
        return (eaoVar == null || (cls = this.a.b) == null || !cls.isAssignableFrom(eaoVar.getClass())) ? false : true;
    }

    @Override // defpackage.eam
    public final void E(eal ealVar) throws Resources.NotFoundException {
        if (ealVar.a(4, 5, 13)) {
            this.a.i();
        }
        if (ealVar.a(4, 5, 7, 13)) {
            this.a.k();
        }
        if (ealVar.a(8, 13)) {
            this.a.l();
        }
        if (ealVar.a(9, 13)) {
            this.a.n();
        }
        if (ealVar.a(8, 9, 11, 0, 16, 17, 13)) {
            this.a.h();
        }
        if (ealVar.a(11, 0, 13)) {
            this.a.o();
        }
        if (ealVar.a(12, 13)) {
            this.a.j();
        }
        if (ealVar.a(2, 13)) {
            this.a.p();
        }
    }

    @Override // defpackage.ftp
    public final void G(DefaultTimeBar defaultTimeBar, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PlayerControlView playerControlView = this.a;
        playerControlView.M = true;
        TextView textView = playerControlView.B;
        if (textView != null) {
            textView.setText(edt.X(playerControlView.C, playerControlView.D, j));
        }
        playerControlView.a.h();
        eao eaoVar = playerControlView.I;
        if (eaoVar == null || !playerControlView.O) {
            return;
        }
        if (K(eaoVar)) {
            try {
                Method method = playerControlView.c;
                method.getClass();
                method.invoke(playerControlView.I, true);
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        PlayerControlView playerControlView2 = this.a;
        if (!J(playerControlView2.I)) {
            eao eaoVar2 = this.a.I;
            eaoVar2.getClass();
            edb.e("PlayerControlView", "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=".concat(String.valueOf(String.valueOf(eaoVar2.getClass()))));
        } else {
            try {
                Method method2 = playerControlView2.f;
                method2.getClass();
                method2.invoke(playerControlView2.I, true);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[Catch: InvocationTargetException -> 0x0059, IllegalAccessException | InvocationTargetException -> 0x005b, TryCatch #2 {IllegalAccessException | InvocationTargetException -> 0x005b, blocks: (B:5:0x0011, B:7:0x001a, B:9:0x0030, B:11:0x0038), top: B:20:0x0011 }] */
    @Override // defpackage.ftp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(long r5) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            androidx.media3.ui.PlayerControlView r0 = r4.a
            android.widget.TextView r1 = r0.B
            if (r1 == 0) goto L11
            java.lang.StringBuilder r2 = r0.C
            java.util.Formatter r3 = r0.D
            java.lang.String r2 = defpackage.edt.X(r2, r3, r5)
            r1.setText(r2)
        L11:
            eao r1 = r0.I     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            boolean r1 = r4.K(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            r2 = 0
            if (r1 == 0) goto L30
            java.lang.reflect.Method r1 = r0.d     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            defpackage.a.aq(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            eao r3 = r0.I     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            defpackage.a.aq(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            if (r1 != 0) goto L4e
        L30:
            eao r1 = r0.I     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            boolean r1 = r4.J(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            if (r1 == 0) goto L58
            java.lang.reflect.Method r1 = r0.g     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            defpackage.a.aq(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            eao r0 = r0.I     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            defpackage.a.aq(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalAccessException -> L5b
            if (r0 == 0) goto L58
        L4e:
            androidx.media3.ui.PlayerControlView r0 = r4.a
            eao r1 = r0.I
            defpackage.a.aq(r1)
            r0.c(r1, r5)
        L58:
            return
        L59:
            r5 = move-exception
            goto L5c
        L5b:
            r5 = move-exception
        L5c:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fss.H(long):void");
    }

    @Override // defpackage.ftp
    public final void I(long j, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PlayerControlView playerControlView = this.a;
        playerControlView.M = false;
        eao eaoVar = playerControlView.I;
        if (eaoVar != null) {
            if (!z) {
                playerControlView.c(eaoVar, j);
            }
            if (K(playerControlView.I)) {
                try {
                    Method method = playerControlView.c;
                    method.getClass();
                    method.invoke(playerControlView.I, false);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } else {
                PlayerControlView playerControlView2 = this.a;
                if (J(playerControlView2.I)) {
                    try {
                        Method method2 = playerControlView2.f;
                        method2.getClass();
                        method2.invoke(playerControlView2.I, false);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        this.a.a.i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView playerControlView = this.a;
        eao eaoVar = playerControlView.I;
        if (eaoVar == null) {
            return;
        }
        ftk ftkVar = playerControlView.a;
        ftkVar.i();
        if (playerControlView.p == view) {
            if (eaoVar.q(9)) {
                eaoVar.k();
                return;
            }
            return;
        }
        if (playerControlView.o == view) {
            if (eaoVar.q(7)) {
                eaoVar.m();
                return;
            }
            return;
        }
        if (playerControlView.r == view) {
            if (eaoVar.bf() == 4 || !eaoVar.q(12)) {
                return;
            }
            eaoVar.h();
            return;
        }
        if (playerControlView.s == view) {
            if (eaoVar.q(11)) {
                eaoVar.g();
                return;
            }
            return;
        }
        if (playerControlView.q == view) {
            edt.aA(eaoVar, playerControlView.L);
            return;
        }
        if (playerControlView.t == view) {
            if (eaoVar.q(15)) {
                int iBh = eaoVar.bh();
                int i = playerControlView.P;
                for (int i2 = 1; i2 <= 2; i2++) {
                    int i3 = (iBh + i2) % 3;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2 || (i & 2) == 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    iBh = i3;
                }
                eaoVar.ad(iBh);
                return;
            }
            return;
        }
        if (playerControlView.u == view) {
            if (eaoVar.q(14)) {
                eaoVar.ae(!eaoVar.am());
                return;
            }
            return;
        }
        View view2 = playerControlView.y;
        if (view2 == view) {
            ftkVar.h();
            playerControlView.a(playerControlView.i, view2);
            return;
        }
        View view3 = playerControlView.z;
        if (view3 == view) {
            ftkVar.h();
            playerControlView.a(playerControlView.j, view3);
            return;
        }
        View view4 = playerControlView.A;
        if (view4 == view) {
            ftkVar.h();
            playerControlView.a(playerControlView.l, view4);
            return;
        }
        ImageView imageView = playerControlView.v;
        if (imageView == view) {
            ftkVar.h();
            playerControlView.a(playerControlView.k, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.a;
        if (playerControlView.Q) {
            playerControlView.a.i();
        }
    }

    @Override // defpackage.eam
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void A(ebf ebfVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void B(ebh ebhVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void C(ebo eboVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void D(float f) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void c(eak eakVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void d(ecb ecbVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dc(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dd(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void de(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dg(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void dh(ead eadVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void el(dyo dyoVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void m(eai eaiVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void n(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void p(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void q(eah eahVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void s(eab eabVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void df(dzy dzyVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}
