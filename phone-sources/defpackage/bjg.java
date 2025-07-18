package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjg implements bbi {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bjg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bbi
    public final void a() {
        if (this.b != 0) {
            bas basVar = (bas) this.a;
            basVar.m--;
        } else {
            bjh bjhVar = (bjh) this.a;
            bjhVar.f--;
        }
    }

    @Override // defpackage.bbi
    public final void b() {
        if (this.b != 0) {
            ((bas) this.a).m++;
        } else {
            ((bjh) this.a).f++;
        }
    }
}
