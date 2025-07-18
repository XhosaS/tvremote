package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dal extends dab implements czb, dbx {
    public final int a;
    public final int b;
    public final int c;
    public final czb d;

    public dal(int i, int i2, int i3, czb czbVar) {
        if (czbVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if ((i2 & 192) != i2) {
            throw new IllegalArgumentException(b.e(i2, "invalid tag class: "));
        }
        this.a = true == (czbVar instanceof cza) ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.d = czbVar;
    }

    static dab g(int i, int i2, czc czcVar) {
        return czcVar.c == 1 ? new dbu(3, i, i2, czcVar.a(0)) : new dbu(4, i, i2, dbq.a(czcVar));
    }

    static dab h(int i, int i2, byte[] bArr) {
        return new dbu(4, i, i2, new dbh(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dal m(Object obj) {
        if (obj == 0 || (obj instanceof dal)) {
            return (dal) obj;
        }
        dab dabVarP = obj.p();
        if (dabVarP instanceof dal) {
            return (dal) dabVarP;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public final czr b() {
        czb czbVar = this.d;
        return czbVar instanceof czr ? (czr) czbVar : czbVar.p();
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (!(dabVar instanceof dal)) {
            return false;
        }
        dal dalVar = (dal) dabVar;
        if (this.c != dalVar.c || this.b != dalVar.b) {
            return false;
        }
        if (this.a != dalVar.a && n() != dalVar.n()) {
            return false;
        }
        dab dabVarP = this.d.p();
        dab dabVarP2 = dalVar.d.p();
        if (dabVarP == dabVarP2) {
            return true;
        }
        if (n()) {
            return dabVarP.d(dabVarP2);
        }
        try {
            return Arrays.equals(s(), dalVar.s());
        } catch (IOException unused) {
            return false;
        }
    }

    public final czr f() {
        if (!n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        czb czbVar = this.d;
        return czbVar instanceof czr ? (czr) czbVar : czbVar.p();
    }

    @Override // defpackage.czr
    public final int hashCode() {
        return ((true != n() ? 240 : 15) ^ ((this.b * 7919) ^ this.c)) ^ this.d.p().hashCode();
    }

    public abstract dag i(dab dabVar);

    @Override // defpackage.dab
    public dab k() {
        return new dbm(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.dab
    public dab l() {
        return new dbu(this.a, this.b, this.c, this.d);
    }

    public final boolean n() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public final String toString() {
        return dnx.am(this.b, this.c).concat(this.d.toString());
    }

    protected dal(boolean z, int i, czb czbVar) {
        this(true != z ? 2 : 1, 128, i, czbVar);
    }

    @Override // defpackage.dbx
    public final dab j() {
        return this;
    }
}
