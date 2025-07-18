package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eku implements ecw {
    public final /* synthetic */ ekl a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ eku(ekl eklVar, boolean z, int i, int i2) {
        this.d = i2;
        this.a = eklVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.ecw
    public final void a(Object obj) {
        if (this.d != 0) {
            int i = this.c;
            ((ekm) obj).y(this.a, this.b, i);
        } else {
            int i2 = this.c;
            ((ekm) obj).t(this.a, this.b, i2);
        }
    }
}
