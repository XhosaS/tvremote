package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czx extends dab implements czy {
    public byte[] b;
    static final dam c = new czw(czx.class);
    static final byte[] a = new byte[0];

    public czx(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.b = bArr;
    }

    public static czx f(Object obj) {
        if (obj == null || (obj instanceof czx)) {
            return (czx) obj;
        }
        if (obj instanceof czb) {
            dab dabVarP = ((czb) obj).p();
            if (dabVarP instanceof czx) {
                return (czx) dabVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (czx) c.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static czx g(dal dalVar, boolean z) {
        return (czx) c.d(dalVar, z);
    }

    @Override // defpackage.czy
    public final InputStream b() {
        return new ByteArrayInputStream(this.b);
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (dabVar instanceof czx) {
            return Arrays.equals(this.b, ((czx) dabVar).b);
        }
        return false;
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return dos.m(this.b);
    }

    @Override // defpackage.dab
    public dab k() {
        return new dbh(this.b);
    }

    @Override // defpackage.dab
    public dab l() {
        return new dbh(this.b);
    }

    public final String toString() {
        return "#".concat(doj.a(dop.d(this.b)));
    }

    @Override // defpackage.dbx
    public final dab j() {
        return this;
    }
}
