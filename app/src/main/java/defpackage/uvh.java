package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvh extends djg {
    private static final Paint b;
    private final uvo c;
    private final uvo d;
    private final Rect e;
    private final boolean f;
    private final int g;
    private final int h;
    private final Bitmap.Config i;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        b = paint;
    }

    public uvh(uvo uvoVar, uvo uvoVar2, Rect rect, int i, int i2, Bitmap.Config config) {
        this.c = uvoVar;
        if (uvoVar.e()) {
            this.g = i / 2;
            this.h = i2 / 2;
            this.d = null;
            this.e = null;
        } else {
            this.g = i;
            this.h = i2;
            this.d = uvoVar2;
            this.e = rect;
        }
        this.f = uvoVar.f();
        if (!uvp.a() && config == uvp.b) {
            config = Bitmap.Config.ARGB_8888;
        }
        this.i = config;
    }

    private final void d(Canvas canvas, Bitmap bitmap) {
        if (this.c.e()) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            rect.set(0, 0, this.g, this.h);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iWidth = rect.width();
        int iHeight = rect.height();
        int iMin = Math.min(iWidth, ((width * iHeight) + (height / 2)) / height);
        int iMin2 = Math.min(iHeight, ((height * iWidth) + (width / 2)) / width);
        int i = iWidth - iMin;
        rect.left += i / 2;
        rect.right -= (i + 1) / 2;
        int i2 = iHeight - iMin2;
        rect.top += i2 / 2;
        rect.bottom -= (i2 + 1) / 2;
        canvas.drawBitmap(bitmap, (Rect) null, rect, b);
    }

    private final void e(uvo uvoVar, Canvas canvas, bho bhoVar) {
        if (uvoVar != null) {
            if (bhoVar != null) {
                uvoVar.c(canvas, bhoVar);
            } else {
                uvoVar.i(canvas);
            }
        }
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(toString().getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.djg
    protected final Bitmap c(ddz ddzVar, Bitmap bitmap) {
        bho bhoVarA;
        Canvas canvas;
        boolean z = this.f;
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
        bho bhoVar = true != z ? null : bhoVarA;
        Bitmap.Config config = this.i;
        if (config == uvp.b) {
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(this.g, this.h);
            e(this.d, canvasBeginRecording, bhoVar);
            d(canvasBeginRecording, bitmap);
            e(this.c, canvasBeginRecording, bhoVar);
            picture.endRecording();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(picture);
            uvp.b(bitmapCreateBitmap, bhoVarA);
            return bitmapCreateBitmap;
        }
        if (bitmap.isMutable() && bitmap.getWidth() == this.g && bitmap.getHeight() == this.h && bitmap.getConfig() == config && this.d == null && this.e == null) {
            canvas = new Canvas(bitmap);
        } else {
            Bitmap bitmapB = ddzVar.b(this.g, this.h, config);
            Canvas canvas2 = new Canvas(bitmapB);
            e(this.d, canvas2, bhoVar);
            d(canvas2, bitmap);
            bitmap = bitmapB;
            canvas = canvas2;
        }
        e(this.c, canvas, bhoVar);
        canvas.setBitmap(null);
        uvp.b(bitmap, bhoVarA);
        return bitmap;
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uvh uvhVar = (uvh) obj;
            if (this.g == uvhVar.g && this.h == uvhVar.h && this.c.equals(uvhVar.c) && Objects.equals(this.d, uvhVar.d) && Objects.equals(this.e, uvhVar.e) && this.i == uvhVar.i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, 0);
    }

    public final String toString() {
        Bitmap.Config config = this.i;
        Rect rect = this.e;
        uvo uvoVar = this.d;
        return "ScrimBitmapTransformation{overlay=" + this.c.toString() + ", underlay=" + String.valueOf(uvoVar) + ", imageRect=" + String.valueOf(rect) + ", widthPixels=" + this.g + ", heightPixels=" + this.h + ", config=" + String.valueOf(config) + ", tintColor=0}";
    }
}
