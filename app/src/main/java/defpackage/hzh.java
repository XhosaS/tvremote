package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzh extends hyr {
    public hzh(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return d(hzk.RESPONSE_IDLE);
            }
            if (iOrdinal == 2) {
                return d(hzk.TALKING);
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 6) {
                    return d(hzk.KEYBOARD);
                }
                if (iOrdinal == 7) {
                    return d(hzk.LISTENING_FALLBACK);
                }
                if (iOrdinal != 11) {
                    switch (iOrdinal) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            return d(hzk.ATTENTION_ASSISTANT);
                        case 15:
                            this.b.j();
                            return this;
                        case 16:
                            return d(hzk.TALKING_IDLE);
                        default:
                            l(hzgVar);
                            return this;
                    }
                }
                return this;
            }
        }
        return d(hzk.IDLE);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze b(hzg hzgVar, String str) {
        switch (hzgVar.ordinal()) {
            case 8:
                return h(hzk.LOADING, str);
            case 9:
                return h(hzk.ERROR, str);
            case 10:
                return h(hzk.RESPONSE, str);
            default:
                l(hzgVar);
                return this;
        }
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze c(hzg hzgVar, String str, String str2) {
        if (hzgVar == hzg.SPEECH) {
            return i(str, str2);
        }
        l(hzgVar);
        return this;
    }

    @Override // defpackage.hyr, defpackage.hze
    public final void m() {
        this.b.i();
        this.b.q();
        this.b.u(2, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.ap;
    }

    @Override // defpackage.hze
    public final void q() {
        this.b.l();
        this.b.r();
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.ew();
    }
}
