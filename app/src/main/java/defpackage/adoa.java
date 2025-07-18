package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adoa extends abwy implements abxa {
    public adoa() {
        super(adob.a);
    }

    public final void a(adny adnyVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        adob adobVar = (adob) this.b;
        adnz adnzVar = (adnz) adnyVar.v();
        adob adobVar2 = adob.a;
        adnzVar.getClass();
        abxs abxsVar = adobVar.c;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            adobVar.c = abxsVar.d(size + size);
        }
        adobVar.c.add(adnzVar);
    }
}
