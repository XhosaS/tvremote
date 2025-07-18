package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsh extends abww implements abyr {
    public wsh() {
        super(wsi.a);
    }

    public final void a(wsg wsgVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        wsi wsiVar = (wsi) this.b;
        wsi wsiVar2 = wsi.a;
        wsgVar.getClass();
        abxs abxsVar = wsiVar.d;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            wsiVar.d = abxsVar.d(size + size);
        }
        wsiVar.d.add(wsgVar);
    }
}
