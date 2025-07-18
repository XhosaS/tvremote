package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzm extends hzp {
    public float a;
    public final float b;
    public final Path c;
    final /* synthetic */ hzr d;

    public hzm(hzr hzrVar, float f, float f2, Path path) {
        this.d = hzrVar;
        this.a = f;
        this.b = f2;
        this.c = path;
    }

    @Override // defpackage.hzp
    public final void a(String str) {
        String str2;
        hzr hzrVar = this.d;
        if (hzrVar.i()) {
            Path path = new Path();
            str2 = str;
            hzrVar.d.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
            this.c.addPath(path);
        } else {
            str2 = str;
        }
        this.a += hzrVar.d.d.measureText(str2);
    }

    @Override // defpackage.hzp
    public final boolean b(hza hzaVar) {
        if (!(hzaVar instanceof hzb)) {
            return true;
        }
        hzr.h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }
}
