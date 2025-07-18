package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wjy extends czb {
    public wjy(cyg cygVar, dnd dndVar, dnm dnmVar, Context context) {
        super(cygVar, dndVar, dnmVar, context);
    }

    @Override // defpackage.czb
    public final /* bridge */ /* synthetic */ cyx a(Class cls) {
        return new wjx(this.a, this, cls, this.b);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx b() {
        return (wjx) super.b();
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx c() {
        return (wjx) a(Drawable.class);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx d(Bitmap bitmap) {
        return (wjx) c().e(bitmap);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx e(Drawable drawable) {
        return (wjx) c().f(drawable);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx f(Uri uri) {
        return (wjx) c().g(uri);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx g(Integer num) {
        return (wjx) c().h(num);
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx h(byte[] bArr) {
        return (wjx) c().j(bArr);
    }

    @Override // defpackage.czb
    protected final void r(dor dorVar) {
        super.r(new wjw().c(dorVar));
    }

    @Override // defpackage.czb
    public final /* synthetic */ cyx v() {
        return (wjx) c().i(null);
    }
}
