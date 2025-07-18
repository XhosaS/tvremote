package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeh implements bol {
    public final aei a;
    public final aei b;
    public final aei c;
    public final aei d;

    public aeh(aei aeiVar, aei aeiVar2, aei aeiVar3, aei aeiVar4) {
        this.a = aeiVar;
        this.b = aeiVar2;
        this.c = aeiVar3;
        this.d = aeiVar4;
    }

    public static /* synthetic */ aeh b(aeh aehVar, aei aeiVar, aei aeiVar2, aei aeiVar3, aei aeiVar4, int i) {
        if ((i & 1) != 0) {
            aeiVar = aehVar.a;
        }
        if ((i & 2) != 0) {
            aeiVar2 = aehVar.b;
        }
        if ((i & 4) != 0) {
            aeiVar3 = aehVar.c;
        }
        if ((i & 8) != 0) {
            aeiVar4 = aehVar.d;
        }
        return new aeh(aeiVar, aeiVar2, aeiVar3, aeiVar4);
    }

    @Override // defpackage.bol
    public final boe a(long j, cmi cmiVar, clx clxVar) {
        aei aeiVar = this.d;
        aei aeiVar2 = this.c;
        aei aeiVar3 = this.b;
        float fA = this.a.a(j, clxVar);
        float fA2 = aeiVar3.a(j, clxVar);
        float fA3 = aeiVar2.a(j, clxVar);
        float fA4 = aeiVar.a(j, clxVar);
        float f = fA + fA4;
        float fB = bna.b(j);
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            wv.c("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new boc(d.q(j));
        }
        bmy bmyVarQ = d.q(j);
        cmi cmiVar2 = cmi.a;
        float f5 = cmiVar == cmiVar2 ? fA : fA2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
        if (cmiVar == cmiVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
        float f6 = cmiVar == cmiVar2 ? fA3 : fA4;
        float f7 = fA3;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f6);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f6);
        if (cmiVar != cmiVar2) {
            fA4 = f7;
        }
        return new bod(d.s(bmyVarQ, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L), (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeh) {
            aeh aehVar = (aeh) obj;
            return yks.e(this.a, aehVar.a) && yks.e(this.b, aehVar.b) && yks.e(this.c, aehVar.c) && yks.e(this.d, aehVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
