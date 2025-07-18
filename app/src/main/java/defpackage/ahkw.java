package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkw {
    public static final ahmg a = new ahmg("CLOSED");

    public static final Object a(ahmd ahmdVar, long j, agvb agvbVar) {
        while (true) {
            long j2 = ahmdVar.d;
            if (j2 >= j && !ahmdVar.m()) {
                return ahmdVar;
            }
            agzy agzyVar = ahmdVar.b;
            Object obj = agzyVar.a;
            ahmg ahmgVar = a;
            if (obj == ahmgVar) {
                return ahmgVar;
            }
            ahmd ahmdVar2 = (ahmd) ((ahkx) obj);
            if (ahmdVar2 != null) {
                ahmdVar = ahmdVar2;
            } else {
                ahmd ahmdVar3 = (ahmd) agvbVar.a(Long.valueOf(j2 + 1), ahmdVar);
                if (agzyVar.d(null, ahmdVar3)) {
                    if (ahmdVar.m()) {
                        ahmdVar.l();
                    }
                    ahmdVar = ahmdVar3;
                }
            }
        }
    }
}
