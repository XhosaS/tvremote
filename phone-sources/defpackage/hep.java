package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hep implements hes {
    private final hei a;
    private final hei b;

    public hep(hei heiVar, hei heiVar2) {
        this.a = heiVar;
        this.b = heiVar2;
    }

    @Override // defpackage.hes
    public final hdg a() {
        return new hdt(this.a.a(), this.b.a());
    }

    @Override // defpackage.hes
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.hes
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
