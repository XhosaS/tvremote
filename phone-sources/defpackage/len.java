package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class len implements idf {
    private final int a;
    private final mma b;

    public len(mma mmaVar) {
        this.a = 0;
        this.b = mmaVar;
    }

    @Override // defpackage.idf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ieg b(mee meeVar) {
        int i;
        byte[] bArr = meeVar.b;
        int i2 = meeVar.c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        Bitmap bitmapDecodeByteArray = null;
        if (options.outWidth >= 0) {
            int i3 = this.a;
            if (i3 != 0) {
                int i4 = options.outWidth;
                i = 1;
                while (true) {
                    i4 >>= 1;
                    if (i4 < i3) {
                        break;
                    }
                    i += i;
                }
            } else {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            options.inInputShareable = false;
            options.inMutable = true;
            mma mmaVar = this.b;
            if (mmaVar != null) {
                int i5 = options.outWidth * options.outHeight * 4;
                options.inBitmap = mmaVar.b(i5, Math.min(i5 + i5, 1048576 + i5));
            }
            try {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            } catch (IllegalArgumentException e) {
                if (options.inBitmap == null) {
                    throw e;
                }
                krd.d("Bitmap decode with inBitmap failed, trying again without inBitmap", e);
                options.inBitmap = null;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            }
        }
        return bitmapDecodeByteArray == null ? ieg.b(new mfh("failed to decode bitmap")) : ieg.f(bitmapDecodeByteArray);
    }

    public len(int i, mma mmaVar) {
        a.aD(i > 0, "desiredWidth must be > 0");
        this.a = i;
        this.b = mmaVar;
    }
}
