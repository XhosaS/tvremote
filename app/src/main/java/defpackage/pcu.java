package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pcu {
    final /* synthetic */ pcv a;
    private int b = -1;

    public pcu(pcv pcvVar) {
        this.a = pcvVar;
    }

    public final void a(pbv pbvVar) {
        yqw.L(pbvVar.b());
        pcb pcbVar = pbvVar.a;
        zpk zpkVar = ((pcc) pcbVar.b).d;
        if (zpkVar == null) {
            zpkVar = zpk.a;
        }
        yqw.L((zpkVar.b & 2048) != 0);
        int iB = zos.b(((pcc) pcbVar.b).e);
        if (iB == 0 || iB == 1) {
            pcv pcvVar = this.a;
            List list = pcvVar.e;
            int size = list.size();
            list.add(pbvVar.a());
            pcvVar.f.put(size, this.b);
            int i = this.b;
            this.b = size;
            pft pftVar = (pft) pbvVar.c;
            List list2 = pftVar.d;
            if (list2 != null) {
                int size2 = list2.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        a((pbv) pftVar.d.get(size2));
                    }
                }
            }
            this.b = i;
        }
    }
}
