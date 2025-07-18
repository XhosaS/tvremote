package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.support.v7.appcompat.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvy implements pvx {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;

    public pvy(Context context) {
        this.b = context;
    }

    static final Rect c(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        float f2 = width;
        int height = bitmap.getHeight();
        float f3 = height;
        float f4 = f2 / f3;
        if (f4 == f) {
            return new Rect(0, 0, width, height);
        }
        if (f4 <= f) {
            int i = (height - ((int) (f2 * f))) / 2;
            return new Rect(0, i, width, i + width);
        }
        int i2 = (int) (f * f3);
        int i3 = (width - i2) / 2;
        return new Rect(i3, 0, i2 + i3, height);
    }

    static final Rect d(Bitmap bitmap) {
        return c(bitmap, 1.0f);
    }

    private static final void e(Canvas canvas, List list) {
        Paint paint = new Paint();
        int width = canvas.getWidth();
        int i = width / 2;
        int size = list.size();
        if (size == 0) {
            ((tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatars", R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, "ChimeImageProcessorImpl.java")).s("Got empty list of avatars to merge.");
            return;
        }
        if (size == 1) {
            canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, width, width), paint);
            return;
        }
        if (size == 2) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), c((Bitmap) list.get(1), 0.5f), new Rect(i, 0, width, width), paint);
            return;
        }
        if (size == 3) {
            canvas.drawBitmap((Bitmap) list.get(0), c((Bitmap) list.get(0), 0.5f), new Rect(0, 0, i, width), paint);
            canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
            canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(i, i, width, width), paint);
            return;
        }
        canvas.drawBitmap((Bitmap) list.get(0), d((Bitmap) list.get(0)), new Rect(0, 0, i, i), paint);
        canvas.drawBitmap((Bitmap) list.get(1), d((Bitmap) list.get(1)), new Rect(i, 0, width, i), paint);
        canvas.drawBitmap((Bitmap) list.get(2), d((Bitmap) list.get(2)), new Rect(0, i, i, width), paint);
        canvas.drawBitmap((Bitmap) list.get(3), d((Bitmap) list.get(3)), new Rect(i, i, width, width), paint);
    }

    @Override // defpackage.pvx
    public final Bitmap a(int i, List list) {
        if (list.isEmpty()) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            e(canvas, list);
            Paint paint = new Paint();
            int width = canvas.getWidth();
            int i2 = width / 2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(width / 4);
            paint.setColor(-16777216);
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            float f = i2;
            canvas.drawCircle(f, f, i2 + (r1 / 2), paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getCircularAvatar", '8', "ChimeImageProcessorImpl.java")).s("Failed to create circular avatar.");
            return null;
        } catch (OutOfMemoryError e2) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e2)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getCircularAvatar", '5', "ChimeImageProcessorImpl.java")).s("Failed to allocate memory.");
            return null;
        }
    }

    @Override // defpackage.pvx
    public final Bitmap b(int i, List list) throws Resources.NotFoundException {
        if (list.isEmpty()) {
            return null;
        }
        if (xfx.a.get().c() && list.size() == 1) {
            Bitmap bitmap = (Bitmap) list.get(0);
            if (bitmap.getWidth() == bitmap.getHeight()) {
                return bitmap;
            }
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.notifications_avatar_separator_stroke_width);
            e(canvas, list);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimensionPixelSize);
            paint.setColor(-16777216);
            int width = canvas.getWidth();
            int i2 = width / 2;
            int size = list.size();
            if (size == 0) {
                ((tvk) ((tvk) a.f()).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatarSeparators", 174, "ChimeImageProcessorImpl.java")).s("Got empty list of images to draw separator on.");
                return bitmapCreateBitmap;
            }
            if (size == 1) {
                ((tvk) a.l().j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "drawSquareAvatarSeparators", 178, "ChimeImageProcessorImpl.java")).s("Not adding any separators since there is only one image.");
                return bitmapCreateBitmap;
            }
            if (size == 2) {
                float f = i2;
                canvas.drawLine(f, 0.0f, f, width, paint);
                return bitmapCreateBitmap;
            }
            if (size != 3) {
                float f2 = width;
                float f3 = i2;
                canvas.drawLine(f3, 0.0f, f3, f2, paint);
                canvas.drawLine(0.0f, f3, f2, f3, paint);
                return bitmapCreateBitmap;
            }
            float f4 = width;
            float f5 = i2;
            canvas.drawLine(f5, 0.0f, f5, f4, paint);
            canvas.drawLine(f5, f5, f4, f5, paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getSquareAvatar", '\\', "ChimeImageProcessorImpl.java")).s("Failed to create square avatar.");
            return null;
        } catch (OutOfMemoryError e2) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e2)).j("com/google/android/libraries/notifications/internal/media/impl/ChimeImageProcessorImpl", "getSquareAvatar", 'Y', "ChimeImageProcessorImpl.java")).s("Failed to allocate memory.");
            return null;
        }
    }
}
