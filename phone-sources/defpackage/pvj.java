package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class pvj extends tsg {
    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doBackward(Object obj) {
        vhp vhpVar = (vhp) obj;
        switch (vhpVar) {
            case DROP_REASON_UNKNOWN:
                return qrx.a;
            case INVALID_PAYLOAD:
                return qrx.b;
            case SILENT_NOTIFICATION:
                return qrx.c;
            case USER_SUPPRESSED:
                return qrx.e;
            case INVALID_TARGET_STATE:
                return qrx.f;
            case WORK_PROFILE:
                return qrx.g;
            case HANDLED_BY_APP:
                return qrx.d;
            case UNICORN_OR_GRIFFIN_ACCOUNT:
                return qrx.h;
            case CLIENT_COUNTERFACTUAL:
                return qrx.i;
            case OUT_OF_ORDER_UPDATE:
                return qrx.m;
            case SEARCH_DISCOVER_DISABLED:
                return qrx.j;
            case SEARCH_OUTSIDE_CONTEXT_FENCE:
                return qrx.k;
            case SEARCH_ACCOUNT_MISSING_OR_MISMATCH:
                return qrx.l;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(vhpVar))));
        }
    }

    @Override // defpackage.tsg
    protected final /* bridge */ /* synthetic */ Object doForward(Object obj) {
        qrx qrxVar = (qrx) obj;
        switch (qrxVar.ordinal()) {
            case 0:
                return vhp.DROP_REASON_UNKNOWN;
            case 1:
                return vhp.INVALID_PAYLOAD;
            case 2:
                return vhp.SILENT_NOTIFICATION;
            case 3:
                return vhp.HANDLED_BY_APP;
            case 4:
                return vhp.USER_SUPPRESSED;
            case 5:
                return vhp.INVALID_TARGET_STATE;
            case 6:
                return vhp.WORK_PROFILE;
            case 7:
                return vhp.UNICORN_OR_GRIFFIN_ACCOUNT;
            case 8:
                return vhp.CLIENT_COUNTERFACTUAL;
            case 9:
                return vhp.SEARCH_DISCOVER_DISABLED;
            case 10:
                return vhp.SEARCH_OUTSIDE_CONTEXT_FENCE;
            case 11:
                return vhp.SEARCH_ACCOUNT_MISSING_OR_MISMATCH;
            case 12:
                return vhp.OUT_OF_ORDER_UPDATE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(qrxVar))));
        }
    }
}
