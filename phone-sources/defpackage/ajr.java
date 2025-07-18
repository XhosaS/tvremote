package defpackage;

import android.view.DragEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajr implements blo {
    final /* synthetic */ yjv a;
    final /* synthetic */ yjz b;
    final /* synthetic */ yjv c;
    final /* synthetic */ yjv d;
    final /* synthetic */ yjv e;
    final /* synthetic */ yjv f;

    public ajr(yjv yjvVar, yjz yjzVar, yjv yjvVar2, yjv yjvVar3, yjv yjvVar4, yjv yjvVar5) {
        this.a = yjvVar;
        this.b = yjzVar;
        this.c = yjvVar2;
        this.d = yjvVar3;
        this.e = yjvVar4;
        this.f = yjvVar5;
    }

    @Override // defpackage.blo
    public final void b(kw kwVar) {
        this.f.a(kwVar);
    }

    @Override // defpackage.blo
    public final void c(kw kwVar) {
        this.c.a(kwVar);
    }

    @Override // defpackage.blo
    public final void cc(kw kwVar) {
        DragEvent dragEvent = (DragEvent) kwVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        this.d.a(new bmx((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L)));
    }

    @Override // defpackage.blo
    public final void d(kw kwVar) {
        this.e.a(kwVar);
    }

    @Override // defpackage.blo
    public final boolean f(kw kwVar) {
        this.a.a(kwVar);
        DragEvent dragEvent = (DragEvent) kwVar.a;
        cvw cvwVar = new cvw(dragEvent.getClipData(), (byte[]) null);
        dragEvent.getClipDescription();
        ((Boolean) this.b.a(cvwVar, new cbp())).booleanValue();
        return true;
    }

    @Override // defpackage.blo
    public final void a() {
    }
}
