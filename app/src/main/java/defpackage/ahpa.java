package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpa extends abww implements abyr {
    public ahpa() {
        super(ahpb.a);
    }

    public final void a(epb epbVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        ahpb ahpbVar = (ahpb) this.b;
        ahpb ahpbVar2 = ahpb.a;
        epbVar.getClass();
        abxs abxsVar = ahpbVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            ahpbVar.d = abxsVar.d(size + size);
        }
        ahpbVar.d.add(epbVar);
    }
}
