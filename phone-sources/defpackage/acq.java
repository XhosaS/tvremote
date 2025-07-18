package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acq extends bko implements byc {
    public act a;

    public acq(act actVar) {
        this.a = actVar;
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        List list = this.a.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            acp acpVar = (acp) list.get(i);
            bpu bpuVar = acpVar.d;
            if (bpuVar != null) {
                long j = acpVar.c;
                int iA = cmf.a(j);
                int iB = cmf.b(j);
                float fA = iA - cmf.a(bpuVar.k);
                float fB = iB - cmf.b(r6);
                byuVar.p().c.y(fA, fB);
                float f = -fA;
                float f2 = -fB;
                try {
                    brx.k(byuVar, bpuVar);
                } finally {
                    byuVar.p().c.y(f, f2);
                }
            }
        }
        byuVar.r();
    }

    @Override // defpackage.bko
    public final void cd() {
        this.a.b = this;
    }

    @Override // defpackage.bko
    public final void ch() {
        this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acq) && yks.e(this.a, ((acq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
