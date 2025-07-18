package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafc implements aaff {
    public final aafg a;

    private aafc(aafg aafgVar) {
        this.a = aafgVar;
    }

    static aaff b(aafg aafgVar) {
        if (aafgVar instanceof aafg) {
            return aafgVar;
        }
        if (aafgVar == null) {
            return null;
        }
        return new aafc(aafgVar);
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        return this.a.a.c(aafbVar, charSequence.toString(), i);
    }
}
