package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diy implements ImageDecoder$OnHeaderDecodedListener {
    private final dkh a = dkh.a();
    private final int b;
    private final int c;
    private final czs d;
    private final djv e;
    private final boolean f;
    private final dao g;

    public diy(int i, int i2, dan danVar) {
        this.b = i;
        this.c = i2;
        this.d = (czs) danVar.b(djy.a);
        this.e = (djv) danVar.b(djv.g);
        dam damVar = djy.d;
        boolean z = false;
        if (danVar.b(damVar) != null && ((Boolean) danVar.b(damVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (dao) danVar.b(djy.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        dkh dkhVar = this.a;
        int width = this.b;
        int height = this.c;
        if (dkhVar.b(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == czs.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new dix());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fA);
        int iRound2 = Math.round(size.getHeight() * fA);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fA);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        dao daoVar = this.g;
        if (daoVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((daoVar == dao.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
