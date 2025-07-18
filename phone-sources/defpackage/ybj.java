package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybj extends ybh {
    @Override // defpackage.ybh
    public final boolean a(ybk ybkVar) {
        synchronized (ybkVar) {
            if (ybkVar.a != 0) {
                return false;
            }
            ybkVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.ybh
    public final void b(ybk ybkVar) {
        synchronized (ybkVar) {
            ybkVar.a = 0;
        }
    }
}
