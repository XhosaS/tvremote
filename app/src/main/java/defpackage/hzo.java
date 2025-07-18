package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzo extends hyr {
    public hzo(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 7) {
                return g(hzk.LISTENING);
            }
            switch (iOrdinal) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                case 17:
                    return d(hzk.ATTENTION_ASSISTANT);
                case 15:
                case 16:
                    break;
                default:
                    l(hzgVar);
                    return this;
            }
        }
        return this;
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
        this.b.u(11, false);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.aq;
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.ex();
    }

    @Override // defpackage.hze
    public final void q() {
    }
}
