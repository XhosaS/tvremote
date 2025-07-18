package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lww {
    public final lwx a;
    public final int b;
    public final kp c = new kp();
    public final SparseArray d = new SparseArray();
    public int e;
    public int f;
    public int g;
    public SparseArray h;

    public lww(lwx lwxVar, int i) {
        this.a = lwxVar;
        this.b = i;
    }

    public final void a(tph tphVar, int i, boolean z, boolean z2) {
        lwn lwjVar;
        int i2 = tphVar.c;
        if (i2 != 0) {
            lwjVar = new lwi(tphVar.b, i, i2, z2);
        } else {
            long j = tphVar.d;
            lwjVar = j != 0 ? new lwj(tphVar.b, i, j, z2) : new lwm(tphVar.b, i, z2);
        }
        lwx lwxVar = this.a;
        int i3 = lwjVar.a;
        if (lwxVar.b(i3) == null) {
            return;
        }
        this.f++;
        SparseArray sparseArray = this.d;
        lwn lwnVar = (lwn) sparseArray.get(i3);
        sparseArray.put(i3, lwjVar);
        if (lwnVar != null) {
            lwnVar.e = lwjVar;
            lwjVar.d = lwnVar.c;
        }
        SparseArray sparseArray2 = (SparseArray) this.c.e(this.g);
        if (z || sparseArray2.indexOfKey(i3) < 0) {
            sparseArray2.put(i3, lwjVar);
        }
    }
}
