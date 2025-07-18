package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rip extends abww implements abyr {
    public rip() {
        super(riq.a);
    }

    public final void a(String str) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        riq riqVar = (riq) this.b;
        riq riqVar2 = riq.a;
        str.getClass();
        abxs abxsVar = riqVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            riqVar.c = abxsVar.d(size + size);
        }
        riqVar.c.add(str);
    }
}
