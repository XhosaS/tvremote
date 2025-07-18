package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmy extends vmm {
    private final Object a;
    private final voi b;

    public vmy(Object obj, voi voiVar) {
        if (obj == null) {
            throw new NullPointerException("Null result");
        }
        this.a = obj;
        if (voiVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = voiVar;
    }

    @Override // defpackage.vmm
    public final voi a() {
        return this.b;
    }

    @Override // defpackage.vmm
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmm) {
            vmm vmmVar = (vmm) obj;
            if (this.a.equals(vmmVar.b())) {
                voi voiVar = this.b;
                voi voiVarA = vmmVar.a();
                if (voiVar != voiVarA) {
                    if (voiVar.getClass() == voiVarA.getClass()) {
                        if (abza.a.a(voiVar.getClass()).k(voiVar, voiVarA)) {
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
        int iHashCode = this.a.hashCode() ^ 1000003;
        voi voiVar = this.b;
        if ((voiVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(voiVar.getClass()).b(voiVar);
        } else {
            int iB2 = voiVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(voiVar.getClass()).b(voiVar);
                voiVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        return (iHashCode * 1000003) ^ iB;
    }

    public final String toString() {
        voi voiVar = this.b;
        return "ResultAndAccountData{result=" + this.a.toString() + ", accountData=" + voiVar.toString() + "}";
    }
}
