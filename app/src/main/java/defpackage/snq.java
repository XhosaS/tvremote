package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class snq implements zxe {
    final /* synthetic */ sgo a;
    final /* synthetic */ snr b;

    public snq(snr snrVar, sgo sgoVar) {
        this.a = sgoVar;
        this.b = snrVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        sor sorVar = (sor) this.b.b.a();
        int iB = sgn.b(this.a.b);
        if (iB == 0) {
            throw null;
        }
        sorVar.b("FAILED_GETTING_STATUS_FUTURE", "REASON_UNKNOWN", sgn.a(iB));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        ruc rucVar = (ruc) obj;
        sor sorVar = (sor) this.b.b.a();
        int iB = rty.b(rucVar.c);
        if (iB == 0) {
            iB = 1;
        }
        int iA = rtw.a(rucVar.d);
        int i = iA != 0 ? iA : 1;
        sgo sgoVar = this.a;
        switch (i) {
            case 1:
                str = "REASON_UNKNOWN";
                break;
            case 2:
                str = "REASON_RELEASED_BY_CLIENT";
                break;
            case 3:
                str = "REASON_LOST_UNKNOWN";
                break;
            case 4:
                str = "REASON_LOST_TO_OTHER_CLIENT";
                break;
            case 5:
                str = "REASON_LOST_TRANSIENT_CAN_DUCK";
                break;
            case 6:
                str = "REASON_LOST_TO_CALL";
                break;
            default:
                str = "REASON_LOST_INTERRUPTED_BY_ANOTHER_REQUEST";
                break;
        }
        int iB2 = sgn.b(sgoVar.b);
        if (iB2 == 0) {
            throw null;
        }
        sorVar.b(rty.a(iB), str, sgn.a(iB2));
    }
}
