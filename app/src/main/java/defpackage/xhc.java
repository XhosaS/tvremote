package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhc extends abww implements abyr {
    public xhc() {
        super(xhd.a);
    }

    public final void a(xjr xjrVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        xhd xhdVar = (xhd) this.b;
        xhd xhdVar2 = xhd.a;
        abxs abxsVar = xhdVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xhdVar.b = abxsVar.d(size + size);
        }
        xhdVar.b.add(xjrVar);
    }
}
