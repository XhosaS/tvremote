package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pbe {
    public ImmutableSet.Builder a;
    public ImmutableSet.Builder b;
    public ImmutableSet.Builder c;
    private ImmutableSet d;
    private ImmutableSet e;
    private ImmutableSet f;
    private ImmutableSet.Builder g;
    private ImmutableSet h;

    public final pbf a() {
        ImmutableSet.Builder builder = this.a;
        if (builder != null) {
            this.d = builder.build();
        } else if (this.d == null) {
            this.d = ImmutableSet.of();
        }
        ImmutableSet.Builder builder2 = this.b;
        if (builder2 != null) {
            this.e = builder2.build();
        } else if (this.e == null) {
            this.e = ImmutableSet.of();
        }
        ImmutableSet.Builder builder3 = this.c;
        if (builder3 != null) {
            this.f = builder3.build();
        } else if (this.f == null) {
            this.f = ImmutableSet.of();
        }
        ImmutableSet.Builder builder4 = this.g;
        if (builder4 != null) {
            this.h = builder4.build();
        } else if (this.h == null) {
            this.h = ImmutableSet.of();
        }
        return new pbf(this.d, this.e, this.f, this.h);
    }

    public final ImmutableSet.Builder b() {
        if (this.g == null) {
            this.g = ImmutableSet.builder();
        }
        return this.g;
    }
}
