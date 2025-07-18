package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yds extends ydw {
    private final int d;
    private final aafi e;
    private final aafi f;
    private final aafi g;
    private final aafi h;

    public yds(aafi aafiVar, aafi aafiVar2, aafi aafiVar3, aafi aafiVar4, Provider provider, int i) {
        super(provider);
        this.e = aafiVar;
        this.f = aafiVar2;
        this.g = aafiVar3;
        this.h = aafiVar4;
        this.d = i;
    }

    @Override // defpackage.ydw
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        aafi aafiVar = this.g;
        if (aafiVar.c(sSLSocket) && (bArr = (byte[]) aafiVar.b(sSLSocket, new Object[0])) != null) {
            return new String(bArr, ydz.b);
        }
        return null;
    }

    @Override // defpackage.ydw
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            this.e.d(sSLSocket, true);
            this.f.d(sSLSocket, str);
        }
        aafi aafiVar = this.h;
        if (aafiVar.c(sSLSocket)) {
            aafiVar.b(sSLSocket, e(list));
        }
    }

    @Override // defpackage.ydw
    public final int c() {
        return this.d;
    }
}
