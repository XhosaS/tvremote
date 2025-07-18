package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gdt {
    public final gdq a;
    public final gdp b;
    public final long c;
    public int d = 0;

    public gdt(gdq gdqVar) {
        this.a = gdqVar;
        this.b = gdqVar.a();
        this.c = Math.round(1000.0f / r3.c);
    }

    public final void a() {
        this.a.d();
        this.d = 2;
    }
}
