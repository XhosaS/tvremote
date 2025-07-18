package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jls implements eam {
    public final jlw a;
    public final TextureView b;
    public final Handler c;
    public final jlu d;
    public boolean e;
    public int f = 4;

    public jls(jlw jlwVar, TextureView textureView, Handler handler, jlu jluVar) {
        this.a = jlwVar;
        this.b = textureView;
        this.c = handler;
        this.d = jluVar;
    }

    @Override // defpackage.eam
    public final void dd(boolean z) {
        if (z) {
            this.c.postDelayed(new jlr(this, 0), this.a.n);
        }
    }

    @Override // defpackage.eam
    public final void n(int i) {
        if (i == 1) {
            jlw jlwVar = this.a;
            jlw.i(this.b);
            jlw.h(jlwVar.d(), 0.6f);
            krd.e("Trailer preview playback state: Idle");
        } else if (i == 2) {
            if (!this.e || this.f != 3) {
                this.b.setVisibility(8);
            }
            krd.e("Trailer preview playback state: Buffering...");
        } else if (i != 3) {
            krd.e("Trailer preview playback state: Ended");
            if (this.f != 4) {
                jlw jlwVar2 = this.a;
                jlw.i(this.b);
                jlw.h(jlwVar2.d(), 0.6f);
            }
        } else {
            if (this.e) {
                jlw jlwVar3 = this.a;
                ExoPlayer exoPlayer = jlwVar3.h;
                if (exoPlayer != null) {
                    exoPlayer.ab(true);
                }
                jlw.i(jlwVar3.d());
                jlw.h(this.b, 1.0f);
            }
            krd.e("Trailer preview playback state: Ready");
        }
        this.f = i;
    }

    @Override // defpackage.eam
    public final void y(int i, int i2) {
        TextureView textureView = this.b;
        int height = (textureView.getHeight() - textureView.getPaddingTop()) - textureView.getPaddingBottom();
        float width = (textureView.getWidth() - textureView.getPaddingStart()) - textureView.getPaddingEnd();
        float f = height;
        float f2 = width / f;
        float f3 = 1.0f;
        float f4 = 1.248f;
        float f5 = (1.0f / f2) * 1.7777778f * 1.248f;
        if (f5 < 1.0f) {
            f4 = f2 / 1.7777778f;
        } else {
            f3 = f5;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f4, width / 2.0f, f / 2.0f);
        textureView.setTransform(matrix);
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
    public final /* synthetic */ void E(eal ealVar) {
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
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}
