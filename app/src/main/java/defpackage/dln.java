package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dln {
    public final List a;
    public final ddx b;

    public dln(List list, ddx ddxVar) {
        this.a = list;
        this.b = ddxVar;
    }

    final ddp a(ImageDecoder.Source source, int i, int i2, dan danVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new diy(i, i2, danVar));
        if (jj$$ExternalSyntheticApiModelOutline0.m$1(drawableDecodeDrawable)) {
            return new dlk(jj$$ExternalSyntheticApiModelOutline0.m121m((Object) drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    public final boolean b(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
