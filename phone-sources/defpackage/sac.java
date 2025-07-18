package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sac extends sbg {
    public int a;

    public static sac a(sbi sbiVar) {
        sac sacVar = new sac();
        sacVar.b = sbiVar;
        sacVar.a = 1;
        return sacVar;
    }

    @Override // defpackage.sbg
    protected final /* bridge */ /* synthetic */ Object b() {
        if (this.a != 0) {
            return new sad(null);
        }
        throw new IllegalStateException("Missing required properties: clickDataType");
    }
}
