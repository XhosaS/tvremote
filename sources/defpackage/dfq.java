package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfq implements dfo {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dfq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.dfo
    public final Signature a(String str) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            return obj != null ? Signature.getInstance(str, (String) obj) : Signature.getInstance(str);
        }
        if (i == 1) {
            try {
                return ((dfs) this.a).e.h(str);
            } catch (Exception unused) {
                return Signature.getInstance(str);
            }
        }
        if (i == 2) {
            try {
                return ((dfw) this.a).f.h(str);
            } catch (Exception unused2) {
                return Signature.getInstance(str);
            }
        }
        if (i != 3) {
            Object obj2 = this.a;
            return obj2 != null ? Signature.getInstance(str, (Provider) obj2) : Signature.getInstance(str);
        }
        Object obj3 = this.a;
        return obj3 != null ? Signature.getInstance(str, (String) obj3) : Signature.getInstance(str);
    }
}
