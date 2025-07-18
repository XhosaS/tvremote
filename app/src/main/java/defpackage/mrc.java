package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrc implements odl {
    private final oco a;
    private final DisplayMetrics b;
    private final yqt c;

    public mrc(Context context, oco ocoVar, yqt yqtVar) {
        this.a = ocoVar;
        this.b = context.getResources().getDisplayMetrics();
        this.c = yqtVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, nfh] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, nfh] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, nfh] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, nfh] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, nfh] */
    @Override // defpackage.odl
    public final /* bridge */ /* synthetic */ Drawable a(mil milVar, Bitmap bitmap, ImageView.ScaleType scaleType, oal oalVar) {
        float[] fArr;
        PointF pointF;
        PointF pointF2;
        int i;
        nfg nfgVar = (nfg) milVar;
        float fG = nfgVar.g();
        DisplayMetrics displayMetrics = this.b;
        mrd mrdVar = new mrd(bitmap, scaleType, TypedValue.applyDimension(1, fG, displayMetrics), nfgVar.j(), TypedValue.applyDimension(1, nfgVar.h(), displayMetrics), nfgVar.o(), this.a, this.c);
        if (nfgVar.r()) {
            mrdVar.k = nfgVar.n();
            if (!mrdVar.d()) {
                mrdVar.b();
            }
        }
        if (nfgVar.t()) {
            nfi nfiVarL = nfgVar.l();
            if (nfiVarL.j() == 0) {
                mrdVar.g.b(acsw.LOG_TYPE_MISSING_FIELD, oalVar, "BorderImageProcessorDrawable Linear Gradient colors is null and linear gradient cannot be applied", new Object[0]);
            } else if (nfiVarL.j() < 2) {
                mrdVar.g.b(acsw.LOG_TYPE_INVALID_FIELD, oalVar, "BorderImageProcessorDrawable There should be minimum 2 colors to apply linear gradient", new Object[0]);
            } else if (!nfiVarL.m() || nfiVarL.l().i() == nfiVarL.l().j()) {
                yqt yqtVarI = nfiVarL.m() ? yqt.i(nfiVarL.l()) : ypv.a;
                if (nfiVarL.k() > 0) {
                    float[] fArr2 = new float[nfiVarL.k()];
                    for (int i2 = 0; i2 < nfiVarL.k(); i2++) {
                        fArr2[i2] = nfiVarL.h(i2);
                    }
                    fArr = fArr2;
                } else {
                    fArr = null;
                }
                int[] iArr = new int[nfiVarL.j()];
                for (int i3 = 0; i3 < nfiVarL.j(); i3++) {
                    iArr[i3] = nfiVarL.i(i3);
                }
                if (yqtVarI.g() && yqtVarI.c().j() && yqtVarI.c().i()) {
                    nlp nlpVarH = yqtVarI.c().h();
                    nlp nlpVarG = yqtVarI.c().g();
                    if (yqtVarI.c().k() - 1 != 1) {
                        pointF = new PointF(nlpVarH.g(), nlpVarH.h());
                        pointF2 = new PointF(nlpVarG.g(), nlpVarG.h());
                    } else {
                        pointF = new PointF(TypedValue.applyDimension(1, nlpVarH.g(), displayMetrics), TypedValue.applyDimension(1, nlpVarH.h(), displayMetrics));
                        pointF2 = new PointF(TypedValue.applyDimension(1, nlpVarG.g(), displayMetrics), TypedValue.applyDimension(1, nlpVarG.h(), displayMetrics));
                        i = 2;
                        mrdVar.j = new mre(nfiVarL.g(), pointF, pointF2, iArr, fArr, i, mrdVar.g);
                        mrdVar.j.d(mrdVar.c, mrdVar.c(), mrdVar.f);
                    }
                } else {
                    pointF = null;
                    pointF2 = null;
                }
                i = 1;
                mrdVar.j = new mre(nfiVarL.g(), pointF, pointF2, iArr, fArr, i, mrdVar.g);
                mrdVar.j.d(mrdVar.c, mrdVar.c(), mrdVar.f);
            } else {
                mrdVar.g.b(acsw.LOG_TYPE_MISSING_FIELD, oalVar, "BorderImageProcessorDrawable LinearGradient line should have both start and end values to apply linear gradient", new Object[0]);
            }
        }
        if (nfgVar.s()) {
            nfj nfjVarM = nfgVar.m();
            int iG = nfjVarM.g();
            int iH = nfjVarM.h() - 1;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            switch (iH) {
                case 1:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 2:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 3:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 4:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 6:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 8:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 9:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 10:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 11:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 15:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 16:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
            }
            mrdVar.setColorFilter(iG, mode);
        }
        if (nfgVar.p()) {
            int i4 = nfgVar.i();
            mrdVar.l = new Paint();
            mrdVar.l.setColor(i4);
        }
        return mrdVar;
    }

    @Override // defpackage.odl
    public final mii b() {
        return nfg.C;
    }
}
