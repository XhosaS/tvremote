package defpackage;

import java.security.Provider;
import java.security.Signature;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zoz implements zox {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zoz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zox
    public final Signature a(String str) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            return obj != null ? Signature.getInstance(str, (String) obj) : Signature.getInstance(str);
        }
        if (i == 1) {
            try {
                return ((zpb) this.a).e.c(str);
            } catch (Exception unused) {
                return Signature.getInstance(str);
            }
        }
        if (i == 2) {
            try {
                return ((zpf) this.a).f.c(str);
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
