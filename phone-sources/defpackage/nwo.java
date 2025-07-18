package defpackage;

import android.os.Looper;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwo {
    public Object a;
    public Object b;

    public nwo() {
    }

    public static /* synthetic */ Object i(Object obj) {
        vdo vdoVar = ((wby) obj).b;
        return vdoVar == null ? vdo.a : vdoVar;
    }

    public static /* synthetic */ Object j(Object obj) {
        vdo vdoVar = ((wcm) obj).b;
        return vdoVar == null ? vdo.a : vdoVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oab] */
    public final nwp a() {
        if (this.a == null) {
            this.a = new ujd(1);
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new nwp(this.a, (Looper) this.b);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null toggleText");
        }
        this.a = str;
    }

    public final mww c() {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: description");
        }
        return new mww((String) obj, (tst) this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final mwk d() {
        Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (obj = this.a) != null) {
            return new mwk(r0, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" text");
        }
        if (this.a == null) {
            sb.append(" contentDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.a = str;
    }

    public final void f(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.b = charSequence;
    }

    public final ltr g() {
        Object obj = this.b;
        if (obj != null) {
            return new ltr((tst) this.a, (ksn) obj);
        }
        throw new IllegalStateException("Missing required properties: account");
    }

    public final void h(String str) {
        this.a = tst.i(str);
    }

    public final lru k() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new lru((ImmutableList) obj2, (ieg) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" licenseKeys");
        }
        if (this.b == null) {
            sb.append(" license");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null license");
        }
        this.b = iegVar;
    }

    public final void m(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null licenseKeys");
        }
        this.a = immutableList;
    }

    public final kyq n() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new kyq((String) obj2, (String) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" sessionNonce");
        }
        if (this.a == null) {
            sb.append(" uri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionNonce");
        }
        this.b = str;
    }

    public final void p(String str) {
        if (str == null) {
            throw new NullPointerException("Null uri");
        }
        this.a = str;
    }

    public nwo(byte[] bArr, byte[] bArr2) {
        this.b = trk.a;
    }

    public nwo(byte[] bArr, char[] cArr) {
        this.a = trk.a;
    }
}
