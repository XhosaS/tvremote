package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm implements dmo {
    private final ddz a;
    private final dmo b;
    private final dmo c;

    public dmm(ddz ddzVar, dmo dmoVar, dmo dmoVar2) {
        this.a = ddzVar;
        this.b = dmoVar;
        this.c = dmoVar2;
    }

    @Override // defpackage.dmo
    public final ddp a(ddp ddpVar, dan danVar) {
        Drawable drawable = (Drawable) ddpVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(djf.f(((BitmapDrawable) drawable).getBitmap(), this.a), danVar);
        }
        if (drawable instanceof dlz) {
            return this.c.a(ddpVar, danVar);
        }
        return null;
    }
}
