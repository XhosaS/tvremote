package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gly implements dvi {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gly(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.dvi
    public final void a(dvk dvkVar, dvc dvcVar) {
        if (this.c == 0) {
            if (dvcVar == dvc.ON_DESTROY) {
                ((Handler) this.a).removeCallbacks(this.b);
                dvkVar.getLifecycle().d(this);
                return;
            }
            return;
        }
        gmd gmdVar = (gmd) this.a;
        if (gmdVar.f()) {
            return;
        }
        dvkVar.getLifecycle().d(this);
        rbx rbxVar = (rbx) this.b;
        if (rbxVar.a().isAttachedToWindow()) {
            gmdVar.h(rbxVar);
        }
    }
}
