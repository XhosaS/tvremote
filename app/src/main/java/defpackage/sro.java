package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sro {
    private final List a;

    static {
        new srl(rxh.FAILED_OPENING_DUE_TO_INACTIVE_AUDIO_ROUTE_SESSION, 114, "the associated audio route is already inactive");
        new srl(rxh.FAILED_OPENING_HOTWORD_DUE_TO_AUDIO_REQUEST_CLIENT_LISTENING, 103, "not allowed while audio client is listening (concurrent mode insufficient)");
    }

    public sro(skf skfVar, sms smsVar, spf spfVar, smw smwVar, slj sljVar, ahbt ahbtVar, sld sldVar) {
        skfVar.getClass();
        smsVar.getClass();
        spfVar.getClass();
        smwVar.getClass();
        sljVar.getClass();
        ahbtVar.getClass();
        sldVar.getClass();
        this.a = new ArrayList();
    }

    public final synchronized List a() {
        ArrayList arrayList;
        int i = srn.a;
        List list = this.a;
        arrayList = new ArrayList(agqq.i(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        return arrayList;
    }
}
