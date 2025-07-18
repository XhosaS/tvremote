package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class buc extends ykq implements yjz {
    public static final buc a = new buc();

    public buc() {
        super(2, yln.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
