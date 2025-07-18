package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkn implements ddp, ddk {
    private final Resources a;
    private final ddp b;

    private dkn(Resources resources, ddp ddpVar) {
        dqk.d(resources, "Argument must not be null");
        this.a = resources;
        this.b = ddpVar;
    }

    public static ddp f(Resources resources, ddp ddpVar) {
        if (ddpVar == null) {
            return null;
        }
        return new dkn(resources, ddpVar);
    }

    @Override // defpackage.ddp
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ddp
    public final Class b() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.ddp
    public final /* bridge */ /* synthetic */ Object c() {
        return new BitmapDrawable(this.a, (Bitmap) this.b.c());
    }

    @Override // defpackage.ddk
    public final void d() {
        ddp ddpVar = this.b;
        if (ddpVar instanceof ddk) {
            ((ddk) ddpVar).d();
        }
    }

    @Override // defpackage.ddp
    public final void e() {
        this.b.e();
    }
}
