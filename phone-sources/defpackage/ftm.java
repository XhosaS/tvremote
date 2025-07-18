package defpackage;

import android.view.View;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftm implements View.OnClickListener, eam {
    final /* synthetic */ PlayerView a;
    private final eav b = new eav();
    private Object c;

    public ftm(PlayerView playerView) {
        this.a = playerView;
    }

    @Override // defpackage.eam
    public final void B(ebh ebhVar) {
        PlayerView playerView = this.a;
        eao eaoVar = playerView.f;
        eaoVar.getClass();
        eay eayVarN = eaoVar.q(17) ? eaoVar.N() : eay.a;
        if (eayVarN.q()) {
            this.c = null;
        } else if (!eaoVar.q(30) || eaoVar.P().a()) {
            Object obj = this.c;
            if (obj != null) {
                int iA = eayVarN.a(obj);
                if (iA != -1) {
                    if (eaoVar.bd() == eayVarN.n(iA, this.b).h) {
                        return;
                    }
                }
                this.c = null;
            }
        } else {
            this.c = eayVarN.d(eaoVar.be(), this.b, true).g;
        }
        playerView.s(false);
    }

    @Override // defpackage.eam
    public final void C(ebo eboVar) {
        PlayerView playerView;
        eao eaoVar;
        if (eboVar.equals(ebo.a) || (eaoVar = (playerView = this.a).f) == null || eaoVar.bf() == 1) {
            return;
        }
        playerView.n();
    }

    @Override // defpackage.eam
    public final void d(ecb ecbVar) {
        SubtitleView subtitleView = this.a.c;
        if (subtitleView != null) {
            subtitleView.a(ecbVar.d);
        }
    }

    @Override // defpackage.eam
    public final void l(boolean z, int i) {
        PlayerView playerView = this.a;
        playerView.o();
        playerView.q();
    }

    @Override // defpackage.eam
    public final void n(int i) {
        PlayerView playerView = this.a;
        playerView.o();
        playerView.r();
        playerView.q();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.m();
    }

    @Override // defpackage.eam
    public final void t(ean eanVar, ean eanVar2, int i) {
        PlayerView playerView = this.a;
        if (playerView.x() && playerView.g) {
            playerView.d();
        }
    }

    @Override // defpackage.eam
    public final void u() {
        PlayerView playerView = this.a;
        View view = playerView.a;
        if (view != null) {
            view.setVisibility(4);
            if (playerView.u()) {
                playerView.e();
            } else {
                playerView.c();
            }
        }
    }

    @Override // defpackage.eam
    public final /* synthetic */ void F() {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void A(ebf ebfVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void D(float f) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void E(eal ealVar) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void c(eak eakVar) {
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
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final void y(int i, int i2) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }
}
