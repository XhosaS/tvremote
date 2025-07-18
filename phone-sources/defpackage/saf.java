package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saf extends sbg implements sap {
    public wge a;
    private saq c;
    private ImmutableSet d;
    private ImmutableSet e;
    private ImmutableSet f;

    @Override // defpackage.sap
    public final /* synthetic */ Object a(Enum r1) {
        return rrx.E(this, r1);
    }

    @Override // defpackage.sbg
    protected final /* bridge */ /* synthetic */ Object b() {
        if (this.d == null) {
            this.d = ImmutableSet.of();
        }
        if (this.e == null) {
            this.e = ImmutableSet.of();
        }
        if (this.f == null) {
            this.f = ImmutableSet.of();
        }
        saq saqVar = this.c;
        if (saqVar != null) {
            return new sag(saqVar, this.a, this.d, this.e, this.f);
        }
        throw new IllegalStateException("Missing required properties: contentType");
    }

    @Override // defpackage.sap
    public final /* synthetic */ Object c(saq saqVar) {
        this.c = saqVar;
        return this;
    }
}
