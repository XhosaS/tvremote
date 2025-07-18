package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmz extends abww implements abyr {
    public xmz() {
        super(xna.a);
    }

    public final void a(xne xneVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        xna xnaVar = (xna) this.b;
        xna xnaVar2 = xna.a;
        abxs abxsVar = xnaVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xnaVar.b = abxsVar.d(size + size);
        }
        xnaVar.b.add(xneVar);
    }
}
