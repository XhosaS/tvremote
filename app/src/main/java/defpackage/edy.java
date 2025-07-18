package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edy implements eeq {
    public final int a;
    public final int b;
    public int c = Integer.MAX_VALUE;
    public int d = 1;
    private final int e;
    private final eef f;

    @Deprecated
    public edy(int i, int i2, eef eefVar, edx edxVar, int i3) {
        this.a = i;
        this.e = i2;
        this.f = eefVar == null ? edw.a : eefVar;
        if (edxVar == null) {
            int i4 = edw.g;
        }
        this.b = i3;
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
        return this.f;
    }

    @Override // defpackage.eeq
    public final egy e(dru druVar) {
        return new ege(druVar.a, this.e, this.a);
    }
}
