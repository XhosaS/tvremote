package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yv extends yn {
    public ArrayList aJ = new ArrayList();

    public final void P(yn ynVar) {
        this.aJ.remove(ynVar);
        ynVar.r();
    }

    public void c() {
        ArrayList arrayList = this.aJ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yn ynVar = (yn) this.aJ.get(i);
            if (ynVar instanceof yv) {
                ((yv) ynVar).c();
            }
        }
    }

    @Override // defpackage.yn
    public void r() {
        this.aJ.clear();
        super.r();
    }

    @Override // defpackage.yn
    public final void t(yb ybVar) {
        super.t(ybVar);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((yn) this.aJ.get(i)).t(ybVar);
        }
    }
}
