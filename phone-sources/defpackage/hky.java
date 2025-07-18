package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface hky {
    ImageHeaderParser$ImageType a(InputStream inputStream);

    ImageHeaderParser$ImageType b(ByteBuffer byteBuffer);

    int c(InputStream inputStream, hok hokVar);

    int d(ByteBuffer byteBuffer, hok hokVar);

    boolean e(InputStream inputStream, hok hokVar);

    boolean f(ByteBuffer byteBuffer, hok hokVar);
}
