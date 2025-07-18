package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pir extends abww implements abyr {
    public pir() {
        super(piu.a);
    }

    public final void a(String str, pia piaVar) {
        str.getClass();
        piaVar.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        piu piuVar = (piu) this.b;
        piu piuVar2 = piu.a;
        abyl abylVar = piuVar.b;
        if (!abylVar.b) {
            piuVar.b = abylVar.a();
        }
        piuVar.b.put(str, piaVar);
    }

    public final void b(String str) {
        str.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        piu piuVar = (piu) this.b;
        piu piuVar2 = piu.a;
        abyl abylVar = piuVar.b;
        if (!abylVar.b) {
            piuVar.b = abylVar.a();
        }
        piuVar.b.remove(str);
    }
}
