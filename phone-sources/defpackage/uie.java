package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uie {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public uie() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.ThreadFactory] */
    public static ThreadFactory b(uie uieVar) {
        Object obj = uieVar.a;
        Object obj2 = uieVar.b;
        Object obj3 = uieVar.c;
        Object obj4 = uieVar.d;
        Object objDefaultThreadFactory = obj4;
        if (obj4 == null) {
            objDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new uid(objDefaultThreadFactory, (String) obj, obj != null ? new AtomicLong(0L) : null, (Boolean) obj2, (Integer) obj3);
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(String str) {
        a(str, 0);
        this.a = str;
    }

    public final void e(rie... rieVarArr) {
        this.a = ImmutableList.copyOf(rieVarArr);
    }

    public final ren f() {
        Object obj;
        Object obj2;
        Object obj3 = this.d;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.c) != null) {
            return new ren((ret) obj3, (rei) obj, (tst) this.a, (rel) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" cardIcon");
        }
        if (this.b == null) {
            sb.append(" titleData");
        }
        if (this.c == null) {
            sb.append(" visualElementsInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(ret retVar) {
        if (retVar == null) {
            throw new NullPointerException("Null cardIcon");
        }
        this.d = retVar;
    }

    public uie(byte[] bArr) {
    }

    public uie(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = trk.a;
    }
}
