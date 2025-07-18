package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkg extends abww implements abyr {
    public adkg() {
        super(adkh.a);
    }

    public final void a(adjm adjmVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        adkh adkhVar = (adkh) this.b;
        adkh adkhVar2 = adkh.a;
        abxs abxsVar = adkhVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            adkhVar.d = abxsVar.d(size + size);
        }
        adkhVar.d.add(adjmVar);
    }
}
