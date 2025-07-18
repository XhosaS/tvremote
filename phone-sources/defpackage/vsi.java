package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vsi implements vvq {
    private static final vtp a;

    static {
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        a = vtp.a;
    }

    private static final void m(vvj vvjVar) throws vuq {
        if (vvjVar != null && !vvjVar.v()) {
            throw new vwf().a();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, vvj] */
    @Override // defpackage.vvq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vvj h(InputStream inputStream, vtp vtpVar) throws vuq {
        vte vteVarL = vte.L(inputStream);
        ?? L = l(vteVarL, vtpVar);
        vteVarL.z(0);
        m(L);
        return L;
    }

    @Override // defpackage.vvq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vvj i(byte[] bArr, vtp vtpVar) {
        return c(bArr, 0, bArr.length, vtpVar);
    }

    public final vvj c(byte[] bArr, int i, int i2, vtp vtpVar) throws vuq {
        vvj vvjVarD = d(bArr, i, i2, vtpVar);
        m(vvjVarD);
        return vvjVarD;
    }

    public vvj d(byte[] bArr, int i, int i2, vtp vtpVar) {
        throw null;
    }

    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object e(InputStream inputStream) {
        return h(inputStream, a);
    }

    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object f(byte[] bArr) {
        return i(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vvj] */
    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object g(vte vteVar, vtp vtpVar) throws vuq {
        ?? L = l(vteVar, vtpVar);
        m(L);
        return L;
    }

    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object j(byte[] bArr, int i) {
        return c(bArr, 0, i, a);
    }

    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object k(byte[] bArr, int i, vtp vtpVar) {
        return c(bArr, 1, i, vtpVar);
    }
}
