package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dje implements dap {
    private final ddz a = new dea();

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        return c(jj$$ExternalSyntheticApiModelOutline0.m120m(obj), i, i2, danVar);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        jj$$ExternalSyntheticApiModelOutline0.m120m(obj);
        return true;
    }

    public final ddp c(ImageDecoder.Source source, int i, int i2, dan danVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new diy(i, i2, danVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new djf(bitmapDecodeBitmap, this.a);
    }
}
