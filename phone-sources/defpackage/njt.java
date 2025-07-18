package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njt implements dxq {
    final /* synthetic */ SignInHubActivity a;

    public njt(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.dxq
    public final dxy a() {
        return new njg(this.a, nwu.t());
    }

    @Override // defpackage.dxq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.a, signInHubActivity.b);
        signInHubActivity.finish();
    }

    @Override // defpackage.dxq
    public final void c() {
    }
}
