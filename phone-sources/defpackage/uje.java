package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uje {
    public Object a;
    public Object b;
    public Object c;
    public CharSequence d;
    public CharSequence e;

    public uje() {
    }

    public final ujf a() {
        Object obj = this.b;
        Object obj2 = this.a;
        Object obj3 = this.c;
        return new ujf((String) obj, (String) obj2, (String) obj3, (String) this.d, (String) this.e);
    }

    public final void b(String str) {
        ocv.aE(str, "ApiKey must be set.");
        this.a = str;
    }

    public final void c(String str) {
        ocv.aE(str, "ApplicationId must be set.");
        this.b = str;
    }

    public final mwh d() {
        CharSequence charSequence;
        CharSequence charSequence2 = this.e;
        if (charSequence2 != null && (charSequence = this.d) != null) {
            return new mwh(charSequence2, charSequence, (tst) this.a, (tst) this.b, (tst) this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" title");
        }
        if (this.d == null) {
            sb.append(" detailContent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null detailContent");
        }
        this.d = charSequence;
    }

    public final void f(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null title");
        }
        this.e = charSequence;
    }

    public uje(byte[] bArr, byte[] bArr2) {
        trk trkVar = trk.a;
        this.a = trkVar;
        this.b = trkVar;
        this.c = trkVar;
    }
}
