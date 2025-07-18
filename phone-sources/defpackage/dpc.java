package defpackage;

import defpackage.dpc;
import defpackage.dpf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpc<MessageType extends dpf<MessageType, BuilderType>, BuilderType extends dpc<MessageType, BuilderType>> extends dnz<MessageType, BuilderType> implements dqb {
    public final dpf a;
    public dpf b;

    public dpc() {
        this(dnv.DEFAULT_INSTANCE);
    }

    public static void g(Object obj, Object obj2) {
        dqh.a.b(obj).e(obj, obj2);
    }

    private final dpf j() {
        return this.a.k();
    }

    @Override // defpackage.dnz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dpc clone() {
        dpc dpcVarI = this.a.m();
        dpcVarI.b = d();
        return dpcVarI;
    }

    public final dpf c() {
        dpf dpfVarD = d();
        if (dpfVarD.s()) {
            return dpfVarD;
        }
        throw new dqs();
    }

    public final dpf d() {
        if (!this.b.t()) {
            return this.b;
        }
        this.b.n();
        return this.b;
    }

    @Override // defpackage.dqb
    public final /* synthetic */ dqa e() {
        throw null;
    }

    public final void f() {
        if (this.b.t()) {
            return;
        }
        dpf dpfVarJ = j();
        g(dpfVarJ, this.b);
        this.b = dpfVarJ;
    }

    public final void h(int i) {
        f();
        dnx dnxVar = (dnx) this.b;
        int i2 = dnx.TYPE_FIELD_NUMBER;
        dnxVar.horizontalAlignment_ = i - 2;
    }

    public final void i(int i) {
        f();
        dnx dnxVar = (dnx) this.b;
        int i2 = dnx.TYPE_FIELD_NUMBER;
        dnxVar.verticalAlignment_ = i - 2;
    }

    public dpc(dpf dpfVar) {
        this.a = dpfVar;
        if (dpfVar.t()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = j();
    }
}
