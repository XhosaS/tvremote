package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lcm implements lco {
    public final lbk y;

    public lcm(lbk lbkVar) {
        kkk.k(lbkVar);
        this.y = lbkVar;
    }

    @Override // defpackage.lco
    public final kts aA() {
        throw null;
    }

    @Override // defpackage.lco
    public final lab aB() {
        throw null;
    }

    @Override // defpackage.lco
    public final lbh aC() {
        throw null;
    }

    @Override // defpackage.lco
    public final void aD() {
        throw null;
    }

    public final void ac() {
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        if (Thread.currentThread() != lbhVar.c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // defpackage.lco
    public final Context az() {
        throw null;
    }

    public void g() {
        lbk lbkVar = this.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
    }
}
