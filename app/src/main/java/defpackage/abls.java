package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abls extends abwy implements abxa {
    public abls() {
        super(ablt.a);
    }

    public final void a(abln ablnVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ablt abltVar = (ablt) this.b;
        ablt abltVar2 = ablt.a;
        abxs abxsVar = abltVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            abltVar.d = abxsVar.d(size + size);
        }
        abltVar.d.add(ablnVar);
    }
}
