package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djf implements ddp, ddk {
    private final Bitmap a;
    private final ddz b;

    public djf(Bitmap bitmap, ddz ddzVar) {
        dqk.d(bitmap, "Bitmap must not be null");
        this.a = bitmap;
        this.b = ddzVar;
    }

    public static djf f(Bitmap bitmap, ddz ddzVar) {
        if (bitmap == null) {
            return null;
        }
        return new djf(bitmap, ddzVar);
    }

    @Override // defpackage.ddp
    public final int a() {
        return dqm.a(this.a);
    }

    @Override // defpackage.ddp
    public final Class b() {
        return Bitmap.class;
    }

    @Override // defpackage.ddp
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.ddk
    public final void d() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.ddp
    public final void e() {
        this.b.d(this.a);
    }
}
