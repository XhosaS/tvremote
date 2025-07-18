package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rds extends abww implements abyr {
    public rds() {
        super(rdt.a);
    }

    public final void a(String str) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        rdt rdtVar = (rdt) this.b;
        rdt rdtVar2 = rdt.a;
        abxs abxsVar = rdtVar.j;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            rdtVar.j = abxsVar.d(size + size);
        }
        rdtVar.j.add(str);
    }
}
