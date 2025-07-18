package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yl extends xx {
    public static final xz a = new yk(0);
    public final mj b = new mj();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final yi b() {
        return (yi) mk.a(this.b, 54321);
    }

    @Override // defpackage.xx
    protected final void c() {
        mj mjVar = this.b;
        int iB = mjVar.b();
        for (int i = 0; i < iB; i++) {
            ((yi) mjVar.c(i)).i();
        }
        int i2 = mjVar.d;
        Object[] objArr = mjVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        mjVar.d = 0;
        mjVar.a = false;
    }
}
