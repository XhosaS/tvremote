package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayb implements tz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ayb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.tz
    public final void a(float f) {
        if (this.b != 0) {
            ((avn) this.a).h(f);
            return;
        }
        ayd aydVar = (ayd) this.a;
        aydVar.h.B(aydVar.c(f), 0.0f);
    }
}
