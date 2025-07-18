package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eng {
    public final elq a;
    public elq b;
    public elq c;
    public boolean d;
    public boolean e;
    public int f;

    public eng(elq elqVar, elq elqVar2, elq elqVar3) {
        this.b = elqVar;
        this.c = elqVar2;
        this.a = elqVar3;
    }

    public final void a(boolean z) {
        this.f = z ? this.f | 32 : this.f & (-33);
    }

    public final boolean b() {
        return (this.f & 32) != 0;
    }

    public final boolean c() {
        return (this.f & 30) == 30;
    }
}
