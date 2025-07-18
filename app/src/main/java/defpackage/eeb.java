package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eeb implements eeq {
    public final int a;
    public final int b;
    public int c;
    public int d;
    private final eef e;
    private final eea f;

    @Deprecated
    public eeb() {
        this(1, Integer.MIN_VALUE, edz.a, edz.d);
    }

    @Override // defpackage.eeq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eeq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.eeq
    public final rh c() {
        return ekb.a(this.b, this.c, this.d);
    }

    @Override // defpackage.eeq
    public final eef d() {
        return this.e;
    }

    @Override // defpackage.eeq
    public final egy e(dru druVar) {
        return new ehb(this.a);
    }

    @Deprecated
    public eeb(int i, int i2, eef eefVar, eea eeaVar) {
        this.c = Integer.MAX_VALUE;
        this.d = 1;
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.a = i;
        this.b = i2;
        this.e = eefVar == null ? edz.a : eefVar;
        this.f = eeaVar == null ? edz.d : eeaVar;
    }
}
