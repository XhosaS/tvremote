package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sm implements bol {
    private final /* synthetic */ int c;
    public static final sm b = new sm(1);
    public static final sm a = new sm(0);

    private sm(int i) {
        this.c = i;
    }

    @Override // defpackage.bol
    public final boe a(long j, cmi cmiVar, clx clxVar) {
        if (this.c == 0) {
            float fCu = clxVar.cu(30.0f);
            return new boc(new bmy(-fCu, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fCu, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        float fCu2 = clxVar.cu(30.0f);
        return new boc(new bmy(0.0f, -fCu2, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fCu2));
    }
}
