package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xeq implements xep {
    private static final ryv a = new ryv(xen.b, 19);

    @Override // defpackage.xep
    public final boolean a() {
        return ((Boolean) a.e(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).get()).booleanValue();
    }

    @Override // defpackage.xep
    public final boolean b() {
        return ((Boolean) a.e(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).get()).booleanValue();
    }

    @Override // defpackage.xep
    public final void c() {
        ((Boolean) a.e(12, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).get()).booleanValue();
    }
}
