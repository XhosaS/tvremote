package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class crv extends cxb {
    final /* synthetic */ cxb a;

    public crv(cxb cxbVar) {
        this.a = cxbVar;
    }

    @Override // defpackage.cxb
    public final /* bridge */ /* synthetic */ Object a(cxa cxaVar) {
        Float f = (Float) this.a.a(cxaVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
