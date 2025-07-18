package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class admp extends abww implements abyr {
    public admp() {
        super(admq.a);
    }

    public final void a(adsm adsmVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        admq admqVar = (admq) this.b;
        admq admqVar2 = admq.a;
        adsmVar.getClass();
        abxs abxsVar = admqVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            admqVar.e = abxsVar.d(size + size);
        }
        admqVar.e.add(adsmVar);
    }
}
