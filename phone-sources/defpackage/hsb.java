package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsb implements hky {
    @Override // defpackage.hky
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.hky
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.hky
    public final int c(InputStream inputStream, hok hokVar) {
        int iC = new dhw(inputStream).c();
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // defpackage.hky
    public final int d(ByteBuffer byteBuffer, hok hokVar) {
        int i = hwc.a;
        return c(new hwb(byteBuffer), hokVar);
    }

    @Override // defpackage.hky
    public final boolean e(InputStream inputStream, hok hokVar) {
        return false;
    }

    @Override // defpackage.hky
    public final boolean f(ByteBuffer byteBuffer, hok hokVar) {
        return false;
    }
}
