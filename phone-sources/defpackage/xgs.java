package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgs implements ttm {
    public static final xgs a = new xgs();
    private final ttm b = new ttp(new xgu());

    public static boolean b() {
        return a.get().a();
    }

    public static boolean c() {
        return a.get().b();
    }

    @Override // defpackage.ttm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xgt get() {
        return (xgt) ((ttp) this.b).a;
    }
}
