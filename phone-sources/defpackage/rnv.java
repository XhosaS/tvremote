package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnv implements rnw {
    final Object a;
    private final /* synthetic */ int b;

    public rnv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rnw
    public final uhp a() {
        return this.b != 0 ? sfy.C(new rnu(this, 1)) : sfy.C(new rnu(this, 0));
    }
}
