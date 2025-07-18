package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkf implements pkr {
    final /* synthetic */ boolean a;

    public pkf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.pkr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(pju pjuVar) {
        pks pksVar = pjuVar.c;
        pksVar.m(this);
        boolean z = false;
        if (this.a && pksVar.n()) {
            z = true;
        }
        if (z) {
            pksVar.i();
        }
        pjuVar.e();
        if (z) {
            pksVar.h();
        }
    }
}
