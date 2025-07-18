package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AvatarView extends AppCompatImageView {
    private final RectF a;
    private final RectF b;
    private final Matrix c;
    private final Paint d;
    private BitmapShader e;
    private Bitmap f;
    private Bitmap g;
    private final boolean h;

    public AvatarView(Context context) throws Resources.NotFoundException {
        super(context);
        this.h = true;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        a();
    }

    private final void a() {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), R.drawable.peoplekit_default_avatar);
        this.g = c(drawable);
        Canvas canvas = new Canvas(this.g);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.e = new BitmapShader(this.g, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    private final void b() {
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            return;
        }
        this.e = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    }

    private static final Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            return Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.clipRect(0, 0, getHeight(), getWidth());
        if (this.f == null) {
            return;
        }
        Paint paint = this.d;
        Matrix matrix = this.c;
        matrix.reset();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, r0.getWidth(), r0.getHeight());
        RectF rectF2 = this.b;
        rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        this.e.setLocalMatrix(matrix);
        paint.setShader(this.e);
        if (this.h) {
            canvas.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, paint);
        } else {
            canvas.drawRect(rectF2, paint);
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f = bitmap;
        b();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f = c(drawable);
        b();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        this.f = c(getDrawable());
        b();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f = uri != null ? c(getDrawable()) : null;
        b();
    }

    public AvatarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.h = true;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        a();
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.h = true;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new Matrix();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        a();
    }
}
