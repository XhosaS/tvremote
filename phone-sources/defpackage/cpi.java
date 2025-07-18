package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpi extends cpd {
    public cpd[] aJ = new cpd[4];
    public int aK = 0;

    public final void X(ArrayList arrayList, int i, cpy cpyVar) {
        for (int i2 = 0; i2 < this.aK; i2++) {
            cpyVar.d(this.aJ[i2]);
        }
        for (int i3 = 0; i3 < this.aK; i3++) {
            cme.o(this.aJ[i3], i, arrayList, cpyVar);
        }
    }

    public void Y() {
    }
}
