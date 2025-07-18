package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afss implements Runnable {
    final /* synthetic */ afst a;

    public afss(afst afstVar) {
        this.a = afstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afst afstVar = this.a;
        afsv afsvVar = afstVar.c;
        Collection collection = afsvVar.n;
        collection.remove(afstVar.a);
        if (afsvVar.r.a == affe.SHUTDOWN && collection.isEmpty()) {
            afsvVar.f();
        }
    }
}
