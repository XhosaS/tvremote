package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bhp extends ykh implements yjz {
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhp(Object obj, int i) {
        super(2, obj, bhq.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b == 0) {
            int iIntValue = ((Number) obj2).intValue();
            ((bhq) this.a).b((bao) obj, iIntValue);
            return ygi.a;
        }
        long j = ((cmm) obj).a;
        vr vrVar = (vr) this.a;
        ykr.q(vrVar.h.f(), null, 0, new vo(vrVar, j, (yih) null, 2, (char[]) null), 3);
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhp(Object obj, int i, byte[] bArr) {
        super(2, obj, vr.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
        this.b = i;
    }
}
