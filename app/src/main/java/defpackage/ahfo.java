package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahfo extends ahab implements ahfn {
    public final ahfn b;

    public ahfo(agte agteVar, ahfn ahfnVar) {
        super(agteVar, true);
        this.b = ahfnVar;
    }

    @Override // defpackage.ahdv
    public final void H(Throwable th) throws Throwable {
        ahfn ahfnVar = this.b;
        CancellationException cancellationExceptionD = D(th, null);
        ahfnVar.s(cancellationExceptionD);
        K(cancellationExceptionD);
    }

    @Override // defpackage.ahgg
    public final Object c(agsw agswVar) {
        throw null;
    }

    @Override // defpackage.ahgg
    public final Object d(agsw agswVar) {
        throw null;
    }

    @Override // defpackage.ahgh
    public final Object g(Object obj, agsw agswVar) {
        return this.b.g(obj, agswVar);
    }

    @Override // defpackage.ahgg
    public final Object h() {
        throw null;
    }

    @Override // defpackage.ahgh
    public final Object i(Object obj) {
        return this.b.i(obj);
    }

    @Override // defpackage.ahgg
    public final ahfp n() {
        throw null;
    }

    @Override // defpackage.ahgh
    public final void r(agux aguxVar) {
        throw null;
    }

    @Override // defpackage.ahdv, defpackage.ahdl
    public final void s(CancellationException cancellationException) throws Throwable {
        if (fB()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new ahdm(b(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.ahgh
    public final boolean u(Throwable th) {
        throw null;
    }

    @Override // defpackage.ahgh
    public final boolean y() {
        throw null;
    }
}
