package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahav extends ahdq {
    public final ahar a;

    public ahav(ahar aharVar) {
        this.a = aharVar;
    }

    @Override // defpackage.ahdq
    public final void b(Throwable th) {
        ahar aharVar = this.a;
        Throwable thQ = aharVar.q(f());
        if (aharVar.E()) {
            agzy agzyVar = ((ahld) aharVar.a).f;
            while (true) {
                Object obj = agzyVar.a;
                ahmg ahmgVar = ahle.b;
                if (agvy.c(obj, ahmgVar)) {
                    if (agzyVar.d(ahmgVar, thQ)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (agzyVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        aharVar.k(thQ);
        aharVar.x();
    }

    @Override // defpackage.ahdq
    public final boolean c() {
        return true;
    }
}
