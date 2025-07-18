package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ceq extends ykh implements yjv {
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(Object obj, int i) {
        super(1, obj, bfz.class, "add", "add(Ljava/lang/Object;)Z", 8);
        this.b = i;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.b != 0) {
            ((ajq) this.a).A(((cjz) obj).a);
            return ygi.a;
        }
        ((bfz) this.a).o((cer) obj);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(Object obj, int i, byte[] bArr) {
        super(1, obj, ajq.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
        this.b = i;
    }
}
