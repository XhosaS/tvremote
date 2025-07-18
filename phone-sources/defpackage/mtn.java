package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import com.google.android.videos.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mtn extends mge {
    private final ImageView b;
    private final int c;
    private lwq d;

    public mtn(ImageView imageView, int i) {
        super(imageView);
        this.b = imageView;
        this.c = i;
    }

    private static void f(ImageView imageView) {
        imageView.setBackgroundColor(imageView.getContext().getColor(R.color.play_movies_secondary));
        imageView.setImageResource(2131231529);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.mge
    protected final Bitmap a(Bitmap bitmap) {
        tju tjuVar = this.d.e;
        int iA = tjuVar.a();
        if (iA != -1) {
            int i = this.c;
            ImageView imageView = this.b;
            RectF rectF = new RectF();
            int[] iArr = (int[]) tjuVar.e.get(iA);
            rectF.set(iArr[0], iArr[1], iArr[2], iArr[3]);
            Matrix matrix = new Matrix();
            float f = i;
            matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, f, f), Matrix.ScaleToFit.FILL);
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
            imageView.setImageMatrix(matrix);
        }
        return bitmap;
    }

    @Override // defpackage.mge
    public final void b(lwq lwqVar, idf idfVar, Executor executor) {
        this.d = lwqVar;
        if (lwqVar.e == null) {
            ImageView imageView = this.b;
            f(imageView);
            imageView.setVisibility(0);
        }
        super.b(lwqVar, idfVar, executor);
    }

    @Override // defpackage.mge
    protected final void c(Bitmap bitmap) {
        if (bitmap != null) {
            this.b.setImageBitmap(bitmap);
        } else {
            f(this.b);
        }
    }

    @Override // defpackage.mge
    public final void d() {
        super.d();
        this.b.setImageDrawable(null);
    }
}
