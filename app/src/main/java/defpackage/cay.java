package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cay implements agux {
    final /* synthetic */ Object a;

    public cay(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
        if (obj2 != null) {
            return (Integer) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
