package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qua extends qty {
    public static final qua a = new qua();

    private qua() {
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite a(String str, Object obj) {
        return qub.e(str, al$$ExternalSyntheticApiModelOutline1.m46m(obj));
    }

    @Override // defpackage.qty
    public final /* synthetic */ MessageLite b(MessageLite messageLite, MessageLite messageLite2) {
        return qub.d((ahqg) messageLite, (ahqg) messageLite2);
    }

    @Override // defpackage.qty
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        ahqg ahqgVar = (ahqg) messageLite;
        ahpw ahpwVar = ahqgVar.e;
        if (ahpwVar == null) {
            ahpwVar = ahpw.a;
        }
        int i = ahpwVar.b & 2;
        ahpw ahpwVar2 = ahqgVar.e;
        if (i != 0) {
            if (ahpwVar2 == null) {
                ahpwVar2 = ahpw.a;
            }
            return ahpwVar2.d;
        }
        if (ahpwVar2 == null) {
            ahpwVar2 = ahpw.a;
        }
        return Long.toHexString(ahpwVar2.c);
    }
}
