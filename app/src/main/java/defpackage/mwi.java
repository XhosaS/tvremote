package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class mwi implements aggz {
    private final int a;
    private final yyr b;
    private final mwj c;

    public mwi(int i, yyr yyrVar, mwj mwjVar) {
        this.a = i;
        this.b = yyrVar;
        this.c = mwjVar;
    }

    @Override // defpackage.aggz
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        HashMap map = new HashMap();
        zdl it = ((yyr) obj).entrySet().iterator();
        while (it.hasNext()) {
            yyr yyrVar = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) yyrVar.get(entry.getKey());
            num.getClass();
            num.intValue();
            final byte[] bArr = (byte[]) entry.getValue();
            map.put(num, new Object() { // from class: mwg
                public final void a(int i, abvz abvzVar) {
                    byte[] bArr2 = bArr;
                    int length = bArr2.length;
                    abvy abvyVar = (abvy) abvzVar;
                    abvyVar.x(((i >>> 3) << 3) | 2);
                    abvyVar.A(bArr2, length);
                }
            });
        }
        byte[] bArr2 = this.c.a;
        int i = abvt.g;
        abvt abvtVarL = abvt.L(bArr2, 0, bArr2.length, false);
        abvp abvpVar = (abvp) abvtVarL;
        abvpVar.a = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = abvz.e;
        abvy abvyVar = new abvy(byteArrayOutputStream, 4096);
        while (!abvtVarL.C()) {
            int iM = abvtVarL.m();
            int i2 = iM >>> 3;
            int i3 = iM & 7;
            if (i3 == 0) {
                abvyVar.y(i2, abvpVar.r());
            } else if (i3 == 1) {
                abvyVar.l(i2, abvpVar.q());
            } else if (i3 == 2) {
                mwg mwgVar = (mwg) map.remove(Integer.valueOf(i2));
                if (mwgVar == null) {
                    abvyVar.h(i2, abvtVarL.w());
                } else {
                    abvtVarL.E(iM);
                    mwgVar.a(iM, abvyVar);
                }
            } else if (i3 == 5) {
                abvyVar.j(i2, abvpVar.i());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            ((mwg) entry2.getValue()).a((((Integer) entry2.getKey()).intValue() << 3) | 2, abvyVar);
        }
        abvyVar.O();
        return new mwj(byteArrayOutputStream.toByteArray()).b(this.a);
    }
}
