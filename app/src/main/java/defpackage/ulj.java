package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulj {
    public final Context a;
    public final Executor b;
    public String c;
    public Set d;
    public uli f;
    private boolean g = false;
    public yrp e = new yrp() { // from class: ulg
        @Override // defpackage.yrp
        public final Object eV() {
            return false;
        }
    };

    public ulj(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final ulm a() {
        boolean z = true;
        if (!this.g && this.d == null) {
            z = false;
        }
        yqw.B(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new ulm(this);
    }

    public final void b() {
        this.d = null;
        this.g = true;
    }

    public final void c(String... strArr) {
        yqw.B(strArr != null, "Cannot call forKeys() with null argument");
        yzo yzoVar = new yzo();
        yzoVar.h(strArr);
        yzq yzqVarF = yzoVar.f();
        yqw.B(yzqVarF.size() == strArr.length, "Duplicate keys specified");
        this.d = yzqVarF;
        this.g = false;
    }

    public final void d(final boolean z) {
        this.e = new yrp() { // from class: ulh
            @Override // defpackage.yrp
            public final Object eV() {
                return Boolean.valueOf(z);
            }
        };
    }

    public final void e(ulk ulkVar) {
        this.f = new uli(ulkVar);
    }
}
