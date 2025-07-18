package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egu extends dxv {

    @eau(a = eav.DRAWABLE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Drawable a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ImageView.ScaleType b;

    public egu() {
        super("Image");
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        int i = egv.a;
        return new dwe();
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        egt egtVar = (egt) duvVar;
        egt egtVar2 = (egt) duvVar2;
        egtVar.a = egtVar2.a;
        egtVar.b = egtVar2.b;
        egtVar.c = egtVar2.c;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        egt egtVar = (egt) duvVar;
        Integer num = egtVar.c;
        Integer num2 = egtVar.a;
        int i = egv.a;
        ((dwe) obj).a(num.intValue(), num2.intValue());
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        Matrix.ScaleToFit scaleToFit;
        float f;
        float f2;
        dwz dwzVar = new dwz();
        dwz dwzVar2 = new dwz();
        dwz dwzVar3 = new dwz();
        Drawable drawable = this.a;
        ImageView.ScaleType scaleType = this.b;
        int i = egv.a;
        int iC = dseVar.c() + dseVar.d();
        int iE = dseVar.e() + dseVar.b();
        dtj dtjVar = null;
        if (ImageView.ScaleType.FIT_XY == scaleType || drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            dwzVar.a = null;
            dwzVar2.a = Integer.valueOf(dseVar.f() - iC);
            dwzVar3.a = Integer.valueOf(dseVar.a() - iE);
        } else {
            int iF = dseVar.f() - iC;
            int iA = dseVar.a() - iE;
            if (scaleType == null) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0 && ImageView.ScaleType.FIT_XY != scaleType && ImageView.ScaleType.MATRIX != scaleType && (iF != intrinsicWidth || iA != intrinsicHeight)) {
                dtjVar = new dtj();
                if (ImageView.ScaleType.CENTER == scaleType) {
                    dtjVar.setTranslate(duc.a((iF - intrinsicWidth) * 0.5f), duc.a((iA - intrinsicHeight) * 0.5f));
                    dtjVar.a = intrinsicWidth > iF || intrinsicHeight > iA;
                } else {
                    float f3 = intrinsicWidth;
                    float f4 = iF;
                    float f5 = intrinsicHeight;
                    float f6 = iA;
                    float f7 = 0.0f;
                    if (ImageView.ScaleType.CENTER_CROP == scaleType) {
                        if (intrinsicWidth * iA > iF * intrinsicHeight) {
                            float f8 = f6 / f5;
                            float f9 = (f4 - (f3 * f8)) * 0.5f;
                            f = f8;
                            f2 = 0.0f;
                            f7 = f9;
                        } else {
                            f = f4 / f3;
                            f2 = (f6 - (f5 * f)) * 0.5f;
                        }
                        dtjVar.setScale(f, f);
                        dtjVar.postTranslate(duc.a(f7), duc.a(f2));
                        dtjVar.a = true;
                    } else if (ImageView.ScaleType.CENTER_INSIDE == scaleType) {
                        float fMin = (intrinsicWidth > iF || intrinsicHeight > iA) ? Math.min(f4 / f3, f6 / f5) : 1.0f;
                        dtjVar.setScale(fMin, fMin);
                        dtjVar.postTranslate(duc.a((f4 - (f3 * fMin)) * 0.5f), duc.a((f6 - (f5 * fMin)) * 0.5f));
                    } else {
                        RectF rectF = new RectF();
                        RectF rectF2 = new RectF();
                        rectF.set(0.0f, 0.0f, f3, f5);
                        rectF2.set(0.0f, 0.0f, f4, f6);
                        int i2 = dti.a[scaleType.ordinal()];
                        if (i2 == 1) {
                            scaleToFit = Matrix.ScaleToFit.FILL;
                        } else if (i2 == 2) {
                            scaleToFit = Matrix.ScaleToFit.START;
                        } else if (i2 == 3) {
                            scaleToFit = Matrix.ScaleToFit.CENTER;
                        } else {
                            if (i2 != 4) {
                                throw new IllegalArgumentException("Only FIT_... values allowed");
                            }
                            scaleToFit = Matrix.ScaleToFit.END;
                        }
                        dtjVar.setRectToRect(rectF, rectF2, scaleToFit);
                    }
                }
            }
            dwzVar.a = dtjVar;
            dwzVar2.a = Integer.valueOf(drawable.getIntrinsicWidth());
            dwzVar3.a = Integer.valueOf(drawable.getIntrinsicHeight());
        }
        egt egtVar = (egt) duvVar;
        egtVar.b = (dtj) dwzVar.a;
        egtVar.c = (Integer) dwzVar2.a;
        egtVar.a = (Integer) dwzVar3.a;
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        Drawable drawable = this.a;
        int i3 = egv.a;
        if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            dxtVar.a = 0;
            dxtVar.b = 0;
            return;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            dxtVar.a = intrinsicWidth;
            dxtVar.b = intrinsicHeight;
            return;
        }
        float f = intrinsicWidth;
        float f2 = intrinsicHeight;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i) > intrinsicWidth) {
            i = View.MeasureSpec.makeMeasureSpec(intrinsicWidth, Integer.MIN_VALUE);
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > intrinsicHeight) {
            i2 = View.MeasureSpec.makeMeasureSpec(intrinsicHeight, Integer.MIN_VALUE);
        }
        eew.b(i, i2, f / f2, dxtVar);
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        Drawable drawable = this.a;
        dtj dtjVar = ((egt) duvVar).b;
        int i = egv.a;
        ((dwe) obj).b(drawable, dtjVar);
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        egu eguVar = (egu) drqVar;
        egu eguVar2 = (egu) drqVar2;
        dtd dtdVar = new dtd(eguVar == null ? null : eguVar.b, eguVar2 == null ? null : eguVar2.b);
        dtd dtdVar2 = new dtd(eguVar == null ? null : eguVar.a, eguVar2 != null ? eguVar2.a : null);
        int i = egv.a;
        return (dtdVar.b == dtdVar.a && eca.a((Drawable) dtdVar2.b, (Drawable) dtdVar2.a)) ? false : true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 2;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        int i = egv.a;
        ((dwe) obj).d();
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        egu eguVar = (egu) drqVar;
        Drawable drawable = this.a;
        if (drawable == null ? eguVar.a != null : !drawable.equals(eguVar.a)) {
            return false;
        }
        ImageView.ScaleType scaleType = this.b;
        return scaleType == null ? eguVar.b == null : scaleType.equals(eguVar.b);
    }

    @Override // defpackage.drq
    protected final int h() {
        return 30;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (egu) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new egt();
    }
}
