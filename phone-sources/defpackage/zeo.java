package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zeo extends zcs {
    final /* synthetic */ zeu d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeo(String str, zeu zeuVar, int i) {
        super(str);
        this.d = zeuVar;
        this.e = i;
    }

    @Override // defpackage.zcs
    public final long a() {
        zeu zeuVar = this.d;
        int i = this.e;
        try {
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
