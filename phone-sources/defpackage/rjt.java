package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rjt implements tsl {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ rjt(String str, int i, int i2) {
        this.c = i2;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        if (this.c != 0) {
            return ((rjq) obj).e(this.a, this.b);
        }
        return ((rjq) obj).f(this.a, this.b);
    }
}
