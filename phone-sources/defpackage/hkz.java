package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkz implements hlf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hkz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hlf
    public final ImageHeaderParser$ImageType a(hky hkyVar) throws IOException {
        if (this.b != 0) {
            try {
                return hkyVar.a((InputStream) this.a);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return hkyVar.b((ByteBuffer) this.a);
        } finally {
            hwc.b((ByteBuffer) this.a);
        }
    }
}
