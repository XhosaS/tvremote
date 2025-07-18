package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileDescriptor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkk implements dkl {
    private final ddx a;
    private final List b;
    private final dbk c;

    public dkk(ParcelFileDescriptor parcelFileDescriptor, List list, ddx ddxVar) {
        this.a = ddxVar;
        this.b = list;
        this.c = new dbk(parcelFileDescriptor);
    }

    @Override // defpackage.dkl
    public final int a() {
        return dai.b(this.b, new dab(this.c, this.a));
    }

    @Override // defpackage.dkl
    public final Bitmap b(BitmapFactory.Options options) throws Throwable {
        FileDescriptor fileDescriptor = this.c.a.rewind().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !dkf.a(options) || !dkg.c(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        dqk.a(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapB = dkg.b(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapB;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeFileDescriptor;
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

    @Override // defpackage.dkl
    public final ImageHeaderParser$ImageType c() {
        return dai.e(this.b, new czy(this.c, this.a));
    }

    @Override // defpackage.dkl
    public final boolean e() {
        return dai.f(this.b, new dae(this.c, this.a));
    }

    @Override // defpackage.dkl
    public final void d() {
    }
}
