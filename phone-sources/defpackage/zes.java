package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zes extends zcs {
    final /* synthetic */ zeu d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zes(String str, zeu zeuVar, int i, int i2) {
        super(str);
        this.d = zeuVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.zcs
    public final long a() throws IOException {
        try {
            this.d.m(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.c(e);
            return -1L;
        }
    }
}
