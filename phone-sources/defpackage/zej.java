package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zej extends zcs {
    final /* synthetic */ zeu d;
    final /* synthetic */ zfb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zej(String str, zeu zeuVar, zfb zfbVar) {
        super(str);
        this.d = zeuVar;
        this.e = zfbVar;
    }

    @Override // defpackage.zcs
    public final long a() {
        try {
            this.d.a.f(this.e);
            return -1L;
        } catch (IOException e) {
            zfo.b.k("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.c)), 4, e);
            try {
                this.e.j(2, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
