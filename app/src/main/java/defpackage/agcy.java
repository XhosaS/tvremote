package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agcy extends agdc {
    private final agcx d;
    private final agcx e;
    private final agcx f;
    private final agcx g;
    private final int h;

    public agcy(agcx agcxVar, agcx agcxVar2, agcx agcxVar3, agcx agcxVar4, Provider provider, int i) {
        super(provider);
        this.d = agcxVar;
        this.e = agcxVar2;
        this.f = agcxVar3;
        this.g = agcxVar4;
        this.h = i;
    }

    @Override // defpackage.agdc
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        agcx agcxVar = this.f;
        if (agcxVar.b(sSLSocket) && (bArr = (byte[]) agcxVar.a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, agdf.b);
        }
        return null;
    }

    @Override // defpackage.agdc
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.d.c(sSLSocket, true);
            this.e.c(sSLSocket, str);
        }
        agcx agcxVar = this.g;
        if (agcxVar.b(sSLSocket)) {
            agcxVar.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.agdc
    public final int c() {
        return this.h;
    }
}
