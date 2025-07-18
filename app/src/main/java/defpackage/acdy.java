package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdy extends abww implements abyr {
    public acdy() {
        super(acdz.a);
    }

    public final void a(acem acemVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        acdz acdzVar = (acdz) this.b;
        aceo aceoVar = (aceo) acemVar.v();
        acdz acdzVar2 = acdz.a;
        aceoVar.getClass();
        abxs abxsVar = acdzVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            acdzVar.d = abxsVar.d(size + size);
        }
        acdzVar.d.add(aceoVar);
    }
}
