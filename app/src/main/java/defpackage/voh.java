package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voh extends abww implements abyr {
    public voh() {
        super(voi.a);
    }

    public final void a(int i, von vonVar) {
        vonVar.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        voi voiVar = (voi) this.b;
        voi voiVar2 = voi.a;
        abyl abylVar = voiVar.d;
        if (!abylVar.b) {
            voiVar.d = abylVar.a();
        }
        voiVar.d.put(Integer.valueOf(i), vonVar);
    }

    public final void b(int i) {
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        voi voiVar = (voi) this.b;
        voi voiVar2 = voi.a;
        abyl abylVar = voiVar.d;
        if (!abylVar.b) {
            voiVar.d = abylVar.a();
        }
        voiVar.d.remove(Integer.valueOf(i));
    }
}
