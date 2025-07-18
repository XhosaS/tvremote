package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgn extends fgo {
    private final String a;
    private final byte[] b;

    public fgn(String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Null actionName");
        }
        this.a = str;
        this.b = bArr;
    }

    @Override // defpackage.fgo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.fgo
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fgo) {
            fgo fgoVar = (fgo) obj;
            if (this.a.equals(fgoVar.a())) {
                if (Arrays.equals(this.b, fgoVar instanceof fgn ? ((fgn) fgoVar).b : fgoVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BatchAction{actionName=" + this.a + ", clientOpArgs=" + Arrays.toString(this.b) + "}";
    }
}
