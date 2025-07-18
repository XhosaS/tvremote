package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkg {
    public static Bitmap a(InputStream inputStream, BitmapFactory.Options options, dkl dklVar) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !dkf.a(options) || !c(dklVar)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        dqk.a(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapB = b(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapB;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null && gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
            ColorMatrixColorFilter colorMatrixColorFilter = dkd.a;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            if (gainmapContents.getConfig() == Bitmap.Config.ALPHA_8) {
                dqk.a(gainmapContents.getConfig() == Bitmap.Config.ALPHA_8, "");
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setColorFilter(dkd.a);
                canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                Gainmap gainmap2 = new Gainmap(bitmapCreateBitmap);
                float[] ratioMin = gainmap.getRatioMin();
                gainmap2.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                float[] ratioMax = gainmap.getRatioMax();
                gainmap2.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                float[] gamma = gainmap.getGamma();
                gainmap2.setGamma(gamma[0], gamma[1], gamma[2]);
                float[] epsilonSdr = gainmap.getEpsilonSdr();
                gainmap2.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                float[] epsilonHdr = gainmap.getEpsilonHdr();
                gainmap2.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                gainmap2.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                gainmap2.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                gainmap = gainmap2;
            }
            bitmap.setGainmap(gainmap);
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static boolean c(dkl dklVar) {
        try {
            boolean zE = dklVar.e();
            if (Log.isLoggable("GlideBitmapFactory", 2)) {
                Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zE);
            }
            return zE;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }
}
