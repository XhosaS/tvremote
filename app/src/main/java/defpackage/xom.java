package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xom extends abww implements abyr {
    public xom() {
        super(xon.a);
    }

    public final void a(xoj xojVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        xon xonVar = (xon) this.b;
        xon xonVar2 = xon.a;
        abxs abxsVar = xonVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xonVar.b = abxsVar.d(size + size);
        }
        xonVar.b.add(xojVar);
    }
}
