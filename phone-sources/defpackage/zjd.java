package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zjd extends zjh implements zje {
    public byte[] b;
    static final zjs c = new zjc(zjd.class);
    static final byte[] a = new byte[0];

    public zjd(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.b = bArr;
    }

    public static zjd f(Object obj) {
        if (obj == null || (obj instanceof zjd)) {
            return (zjd) obj;
        }
        if (obj instanceof zih) {
            zjh zjhVarP = ((zih) obj).p();
            if (zjhVarP instanceof zjd) {
                return (zjd) zjhVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (zjd) c.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static zjd g(zjr zjrVar, boolean z) {
        return (zjd) c.d(zjrVar, z);
    }

    @Override // defpackage.zje
    public final InputStream b() {
        return new ByteArrayInputStream(this.b);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zjd) {
            return Arrays.equals(this.b, ((zjd) zjhVar).b);
        }
        return false;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.b);
    }

    @Override // defpackage.zjh
    public zjh k() {
        return new zkn(this.b);
    }

    @Override // defpackage.zjh
    public zjh l() {
        return new zkn(this.b);
    }

    public final String toString() {
        return "#".concat(zxr.a(zxx.d(this.b)));
    }

    @Override // defpackage.zld
    public final zjh j() {
        return this;
    }
}
