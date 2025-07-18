package defpackage;

import com.google.android.libraries.performance.primes.flogger.AbseilToFloggerLogSink;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qro extends zfx {
    private final abnu a;
    private final String b;
    private final int c;
    private final int d;

    public qro(abnu abnuVar, String str) {
        this.a = abnuVar;
        this.b = str;
        int i = 4;
        if (str != null) {
            this.d = 4;
            i = 5;
        } else {
            this.d = -1;
        }
        this.c = i;
    }

    @Override // defpackage.zfx
    public final int a() {
        return this.c;
    }

    @Override // defpackage.zfx
    public final zer b(int i) {
        if (i >= this.c || i < 0) {
            throw new IndexOutOfBoundsException(a.b(i, "Invalid metadata index: "));
        }
        if (i == 0) {
            return zfi.a;
        }
        if (i == 1) {
            return zfj.a;
        }
        if (i == 2) {
            return qrl.a;
        }
        if (i == 3) {
            return qrl.c;
        }
        if (this.d == 4) {
            return qrl.b;
        }
        throw new IndexOutOfBoundsException("Invalid metadata index: 4");
    }

    @Override // defpackage.zfx
    public final Object c(zer zerVar) {
        String str;
        if (yqs.a(zerVar, zfi.a)) {
            return zerVar.b.cast(AbseilToFloggerLogSink.a(this.a));
        }
        if (yqs.a(zerVar, zfj.a)) {
            return zerVar.b.cast(true);
        }
        if (yqs.a(zerVar, qrl.a)) {
            return zerVar.b.cast(true);
        }
        if (yqs.a(zerVar, qrl.c)) {
            return zerVar.b.cast(Long.valueOf(this.a.f));
        }
        if (!yqs.a(zerVar, qrl.b) || (str = this.b) == null) {
            return null;
        }
        return zerVar.b.cast(str);
    }

    @Override // defpackage.zfx
    public final Object d(int i) {
        String str;
        if (i >= this.c || i < 0) {
            throw new IndexOutOfBoundsException(a.b(i, "Invalid metadata index: "));
        }
        if (i == 0) {
            return AbseilToFloggerLogSink.a(this.a);
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                return Long.valueOf(this.a.f);
            }
            if (this.d != 4 || (str = this.b) == null) {
                throw new IndexOutOfBoundsException("Invalid metadata index: 4");
            }
            return str;
        }
        return true;
    }
}
