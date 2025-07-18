package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsh implements hsi {
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public hsh(ByteBuffer byteBuffer, List list, hok hokVar, int i) {
        this.b = i;
        this.d = byteBuffer;
        this.a = list;
        this.c = hokVar;
    }

    @Override // defpackage.hsi
    public final int a() {
        int i = this.b;
        if (i == 0) {
            return hju.e(this.a, ((hmf) this.c).a(), (hok) this.d);
        }
        if (i != 1) {
            return hju.a(this.a, new hlb((hmi) this.c, (hok) this.d, 2));
        }
        ByteBuffer byteBufferB = hwc.b((ByteBuffer) this.d);
        if (byteBufferB == null) {
            return -1;
        }
        return hju.a(this.a, new hlb(byteBufferB, (hok) this.c, 1));
    }

    @Override // defpackage.hsi
    public final Bitmap b(BitmapFactory.Options options) throws Throwable {
        int i = this.b;
        if (i == 0) {
            return hju.g(((hmf) this.c).a(), options, this);
        }
        if (i == 1) {
            return hju.g(new hwb(hwc.b((ByteBuffer) this.d)), options, this);
        }
        FileDescriptor fileDescriptor = ((hmi) this.c).a().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !hsf.a(options) || !hju.i(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        hju.m(options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapH = hju.h(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapH;
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

    @Override // defpackage.hsi
    public final ImageHeaderParser$ImageType c() {
        int i = this.b;
        if (i == 0) {
            return hju.f(this.a, ((hmf) this.c).a(), (hok) this.d);
        }
        if (i == 1) {
            return hju.b(this.a, hwc.b((ByteBuffer) this.d));
        }
        return hju.c(this.a, new hla((hmi) this.c, (hok) this.d));
    }

    @Override // defpackage.hsi
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((hmf) this.c).a.a();
    }

    @Override // defpackage.hsi
    public final boolean e() {
        int i = this.b;
        if (i == 0) {
            InputStream inputStreamA = ((hmf) this.c).a();
            inputStreamA.mark(5242880);
            return hju.d(this.a, new hlc(inputStreamA, (hok) this.d, 0));
        }
        if (i != 1) {
            return hju.d(this.a, new hlc((hmi) this.c, (hok) this.d, 2));
        }
        ByteBuffer byteBufferB = hwc.b((ByteBuffer) this.d);
        if (byteBufferB == null) {
            return false;
        }
        return hju.d(this.a, new hlc(byteBufferB, (hok) this.c, 1));
    }

    public hsh(InputStream inputStream, List list, hok hokVar, int i) {
        this.b = i;
        hju.p(hokVar);
        this.d = hokVar;
        hju.p(list);
        this.a = list;
        this.c = new hmf(inputStream, hokVar);
    }

    public hsh(ParcelFileDescriptor parcelFileDescriptor, List list, hok hokVar, int i) {
        this.b = i;
        hju.p(hokVar);
        this.d = hokVar;
        hju.p(list);
        this.a = list;
        this.c = new hmi(parcelFileDescriptor);
    }
}
