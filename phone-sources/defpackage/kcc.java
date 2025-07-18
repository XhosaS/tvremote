package defpackage;

import android.graphics.Matrix;
import android.view.TextureView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcc implements eam {
    final /* synthetic */ TextureView a;

    public kcc(TextureView textureView) {
        this.a = textureView;
    }

    @Override // defpackage.eam
    public final void y(int i, int i2) {
        TextureView textureView = this.a;
        float width = (textureView.getWidth() - textureView.getPaddingStart()) - textureView.getPaddingEnd();
        float height = (textureView.getHeight() - textureView.getPaddingTop()) - textureView.getPaddingBottom();
        float f = width / height;
        float f2 = 1.0f;
        float f3 = 1.248f;
        float f4 = (1.0f / f) * 1.7777778f * 1.248f;
        if (f4 < 1.0f) {
            f3 = f / 1.7777778f;
        } else {
            f2 = f4;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3, width / 2.0f, height / 2.0f);
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
    public final /* synthetic */ void z(eay eayVar, int i) {
    }

    @Override // defpackage.eam
    public final /* synthetic */ void t(ean eanVar, ean eanVar2, int i) {
    }
}
