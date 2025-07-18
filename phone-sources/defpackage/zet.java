package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zet extends zcs {
    final /* synthetic */ zeu d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zet(String str, zeu zeuVar, int i, long j) {
        super(str);
        this.d = zeuVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.zcs
    public final long a() throws IOException {
        try {
            this.d.q.f(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
