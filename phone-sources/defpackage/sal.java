package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sal extends sbg implements sap {
    private saq a;
    private boolean c;
    private ImmutableSet d;
    private ImmutableSet e;
    private ImmutableSet f;
    private byte g;

    @Override // defpackage.sap
    public final /* synthetic */ Object a(Enum r1) {
        return rrx.E(this, r1);
    }

    @Override // defpackage.sbg
    protected final /* bridge */ /* synthetic */ Object b() {
        saq saqVar;
        if (this.d == null) {
            this.d = ImmutableSet.of();
        }
        if (this.e == null) {
            this.e = ImmutableSet.of();
        }
        if (this.f == null) {
            this.f = ImmutableSet.of();
        }
        if (this.g == 1 && (saqVar = this.a) != null) {
            return new sam(saqVar, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contentType");
        }
        if (this.g == 0) {
            sb.append(" isSelected");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.sap
    public final /* synthetic */ Object c(saq saqVar) {
        this.a = saqVar;
        return this;
    }

    public final /* bridge */ /* synthetic */ void d(boolean z) {
        this.c = z;
        this.g = (byte) 1;
    }
}
