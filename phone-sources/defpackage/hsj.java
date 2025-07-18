package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsj implements hnv, hns {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public hsj(Bitmap bitmap, hod hodVar, int i) {
        this.a = i;
        a.ar(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        a.ar(hodVar, "BitmapPool must not be null");
        this.c = hodVar;
    }

    public static hnv f(Resources resources, hnv hnvVar) {
        if (hnvVar == null) {
            return null;
        }
        return new hsj(resources, hnvVar, 0);
    }

    public static hsj g(Bitmap bitmap, hod hodVar) {
        if (bitmap == null) {
            return null;
        }
        return new hsj(bitmap, hodVar, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hnv, java.lang.Object] */
    @Override // defpackage.hnv
    public final int a() {
        return this.a != 0 ? hwp.a((Bitmap) this.b) : this.c.a();
    }

    @Override // defpackage.hnv
    public final Class b() {
        return this.a != 0 ? Bitmap.class : BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hnv, java.lang.Object] */
    @Override // defpackage.hnv
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.hns
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof hns) {
            ((hns) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hnv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hod, java.lang.Object] */
    @Override // defpackage.hnv
    public final void e() {
        if (this.a != 0) {
            this.c.d((Bitmap) this.b);
        } else {
            this.c.e();
        }
    }

    private hsj(Resources resources, hnv hnvVar, int i) {
        this.a = i;
        hju.p(resources);
        this.b = resources;
        hju.p(hnvVar);
        this.c = hnvVar;
    }
}
