package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avl implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;

    public avl(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final avk a() {
        return new avk(((auz) this.a).a(), ((auy) this.b).a(), this.c);
    }
}
