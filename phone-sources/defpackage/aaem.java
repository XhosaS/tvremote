package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaem extends aaeq {
    public aaem(aabo aaboVar, int i) {
        super(aaboVar, i, false, i);
    }

    @Override // defpackage.aaep, defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        int i2;
        char cCharAt;
        int iC = super.c(aafbVar, charSequence, i);
        if (iC < 0 || iC == (i2 = this.b + i)) {
            return iC;
        }
        if (this.c && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
            i2++;
        }
        return iC > i2 ? ~(i2 + 1) : iC < i2 ? ~iC : iC;
    }
}
