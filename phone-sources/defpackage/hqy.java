package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqy implements ImageDecoder$OnHeaderDecodedListener {
    private final hsg a = hsg.a();
    private final int b;
    private final int c;
    private final hkv d;
    private final hru e;
    private final boolean f;
    private final hlm g;

    public hqy(int i, int i2, hll hllVar) {
        this.b = i;
        this.c = i2;
        this.d = (hkv) hllVar.b(hrx.a);
        this.e = (hru) hllVar.b(hru.g);
        hlk hlkVar = hrx.d;
        boolean z = false;
        if (hllVar.b(hlkVar) != null && ((Boolean) hllVar.b(hlkVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (hlm) hllVar.b(hrx.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        hsg hsgVar = this.a;
        int width = this.b;
        int height = this.c;
        if (hsgVar.b(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == hkv.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new hqx());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * fA), Math.round(fA * size.getHeight()));
        hlm hlmVar = this.g;
        if (hlmVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((hlmVar == hlm.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (Build.VERSION.SDK_INT >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
