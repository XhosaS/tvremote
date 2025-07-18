package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class czw implements dah {
    final /* synthetic */ InputStream a;

    public czw(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.dah
    public final ImageHeaderParser$ImageType a(czv czvVar) throws IOException {
        try {
            return czvVar.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
