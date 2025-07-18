package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmy extends abww implements abyr {
    public abmy() {
        super(abmz.a);
    }

    public final void a(xjr xjrVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        abmz abmzVar = (abmz) this.b;
        abmz abmzVar2 = abmz.a;
        abxs abxsVar = abmzVar.i;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abmzVar.i = abxsVar.d(size + size);
        }
        abmzVar.i.add(xjrVar);
    }
}
