package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lni implements ttm {
    boolean a;
    final /* synthetic */ String b;

    public lni(String str) {
        this.b = str;
    }

    @Override // defpackage.ttm
    public final /* bridge */ /* synthetic */ Object get() {
        if (this.a) {
            return elg.b();
        }
        this.a = true;
        return this.b;
    }
}
