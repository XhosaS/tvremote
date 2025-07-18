package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hla implements hlf {
    final /* synthetic */ hmi a;
    final /* synthetic */ hok b;

    public hla(hmi hmiVar, hok hokVar) {
        this.a = hmiVar;
        this.b = hokVar;
    }

    @Override // defpackage.hlf
    public final ImageHeaderParser$ImageType a(hky hkyVar) throws Throwable {
        hsl hslVar;
        try {
            hslVar = new hsl(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
            hslVar = null;
        }
        try {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = hkyVar.a(hslVar);
            hslVar.b();
            this.a.a();
            return imageHeaderParser$ImageTypeA;
        } catch (Throwable th2) {
            th = th2;
            if (hslVar != null) {
                hslVar.b();
            }
            this.a.a();
            throw th;
        }
    }
}
