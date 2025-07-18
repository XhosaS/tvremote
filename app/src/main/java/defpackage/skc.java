package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skc {
    public static final skc a = new skc();

    private skc() {
    }

    public static final ruv a(rxh rxhVar) {
        rxhVar.getClass();
        rxj rxjVar = rxj.a;
        rxi rxiVar = new rxi();
        rwz.b(rxhVar, rxiVar);
        return f(null, null, rwz.a(rxiVar), 27);
    }

    public static final ruv b(yqt yqtVar, yqt yqtVar2, rxj rxjVar, yqt yqtVar3, zyd zydVar) {
        yqtVar.getClass();
        yqtVar2.getClass();
        rxjVar.getClass();
        return new sjz(yqtVar, ypv.a, yqtVar2, yqtVar3, zydVar, rxjVar);
    }

    public static /* synthetic */ ruv f(yqt yqtVar, yqt yqtVar2, rxj rxjVar, int i) {
        if ((i & 1) != 0) {
            yqtVar = ypv.a;
        }
        if ((i & 2) != 0) {
            yqtVar2 = ypv.a;
        }
        ypv ypvVar = ypv.a;
        rur rurVar = rur.a;
        return b(yqtVar, yqtVar2, rxjVar, ypvVar, zxn.h(rxo.a(new ruq())));
    }

    public final rvm c(rxd rxdVar, rxn rxnVar) {
        rxdVar.getClass();
        rvm rvmVar = rvm.a;
        rvl rvlVar = new rvl();
        rzy.b(rxdVar, rvlVar);
        rzy.c(rxnVar, rvlVar);
        return rzy.a(rvlVar);
    }

    public final rxj d(rxh rxhVar) {
        rxhVar.getClass();
        rxj rxjVar = rxj.a;
        rxi rxiVar = new rxi();
        rwz.b(rxhVar, rxiVar);
        return rwz.a(rxiVar);
    }

    public final rxn e(rwk rwkVar) {
        switch (rwkVar.ordinal()) {
            case 0:
                return rxn.UNKNOWN_AUDIO_ROUTE_DISCONNECT_STATUS;
            case 1:
            case 8:
            case 9:
            case 10:
            case 11:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                return rxn.FAILED_TO_CONNECT_TO_AUDIO_ROUTE;
            case 2:
            case 6:
            case 16:
            case 18:
            case 19:
            case 20:
            case 25:
            case 30:
                return rxn.AUDIO_ROUTE_LOST;
            case 3:
                return rxn.AUDIO_ROUTE_DISCONNECT_CLIENT_REQUESTED;
            case 4:
            case 24:
                return rxn.MISSING_AUDIO_ROUTE_IMPLEMENTATION;
            case 5:
                return rxn.CLIENT_DEACTIVATED;
            case 7:
                return rxn.AUDIO_ADAPTER_NOT_REGISTERED;
            case 17:
                return rxn.UNEXPECTED_AUDIO_SOURCE_OPENED;
            case 26:
                return rxn.NEW_CLIENT_ACTIVATING;
            case 36:
            case 37:
                return rxn.ERROR_IN_GETTING_AUDIO_ROUTE_DISCONNECT_STATUS;
            case 38:
                return rxn.REMOTE_COMMUNICATION_CHANNEL_SHUTDOWN;
            default:
                throw new agpg();
        }
    }

    public final rvm g(int i, rxn rxnVar) {
        rxnVar.getClass();
        return c(h(i), rxnVar);
    }

    public final rxd h(int i) {
        rxd rxdVar = rxd.a;
        rxc rxcVar = new rxc();
        rwy.b(i, rxcVar);
        return rwy.a(rxcVar);
    }
}
