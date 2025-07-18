package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hdi extends hhu {
    final /* synthetic */ hhu a;

    public hdi(hhu hhuVar) {
        this.a = hhuVar;
    }

    @Override // defpackage.hhu
    public final /* bridge */ /* synthetic */ Object a(hht hhtVar) {
        Float f = (Float) this.a.d;
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
