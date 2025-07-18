package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acej extends abww implements abyr {
    public acej() {
        super(acek.a);
    }

    public final void a(acby acbyVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acek acekVar = (acek) this.b;
        acek acekVar2 = acek.a;
        acbyVar.getClass();
        abxs abxsVar = acekVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acekVar.b = abxsVar.d(size + size);
        }
        acekVar.b.add(acbyVar);
    }

    public final void b(acby acbyVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acek acekVar = (acek) this.b;
        acek acekVar2 = acek.a;
        acbyVar.getClass();
        abxs abxsVar = acekVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acekVar.c = abxsVar.d(size + size);
        }
        acekVar.c.add(acbyVar);
    }
}
