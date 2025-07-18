package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzk extends hzl {
    final /* synthetic */ hzr a;
    private final Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(hzr hzrVar, Path path, float f) {
        super(hzrVar, f, 0.0f);
        this.a = hzrVar;
        this.e = path;
    }

    @Override // defpackage.hzl, defpackage.hzp
    public final void a(String str) {
        hzr hzrVar = this.a;
        if (hzrVar.i()) {
            hzn hznVar = hzrVar.d;
            if (hznVar.b) {
                hzrVar.a.drawTextOnPath(str, this.e, this.b, this.c, hznVar.d);
            }
            hzn hznVar2 = hzrVar.d;
            if (hznVar2.c) {
                hzrVar.a.drawTextOnPath(str, this.e, this.b, this.c, hznVar2.e);
            }
        }
        this.b += hzrVar.d.d.measureText(str);
    }
}
