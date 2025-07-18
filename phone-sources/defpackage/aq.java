package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aq extends am {
    public final ArrayList al = new ArrayList();

    public void D() {
        q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            am amVar = (am) arrayList.get(i);
            if (amVar instanceof aq) {
                ((aq) amVar).D();
            }
        }
    }

    public final void F(am amVar) {
        this.al.remove(amVar);
        amVar.r = null;
    }

    @Override // defpackage.am
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.am
    public final void n(int i, int i2) {
        super.n(i, i2);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((am) arrayList.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.am
    public final void q() {
        super.q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            am amVar = (am) arrayList.get(i);
            amVar.n(b(), c());
            if (!(amVar instanceof an)) {
                amVar.q();
            }
        }
    }

    @Override // defpackage.am
    public final void z(ivx ivxVar) {
        super.z(ivxVar);
        ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((am) arrayList.get(i)).z(ivxVar);
        }
    }
}
