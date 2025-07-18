package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xby extends abww implements abyr {
    public xby() {
        super(xbz.a);
    }

    public final void a(xbw xbwVar) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        xbz xbzVar = (xbz) this.b;
        xbx xbxVar = (xbx) xbwVar.v();
        xbz xbzVar2 = xbz.a;
        xbxVar.getClass();
        abxs abxsVar = xbzVar.b;
        if (!abxsVar.c()) {
            int size = abxsVar.size();
            xbzVar.b = abxsVar.d(size + size);
        }
        xbzVar.b.add(xbxVar);
    }
}
