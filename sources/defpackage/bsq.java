package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bsq implements amd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bsq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.amd
    public final void a(ami amiVar) {
        if (this.b != 0) {
            cbt cbtVar = bsr.a;
            ((Handler) this.a).removeCallbacksAndMessages(null);
            return;
        }
        boolean z = false;
        if (amiVar.d()) {
            anc ancVar = ((ang) ((apl) amiVar.c()).a).a;
            qp.p(ancVar);
            if (ancVar.a == 1) {
                z = true;
            }
        }
        ((bsr) this.a).a(z);
    }
}
