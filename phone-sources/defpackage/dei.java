package defpackage;

import defpackage.dei;
import defpackage.dek;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dei<MessageType extends dek<MessageType, BuilderType>, BuilderType extends dei<MessageType, BuilderType>> extends ddh<MessageType, BuilderType> implements dfi {
    public final dek a;
    public dek b;

    public dei() {
        this(dcz.DEFAULT_INSTANCE);
    }

    private final dek g() {
        return this.a.l();
    }

    @Override // defpackage.ddh
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dei clone() {
        dei deiVarJ = this.a.m();
        deiVarJ.b = d();
        return deiVarJ;
    }

    public final dek c() {
        dek dekVarD = d();
        if (dekVarD.s()) {
            return dekVarD;
        }
        throw new dfy();
    }

    public final dek d() {
        if (!this.b.t()) {
            return this.b;
        }
        this.b.n();
        return this.b;
    }

    @Override // defpackage.dfi
    public final /* synthetic */ dfh e() {
        throw null;
    }

    public final void f() {
        if (this.b.t()) {
            return;
        }
        dek dekVarG = g();
        dfp.a.b(dekVarG).e(dekVarG, this.b);
        this.b = dekVarG;
    }

    public dei(dek dekVar) {
        this.a = dekVar;
        if (dekVar.t()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = g();
    }
}
