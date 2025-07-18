package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class czy implements dah {
    final /* synthetic */ dbk a;
    final /* synthetic */ ddx b;

    public czy(dbk dbkVar, ddx ddxVar) {
        this.a = dbkVar;
        this.b = ddxVar;
    }

    @Override // defpackage.dah
    public final ImageHeaderParser$ImageType a(czv czvVar) throws Throwable {
        dkq dkqVar;
        try {
            dkqVar = new dkq(new FileInputStream(this.a.a.rewind().getFileDescriptor()), this.b);
        } catch (Throwable th) {
            th = th;
            dkqVar = null;
        }
        try {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = czvVar.c(dkqVar);
            dkqVar.b();
            this.a.a.rewind();
            return imageHeaderParser$ImageTypeC;
        } catch (Throwable th2) {
            th = th2;
            if (dkqVar != null) {
                dkqVar.b();
            }
            this.a.a.rewind();
            throw th;
        }
    }
}
