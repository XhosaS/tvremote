package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgx extends abww implements abyr {
    public xgx() {
        super(xgy.a);
    }

    public final void a(xjr xjrVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        xgy xgyVar = (xgy) this.b;
        xgy xgyVar2 = xgy.a;
        abxs abxsVar = xgyVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xgyVar.b = abxsVar.d(size + size);
        }
        xgyVar.b.add(xjrVar);
    }
}
