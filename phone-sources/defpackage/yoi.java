package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yoi extends yqh {
    public final yof a;

    public yoi(yof yofVar) {
        this.a = yofVar;
    }

    @Override // defpackage.yqh
    public final void a(Throwable th) {
        yof yofVar = this.a;
        Throwable thN = yofVar.n(e());
        if (yofVar.z()) {
            ynu ynuVar = ((ywu) yofVar.a).f;
            while (true) {
                Object obj = ynuVar.a;
                yxo yxoVar = ywv.b;
                if (yks.e(obj, yxoVar)) {
                    if (ynuVar.d(yxoVar, thN)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (ynuVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        yofVar.e(thN);
        yofVar.u();
    }

    @Override // defpackage.yqh
    public final boolean b() {
        return true;
    }
}
