package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkj implements dkl {
    private final dbh a;
    private final ddx b;
    private final List c;

    public dkj(InputStream inputStream, List list, ddx ddxVar) {
        this.b = ddxVar;
        this.c = list;
        this.a = new dbh(inputStream, ddxVar);
    }

    @Override // defpackage.dkl
    public final int a() {
        dkq dkqVar = this.a.a;
        dkqVar.reset();
        return dai.a(this.c, dkqVar, this.b);
    }

    @Override // defpackage.dkl
    public final Bitmap b(BitmapFactory.Options options) {
        dkq dkqVar = this.a.a;
        dkqVar.reset();
        return dkg.a(dkqVar, options, this);
    }

    @Override // defpackage.dkl
    public final ImageHeaderParser$ImageType c() {
        dkq dkqVar = this.a.a;
        dkqVar.reset();
        return dai.d(this.c, dkqVar, this.b);
    }

    @Override // defpackage.dkl
    public final void d() {
        this.a.a.a();
    }

    @Override // defpackage.dkl
    public final boolean e() {
        dkq dkqVar = this.a.a;
        dkqVar.reset();
        dkqVar.mark(5242880);
        return dai.f(this.c, new dad(dkqVar, this.b));
    }
}
