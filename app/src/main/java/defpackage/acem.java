package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acem extends abww implements abyr {
    public acem() {
        super(aceo.a);
    }

    public final void a(abvo abvoVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        aceo aceoVar = (aceo) this.b;
        aceo aceoVar2 = aceo.a;
        abxs abxsVar = aceoVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            aceoVar.d = abxsVar.d(size + size);
        }
        aceoVar.d.add(abvoVar);
    }
}
