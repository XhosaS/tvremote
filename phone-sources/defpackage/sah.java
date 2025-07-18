package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sah extends sbg implements sap {
    private saq a;
    private ImmutableSet c;
    private ImmutableSet d;
    private ImmutableSet e;
    private final /* synthetic */ int f;

    public sah(int i) {
        this.f = i;
    }

    public static sap d(sbi sbiVar) {
        sah sahVar = new sah(2);
        sahVar.b = sbiVar;
        return sahVar;
    }

    @Override // defpackage.sap
    public final /* synthetic */ Object a(Enum r3) {
        int i = this.f;
        return i != 0 ? i != 1 ? rrx.E(this, r3) : rrx.E(this, r3) : rrx.E(this, r3);
    }

    @Override // defpackage.sbg
    protected final /* synthetic */ Object b() {
        int i = this.f;
        if (i == 0) {
            if (this.c == null) {
                this.c = ImmutableSet.of();
            }
            if (this.d == null) {
                this.d = ImmutableSet.of();
            }
            if (this.e == null) {
                this.e = ImmutableSet.of();
            }
            saq saqVar = this.a;
            if (saqVar != null) {
                return new sai(saqVar, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties: contentType");
        }
        if (i != 1) {
            if (this.c == null) {
                this.c = ImmutableSet.of();
            }
            if (this.d == null) {
                this.d = ImmutableSet.of();
            }
            if (this.e == null) {
                this.e = ImmutableSet.of();
            }
            saq saqVar2 = this.a;
            if (saqVar2 != null) {
                return new saj(saqVar2, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties: contentType");
        }
        if (this.c == null) {
            this.c = ImmutableSet.of();
        }
        if (this.d == null) {
            this.d = ImmutableSet.of();
        }
        if (this.e == null) {
            this.e = ImmutableSet.of();
        }
        saq saqVar3 = this.a;
        if (saqVar3 != null) {
            return new sae(saqVar3, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: contentType");
    }

    @Override // defpackage.sap
    public final /* synthetic */ Object c(saq saqVar) {
        if (this.f != 0) {
            this.a = saqVar;
            return this;
        }
        this.a = saqVar;
        return this;
    }
}
