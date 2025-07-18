package defpackage;

import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ztj {
    public final Object a;
    public final Object b;

    public ztj(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean a(String str) {
        return str.startsWith((String) this.b);
    }

    public final boolean b(String str) {
        return str.startsWith((String) this.a);
    }

    public ztj(ypc[] ypcVarArr) {
        this.b = ypcVarArr;
        this.a = new yns(ypcVarArr.length, ynv.a);
    }

    public ztj() {
        this.a = new Hashtable();
        this.b = new Vector();
    }

    public ztj(String str) {
        this.a = a.cg(str, "-----BEGIN ", "-----");
        this.b = a.cg(str, "-----END ", "-----");
    }
}
