package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sut extends syi {
    final /* synthetic */ suv a;

    public sut(suv suvVar) {
        this.a = suvVar;
    }

    @Override // defpackage.syi
    public final void a(int i) {
        suv suvVar = this.a;
        suvVar.c = true;
        suu suuVar = (suu) suvVar.d.get();
        if (suuVar != null) {
            suuVar.g();
        }
    }

    @Override // defpackage.syi
    public final void b(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        suv suvVar = this.a;
        suvVar.c = true;
        suu suuVar = (suu) suvVar.d.get();
        if (suuVar != null) {
            suuVar.g();
        }
    }
}
