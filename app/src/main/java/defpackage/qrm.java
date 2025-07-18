package defpackage;

import com.google.android.libraries.performance.primes.flogger.AbseilToFloggerLogSink;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrm implements zfp {
    private final abnu a;
    private final qrn b;
    private final Level c;
    private final String d;
    private final zfx e;
    private final Object[] f;
    private final zgu g;

    public qrm(abnu abnuVar, Level level, String str, int i) {
        int i2;
        this.a = abnuVar;
        this.b = new qrn(abnuVar);
        this.c = level;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (aboa aboaVar : abnuVar.g) {
            int i3 = aboaVar.b;
            if (i3 == 0) {
                i2 = 6;
            } else if (i3 != 1) {
                i2 = 3;
                if (i3 != 2) {
                    i2 = i3 != 3 ? i3 != 6 ? i3 != 10 ? 0 : 5 : 2 : 4;
                }
            } else {
                i2 = 1;
            }
            if (i2 == 0) {
                throw null;
            }
            int i4 = i2 - 1;
            if (i4 == 0) {
                sb.append("%s");
                String strX = (aboaVar.b == 1 ? (abvo) aboaVar.c : abvo.b).x(abxt.a);
                if (i == 2) {
                    abxc abxcVar = aagh.a;
                    MessageLite messageLite = abxcVar.a;
                    aboa aboaVar2 = aboa.a;
                    if (messageLite != aboaVar2) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    if (aboaVar.n.n(abxcVar.d)) {
                        if (abxcVar.a != aboaVar2) {
                            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                        }
                        Object objK = aboaVar.n.k(abxcVar.d);
                        if (((aagj) (objK == null ? abxcVar.b : abxcVar.b(objK))).b) {
                            arrayList.add(new qsk(new qpi(strX)));
                        }
                    }
                }
                arrayList.add(strX);
            } else if (i4 == 1) {
                sb.append((i3 == 6 ? (abvo) aboaVar.c : abvo.b).x(abxt.a));
            }
        }
        String string = sb.toString();
        this.d = string;
        if (arrayList.isEmpty()) {
            this.f = null;
            this.g = null;
        } else {
            this.f = arrayList.toArray();
            this.g = new zgu(zio.a, string);
        }
        this.e = new qro(abnuVar, str);
    }

    @Override // defpackage.zfp
    public final long a() {
        return this.a.e;
    }

    @Override // defpackage.zfp
    public final zei b() {
        return this.b;
    }

    @Override // defpackage.zfp
    public final zfx c() {
        return this.e;
    }

    @Override // defpackage.zfp
    public final zgu d() {
        return this.g;
    }

    @Override // defpackage.zfp
    public final Object e() {
        if (this.g == null && this.f == null) {
            return this.d;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.zfp
    public final String f() {
        return AbseilToFloggerLogSink.class.getName();
    }

    @Override // defpackage.zfp
    public final Level g() {
        return this.c;
    }

    @Override // defpackage.zfp
    public final boolean h() {
        return false;
    }

    @Override // defpackage.zfp
    public final Object[] i() {
        Object[] objArr;
        if (this.g == null || (objArr = this.f) == null) {
            throw new IllegalStateException();
        }
        return objArr;
    }
}
