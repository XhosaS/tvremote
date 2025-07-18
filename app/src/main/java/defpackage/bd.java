package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bd implements bcy {
    final /* synthetic */ bf a;

    public bd(bf bfVar) {
        this.a = bfVar;
    }

    @Override // defpackage.bcy
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((bcl) obj) != null) {
            bf bfVar = this.a;
            if (bfVar.b) {
                View viewCP = bfVar.cP();
                if (viewCP.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (bfVar.c != null) {
                    if (de.S(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + bfVar.c);
                    }
                    bfVar.c.setContentView(viewCP);
                }
            }
        }
    }
}
