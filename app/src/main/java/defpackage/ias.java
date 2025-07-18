package defpackage;

import java.util.Collection;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ias implements icj {
    private final agow a;
    private final idu b;

    public ias(agow agowVar, idu iduVar) {
        agowVar.getClass();
        iduVar.getClass();
        this.a = agowVar;
        this.b = iduVar;
    }

    @Override // defpackage.icj
    public final String b(icg icgVar) {
        icgVar.getClass();
        ice iceVar = icg.a;
        int iOrdinal = icgVar.ordinal();
        if (iOrdinal == 6) {
            return ((idl) this.a.a()).h();
        }
        if (iOrdinal == 7) {
            return ((idl) this.a.a()).j();
        }
        throw new IllegalArgumentException(a.c(icgVar, "Unsupported string setting[", "]"));
    }

    @Override // defpackage.icj
    public final Collection c(icg icgVar) {
        icgVar.getClass();
        ice iceVar = icg.a;
        switch (icgVar.ordinal()) {
            case 8:
                return this.b.c();
            case 9:
                return this.b.d();
            case 10:
                return this.b.e();
            case 11:
                return ((idl) this.a.a()).l(idh.c);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((idl) this.a.a()).l(idh.d);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((idl) this.a.a()).l(idh.b);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((idl) this.a.a()).m(idj.c);
            case 15:
                return ((idl) this.a.a()).m(idj.b);
            case 16:
                return ((idl) this.a.a()).m(idj.a);
            case 17:
                return this.b.k();
            case 18:
                return this.b.l();
            default:
                throw new IllegalArgumentException(a.c(icgVar, "Unsupported string list setting[", "]"));
        }
    }

    @Override // defpackage.icj
    public final boolean i(icg icgVar, boolean z) {
        icgVar.getClass();
        ice iceVar = icg.a;
        int iOrdinal = icgVar.ordinal();
        if (iOrdinal == 0) {
            return this.b.B();
        }
        if (iOrdinal == 1) {
            return ((idl) this.a.a()).ag() != 1;
        }
        if (iOrdinal == 2) {
            return ((idl) this.a.a()).U();
        }
        if (iOrdinal == 3) {
            return ((idl) this.a.a()).af();
        }
        if (iOrdinal == 4) {
            return ((idl) this.a.a()).ac();
        }
        throw new IllegalArgumentException(a.c(icgVar, "Unsupported boolean setting[", "]"));
    }

    @Override // defpackage.icj
    public final int m(icg icgVar) {
        icgVar.getClass();
        if (icgVar == icg.h) {
            return ((idl) this.a.a()).a();
        }
        throw new IllegalArgumentException(a.c(icgVar, "Unsupported integer setting[", "]"));
    }
}
