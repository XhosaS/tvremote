package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyp extends abww implements abyr {
    public wyp() {
        super(wyr.a);
    }

    public final void a(wvv wvvVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        wyr wyrVar = (wyr) this.b;
        wyr wyrVar2 = wyr.a;
        wvvVar.getClass();
        abxs abxsVar = wyrVar.e;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            wyrVar.e = abxsVar.d(size + size);
        }
        wyrVar.e.add(wvvVar);
    }
}
