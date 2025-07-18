package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class nje {
    public Set a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map i;

    public nje() {
        this.a = new HashSet();
        this.i = new HashMap();
    }

    public final GoogleSignInOptions a() {
        if (this.a.contains(GoogleSignInOptions.d)) {
            Set set = this.a;
            Scope scope = GoogleSignInOptions.c;
            if (set.contains(scope)) {
                this.a.remove(scope);
            }
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(GoogleSignInOptions.b);
    }

    public final void c(Scope scope, Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(scopeArr));
    }

    public nje(GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.i = new HashMap();
        this.a = new HashSet(googleSignInOptions.h);
        this.c = googleSignInOptions.k;
        this.d = googleSignInOptions.l;
        this.e = googleSignInOptions.j;
        this.f = googleSignInOptions.m;
        this.g = googleSignInOptions.i;
        this.h = googleSignInOptions.n;
        this.i = GoogleSignInOptions.b(googleSignInOptions.o);
        this.b = googleSignInOptions.p;
    }
}
