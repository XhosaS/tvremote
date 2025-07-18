package defpackage;

import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jxg {
    public abstract int a();

    public abstract GetTokenRequest b();

    public abstract GoogleAccount c();

    public abstract String d();

    public abstract List e();

    public abstract List f();

    public abstract List g();

    public abstract List h();

    public abstract void i(int i);

    public abstract void j(boolean z);

    public final GetTokenRequest k() {
        if (c() == null) {
            throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
        }
        if (g() == null && h() == null && e() == null && f() == null) {
            throw new IllegalArgumentException("A token type must be specified.");
        }
        int i = g() != null ? 1 : 0;
        if (h() != null) {
            i++;
        }
        if (e() != null) {
            i++;
        }
        if (f() != null) {
            i++;
        }
        if (i == 0) {
            throw new IllegalArgumentException("No auth token type specified. Please specify exactly one type of auth token.");
        }
        if (i > 1) {
            throw new IllegalArgumentException("GetTokenRequest supports only one token type per request. Please call only one of setOauth2Scopes(), setWebLoginUrls(), setClientLoginScopes(), setOauth2TokenIdScopes()");
        }
        if (d() != null && a() == 0) {
            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if (a() == 1 && d() == null) {
            throw new IllegalArgumentException("Please provide a delegatee user ID.");
        }
        return b();
    }
}
