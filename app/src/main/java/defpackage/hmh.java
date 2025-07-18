package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmh {
    public static Drawable a(Resources resources) throws Resources.NotFoundException {
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.s2_text_dot_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.s2_text_height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(R.color.G200, null));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setTextSize(resources.getDimension(R.dimen.s2_text_size));
        String string = resources.getString(R.string.middle_dot_character);
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        canvas.drawText(string, 0, string.length(), dimensionPixelSize / 2.0f, (dimensionPixelSize2 / 2.0f) - rect.exactCenterY(), paint);
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }
}
