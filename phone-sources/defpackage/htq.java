package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htq implements hts {
    private final /* synthetic */ int a;
    private final Object b;

    public htq(int i) {
        this.a = i;
        this.b = Bitmap.CompressFormat.JPEG;
    }

    @Override // defpackage.hts
    public final hnv a(hnv hnvVar, hll hllVar) {
        if (this.a == 0) {
            return hsj.f((Resources) this.b, hnvVar);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) hnvVar.c()).compress((Bitmap.CompressFormat) this.b, 100, byteArrayOutputStream);
        hnvVar.e();
        return new hsz(byteArrayOutputStream.toByteArray(), 0);
    }

    public htq(Resources resources, int i) {
        this.a = i;
        hju.p(resources);
        this.b = resources;
    }
}
