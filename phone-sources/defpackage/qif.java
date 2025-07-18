package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qif implements xcm {
    private final xcq a;
    private final xcq b;

    public qif(xcq xcqVar, xcq xcqVar2) {
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String b() {
        String strA;
        qig qigVarB = ((qie) this.a).b();
        qei qeiVar = (qei) this.b.b();
        int i = qid.a;
        qeiVar.getClass();
        sjh sjhVar = qih.a;
        if (sin.o(sjh.c)) {
            strA = sjj.a(sjhVar.a, sjhVar.b);
            if (strA != null && strA.length() == 91) {
                StringBuilder sb = new StringBuilder(strA);
                int i2 = 2;
                while (true) {
                    String strA2 = sjj.a(a.cf(i2, "gnp.server.url"), "");
                    sb.append(strA2);
                    if (strA2.length() != 91) {
                        break;
                    }
                    i2++;
                }
                strA = sb.toString();
            }
        } else {
            strA = sjhVar.b;
        }
        String str = strA != null ? strA : "";
        if (str.length() != 0) {
            return str;
        }
        int iOrdinal = qigVarB.ordinal();
        if (iOrdinal == 0) {
            return "https://notifications-pa.googleapis.com:443";
        }
        if (iOrdinal == 1) {
            return "https://autopush-notifications-pa.sandbox.googleapis.com:443";
        }
        if (iOrdinal == 2) {
            return "https://autopush-qual-playground-notifications-pa.sandbox.googleapis.com:443";
        }
        if (iOrdinal == 3) {
            return "https://staging-notifications-pa.sandbox.googleapis.com:443";
        }
        if (iOrdinal == 4) {
            return "https://staging-qual-qa-notifications-pa.sandbox.googleapis.com:443";
        }
        if (iOrdinal == 5) {
            return "https://dev-notifications-pa.corp.googleapis.com:443";
        }
        throw new yfu();
    }
}
