package defpackage;

import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmi extends zix {
    private zik c;
    private static final String[] b = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final Hashtable a = new Hashtable();

    public zmi(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
        }
        this.c = new zik(i);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.c;
    }

    public final String toString() {
        int iIntValue = this.c.b().intValue();
        return "CRLReason: ".concat(String.valueOf((iIntValue < 0 || iIntValue > 10) ? "invalid" : b[iIntValue]));
    }
}
