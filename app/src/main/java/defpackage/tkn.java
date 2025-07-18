package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkn extends tks {
    public final addu a;

    public tkn(addu adduVar, acxn acxnVar) {
        super(acxnVar);
        this.a = adduVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tks
    public final Integer a(int i) {
        addu adduVar = this.a;
        abyl abylVar = adduVar.l;
        Integer numValueOf = Integer.valueOf(i - 1);
        if (!abylVar.containsKey(numValueOf)) {
            return null;
        }
        abyl abylVar2 = adduVar.l;
        if (!abylVar2.containsKey(numValueOf)) {
            throw new IllegalArgumentException();
        }
        Integer num = (Integer) abylVar2.get(numValueOf);
        num.intValue();
        return num;
    }

    @Override // defpackage.tks
    public final boolean b(int i) {
        int iA;
        addu adduVar = this.a;
        int iA2 = addr.a(adduVar.h);
        if (iA2 != 0 && iA2 != 1) {
            return false;
        }
        if (i != 2 || (adduVar.c & 8) == 0 || ((iA = addo.a(adduVar.g)) != 0 && iA != 1)) {
            return true;
        }
        ((zdv) tks.c.c().q("com/google/android/libraries/search/rendering/xuikit/elements/logging/XUiKitVe$ClientImpressedVe", "shouldVeLog", 64, "XUiKitVe.kt")).x("xUIKit VE id %s sets ClickTracking.NONE, but also InteractionLoggingMode.LOG_ALL", new aawt(aaws.NON_TEXTUAL_INTERACTION_USER_DATA, Integer.valueOf(adduVar.d)));
        return false;
    }

    @Override // defpackage.tks
    public final String toString() {
        int i = this.a.d;
        acxn acxnVar = this.d;
        return "ClientImpressedVe(veId=" + i + ", nodeId=" + acxnVar.d + ", parentNodeId=" + acxnVar.e + ")";
    }
}
