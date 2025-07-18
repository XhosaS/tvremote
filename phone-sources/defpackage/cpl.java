package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpl extends cpd {
    public ArrayList aJ = new ArrayList();

    @Override // defpackage.cpd
    public final void V(ivx ivxVar) {
        super.V(ivxVar);
        int size = this.aJ.size();
        for (int i = 0; i < size; i++) {
            ((cpd) this.aJ.get(i)).V(ivxVar);
        }
    }

    public void W() {
        ArrayList arrayList = this.aJ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cpd cpdVar = (cpd) this.aJ.get(i);
            if (cpdVar instanceof cpl) {
                ((cpl) cpdVar).W();
            }
        }
    }

    public final void ab(cpd cpdVar) {
        this.aJ.remove(cpdVar);
        cpdVar.t();
    }

    @Override // defpackage.cpd
    public void t() {
        this.aJ.clear();
        super.t();
    }
}
