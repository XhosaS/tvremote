package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
class czx implements dah {
    final /* synthetic */ ByteBuffer a;

    public czx(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.dah
    public final ImageHeaderParser$ImageType a(czv czvVar) {
        try {
            return czvVar.d(this.a);
        } finally {
            dpw.b(this.a);
        }
    }
}
