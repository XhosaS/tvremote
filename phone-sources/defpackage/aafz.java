package defpackage;

import java.io.DataInput;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafz {
    final aafx a;
    final String b;
    final int c;

    public aafz(aafx aafxVar, String str, int i) {
        this.a = aafxVar;
        this.b = str;
        this.c = i;
    }

    static aafz c(DataInput dataInput) {
        return new aafz(new aafx((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) vxr.as(dataInput)), dataInput.readUTF(), (int) vxr.as(dataInput));
    }

    public final long a(long j, int i, int i2) {
        aafx aafxVar = this.a;
        char c = aafxVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        aadl aadlVar = aadl.o;
        aabm aabmVar = aadlVar.m;
        int i3 = aafxVar.b;
        long jH = aadlVar.i.h(aabmVar.h(j3, i3), 0);
        aabm aabmVar2 = aadlVar.i;
        int i4 = aafxVar.f;
        long jA = aafxVar.a(aadlVar, aabmVar2.e(jH, Math.min(i4, 86399999)));
        if (aafxVar.d != 0) {
            jA = aafxVar.c(aadlVar, jA);
            if (jA <= j3) {
                jA = aafxVar.c(aadlVar, aafxVar.a(aadlVar, aadlVar.m.h(aadlVar.n.e(jA, 1), i3)));
            }
        } else if (jA <= j3) {
            jA = aafxVar.a(aadlVar, aadlVar.n.e(jA, 1));
        }
        return aadlVar.i.e(aadlVar.i.h(jA, 0), i4) - j2;
    }

    public final long b(long j, int i, int i2) {
        aafx aafxVar = this.a;
        char c = aafxVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        aadl aadlVar = aadl.o;
        aabm aabmVar = aadlVar.m;
        int i3 = aafxVar.b;
        long jH = aadlVar.i.h(aabmVar.h(j3, i3), 0);
        aabm aabmVar2 = aadlVar.i;
        int i4 = aafxVar.f;
        long jB = aafxVar.b(aadlVar, aabmVar2.e(jH, i4));
        if (aafxVar.d != 0) {
            jB = aafxVar.c(aadlVar, jB);
            if (jB >= j3) {
                jB = aafxVar.c(aadlVar, aafxVar.b(aadlVar, aadlVar.m.h(aadlVar.n.e(jB, -1), i3)));
            }
        } else if (jB >= j3) {
            jB = aafxVar.b(aadlVar, aadlVar.n.e(jB, -1));
        }
        return aadlVar.i.e(aadlVar.i.h(jB, 0), i4) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aafz) {
            aafz aafzVar = (aafz) obj;
            if (this.c == aafzVar.c && this.b.equals(aafzVar.b) && this.a.equals(aafzVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b, this.a});
    }

    public final String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
