package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class u extends p {
    public final ArrayList an = new ArrayList();

    public final void B(p pVar) {
        this.an.remove(pVar);
        pVar.r = null;
    }

    @Override // defpackage.p
    public void e() {
        this.an.clear();
        super.e();
    }

    @Override // defpackage.p
    public final void f(i iVar) {
        super.f(iVar);
        ArrayList arrayList = this.an;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p) arrayList.get(i)).f(iVar);
        }
    }

    @Override // defpackage.p
    public final void k(int i, int i2) {
        this.C = i;
        this.D = i2;
        ArrayList arrayList = this.an;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p) arrayList.get(i3)).k(this.w + this.C, this.x + this.D);
        }
    }

    @Override // defpackage.p
    public final void n() {
        super.n();
        ArrayList arrayList = this.an;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            pVar.k(this.y + this.C, this.z + this.D);
            if (!(pVar instanceof q)) {
                pVar.n();
            }
        }
    }

    public void z() {
        n();
        ArrayList arrayList = this.an;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p pVar = (p) arrayList.get(i);
            if (pVar instanceof u) {
                ((u) pVar).z();
            }
        }
    }
}
