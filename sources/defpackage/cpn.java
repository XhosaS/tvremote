package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpn implements cpm {
    private final cpm a;

    private cpn(cpm cpmVar) {
        this.a = cpmVar;
    }

    public static cpm b(cpm cpmVar) {
        cpmVar.getClass();
        return new cpn(cpmVar);
    }

    @Override // defpackage.crv, defpackage.cru
    public final /* bridge */ /* synthetic */ Object a() {
        return cph.b(this.a);
    }
}
