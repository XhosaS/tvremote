package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zjr extends zjh implements zih, zld {
    public final int a;
    public final int b;
    public final int c;
    public final zih d;

    public zjr(int i, int i2, int i3, zih zihVar) {
        if (zihVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if ((i2 & 192) != i2) {
            throw new IllegalArgumentException(a.cf(i2, "invalid tag class: "));
        }
        this.a = true == (zihVar instanceof zig) ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.d = zihVar;
    }

    static zjh g(int i, int i2, zii ziiVar) {
        return ziiVar.c == 1 ? new zla(3, i, i2, ziiVar.a(0)) : new zla(4, i, i2, zkw.a(ziiVar));
    }

    static zjh h(int i, int i2, byte[] bArr) {
        return new zla(4, i, i2, new zkn(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zjr m(Object obj) {
        if (obj == 0 || (obj instanceof zjr)) {
            return (zjr) obj;
        }
        zjh zjhVarP = obj.p();
        if (zjhVarP instanceof zjr) {
            return (zjr) zjhVarP;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final zix b() {
        zih zihVar = this.d;
        return zihVar instanceof zix ? (zix) zihVar : zihVar.p();
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (!(zjhVar instanceof zjr)) {
            return false;
        }
        zjr zjrVar = (zjr) zjhVar;
        if (this.c != zjrVar.c || this.b != zjrVar.b) {
            return false;
        }
        if (this.a != zjrVar.a && n() != zjrVar.n()) {
            return false;
        }
        zjh zjhVarP = this.d.p();
        zjh zjhVarP2 = zjrVar.d.p();
        if (zjhVarP == zjhVarP2) {
            return true;
        }
        if (n()) {
            return zjhVarP.d(zjhVarP2);
        }
        try {
            return Arrays.equals(s(), zjrVar.s());
        } catch (IOException unused) {
            return false;
        }
    }

    public final zix f() {
        if (!n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        zih zihVar = this.d;
        return zihVar instanceof zix ? (zix) zihVar : zihVar.p();
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return ((true != n() ? 240 : 15) ^ ((this.b * 7919) ^ this.c)) ^ this.d.p().hashCode();
    }

    public abstract zjm i(zjh zjhVar);

    @Override // defpackage.zjh
    public zjh k() {
        return new zks(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.zjh
    public zjh l() {
        return new zla(this.a, this.b, this.c, this.d);
    }

    public final boolean n() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public final String toString() {
        return wcq.aq(this.b, this.c).concat(this.d.toString());
    }

    protected zjr(boolean z, int i, zih zihVar) {
        this(true != z ? 2 : 1, 128, i, zihVar);
    }

    @Override // defpackage.zld
    public final zjh j() {
        return this;
    }
}
