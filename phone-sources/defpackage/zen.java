package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zen extends zcs {
    final /* synthetic */ zeu d;
    final /* synthetic */ int e;
    final /* synthetic */ zgk f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zen(String str, zeu zeuVar, int i, zgk zgkVar, int i2) {
        super(str);
        this.d = zeuVar;
        this.e = i;
        this.f = zgkVar;
        this.g = i2;
    }

    @Override // defpackage.zcs
    public final long a() {
        try {
            zeu zeuVar = this.d;
            int i = this.e;
            this.f.B(this.g);
            zeuVar.q.h(i, 9);
            synchronized (zeuVar) {
                zeuVar.s.remove(Integer.valueOf(i));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
