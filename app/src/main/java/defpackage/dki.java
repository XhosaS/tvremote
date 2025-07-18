package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dki implements dkl {
    private final ByteBuffer a;
    private final List b;
    private final ddx c;

    public dki(ByteBuffer byteBuffer, List list, ddx ddxVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = ddxVar;
    }

    @Override // defpackage.dkl
    public final int a() {
        ByteBuffer byteBufferB = dpw.b(this.a);
        if (byteBufferB == null) {
            return -1;
        }
        return dai.b(this.b, new czz(byteBufferB, this.c));
    }

    @Override // defpackage.dkl
    public final Bitmap b(BitmapFactory.Options options) {
        return dkg.a(new dpu(dpw.b(this.a)), options, this);
    }

    @Override // defpackage.dkl
    public final ImageHeaderParser$ImageType c() {
        return dai.c(this.b, dpw.b(this.a));
    }

    @Override // defpackage.dkl
    public final boolean e() {
        ByteBuffer byteBufferB = dpw.b(this.a);
        if (byteBufferB == null) {
            return false;
        }
        return dai.f(this.b, new dac(byteBufferB, this.c));
    }

    @Override // defpackage.dkl
    public final void d() {
    }
}
