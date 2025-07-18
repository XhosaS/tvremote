package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyx extends hyr {
    public hyx(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return g(hzk.RESPONSE_IDLE);
            }
            if (iOrdinal == 2) {
                return g(hzk.TALKING);
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 6) {
                    return g(hzk.KEYBOARD);
                }
                if (iOrdinal != 7) {
                    if (iOrdinal == 11) {
                        return g(hzk.SPEAKING);
                    }
                    switch (iOrdinal) {
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            return g(hzk.LISTENING_FALLBACK);
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            return g(hzk.ATTENTION_ASSISTANT);
                        case 15:
                            break;
                        case 16:
                            return g(hzk.TALKING_IDLE);
                        default:
                            l(hzgVar);
                            return this;
                    }
                }
                return this;
            }
        }
        return g(hzk.IDLE);
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
        this.b.h();
        this.b.u(1, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.aj;
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.eq();
    }

    @Override // defpackage.hze
    public final void q() {
    }
}
