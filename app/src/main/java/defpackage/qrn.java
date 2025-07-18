package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qrn extends zei {
    private final abnu b;

    public qrn(abnu abnuVar) {
        this.b = abnuVar;
    }

    @Override // defpackage.zei
    public final int a() {
        return this.b.d;
    }

    @Override // defpackage.zei
    public final String b() {
        return "";
    }

    @Override // defpackage.zei
    public final String c() {
        return f();
    }

    @Override // defpackage.zei
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.zei
    public final String e() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qrn) {
            qrn qrnVar = (qrn) obj;
            if (yqs.a(f(), qrnVar.f())) {
                if (this.b.d == qrnVar.b.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{f(), Integer.valueOf(this.b.d)});
    }
}
