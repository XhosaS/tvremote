package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjk extends abww implements abyr {
    public pjk() {
        super(pjm.a);
    }

    public final void a(String str, pjj pjjVar) {
        str.getClass();
        pjjVar.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        pjm pjmVar = (pjm) this.b;
        pjm pjmVar2 = pjm.a;
        abyl abylVar = pjmVar.b;
        if (!abylVar.b) {
            pjmVar.b = abylVar.a();
        }
        pjmVar.b.put(str, pjjVar);
    }

    public final void b(String str) {
        str.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        pjm pjmVar = (pjm) this.b;
        pjm pjmVar2 = pjm.a;
        abyl abylVar = pjmVar.b;
        if (!abylVar.b) {
            pjmVar.b = abylVar.a();
        }
        pjmVar.b.remove(str);
    }
}
