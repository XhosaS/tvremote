package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rdy implements dvw {
    final /* synthetic */ rdz a;
    private final int b;

    public rdy(rdz rdzVar, int i) {
        this.a = rdzVar;
        this.b = i;
    }

    @Override // defpackage.dvw
    public final /* bridge */ /* synthetic */ void dV(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.a.a.add(Integer.valueOf(this.b));
        } else {
            this.a.a.remove(Integer.valueOf(this.b));
        }
    }
}
