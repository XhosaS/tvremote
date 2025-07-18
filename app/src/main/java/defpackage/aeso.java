package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeso implements aesn {
    private static final rlc a = new rlc(aesl.a, 19);

    @Override // defpackage.aesn
    public final boolean a() {
        return ((Boolean) a.d(1, "CollectionBasisVerifierFeatures__enable_cbv_v2", false).eV()).booleanValue();
    }

    @Override // defpackage.aesn
    public final boolean b() {
        return ((Boolean) a.d(2, "CollectionBasisVerifierFeatures__enable_google_signature_check", false).eV()).booleanValue();
    }

    @Override // defpackage.aesn
    public final void c() {
        ((Boolean) a.d(12, "CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false).eV()).booleanValue();
    }
}
