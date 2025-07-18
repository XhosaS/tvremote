package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ctf implements ctj {
    private final csy a;
    private final csy b;

    public ctf(csy csyVar, csy csyVar2) {
        this.a = csyVar;
        this.b = csyVar2;
    }

    @Override // defpackage.ctj
    public final crt a() {
        return new csh(this.a.a(), this.b.a());
    }

    @Override // defpackage.ctj
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.ctj
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
