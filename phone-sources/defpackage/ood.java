package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ood extends nzo {
    private final List a;

    private ood(nzp nzpVar) {
        super(nzpVar);
        this.a = new ArrayList();
        this.f.c("TaskOnStopCallback", this);
    }

    public static ood a(Activity activity) {
        ood oodVar;
        nzp nzpVarL = l(activity);
        synchronized (nzpVarL) {
            oodVar = (ood) nzpVarL.b("TaskOnStopCallback", ood.class);
            if (oodVar == null) {
                oodVar = new ood(nzpVarL);
            }
        }
        return oodVar;
    }

    public final void b(ooa ooaVar) {
        List list = this.a;
        synchronized (list) {
            list.add(new WeakReference(ooaVar));
        }
    }

    @Override // defpackage.nzo
    public final void j() {
        List list = this.a;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ooa ooaVar = (ooa) ((WeakReference) it.next()).get();
                if (ooaVar != null) {
                    ooaVar.a();
                }
            }
            list.clear();
        }
    }
}
