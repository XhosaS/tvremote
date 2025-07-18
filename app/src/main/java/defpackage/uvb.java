package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.SystemClock;
import com.google.android.libraries.tv.ui.assets.gradients.NativeSmoothGradient;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvb extends djg {
    final /* synthetic */ uvc b;
    private final int c;
    private final int d;
    private final Bitmap.Config e;
    private final int f = 0;

    public uvb(uvc uvcVar, int i, int i2, Bitmap.Config config) {
        this.b = uvcVar;
        this.c = i;
        this.d = i2;
        if (!uvp.a() && config == uvp.b) {
            config = Bitmap.Config.ARGB_8888;
        }
        this.e = config;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(toString().getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.djg
    protected final Bitmap c(ddz ddzVar, Bitmap bitmap) {
        bho bhoVarA;
        int i;
        uvc uvcVar = this.b;
        boolean z = uvcVar.b;
        if (z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(bho.f);
            arrayList.add(bhp.a);
            arrayList.add(bhp.b);
            arrayList.add(bhp.c);
            arrayList.add(bhp.d);
            arrayList.add(bhp.e);
            arrayList.add(bhp.f);
            bhoVarA = bhm.a(bitmap, arrayList, arrayList2);
        } else {
            bhoVarA = null;
        }
        int[] iArrG = uvcVar.g(z ? bhoVarA.a() : 0);
        if (iArrG.length == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(iArrG[0]);
            uvp.b(bitmapCreateBitmap, bhoVarA);
            return bitmapCreateBitmap;
        }
        int i2 = this.c;
        float f = uvcVar.l;
        int i3 = this.d;
        float f2 = uvcVar.m;
        Bitmap bitmapB = (bitmap.isMutable() && bitmap.getWidth() == i2 && bitmap.getHeight() == i3 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) ? bitmap : ddzVar.b(i2, i3, Bitmap.Config.ARGB_8888);
        float f3 = i3 / f2;
        float f4 = i2 / f;
        PointF pointF = new PointF(uvcVar.c * f4, uvcVar.d * f3);
        boolean z2 = uvcVar.h;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z2) {
            PointF pointF2 = new PointF(uvcVar.e * f4, uvcVar.f * f3);
            float[] fArr = uvcVar.j;
            int i4 = uvcVar.k;
            NativeSmoothGradient nativeSmoothGradient = NativeSmoothGradient.a;
            if (fArr != null) {
                iArrG = NativeSmoothGradient.a(iArrG, fArr, i4);
            }
            i = i2;
            int[] iArr = iArrG;
            double dAtan2 = (float) Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x);
            float fCos = (float) Math.cos(dAtan2);
            float fSin = (float) Math.sin(dAtan2);
            float f5 = (pointF.x * fCos) + (pointF.y * fSin);
            if (!nativeSmoothGradient.linearGradient(bitmapB, iArr, fCos, fSin, f5, ((pointF2.x * fCos) + (pointF2.y * fSin)) - f5)) {
                throw new IllegalStateException("Unable to render gradient");
            }
        } else {
            i = i2;
            float f6 = uvcVar.i * f4;
            float[] fArr2 = uvcVar.j;
            int i5 = uvcVar.k;
            float f7 = f3 / f4;
            float f8 = uvcVar.g;
            NativeSmoothGradient nativeSmoothGradient2 = NativeSmoothGradient.a;
            if (fArr2 != null) {
                iArrG = NativeSmoothGradient.a(iArrG, fArr2, i5);
            }
            if (!nativeSmoothGradient2.radialGradient(bitmapB, pointF.x, pointF.y, f6, iArrG, f7 * f8)) {
                throw new IllegalStateException("Unable to render gradient");
            }
        }
        ((zdv) ((zdv) uvc.a.b()).q("com/google/android/libraries/tv/widgets/scrim/GradientScrimRenderer$HighQualityTransformation", "transform", 272, "GradientScrimRenderer.java")).I("Generated dithered %dx%d gradient in %d milliseconds", Integer.valueOf(i), Integer.valueOf(i3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        Bitmap.Config config = this.e;
        Bitmap.Config config2 = uvp.b;
        if (config != config2) {
            uvp.b(bitmapB, bhoVarA);
            return bitmapB;
        }
        Bitmap bitmapCopy = bitmapB.copy(config2, false);
        if (bitmapB != bitmap) {
            ddzVar.d(bitmapB);
        }
        uvp.b(bitmapCopy, bhoVarA);
        return bitmapCopy;
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvb)) {
            return false;
        }
        uvb uvbVar = (uvb) obj;
        if (this.c != uvbVar.c || this.d != uvbVar.d) {
            return false;
        }
        int i = uvbVar.f;
        return this.b.equals(uvbVar.b) && this.e == uvbVar.e;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, 0, this.b);
    }

    public final String toString() {
        return "HighQualityTransformation{width=" + this.c + ", height=" + this.d + ", config=" + String.valueOf(this.e) + ", tintColor=0, renderer=" + this.b.toString() + "}";
    }
}
