package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ske implements rux {
    final /* synthetic */ rxh a;
    final /* synthetic */ int b;

    public ske(rxh rxhVar, int i) {
        this.a = rxhVar;
        this.b = i;
    }

    @Override // defpackage.rux
    public final ruw a() {
        return new skh(this.b, rxn.FAILED_START_LISTENING);
    }

    @Override // defpackage.rzv
    public final zyd b() {
        return zxn.h(skc.a(this.a));
    }

    @Override // defpackage.rzv
    public final /* bridge */ /* synthetic */ Object c() {
        return new skh(this.b, rxn.FAILED_START_LISTENING);
    }
}
