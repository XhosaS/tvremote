package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plv implements pkr {
    final /* synthetic */ int a;
    final /* synthetic */ AtomicReference b;

    public plv(int i, AtomicReference atomicReference) {
        this.a = i;
        this.b = atomicReference;
    }

    @Override // defpackage.pkr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(pju pjuVar) {
        pka pkaVarA = pjuVar.a();
        pks pksVar = pjuVar.c;
        ucy ucyVar = pkaVarA.d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        if (ucyVar.d == this.a) {
            this.b.set(pkd.b(pjuVar));
        } else {
            pksVar.m(this);
        }
    }
}
