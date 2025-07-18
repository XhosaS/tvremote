package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkv extends hkw {
    private final int a;
    private final xmy b;

    public hkv(int i, xmy xmyVar) {
        this.a = i;
        if (xmyVar == null) {
            throw new NullPointerException("Null mediaOnDeviceLookupArgs");
        }
        this.b = xmyVar;
    }

    @Override // defpackage.hkw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.hkw
    public final xmy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkw) {
            hkw hkwVar = (hkw) obj;
            if (this.a == hkwVar.a()) {
                xmy xmyVar = this.b;
                xmy xmyVarB = hkwVar.b();
                if (xmyVar != xmyVarB) {
                    if (xmyVar.getClass() == xmyVarB.getClass()) {
                        if (abza.a.a(xmyVar.getClass()).k(xmyVar, xmyVarB)) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB;
        xmy xmyVar = this.b;
        if ((xmyVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(xmyVar.getClass()).b(xmyVar);
        } else {
            int iB2 = xmyVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(xmyVar.getClass()).b(xmyVar);
                xmyVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return iB ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "MediaOnDeviceLookupEntry{index=" + this.a + ", mediaOnDeviceLookupArgs=" + this.b.toString() + "}";
    }
}
