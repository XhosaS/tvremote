package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hys extends hyr {
    public hys(hzk hzkVar, hzd hzdVar, hzf hzfVar) {
        super(hzkVar, hzdVar, hzfVar);
    }

    @Override // defpackage.hyr, defpackage.hze
    public final hze a(hzg hzgVar) {
        int iOrdinal = hzgVar.ordinal();
        if (iOrdinal == 1) {
            return g(hzk.RESPONSE_IDLE);
        }
        if (iOrdinal == 2) {
            return g(hzk.TALKING);
        }
        if (iOrdinal == 6) {
            return g(hzk.KEYBOARD);
        }
        if (iOrdinal == 7) {
            return g(hzk.LISTENING);
        }
        if (iOrdinal == 14) {
            return this;
        }
        if (iOrdinal == 16) {
            return g(hzk.TALKING_IDLE);
        }
        l(hzgVar);
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
        this.b.u(10, true);
    }

    @Override // defpackage.hze
    public final gmc p() {
        return gmc.am;
    }

    @Override // defpackage.hze
    public final rqw r() {
        return rpm.et();
    }

    @Override // defpackage.hze
    public final void q() {
    }
}
