package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class bud extends ykq implements yjz {
    public static final bud a = new bud();

    public bud() {
        super(2, yln.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
