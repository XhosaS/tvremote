package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stm extends abww implements abyr {
    public stm() {
        super(stn.a);
    }

    public final void a(ssz sszVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        stn stnVar = (stn) this.b;
        stn stnVar2 = stn.a;
        abxs abxsVar = stnVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            stnVar.b = abxsVar.d(size + size);
        }
        stnVar.b.add(sszVar);
    }
}
