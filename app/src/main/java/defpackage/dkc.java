package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkc implements czv {
    @Override // defpackage.czv
    public final int a(InputStream inputStream, ddx ddxVar) throws Throwable {
        asr asrVar = new asr(inputStream);
        asn asnVarA = asrVar.a("Orientation");
        int iA = 1;
        if (asnVarA != null) {
            try {
                iA = asnVarA.a(asrVar.k);
            } catch (NumberFormatException unused) {
            }
        }
        if (iA == 0) {
            return -1;
        }
        return iA;
    }

    @Override // defpackage.czv
    public final int b(ByteBuffer byteBuffer, ddx ddxVar) {
        int i = dpw.a;
        return a(new dpu(byteBuffer), ddxVar);
    }

    @Override // defpackage.czv
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.czv
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.czv
    public final boolean e(InputStream inputStream, ddx ddxVar) {
        return false;
    }

    @Override // defpackage.czv
    public final boolean f(ByteBuffer byteBuffer, ddx ddxVar) {
        return false;
    }
}
