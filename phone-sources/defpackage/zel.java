package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zel extends zcs {
    final /* synthetic */ zem d;
    final /* synthetic */ zlj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zel(String str, zem zemVar, zlj zljVar) {
        super(str);
        this.d = zemVar;
        this.e = zljVar;
    }

    @Override // defpackage.zcs
    public final long a() {
        long jE;
        int i;
        zfb[] zfbVarArr;
        ylf ylfVar = new ylf();
        zlj zljVar = this.e;
        zeu zeuVar = this.d.a;
        synchronized (zeuVar.q) {
            synchronized (zeuVar) {
                zlj zljVar2 = zeuVar.v;
                zlj zljVar3 = new zlj();
                zljVar3.i(zljVar2);
                zljVar3.i(zljVar);
                ylfVar.a = zljVar3;
                jE = ((zlj) ylfVar.a).e() - zljVar2.e();
                zfbVarArr = null;
                if (jE != 0) {
                    Map map = zeuVar.b;
                    if (!map.isEmpty()) {
                        zfbVarArr = (zfb[]) map.values().toArray(new zfb[0]);
                    }
                } else {
                    jE = 0;
                }
                zlj zljVar4 = (zlj) ylfVar.a;
                zljVar4.getClass();
                zeuVar.v = zljVar4;
                zeuVar.j.e(new zei(zeuVar.c + " onSettings", zeuVar, ylfVar));
            }
            try {
                zeuVar.q.j((zlj) ylfVar.a);
            } catch (IOException e) {
                zeuVar.c(e);
            }
        }
        if (zfbVarArr == null) {
            return -1L;
        }
        for (zfb zfbVar : zfbVarArr) {
            synchronized (zfbVar) {
                zfbVar.b(jE);
            }
        }
        return -1L;
    }
}
