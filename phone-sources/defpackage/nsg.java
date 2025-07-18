package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nsg implements nsm {
    final /* synthetic */ nsm a;
    final /* synthetic */ nsk b;
    private final /* synthetic */ int c;

    public nsg(nsk nskVar, nsm nsmVar, int i) {
        this.c = i;
        this.a = nsmVar;
        this.b = nskVar;
    }

    @Override // defpackage.nsm
    public final void a(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        String str2;
        Object obj2;
        long j4;
        long j5;
        long j6;
        if (this.c != 0) {
            this.b.f = null;
            nsm nsmVar = this.a;
            if (nsmVar != null) {
                nsmVar.a(str, j, i, obj, j2, j3);
                return;
            }
            return;
        }
        nsm nsmVar2 = this.a;
        if (nsmVar2 != null) {
            if (i == 2001) {
                nsk nskVar = this.b;
                nskVar.a.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(nskVar.h));
                nskVar.g.k();
                i2 = 2001;
                str2 = str;
                j6 = j;
                obj2 = obj;
                j4 = j2;
                j5 = j3;
            } else {
                i2 = i;
                str2 = str;
                obj2 = obj;
                j4 = j2;
                j5 = j3;
                j6 = j;
            }
            nsmVar2.a(str2, j6, i2, obj2, j4, j5);
        }
    }

    @Override // defpackage.nsm
    public final void b(String str, long j, long j2, long j3) {
        if (this.c != 0) {
            nsm nsmVar = this.a;
            if (nsmVar != null) {
                nsmVar.b(str, j, j2, j3);
                return;
            }
            return;
        }
        nsm nsmVar2 = this.a;
        if (nsmVar2 != null) {
            nsmVar2.b(str, j, j2, j3);
        }
    }
}
