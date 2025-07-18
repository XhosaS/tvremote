package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyp extends afyn {
    @Override // defpackage.afyn
    public final boolean a(afyq afyqVar) {
        synchronized (afyqVar) {
            if (afyqVar.a != 0) {
                return false;
            }
            afyqVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.afyn
    public final void b(afyq afyqVar) {
        synchronized (afyqVar) {
            afyqVar.a = 0;
        }
    }
}
