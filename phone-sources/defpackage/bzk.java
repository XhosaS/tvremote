package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzk {
    public bko a;
    public int b;
    public bfz c;
    public bfz d;
    public boolean e;
    final /* synthetic */ bzm f;

    public bzk(bzm bzmVar, bko bkoVar, int i, bfz bfzVar, bfz bfzVar2, boolean z) {
        this.f = bzmVar;
        this.a = bkoVar;
        this.b = i;
        this.c = bfzVar;
        this.d = bfzVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        bfz bfzVar = this.c;
        int i3 = this.b;
        return cbp.S((bkn) bfzVar.a[i + i3], (bkn) this.d.a[i3 + i2]) != 0;
    }
}
