package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acpk extends abww implements abyr {
    public acpk() {
        super(acpp.a);
    }

    public final void a(acpl acplVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acpp acppVar = (acpp) this.b;
        acpo acpoVar = (acpo) acplVar.v();
        acpp acppVar2 = acpp.a;
        acpoVar.getClass();
        abxs abxsVar = acppVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acppVar.c = abxsVar.d(size + size);
        }
        acppVar.c.add(acpoVar);
    }
}
