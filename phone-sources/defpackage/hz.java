package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hz extends ht {
    public final WeakReference a;

    public hz(ic icVar) {
        this.a = new WeakReference(icVar);
    }

    @Override // defpackage.ht
    public final void B(zuw zuwVar) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((ic) weakReference.get()).h) {
            return;
        }
        int i = -1;
        if (zuwVar.a == -1) {
            Object obj = zuwVar.b;
            int i2 = ((ic) weakReference.get()).n;
            if ((i2 & 32767) != 0 && !hu.i(i2)) {
                i = 2;
            }
            zuwVar = new zuw(obj, i);
        }
        ((ic) weakReference.get()).r(zuwVar);
    }

    @Override // defpackage.ht
    public final void b(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((ic) weakReference.get()).i || !((ic) weakReference.get()).h) {
            return;
        }
        ((ic) weakReference.get()).f(new ig(i, charSequence));
    }

    @Override // defpackage.ht
    public final void c() {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((ic) weakReference.get()).h) {
            return;
        }
        ((ic) weakReference.get()).g(true);
    }
}
