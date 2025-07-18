package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjf implements nzy {
    @Override // defpackage.nzz
    public final abwk a() {
        return aczl.b;
    }

    @Override // defpackage.nzy
    public final /* bridge */ /* synthetic */ agff b(Object obj, nzx nzxVar) {
        final aczl aczlVar = (aczl) obj;
        final View viewO = nzxVar.o();
        if (viewO == null) {
            return agff.f(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((aczlVar.c & 1) != 0 && !aczlVar.d.isEmpty()) {
            return agff.g(new aggv() { // from class: mje
                @Override // defpackage.aggv
                public final void a() {
                    viewO.announceForAccessibility(aczlVar.d);
                }
            });
        }
        agff agffVar = agij.a;
        aggz aggzVar = agoh.n;
        return agffVar;
    }
}
